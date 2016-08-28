package com.cap.medallerorio2016.di.component;

import com.cap.medallerorio2016.di.PerActivity;
import com.cap.medallerorio2016.di.module.ActivityModule;
import com.cap.medallerorio2016.di.module.ListarMedalleroModule;
import com.cap.medallerorio2016.view.ui.fragment.ListarMedalleroFragment;
import com.cap.medallerorio2016.view.ui.fragment.MainFragment;

import dagger.Component;

/**
 * Created by CAP on 15/08/2016.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class, ListarMedalleroModule.class})
public interface ListarMedalleroComponent extends ActivityComponent{


    void inject(MainFragment mainFragment);
    void inject(ListarMedalleroFragment listarMedalleroFragment);
}
