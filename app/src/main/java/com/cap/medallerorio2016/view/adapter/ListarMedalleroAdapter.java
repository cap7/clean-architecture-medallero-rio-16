package com.cap.medallerorio2016.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cap.medallerorio2016.R;
import com.cap.medallerorio2016.viewmodel.MedalleroModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Iterator;

import butterknife.BindView;
import butterknife.ButterKnife;

import javax.inject.Inject;

/**
 * Created by CAP on 21/08/2016.
 */
public class ListarMedalleroAdapter extends RecyclerView.Adapter<ListarMedalleroAdapter.ListarMedalleroViewHolder>{

    private ArrayList<MedalleroModel> medalleroModelList;
    private LayoutInflater layoutInflater;

    @Inject
    public ListarMedalleroAdapter(Context context) {
        this.layoutInflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.medalleroModelList = new ArrayList<>();
    }

    @Override
    public ListarMedalleroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.medallero_row,parent,false);
        return new ListarMedalleroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListarMedalleroViewHolder holder, int position) {
        MedalleroModel medalleroModel = medalleroModelList.get(position);
        holder.render(medalleroModel);
    }

    @Override
    public int getItemCount() {
        return medalleroModelList.size();
    }

    public void setListarMedallero(ArrayList<MedalleroModel> baseMedalleroModel) {
        try{
            medalleroModelList = baseMedalleroModel;
            /*Iterator<MedalleroModel> iterator = medalleroModelList.iterator();
            while (iterator.hasNext()) {
                MedalleroModel elmento = iterator.next();
                Log.i("ELEMENTO ADAPTER =", elmento.getNombrePais() + " \n");
            }*/
        }catch (Exception e){
            Log.e("ERROR ADAPTER=",e.toString());
        }
    }


    static class ListarMedalleroViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.civbandera)
        ImageView banderaPais;

        @BindView(R.id.tvnombrepais)
        TextView nombrePais;

        @BindView(R.id.ivmedallaoro)
        ImageView medallaoro;

        @BindView(R.id.tvcantidadmedallaoro)
        TextView cantidadmedallaoro;

        @BindView(R.id.ivmedallaplata)
        ImageView medallaplata;

        @BindView(R.id.tvcantidadmedallaplata)
        TextView cantidadmedallaplata;

        @BindView(R.id.ivmedallabronce)
        ImageView medallabronce;

        @BindView(R.id.tvcantidadmedallabronce)
        TextView cantidadmedallabronce;

        @BindView(R.id.tvtotalmedalla)
        TextView totalmedalla;

        @BindView(R.id.ivtotalmedalla)
        ImageView totalmedallaImagen;


        public ListarMedalleroViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        public  void render(MedalleroModel medalleroModel){
            renderBanderaPais(medalleroModel.getUrlImagenBandera());
            renderNombrePais(medalleroModel.getNombrePais());
            renderCantidadMedallaOro(medalleroModel.getMedallaOro());
            renderCantidadMedallaPlata(medalleroModel.getMedallaPlata());
            renderCantidadMedallaBronce(medalleroModel.getMedallaBronce());
            renderTotalMedalla(medalleroModel.getTotalMedalla());
            renderMedalla();

        }


        private void renderBanderaPais(String urlImageBanderaPais){
            getImageBanderaPais(urlImageBanderaPais,banderaPais);
        }

        private void renderNombrePais(String nombre){
            nombrePais.setText(nombre);
        }

        private void renderCantidadMedallaOro(String cantidadMedallaOro){
            cantidadmedallaoro.setText(cantidadMedallaOro);
        }

        private void renderCantidadMedallaPlata(String cantidadMedallaPlata){
            cantidadmedallaplata.setText(cantidadMedallaPlata);
        }

        private void renderCantidadMedallaBronce(String cantidadMedallaBronce){
            cantidadmedallabronce.setText(cantidadMedallaBronce);
        }

        private void renderTotalMedalla(String totalMedalla){
            totalmedalla.setText(totalMedalla);
        }

        private void renderMedalla(){
            getImageMedallaOro(medallaoro);
            getImageMedallaPlata(medallaplata);
            getImageMedallaBronce(medallabronce);
            getImageTotalMedalla(totalmedallaImagen);
        }

        private void getImageBanderaPais(String image, ImageView imageView){
            Picasso.with(getContext()).load(image).fit().centerCrop().into(imageView);
        }

        private void getImageMedallaOro(ImageView imageView){
            Picasso.with(getContext()).load(R.drawable.oro).fit().centerCrop().into(imageView);
        }

        private void getImageMedallaPlata(ImageView imageView){
            Picasso.with(getContext()).load(R.drawable.plata).fit().centerCrop().into(imageView);
        }

        private void getImageMedallaBronce( ImageView imageView){
            Picasso.with(getContext()).load(R.drawable.bronce).fit().centerCrop().into(imageView);
        }

        private void getImageTotalMedalla( ImageView imageView){
            Picasso.with(getContext()).load(R.mipmap.ic_medalla).fit().centerCrop().into(imageView);
        }

        private Context getContext(){
            return itemView.getContext();
        }
    }
}

