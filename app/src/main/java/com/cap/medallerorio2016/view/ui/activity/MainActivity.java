package com.cap.medallerorio2016.view.ui.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.cap.medallerorio2016.R;
import com.cap.medallerorio2016.di.HasComponent;
import com.cap.medallerorio2016.di.component.DaggerListarMedalleroComponent;
import com.cap.medallerorio2016.di.component.ListarMedalleroComponent;
import com.cap.medallerorio2016.di.module.ListarMedalleroModule;
import com.cap.medallerorio2016.view.ui.fragment.MainFragment;
import com.cap.medallerorio2016.viewmodel.BaseMedalleroModel;
import com.squareup.picasso.Picasso;

import butterknife.BindView;

/**
 * Created by CAP on 15/08/2016.
 */
public class MainActivity extends BaseActivity implements HasComponent<ListarMedalleroComponent>,MainFragment.DatosMedalleroListener{

    private ListarMedalleroComponent listarMedalleroComponent;

    /*@BindView(R.id.ivolimpiadasrio2016)
    ImageView logoRio2016;*/

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Picasso.with(this).load(R.drawable.rio2016).into(logoRio2016);
        initalizeInjector();
    }

    @Override
    public void initView() {
        super.initView();

        showFragment(new MainFragment(), R.id.fragment_main);
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
