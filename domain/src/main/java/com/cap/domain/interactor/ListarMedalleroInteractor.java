package com.cap.domain.interactor;

import com.cap.domain.executor.PostExecutionThread;
import com.cap.domain.executor.ThreadExecutor;
import com.cap.domain.repository.ListarMedalleroRepository;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by CAP on 15/08/2016.
 */
public class ListarMedalleroInteractor extends UseCase{

    private final ListarMedalleroRepository listarMedalleroRepository;

    @Inject
    public ListarMedalleroInteractor(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread, ListarMedalleroRepository listarMedalleroRepository) {
        super(threadExecutor, postExecutionThread);
        this.listarMedalleroRepository = listarMedalleroRepository;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return listarMedalleroRepository.domainListarMedalleroRepository();
    }
}
