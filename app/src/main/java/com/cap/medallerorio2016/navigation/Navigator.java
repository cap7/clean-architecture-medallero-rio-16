package com.cap.medallerorio2016.navigation;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.cap.medallerorio2016.view.ui.activity.ListarMedalleroActivity;
import com.cap.medallerorio2016.viewmodel.BaseMedalleroModel;
import com.cap.medallerorio2016.viewmodel.MedalleroModel;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by CAP on 18/08/2016.
 *
 * Descripción: Esta clase sirver para pasar el objeto BaseMedalleroModel  a la activity ListarMedalleroActivity
 *              utilizando un intent, para eso se tubo que parcear la clase MedalleroModel
 */
@Singleton
public class Navigator {

    private ArrayList<MedalleroModel> medalleroModelList = new ArrayList<>();

    @Inject
    public Navigator() {
    }

    public void navigateToListarMedallero(Context context, BaseMedalleroModel baseMedalleroModel){
        try {
            if (context != null) {
                for (MedalleroModel medalleroModel : baseMedalleroModel.getMedalleroModelList()) {
                    medalleroModelList.add(medalleroModel);
                }
                Intent intent = ListarMedalleroActivity.getCallingIntent(context, medalleroModelList);
                context.startActivity(intent);
            }
        }catch (Exception e){
            Log.e("ERROR NAVIGATOR=",e.toString());
        }

    }
}
