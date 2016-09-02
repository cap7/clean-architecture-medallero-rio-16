package com.cap.medallerorio2016.view.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.cap.medallerorio2016.R;
import com.cap.medallerorio2016.di.HasComponent;
import com.cap.medallerorio2016.di.component.DaggerListarMedalleroComponent;
import com.cap.medallerorio2016.di.component.ListarMedalleroComponent;
import com.cap.medallerorio2016.view.ui.fragment.ListarMedalleroFragment;
import com.cap.medallerorio2016.viewmodel.MedalleroModel;

import java.util.ArrayList;

/**
 * Created by CAP on 15/08/2016.
 */
public class ListarMedalleroActivity extends BaseActivity implements HasComponent<ListarMedalleroComponent> {

    private ListarMedalleroComponent listarMedalleroComponent;

    public static Intent getCallingIntent(Context context, ArrayList<MedalleroModel> medalleroModel){
        Intent callingIntent = new Intent(context,ListarMedalleroActivity.class);
        callingIntent.putExtra("INTENT_MEDALLERO",medalleroModel);
        return callingIntent;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        initalizeInjector();
        if(savedInstanceState==null){
            Bundle bundle = getIntent().getExtras();
            showFragment(new ListarMedalleroFragment(), R.id.fragment_app, bundle);
        }
    }

    private void initalizeInjector(){
        listarMedalleroComponent = DaggerListarMedalleroComponent.builder()
                .applicationComponent(getApplicationComponent())
                .activityModule(getActivityModule())
                .build();
    }

    @Override
    public ListarMedalleroComponent getComponent() {
        return listarMedalleroComponent;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("BOOM","ACTIVITY 2");
    }

}
