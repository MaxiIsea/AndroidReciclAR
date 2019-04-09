package com.example.unnobareciclar;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {

    private ArrayList<Residuo> listResiduos;

    public AdapterDatos(ArrayList<Residuo> listResiduos) {
        this.listResiduos = listResiduos;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.residuo.setImageResource(listResiduos.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listResiduos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        ImageView residuo;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            residuo = itemView.findViewById(R.id.idResiduo);
        }
    }
}
