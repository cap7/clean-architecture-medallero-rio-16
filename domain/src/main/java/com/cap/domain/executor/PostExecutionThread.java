package com.cap.domain.executor;

import rx.Scheduler;

/**
 * Created by CAP on 15/08/2016.
 */
public interface PostExecutionThread {
    Scheduler getScheduler();
}
