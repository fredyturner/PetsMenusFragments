package com.fredy.PetsFragmentsMenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class FavoritoPets extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listademascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorito_pets);

        androidx.appcompat.widget.Toolbar miActionbar2 = (androidx.appcompat.widget.Toolbar) findViewById(R.id.miActiobar2);
        setSupportActionBar(miActionbar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listademascotas = (RecyclerView) findViewById(R.id.rvmascotas2);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);


        listademascotas.setLayoutManager(llm);
        InicializarListaContactos();
        InicializarAdaptador();


    }

    public void InicializarAdaptador(){
        MascotaAdapter adapter = new MascotaAdapter(mascotas, this);
        listademascotas.setAdapter(adapter);



    }


    public void InicializarListaContactos(){



        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.dog_pets_puppies_pet_0,"Perro Puppy","4"));
        mascotas.add(new Mascota(R.drawable.pet_squirrel_small_animals,"Ardilla","5"));
        mascotas.add(new Mascota(R.drawable.cat_animals_pet_feline_5,"Gato Felino","3"));
        mascotas.add(new Mascota(R.drawable.rabbit_bunny_pet_grass,"Conejo","5"));
        mascotas.add(new Mascota(R.drawable.cat_pet_animal_pet,"Gatico","5"));




    }




}

