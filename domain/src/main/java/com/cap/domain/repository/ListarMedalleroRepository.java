package com.cap.domain.repository;

import com.cap.domain.model.BaseMedallero;

import rx.Observable;

/**
 * Created by CAP on 15/08/2016.
 */
public interface ListarMedalleroRepository {
    Observable<BaseMedallero> domainListarMedalleroRepository();
}
