package com.cap.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CAP on 13/08/2016.
 *
 */
public class BaseMedalleroEntity {

    @SerializedName ("lastUpdated")
    @Expose
    private String ultimaActualizacion;

    @SerializedName ("totalCountries")
    @Expose
    private String totalPaise;

    @SerializedName("medals")
    @Expose
    private List<MedalleroEntity> medalleroEntityList =  new ArrayList<MedalleroEntity>();

    @SerializedName("nextUpdate")
    @Expose
    private String siguienteActualizacion;

    public List<MedalleroEntity> getMedalleroEntityList() {
        return medalleroEntityList;
    }

    public void setMedalleroEntityList(List<MedalleroEntity> medalleroEntityList) {
        this.medalleroEntityList = medalleroEntityList;
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
