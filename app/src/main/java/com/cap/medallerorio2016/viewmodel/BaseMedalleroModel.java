package com.cap.medallerorio2016.viewmodel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CAP on 20/08/2016.
 */
public class BaseMedalleroModel {

    private String ultimaActualizacion;
    private String totalPaise;
    private List<MedalleroModel> medalleroModelList = new ArrayList<MedalleroModel>();
    private String siguienteActualizacion;

    public List<MedalleroModel> getMedalleroModelList() {
        return medalleroModelList;
    }

    public void setMedalleroModelList(List<MedalleroModel> medalleroModelList) {
        this.medalleroModelList = medalleroModelList;
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
