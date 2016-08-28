package com.cap.data.net;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by CAP on 13/08/2016.
 *
 * Descripción: En esta clase se implementa la interfaz ApiConnection, se inicia la implementación
 * con retrofit 2 utilizando la url base y luego se implementa en los metodos de la interfaz ApiConnection
 * para de esta forma ser utilizado cuando se requerido.
 * Se visualiza "@Singleton" y "@Inject" porque esta clase va ser iniciada cuando se compile dagger 2
 *
 */
@Singleton
public class ApiConnectionImpl implements ApiConnection{

    private static RestApi restApi;
    private static OkHttpClient client;
    private static Retrofit retrofit;

    @Inject
    public ApiConnectionImpl(){
        /*Se hace el llamado del interceptor para saber que enviamos y que recibimos*/
        client = new OkHttpClient.Builder().addInterceptor(new LogInterceptor()).build();
        /*--------*/
        retrofit = new Retrofit.Builder()
                .baseUrl("http://olympics.atelerix.co/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
    }

    private RestApi connectToApi(){
        restApi = retrofit.create(RestApi.class);
        return restApi;
    }

    @Override
    public RestApi call() throws Exception {
        return requestSyncCall();
    }

    @Override
    public RestApi requestSyncCall() {
        return connectToApi();
    }
}
