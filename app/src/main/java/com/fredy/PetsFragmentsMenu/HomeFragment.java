package com.fredy.PetsFragmentsMenu;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;



public class HomeFragment extends Fragment {


    ArrayList<Mascota> mascotas;
        private RecyclerView listademascotas;
        @Nullable
        @Override
        //Inflara el Layout, asociara eel layout con nuestra clase
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment_home ,container,false);







            listademascotas = (RecyclerView) view.findViewById(R.id.rvmascotas);

            LinearLayoutManager llm = new LinearLayoutManager(getActivity());
            llm.setOrientation(LinearLayoutManager.VERTICAL);
            listademascotas.setLayoutManager(llm);

            InicializarListaContactos();
            InicializarAdaptador();



            return view;

        }



    public void InicializarAdaptador(){
        MascotaAdapter adapter = new MascotaAdapter(mascotas, getActivity());
        listademascotas.setAdapter(adapter);



    }



    public void InicializarListaContactos(){



        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.cat_animals_pet_feline_5,"Gato Felino","3"));
        mascotas.add(new Mascota(R.drawable.dog_pets_puppies_pet_0,"Perro Puppy","4"));
        mascotas.add(new Mascota(R.drawable.cat_pet_animal_pet,"Gatico","5"));
        mascotas.add(new Mascota(R.drawable.pet_squirrel_small_animals,"Ardilla","5"));
        mascotas.add(new Mascota(R.drawable.rabbit_bunny_pet_grass,"Conejo","5"));


    }
}

