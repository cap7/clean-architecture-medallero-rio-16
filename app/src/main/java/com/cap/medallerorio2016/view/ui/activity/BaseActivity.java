package com.cap.medallerorio2016.view.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.cap.medallerorio2016.MedalleroRio2016App;
import com.cap.medallerorio2016.di.component.ApplicationComponent;
import com.cap.medallerorio2016.di.module.ActivityModule;
import com.cap.medallerorio2016.navigation.Navigator;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * Created by CAP on 15/08/2016.
 */
public abstract class BaseActivity extends AppCompatActivity{

    @Inject
    Navigator navigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        this.getApplicationComponent().inject(this);
        bindViews();
        initView(savedInstanceState);
    }

    public void showFragment(Fragment fragment, int containerViewId,Bundle bundle){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if(bundle!=null) {
            fragment.setArguments(bundle);
        }
        transaction.add(containerViewId, fragment);
        transaction.commit();
    }

    public void initView(Bundle savedInstanceState){}

    protected abstract int getLayoutId();

    private void bindViews(){
        ButterKnife.bind(this);
    }

    protected ApplicationComponent getApplicationComponent(){
        return ((MedalleroRio2016App)getApplication()).getApplicationComponent();
    }

    protected ActivityModule getActivityModule(){
        return new ActivityModule(this);
    }
}
