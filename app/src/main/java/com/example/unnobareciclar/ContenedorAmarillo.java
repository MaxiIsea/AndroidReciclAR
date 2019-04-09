package com.example.unnobareciclar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class ContenedorAmarillo extends AppCompatActivity {

    private ArrayList<Residuo> listResiduos;
    RecyclerView recyclerResiduos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_amarillo);

        listResiduos = new ArrayList<Residuo>();
        recyclerResiduos = (RecyclerView) findViewById(R.id.recyclerId);
        recyclerResiduos.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        llenarResiduos();

        AdapterDatos adapter = new AdapterDatos(listResiduos);
        recyclerResiduos.setAdapter(adapter);
    }

    private void llenarResiduos() {
        listResiduos.add(new Residuo("Botellas de Vidrio", R.drawable.amarillo_botellasvidrio));
        listResiduos.add(new Residuo("Bricks", R.drawable.amarillo_bricks));
        listResiduos.add(new Residuo("Envases Metàlicos", R.drawable.amarillo_envasesmetalicos));
        listResiduos.add(new Residuo("Envases de Plástico", R.drawable.amarillo_envasesplastico));
        listResiduos.add(new Residuo("Envases de Vidrio", R.drawable.amarillo_envasesvidrio));
    }

    public void Volver(View view) {
        finish();
    }

    public void goHome(View view) {
        Intent goHome = new Intent(this, MainActivity.class);
        startActivity(goHome);
    }
}
