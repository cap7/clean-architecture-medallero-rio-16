package com.cap.data.repository.datasource;

import android.util.Log;

import com.cap.data.entity.BaseMedalleroEntity;
import com.cap.data.net.ApiConnection;

import rx.Observable;

/**
 * Created by CAP on 16/08/2016.
 *
 */
public class CloudDataStore implements DataStore{

    private final ApiConnection apiConnection;

    public CloudDataStore(ApiConnection apiConnection) {
        this.apiConnection = apiConnection;
    }

    @Override
    public Observable<BaseMedalleroEntity> dataListarMedalleroObservable() {
            return apiConnection.requestSyncCall().dataListarMedalleroRepositoryFromApi()
                    .doOnError(throwable -> Log.i("ERROR CLOUD DATA STORE=",throwable.toString()));

    }
}
