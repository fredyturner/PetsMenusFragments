package com.fredy.PetsFragmentsMenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class ActivityContacto extends AppCompatActivity {

    // Defino los objetos de la interface
    Button button;
    TextInputEditText nombre , email, mensaje ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        // Obtengo los elementos de la interface
        nombre = (TextInputEditText) findViewById(R.id.Nombrecompleto);
        email = findViewById(R.id.Email);
        mensaje = findViewById(R.id.Mensaje);
        button = findViewById(R.id.button2);

        // El setOnClickListener del botón Enviar
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                String enviarcorreo = email.getText().toString();
                String enviarasunto = nombre.getText().toString();
                String enviarmensaje = mensaje.getText().toString();

                // Defino mi Intent y hago uso del objeto ACTION_SEND
                Intent intent = new Intent(Intent.ACTION_SEND);

                // Defino los Strings Email, Asunto y Mensaje con la función putExtra
                intent.putExtra(Intent.EXTRA_EMAIL,
                        new String[] { enviarcorreo });
                intent.putExtra(Intent.EXTRA_SUBJECT, enviarasunto);
                intent.putExtra(Intent.EXTRA_TEXT, enviarmensaje);

                // Establezco el tipo de Intent
                intent.setType("message/rfc822");

                // Lanzo el selector de cliente de Correo
                startActivity(
                        Intent
                                .createChooser(intent,
                                        "Elije un cliente de Correo:"));
            }

        });


    }
}