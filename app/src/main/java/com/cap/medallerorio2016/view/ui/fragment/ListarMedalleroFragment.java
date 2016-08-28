package com.cap.medallerorio2016.view.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.cap.medallerorio2016.R;
import com.cap.medallerorio2016.di.component.ListarMedalleroComponent;
import com.cap.medallerorio2016.view.ListarMedalleroView;
import com.cap.medallerorio2016.view.adapter.ListarMedalleroAdapter;
import com.cap.medallerorio2016.viewmodel.MedalleroModel;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by CAP on 15/08/2016.
 */
public class ListarMedalleroFragment extends BaseFragment implements ListarMedalleroView{

    private ArrayList<MedalleroModel> medalleroModel;

    @Inject
    ListarMedalleroAdapter listarMedalleroAdapter;

    @BindView(R.id.rvmedallero)
    RecyclerView listaMedallero;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_listar_medallero;
    }

    @Override
    public void initViewFragment() {
        super.initViewFragment();
        medalleroModel = getArguments().getParcelableArrayList("INTENT_MEDALLERO");
        /*Iterator<MedalleroModel> iterator = medalleroModel.iterator();
        while (iterator.hasNext()) {
            MedalleroModel elmento = iterator.next();
            Log.i("ELEMENTOS=", elmento.getNombrePais() + " \n");
        }*/
        initRecyclerView();
        renderListarMedallero(medalleroModel);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getComponent(ListarMedalleroComponent.class).inject(this);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void renderListarMedallero(ArrayList<MedalleroModel> datosMedallero) {
        listarMedalleroAdapter.setListarMedallero(datosMedallero);
        listarMedalleroAdapter.notifyDataSetChanged();
    }

    private void initRecyclerView(){
        listaMedallero.setLayoutManager(new LinearLayoutManager(getContext()));
        listaMedallero.setAdapter(listarMedalleroAdapter);
    }

    @Override
    public Context getContext() {
        return getActivity().getApplicationContext();
    }


}
