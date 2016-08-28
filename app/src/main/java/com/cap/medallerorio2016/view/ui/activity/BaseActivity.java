package com.cap.medallerorio2016.view.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

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
        this.getApplicationComponent().inject(this);
        setContentView(getLayoutId());
        bindViews();
        initView();
    }

    public void showFragment(Fragment fragment, int containerViewId){
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(containerViewId, fragment);
        transaction.commit();
    }

    public void showFragmentBundle(Fragment fragment, int containerViewId,Bundle bundle){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        fragment.setArguments(bundle);
        transaction.add(containerViewId, fragment);
        transaction.commit();
    }

    public void initView(){}

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
