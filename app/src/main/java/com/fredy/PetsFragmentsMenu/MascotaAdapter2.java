package com.fredy.PetsFragmentsMenu;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdapter2 extends RecyclerView.Adapter<MascotaAdapter2.ContactoViewHolder> {

    ArrayList<Mascota2> mascotas2;
    Activity activity;
    public MascotaAdapter2(ArrayList<Mascota2> mascotas2, Activity activity){
        this.mascotas2 = mascotas2;
        this.activity = activity;
    }

    //Inflar el layout Y LO PASARA al viewHolder para que obtenga los views
    @NonNull
    @Override
    public ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_contacto2, parent, false);
        return new ContactoViewHolder(view);
    }

    //Asocia cada elemento de nuestra vista a cada view
    @Override
    public void onBindViewHolder(@NonNull ContactoViewHolder ContactoViewHolder, int position) {
        final Mascota2 mascota2 = mascotas2.get(position);
        ContactoViewHolder.imgFoto2.setImageResource(mascota2.getFoto());
        ContactoViewHolder.tvLikesCV2.setText(mascota2.getLikes());



    }

    @Override
    public int getItemCount() {//Cantidad de contactos de mi lista
        return mascotas2.size();
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto2;
        private TextView tvLikesCV2;


        public ContactoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto2 = (ImageView) itemView.findViewById(R.id.imgFoto2);
            tvLikesCV2 = (TextView) itemView.findViewById(R.id.tvLikescv2);


        }
    }
}
