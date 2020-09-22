package com.fredy.PetsFragmentsMenu;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.ContactoViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;
    public MascotaAdapter(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    //Inflar el layout Y LO PASARA al viewHolder para que obtenga los views
    @NonNull
    @Override
    public ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_contacto, parent, false);
        return new ContactoViewHolder(view);
    }

    //Asocia cada elemento de nuestra vista a cada view
    @Override
    public void onBindViewHolder(@NonNull ContactoViewHolder ContactoViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        ContactoViewHolder.imgFoto.setImageResource(mascota.getFoto());
        ContactoViewHolder.tvNombreCV.setText(mascota.getNombre());
        ContactoViewHolder.tvLikesCV.setText(mascota.getLikes());

        ContactoViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity,"Diste like a "+ mascota.getNombre(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {//Cantidad de contactos de mi lista
        return mascotas.size();
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private TextView  tvNombreCV;
        private TextView tvLikesCV;
        private ImageButton btnLike;

        public ContactoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombreCV = (TextView) itemView.findViewById(R.id.tvNombrecv);
            tvLikesCV = (TextView) itemView.findViewById(R.id.tvLikescv);
            btnLike =(ImageButton) itemView.findViewById(R.id.btnlike);

        }
    }
}
