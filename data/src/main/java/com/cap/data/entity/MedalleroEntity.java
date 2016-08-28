package com.cap.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by CAP on 13/08/2016.
 *
 */
public class MedalleroEntity {

        @SerializedName("flag")
        @Expose
        private String urlImagenBandera;

        @SerializedName("noc")
        @Expose
        private String abreviaturaNombrePais;

        @SerializedName("name")
        @Expose
        private String nombrePais;

        @SerializedName("bronze")
        @Expose
        private String medallaBronce;

        @SerializedName("silver")
        @Expose
        private String medallaPlata;

        @SerializedName("gold")
        @Expose
        private String medallaOro;

        @SerializedName("total")
        @Expose
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
