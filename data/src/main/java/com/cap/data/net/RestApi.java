package com.cap.data.net;

import com.cap.data.entity.BaseMedalleroEntity;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import rx.Observable;

/**
 * Created by CAP on 13/08/2016.
 *
 */
public interface RestApi {

    @Headers({"Content-Type:application/json"})
    @GET("medals")
    Observable<BaseMedalleroEntity> dataListarMedalleroRepositoryFromApi();

}
