package com.cap.medallerorio2016.viewmodel.mapper;

import com.cap.data.entity.mapper.Mapper;
import com.cap.domain.model.BaseMedallero;
import com.cap.domain.model.Medallero;
import com.cap.medallerorio2016.viewmodel.BaseMedalleroModel;

import javax.inject.Inject;

/**
 * Created by CAP on 20/08/2016.
 */
public class BaseMedalleroModelDataMapper extends Mapper<BaseMedalleroModel,BaseMedallero> {

    @Inject
    public BaseMedalleroModelDataMapper() {
    }

    @Override
    public BaseMedallero map(BaseMedalleroModel dato) {
        return null;
    }

    @Override
    public BaseMedalleroModel reverseMap(BaseMedallero dato) {
        BaseMedalleroModel baseMedalleroModel = new BaseMedalleroModel();
        baseMedalleroModel.setUltimaActualizacion(dato.getUltimaActualizacion());
        baseMedalleroModel.setTotalPaise(dato.getTotalPaise());
        for(Medallero medallero : dato.getMedalleroList()){
            baseMedalleroModel.getMedalleroModelList().add(new MedalleroModelDataMapper().reverseMap(medallero));
        }
        baseMedalleroModel.setSiguienteActualizacion(dato.getSiguienteActualizacion());
        return baseMedalleroModel;
    }
}
