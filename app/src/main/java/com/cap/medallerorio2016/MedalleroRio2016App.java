package com.cap.medallerorio2016;

import android.app.Application;

import com.cap.medallerorio2016.di.component.ApplicationComponent;
import com.cap.medallerorio2016.di.component.DaggerApplicationComponent;
import com.cap.medallerorio2016.di.module.ApplicationModule;

/**
 * Created by CAP on 15/08/2016.
 *
 * Descripción: Esta clase inicializa el Dagger 2 en toda la aplicación, como tip no olvidar colocar
 *              en el manifet en application " android:name=".MedalleroRio2016App" " para que pueda
 *              iniciar.
 */
public class MedalleroRio2016App extends Application{

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();

    }

    private void initializeInjector(){
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}
