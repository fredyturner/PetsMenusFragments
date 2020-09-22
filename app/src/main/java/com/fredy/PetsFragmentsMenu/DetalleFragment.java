package com.fredy.PetsFragmentsMenu;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;



public class DetalleFragment extends Fragment {



    ArrayList<Mascota2> mascotas2;
    private RecyclerView listademascotas;
    @Nullable
    @Override
    //Inflara el Layout, asociara eel layout con nuestra clase
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle ,container,false);

        listademascotas = (RecyclerView) view.findViewById(R.id.rvdetalle);

        GridLayoutManager llm = new GridLayoutManager(getActivity(),3); ;
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listademascotas.setLayoutManager(llm);

        InicializarListaContactos();
        InicializarAdaptador();


        return view;

    }

    public void InicializarAdaptador(){
        MascotaAdapter2 adapter2 = new MascotaAdapter2(mascotas2, getActivity());
        listademascotas.setAdapter(adapter2);



    }



    public void InicializarListaContactos(){



        mascotas2 = new ArrayList<Mascota2>();

        mascotas2.add( new Mascota2(R.drawable.dog_pets_puppies_pet_0,"4"));
        mascotas2.add( new Mascota2(R.drawable.dog_pets_puppies_pet_0,"5"));
        mascotas2.add( new Mascota2(R.drawable.dog_pets_puppies_pet_0,"7"));
        mascotas2.add( new Mascota2(R.drawable.dog_pets_puppies_pet_0,"9"));
        mascotas2.add( new Mascota2(R.drawable.dog_pets_puppies_pet_0,"1"));
        mascotas2.add( new Mascota2(R.drawable.dog_pets_puppies_pet_0,"6"));
        mascotas2.add( new Mascota2(R.drawable.dog_pets_puppies_pet_0,"3"));
        mascotas2.add( new Mascota2(R.drawable.dog_pets_puppies_pet_0,"2"));
        mascotas2.add( new Mascota2(R.drawable.dog_pets_puppies_pet_0,"4"));



    }




}