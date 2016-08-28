package com.cap.medallerorio2016.di;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by CAP on 15/08/2016.
 */
@Scope
@Retention(RUNTIME)
public @interface PerActivity {}
