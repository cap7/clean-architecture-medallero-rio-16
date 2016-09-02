package com.cap.medallerorio2016.presenter;

import android.support.annotation.NonNull;
import android.util.Log;

import com.cap.domain.interactor.DefaultSubscriber;
import com.cap.domain.interactor.UseCase;
import com.cap.domain.model.BaseMedallero;
import com.cap.medallerorio2016.di.PerActivity;
import com.cap.medallerorio2016.view.DatosMedalleroView;
import com.cap.medallerorio2016.viewmodel.BaseMedalleroModel;
import com.cap.medallerorio2016.viewmodel.mapper.BaseMedalleroModelDataMapper;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by CAP on 15/08/2016.
 */
@PerActivity
public class ListarMedalleroPresenter implements Presenter{

    private final UseCase listarMedalleroInteractor;
    private final BaseMedalleroModelDataMapper baseMedalleroModelDataMapper;
    private DatosMedalleroView datosMedalleroView;


    @Inject
    public ListarMedalleroPresenter(@Named("listarMedallero") UseCase listarMedalleroInteractor,BaseMedalleroModelDataMapper baseMedalleroModelDataMapper) {
        this.listarMedalleroInteractor = listarMedalleroInteractor;
        this.baseMedalleroModelDataMapper = baseMedalleroModelDataMapper;
    }

    public void setView(@NonNull DatosMedalleroView view){
        datosMedalleroView = view;
    }

    public void initInteractor(){
        /*Ejecuta la solicitud para obtener los datos*/
        listarMedalleroInteractor.execute(new ListarMedalleroSubscriber());
    }

    private void showListarMedallero(BaseMedallero baseMedallero){
        final BaseMedalleroModel baseMedalleroModel = baseMedalleroModelDataMapper.reverseMap(baseMedallero);
        datosMedalleroView.setDatosListarMedallero(baseMedalleroModel);
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    /*Cancela el proceso luego de obtener los datos*/
    @Override
    public void destroy() {
        listarMedalleroInteractor.unsubscribe();
        datosMedalleroView = null;
    }

    /*Cuando los datos ya pasaron de la capa de Datos y fueron mapeados a la capa de Dominio,
    * llegan a este punto donde los datos deben ser mapeado a la capa de presentacion*/
    private final class ListarMedalleroSubscriber extends DefaultSubscriber<BaseMedallero>{
        @Override
        public void onCompleted() {
            super.onCompleted();
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
            Log.e("DATOS NO RECIBIDO=",e.toString());
        }

        /*Se utiliza un metodo del presente para poder organizar los datos que llegan de la capa de Dominio*/
        @Override
        public void onNext(BaseMedallero baseMedallero) {
            super.onNext(baseMedallero);
            ListarMedalleroPresenter.this.showListarMedallero(baseMedallero);
        }
    }
}
