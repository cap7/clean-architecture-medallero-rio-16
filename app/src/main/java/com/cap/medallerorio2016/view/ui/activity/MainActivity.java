package com.cap.medallerorio2016.view.ui.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.Window;

import com.cap.medallerorio2016.R;
import com.cap.medallerorio2016.di.HasComponent;
import com.cap.medallerorio2016.di.component.DaggerListarMedalleroComponent;
import com.cap.medallerorio2016.di.component.ListarMedalleroComponent;
import com.cap.medallerorio2016.di.module.ListarMedalleroModule;
import com.cap.medallerorio2016.view.ui.fragment.MainFragment;
import com.cap.medallerorio2016.viewmodel.BaseMedalleroModel;

/**
 * Created by CAP on 15/08/2016.
 */
public class MainActivity extends BaseActivity implements HasComponent<ListarMedalleroComponent>,MainFragment.DatosMedalleroListener{

    private ListarMedalleroComponent listarMedalleroComponent;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        initalizeInjector();
        if(savedInstanceState == null){
            showFragment(new MainFragment(), R.id.fragment_app,null);
        }

    }

    private void initalizeInjector() {
        listarMedalleroComponent = DaggerListarMedalleroComponent.builder()
                .applicationComponent(getApplicationComponent())
                .activityModule(getActivityModule())
                .listarMedalleroModule(new ListarMedalleroModule())
                .build();
    }

    @Override
    public ListarMedalleroComponent getComponent() {
        return listarMedalleroComponent;
    }


    @Override
    public void medalleroListener(BaseMedalleroModel baseMedalleroModel) {
        navigator.navigateToListarMedallero(MainActivity.this,baseMedalleroModel);
    }
}
