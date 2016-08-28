package com.cap.data.repository;

import android.util.Log;

import com.cap.data.entity.mapper.BaseMedalleroEntityDataMapper;
import com.cap.data.repository.datasource.DataStore;
import com.cap.data.repository.datasource.DataStoreFactory;
import com.cap.domain.model.BaseMedallero;
import com.cap.domain.repository.ListarMedalleroRepository;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;

/**
 * Created by CAP on 15/08/2016.
 *
 * Descripción: Esta clase implmenta la interfaz ListarMedalleroRepository y desarrolla su metodo
 * observable. Se ejecuta el metodo createDataStore de la case DataFactory, el cual iniciara el consturctor
 * de la clase CloudDataStore, donde sera intanciada la interfaz ApiConnection dejandola lista para ser usada.
 * Como el metodo observable de ListarMedalleroRepository debe retornar los valores solicitados,
 * se llama al metodo observable de DataStore para ser utilizado y obtendremos los datos. Luego se utiliza
 * el map de ReactiveX (Rx java) para cambiar el tipo de los datos, ya que los datos obtenidos
 * llegan en BaseMedalleroEntity y hay que pasarlos ha BaseMedallero(Capa de Dominio). Para eso utilizamos
 * el metodo reverseMap(no el metodo abtractor reverseMap) que se encuentra declarado en la clase Mapper,
 * que por manejo de List los valores son cambiados a BaseMedallero.
 */
@Singleton
public class ListarMedalleroDataRepository implements ListarMedalleroRepository{

    private final BaseMedalleroEntityDataMapper baseMedalleroEntityDataMapper;
    private final DataStoreFactory dataStoreFactory;

    @Inject
    public ListarMedalleroDataRepository(DataStoreFactory dataStoreFactory, BaseMedalleroEntityDataMapper baseMedalleroEntityDataMapper) {
        this.dataStoreFactory = dataStoreFactory;
        this.baseMedalleroEntityDataMapper = baseMedalleroEntityDataMapper;
    }

    @Override
    public Observable<BaseMedallero> domainListarMedalleroRepository() {
        try {
            final DataStore listarMedalleroDataStore = dataStoreFactory.createDataStore();
            return listarMedalleroDataStore.dataListarMedalleroObservable()
                    .map(medalleroEntities -> baseMedalleroEntityDataMapper.reverseMap(medalleroEntities));
        }catch (Exception e){
            Log.i("ERROR DATA REPOSITORY=",e.toString());
            return null;
        }

    }
}
