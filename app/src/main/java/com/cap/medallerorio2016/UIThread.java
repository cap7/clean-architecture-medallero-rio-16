package com.cap.medallerorio2016;

import com.cap.domain.executor.PostExecutionThread;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by CAP on 15/08/2016.
 */

@Singleton
public class UIThread implements PostExecutionThread{
    @Inject
    public UIThread() {}

    @Override public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }
}
