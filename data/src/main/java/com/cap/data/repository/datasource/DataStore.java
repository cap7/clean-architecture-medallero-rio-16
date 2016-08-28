package com.cap.data.repository.datasource;

import com.cap.data.entity.BaseMedalleroEntity;

import rx.Observable;


/**
 * Created by CAP on 16/08/2016.
 *
 */
public interface DataStore {

    Observable<BaseMedalleroEntity> dataListarMedalleroObservable();
}
