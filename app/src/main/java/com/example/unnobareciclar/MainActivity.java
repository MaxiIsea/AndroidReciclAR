package com.example.unnobareciclar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goContenedores(View view) {
        Intent goContenedores = new Intent(this, Contenedores.class);
        startActivity(goContenedores);
    }

    public void goRecordatorios(View view){
        Intent goRecordatorios = new Intent(this,Recordatorios.class);
        startActivity(goRecordatorios);
    }
}
