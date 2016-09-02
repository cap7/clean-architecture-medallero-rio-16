package com.cap.medallerorio2016.view.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.cap.medallerorio2016.R;
import com.cap.medallerorio2016.di.component.ListarMedalleroComponent;
import com.cap.medallerorio2016.presenter.ListarMedalleroPresenter;
import com.cap.medallerorio2016.view.DatosMedalleroView;
import com.cap.medallerorio2016.viewmodel.BaseMedalleroModel;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by CAP on 22/08/2016.
 */
public class MainFragment extends BaseFragment implements DatosMedalleroView {

    public interface DatosMedalleroListener{
        void medalleroListener(BaseMedalleroModel baseMedalleroModel);
    }

    private DatosMedalleroListener datosMedalleroListener;

    @Inject
    ListarMedalleroPresenter listarMedalleroPresenter;

    @BindView(R.id.ivolimpiadasrio2016)
    ImageView logoRio2016;


    /*Agreagar setRetainInstance(true) en el constructor del fragment para no tener problemas con la
    * orientación de la pantalla*/
    public MainFragment() {
        setRetainInstance(true);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main;
    }


    @Override
    public void initViewFragment() {
        super.initViewFragment();
        Picasso.with(getActivity()).load(R.drawable.rio2016).into(logoRio2016);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof DatosMedalleroListener){
            datosMedalleroListener = (DatosMedalleroListener) context;
        }
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getComponent(ListarMedalleroComponent.class).inject(this);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listarMedalleroPresenter.setView(this);
        listarMedalleroPresenter.initInteractor();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        listarMedalleroPresenter.destroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listarMedalleroPresenter = null;
    }

    @Override
    public Context getContext() {
        return getActivity().getApplicationContext();
    }

    @Override
    public void setDatosListarMedallero(BaseMedalleroModel baseMedalleroModel) {
        datosMedalleroListener.medalleroListener(baseMedalleroModel);
    }
}
