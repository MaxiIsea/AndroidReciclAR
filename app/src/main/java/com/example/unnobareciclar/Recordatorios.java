package com.example.unnobareciclar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Recordatorios extends AppCompatActivity {

    //private EditText et1;
    //private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recordatorios);

        String dato1 = getIntent().getStringExtra("dato1");
        String dato2 = getIntent().getStringExtra("dato2");

        //et1.setText("Hora:" + dato1);
        //tv1.setText("Dias" + dato2);

    }

    public void Volver(View view) {
        finish();
    }

    public void goHome(View view) {
        Intent goHome = new Intent(this, MainActivity.class );
        startActivity(goHome);
    }

    public void agregarRecordatorios(View view){
        Intent agregarRecordatorios = new Intent(this, Recordatorios_Add.class);
        startActivity(agregarRecordatorios);
    }
}
