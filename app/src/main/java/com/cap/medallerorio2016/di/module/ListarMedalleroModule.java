package com.cap.medallerorio2016.di.module;

import com.cap.domain.interactor.ListarMedalleroInteractor;
import com.cap.domain.interactor.UseCase;
import com.cap.medallerorio2016.di.PerActivity;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by CAP on 15/08/2016.
 *
 * Descripción: Esta clase una vez ejecutado el metodo initalizeInjector() en la activity MainActivity
 *              es la que inicia el contructor en la clase ListarMedalleroInteractor.
 *              Se llama a este metodo utilizando su alias @Named("listarMedallero")
 */
@Module
public class ListarMedalleroModule {

    public ListarMedalleroModule() {
    }

    @Provides @PerActivity @Named("listarMedallero")
    UseCase provideListarMedalleroInteractor(ListarMedalleroInteractor listarMedalleroInteractor){
        return listarMedalleroInteractor;
    }

}
