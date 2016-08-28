package com.cap.medallerorio2016.view;

import com.cap.medallerorio2016.viewmodel.MedalleroModel;

import java.util.ArrayList;

/**
 * Created by CAP on 21/08/2016.
 */
public interface ListarMedalleroView extends BaseView{

    void renderListarMedallero(ArrayList<MedalleroModel> datosMedallero);


}
