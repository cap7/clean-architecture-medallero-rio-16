package com.cap.data.entity.mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CAP on 16/08/2016.
 */
public abstract class Mapper <T1,T2>{

    public abstract T2 map(T1 dato);
    public abstract T1 reverseMap(T2 dato);

    public List<T2> map(List<T1> datosA){
        List<T2> returnDatosA = new ArrayList<>(datosA.size());
        for(T1 datosB : datosA){
            returnDatosA.add(map(datosB));
        }
        return returnDatosA;
    }

    public List<T1> reverseMap(List<T2> datosA){
        List<T1> returnDatosA = new ArrayList<>(datosA.size());
        for(T2 datosB : datosA){
            returnDatosA.add(reverseMap(datosB));
        }
        return returnDatosA;
    }
}
