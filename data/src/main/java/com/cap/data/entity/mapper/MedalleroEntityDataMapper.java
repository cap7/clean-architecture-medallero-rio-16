package com.cap.data.entity.mapper;

import com.cap.data.entity.MedalleroEntity;
import com.cap.domain.model.Medallero;

/**
 * Created by CAP on 20/08/2016.
 *
 */
public class MedalleroEntityDataMapper extends Mapper<Medallero,MedalleroEntity> {

    @Override
    public MedalleroEntity map(Medallero dato) {
        return null;
    }

    @Override
    public Medallero reverseMap(MedalleroEntity dato) {
        Medallero medallero = new Medallero();
        medallero.setUrlImagenBandera(dato.getUrlImagenBandera());
        medallero.setNombrePais(dato.getNombrePais());
        medallero.setAbreviaturaNombrePais(dato.getAbreviaturaNombrePais());
        medallero.setMedallaBronce(dato.getMedallaBronce());
        medallero.setMedallaPlata(dato.getMedallaPlata());
        medallero.setMedallaOro(dato.getMedallaOro());
        medallero.setTotalMedalla(dato.getTotalMedalla());
        return medallero;
    }
}
