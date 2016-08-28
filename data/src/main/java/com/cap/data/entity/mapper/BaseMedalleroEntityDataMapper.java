package com.cap.data.entity.mapper;

import com.cap.data.entity.BaseMedalleroEntity;
import com.cap.data.entity.MedalleroEntity;
import com.cap.domain.model.BaseMedallero;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by CAP on 16/08/2016.
 *
 */
@Singleton
public class BaseMedalleroEntityDataMapper extends Mapper<BaseMedallero,BaseMedalleroEntity>{

    @Inject
    public BaseMedalleroEntityDataMapper() {
    }


    @Override
    public BaseMedalleroEntity map(BaseMedallero dato) {
        return null;
    }

    @Override
    public BaseMedallero reverseMap(BaseMedalleroEntity dato) {
        BaseMedallero baseMedallero = new BaseMedallero();
        baseMedallero.setUltimaActualizacion(dato.getUltimaActualizacion());
        baseMedallero.setTotalPaise(dato.getTotalPaise());
        for(MedalleroEntity medalleroEntity : dato.getMedalleroEntityList()){
            baseMedallero.getMedalleroList().add(new MedalleroEntityDataMapper().reverseMap(medalleroEntity));
        }
        return baseMedallero;
    }

}
