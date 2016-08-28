package com.cap.medallerorio2016.di.component;

import android.content.Context;

import com.cap.domain.executor.PostExecutionThread;
import com.cap.domain.executor.ThreadExecutor;
import com.cap.domain.repository.ListarMedalleroRepository;
import com.cap.medallerorio2016.di.module.ApplicationModule;
import com.cap.medallerorio2016.view.ui.activity.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by CAP on 15/08/2016.
 */
@Singleton
@Component (modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(BaseActivity baseActivity);

    Context context();
    ThreadExecutor threadExecutor();
    PostExecutionThread postExecutionThread();
    ListarMedalleroRepository listarMedalleroRepository();

}
