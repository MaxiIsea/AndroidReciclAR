package com.example.unnobareciclar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContenedorVerde extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_verde);
    }

    public void Volver(View view) {
        finish();
    }

    public void goHome(View view) {
        Intent goHome = new Intent(this, MainActivity.class);
        startActivity(goHome);
    }
}
