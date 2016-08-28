package com.cap.data.repository.datasource;

import android.content.Context;

import com.cap.data.net.ApiConnection;

import javax.inject.Inject;

/**
 * Created by CAP on 16/08/2016.
 */
public class DataStoreFactory {

    private final Context context;
    private final ApiConnection apiConnection;

    @Inject
    public DataStoreFactory(ApiConnection apiConnection, Context context) {
        this.apiConnection = apiConnection;
        this.context = context;
    }

    public DataStore createDataStore(){
        return new CloudDataStore(apiConnection);
    }
}
