package com.cap.medallerorio2016.di.component;

import android.app.Activity;

import com.cap.medallerorio2016.di.PerActivity;
import com.cap.medallerorio2016.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by CAP on 15/08/2016.
 *
 *
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();
}
