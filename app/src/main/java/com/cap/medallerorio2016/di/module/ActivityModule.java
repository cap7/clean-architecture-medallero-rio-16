package com.cap.medallerorio2016.di.module;

import android.app.Activity;

import com.cap.medallerorio2016.di.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by CAP on 15/08/2016.
 */
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides @PerActivity Activity activity(){
        return activity;
    }
}
