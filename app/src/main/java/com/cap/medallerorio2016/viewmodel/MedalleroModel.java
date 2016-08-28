package com.cap.medallerorio2016.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by CAP on 13/08/2016.
 */
public class MedalleroModel implements Parcelable {

    private String urlImagenBandera;
    private String abreviaturaNombrePais;
    private String nombrePais;
    private String medallaBronce;
    private String medallaPlata;
    private String medallaOro;
    private String totalMedalla;

    public MedalleroModel() {
    }

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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.urlImagenBandera);
        dest.writeString(this.abreviaturaNombrePais);
        dest.writeString(this.nombrePais);
        dest.writeString(this.medallaBronce);
        dest.writeString(this.medallaPlata);
        dest.writeString(this.medallaOro);
        dest.writeString(this.totalMedalla);
    }

    protected MedalleroModel(Parcel in) {
        this.urlImagenBandera = in.readString();
        this.abreviaturaNombrePais = in.readString();
        this.nombrePais = in.readString();
        this.medallaBronce = in.readString();
        this.medallaPlata = in.readString();
        this.medallaOro = in.readString();
        this.totalMedalla = in.readString();
    }

    public static final Parcelable.Creator<MedalleroModel> CREATOR = new Parcelable.Creator<MedalleroModel>() {
        @Override
        public MedalleroModel createFromParcel(Parcel source) {
            return new MedalleroModel(source);
        }

        @Override
        public MedalleroModel[] newArray(int size) {
            return new MedalleroModel[size];
        }
    };
}
