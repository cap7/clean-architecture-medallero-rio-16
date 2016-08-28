package com.cap.medallerorio2016.view.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cap.medallerorio2016.di.HasComponent;

import butterknife.ButterKnife;


/**
 * Created by CAP on 15/08/2016.
 */
public abstract class BaseFragment extends Fragment {

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(getLayoutId(),container,false);
        bindViews();
        initViewFragment();
        return view;
    }

    protected abstract int getLayoutId();

    private void bindViews(){ButterKnife.bind(this,view);}

    public void initViewFragment(){}

    protected <C> C getComponent(Class<C> componentType){
        return componentType.cast(((HasComponent<C>)getActivity()).getComponent());
    }
}
