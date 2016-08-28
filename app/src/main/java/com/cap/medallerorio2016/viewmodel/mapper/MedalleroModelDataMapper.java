package com.cap.medallerorio2016.viewmodel.mapper;

import com.cap.data.entity.mapper.Mapper;
import com.cap.domain.model.Medallero;
import com.cap.medallerorio2016.viewmodel.MedalleroModel;

/**
 * Created by CAP on 17/08/2016.
 */

public class MedalleroModelDataMapper extends Mapper<MedalleroModel,Medallero> {


    @Override
    public Medallero map(MedalleroModel dato) {
        return null;
    }

    @Override
    public MedalleroModel reverseMap(Medallero dato) {
        MedalleroModel medalleroModel = new MedalleroModel();
        medalleroModel.setUrlImagenBandera(dato.getUrlImagenBandera());
        medalleroModel.setNombrePais(dato.getNombrePais());
        medalleroModel.setAbreviaturaNombrePais(dato.getAbreviaturaNombrePais());
        medalleroModel.setMedallaBronce(dato.getMedallaBronce());
        medalleroModel.setMedallaPlata(dato.getMedallaPlata());
        medalleroModel.setMedallaOro(dato.getMedallaOro());
        medalleroModel.setTotalMedalla(dato.getTotalMedalla());
        return medalleroModel;
    }
}
