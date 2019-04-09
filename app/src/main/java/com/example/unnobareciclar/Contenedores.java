package com.example.unnobareciclar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Contenedores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedores);
    }

    public void goContenedorAzul(View view) {
        Intent goContenedorAzul = new Intent(this, ContenedorAzul.class);
        startActivity(goContenedorAzul);
    }

    public void goContenedorNaranja(View view) {
        Intent goContenedorNaranja = new Intent(this, ContenedorNaranja.class);
        startActivity(goContenedorNaranja);
    }

    public void goContenedorVerde(View view) {
        Intent goContenedorVerde = new Intent(this, ContenedorVerde.class);
        startActivity(goContenedorVerde);
    }

    public void goContenedorAmarillo(View view) {
        Intent goContenedorAmarillo = new Intent(this, ContenedorAmarillo.class);
        startActivity(goContenedorAmarillo);
    }

    public void Volver(View view) {
        finish();
    }

    public void goHome(View view) {
        Intent goHome = new Intent(this, MainActivity.class );
        startActivity(goHome);
    }
}
