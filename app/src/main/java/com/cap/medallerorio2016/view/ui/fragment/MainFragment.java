package com.cap.medallerorio2016.view.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.cap.medallerorio2016.R;
import com.cap.medallerorio2016.di.component.ListarMedalleroComponent;
import com.cap.medallerorio2016.presenter.ListarMedalleroPresenter;
import com.cap.medallerorio2016.view.DatosMedalleroView;
import com.cap.medallerorio2016.viewmodel.BaseMedalleroModel;

import javax.inject.Inject;

/**
 * Created by CAP on 22/08/2016.
 */
public class MainFragment extends BaseFragment implements DatosMedalleroView {

    public interface DatosMedalleroListener{
        void medalleroListener(BaseMedalleroModel baseMedalleroModel);
    }

    @Inject
    ListarMedalleroPresenter listarMedalleroPresenter;

    private DatosMedalleroListener datosMedalleroListener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof DatosMedalleroListener){
            datosMedalleroListener = (DatosMedalleroListener) context;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getComponent(ListarMedalleroComponent.class).inject(this);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listarMedalleroPresenter.setView(this);
        listarMedalleroPresenter.initInteractor();
    }

    @Override
    public void setDatosListarMedallero(BaseMedalleroModel baseMedalleroModel) {
        datosMedalleroListener.medalleroListener(baseMedalleroModel);
    }
}
