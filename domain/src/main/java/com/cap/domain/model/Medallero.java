package com.cap.domain.model;

/**
 * Created by CAP on 20/08/2016.
 */
public class Medallero {

    private String urlImagenBandera;
    private String abreviaturaNombrePais;
    private String nombrePais;
    private String medallaBronce;
    private String medallaPlata;
    private String medallaOro;
    private String totalMedalla;

    public String getAbreviaturaNombrePais() {
        return abreviaturaNombrePais;
    }

    public void setAbreviaturaNombrePais(String abreviaturaNombrePais) {
        this.abreviaturaNombrePais = abreviaturaNombrePais;
    }

    public String getMedallaBronce() {
        return medallaBronce;
    }

    public void setMedallaBronce(String medallaBronce) {
        this.medallaBronce = medallaBronce;
    }

    public String getMedallaOro() {
        return medallaOro;
    }

    public void setMedallaOro(String medallaOro) {
        this.medallaOro = medallaOro;
    }

    public String getMedallaPlata() {
        return medallaPlata;
    }

    public void setMedallaPlata(String medallaPlata) {
        this.medallaPlata = medallaPlata;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getTotalMedalla() {
        return totalMedalla;
    }

    public void setTotalMedalla(String totalMedalla) {
        this.totalMedalla = totalMedalla;
    }

    public String getUrlImagenBandera() {
        return urlImagenBandera;
    }

    public void setUrlImagenBandera(String urlImagenBandera) {
        this.urlImagenBandera = urlImagenBandera;
    }
}
