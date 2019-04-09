package com.example.unnobareciclar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class ContenedorAzul extends AppCompatActivity {

    private ArrayList<Residuo> listResiduos;
    RecyclerView recyclerResiduos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_azul);

        listResiduos = new ArrayList<Residuo>();
        recyclerResiduos = (RecyclerView) findViewById(R.id.recyclerId);
        recyclerResiduos.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        llenarResiduos();

        AdapterDatos adapter = new AdapterDatos(listResiduos);
        recyclerResiduos.setAdapter(adapter);
    }

    private void llenarResiduos() {
        listResiduos.add(new Residuo("Cajas de Carton", R.drawable.azul_carton_cajadecarton_01));
        listResiduos.add(new Residuo("Cajas de Cereales", R.drawable.azul_carton_cajadecereales_01));
        listResiduos.add(new Residuo("Cajas de Cereales", R.drawable.azul_carton_cajadecereales_02));
        listResiduos.add(new Residuo("Cajas de Productos Congelados", R.drawable.azul_carton_cajadeproductocongelado_01));
        listResiduos.add(new Residuo("Cajas de Productos Congelados", R.drawable.azul_carton_cajadeproductocongelado_02));
        listResiduos.add(new Residuo("Cajas de Zapatos", R.drawable.azul_carton_cajadezapatos_01));
        listResiduos.add(new Residuo("Cajas de Zapatos", R.drawable.azul_carton_cajadezapatos_02));
        listResiduos.add(new Residuo("Envases de Carton", R.drawable.azul_carton_envasesdecarton_01));
        listResiduos.add(new Residuo("Hueveras", R.drawable.azul_carton_huevera_01));
        listResiduos.add(new Residuo("Hueveras", R.drawable.azul_carton_huevera_02));
        listResiduos.add(new Residuo("Bolsa de Papel", R.drawable.azul_papel_bolsa_papel_01));
        listResiduos.add(new Residuo("Bolsa de Papel", R.drawable.azul_papel_bolsa_papel_02));
        listResiduos.add(new Residuo("Bolsa de Papel", R.drawable.azul_papel_bolsa_papel_03));
        listResiduos.add(new Residuo("Diarios", R.drawable.azul_papel_diarios_01));
        listResiduos.add(new Residuo("Diarios", R.drawable.azul_papel_diarios_02));
        listResiduos.add(new Residuo("Libros", R.drawable.azul_papel_libro_01));
        listResiduos.add(new Residuo("Libros", R.drawable.azul_papel_libro_02));
        listResiduos.add(new Residuo("Revistas", R.drawable.azul_papel_revista_01));
        listResiduos.add(new Residuo("Revistas", R.drawable.azul_papel_revista_02));
    }

    public void Volver(View view) {
        finish();
    }

    public void goHome(View view) {
        Intent goHome = new Intent(this, MainActivity.class);
        startActivity(goHome);
    }
}
