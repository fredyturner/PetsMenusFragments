package com.fredy.PetsFragmentsMenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager();

        if (toolbar != null){
            setSupportActionBar(toolbar);
        }





    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new DetalleFragment());

        return fragments;

    }

    private void setupViewPager(){
        viewPager.setAdapter(new pageAdapter(getSupportFragmentManager(),agregarFragments()) );
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_baseline_star_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_baseline_thumb_up_24);

    }


    //Metodo que crea un menu de opciones, y toma el layout menu y lo infla(muestra)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);

        ImageButton btn;
        btn = (ImageButton) findViewById(R.id.starbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FavoritoPets.class);
                startActivity(intent);
            }
        });


        return true;
    }



    //Metodo para cuando se selecione un item del menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){

            case R.id.mContacto :
                //dirigirse a otro activvity
                Intent intent = new Intent(this,ActivityContacto.class);
                startActivity(intent);
                break;

            case R.id.mAcercade :
                Intent i = new Intent(this,ActivityAcercade.class);
                startActivity(i);
                break;


        }



        return super.onOptionsItemSelected(item);
    }









}

