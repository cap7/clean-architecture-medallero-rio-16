package com.cap.medallerorio2016.di.module;

import android.content.Context;

import com.cap.data.executor.JobExecutor;
import com.cap.data.net.ApiConnection;
import com.cap.data.net.ApiConnectionImpl;
import com.cap.data.repository.ListarMedalleroDataRepository;
import com.cap.domain.executor.PostExecutionThread;
import com.cap.domain.executor.ThreadExecutor;
import com.cap.domain.repository.ListarMedalleroRepository;
import com.cap.medallerorio2016.MedalleroRio2016App;
import com.cap.medallerorio2016.UIThread;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by CAP on 15/08/2016.
 */
@Module
public class ApplicationModule {

    private final MedalleroRio2016App medalleroRio2016App;

    public ApplicationModule(MedalleroRio2016App medalleroRio2016App) {
        this.medalleroRio2016App = medalleroRio2016App;
    }

    @Provides @Singleton
    Context provideApplicationContext(){
        return medalleroRio2016App;
    }

    @Provides @Singleton
    ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor){
        return jobExecutor;
    }

    @Provides @Singleton
    PostExecutionThread providePostExecutionThread(UIThread uiThread){
        return uiThread;
    }

    @Provides @Singleton
    ListarMedalleroRepository provideListarMedalleroRepository(ListarMedalleroDataRepository listarMedalleroDataRepository){
        return listarMedalleroDataRepository;
    }

    /* Se declara este metodo para que la aplicación al momento de hacer la consulta solo haga
    * la solucitud de la conección, en vez de inicializarla cuando quiere consultar*/
    @Provides @Singleton
    public ApiConnection provideApiConnection(ApiConnectionImpl apiConnection){
        return apiConnection;
    }

}
