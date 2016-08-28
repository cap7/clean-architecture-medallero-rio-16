package com.cap.domain.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CAP on 13/08/2016.
 */
public class BaseMedallero {

    private String ultimaActualizacion;
    private String totalPaise;
    private List<Medallero> medalleroList = new ArrayList<Medallero>();
    private String siguienteActualizacion;

    public List<Medallero> getMedalleroList() {
        return medalleroList;
    }

    public void setMedalleroList(List<Medallero> medalleroList) {
        this.medalleroList = medalleroList;
    }

    public String getSiguienteActualizacion() {
        return siguienteActualizacion;
    }

    public void setSiguienteActualizacion(String siguienteActualizacion) {
        this.siguienteActualizacion = siguienteActualizacion;
    }

    public String getTotalPaise() {
        return totalPaise;
    }

    public void setTotalPaise(String totalPaise) {
        this.totalPaise = totalPaise;
    }

    public String getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(String ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }
}
