package com.example.unnobareciclar;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;
import java.util.Calendar;


public class Recordatorios_Add extends AppCompatActivity implements View.OnClickListener {

    private ImageButton breloj, badd;
    private CheckBox checkL, checkM, checkX, checkJ, checkV, checkS, checkD;
    private TextView tv_hora;
    private TextView tv_dias;
    private int hora, minutos;
    private String dias = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recordatorios__add);

        breloj = (ImageButton) findViewById(R.id.button_reloj);
        badd = (ImageButton) findViewById(R.id.button_add);

        checkL = (CheckBox) findViewById(R.id.chk_lun);
        checkM = (CheckBox) findViewById(R.id.chk_mar);
        checkX = (CheckBox) findViewById(R.id.chk_mie);
        checkJ = (CheckBox) findViewById(R.id.chk_jue);
        checkV = (CheckBox) findViewById(R.id.chk_vie);
        checkS = (CheckBox) findViewById(R.id.chk_sab);
        checkD = (CheckBox) findViewById(R.id.chk_dom);

        tv_hora = (TextView) findViewById(R.id.txt_hora);
        tv_dias = (TextView) findViewById(R.id.txt_selec_dias);


        breloj.setOnClickListener(this);
    }

    public void Volver(View view) {
        finish();
    }

    public void goHome(View view) {
        Intent goHome = new Intent(this, MainActivity.class );
        startActivity(goHome);
    }

    //Método selección de hora
    @Override
    public void onClick(View v) {
        if (v == breloj) {
            final Calendar c = Calendar.getInstance();
            hora = c.get(Calendar.HOUR_OF_DAY);
            minutos = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    tv_hora.setText(hourOfDay + ":" + minute + " Hs.");
                }
            }, hora, minutos, true);
            timePickerDialog.show();
        }
    }

    //Metodo para los dias
    public void seleccion_dias(View view){
        tv_dias.setText("");
        dias = "";

        if(checkL.isChecked()){
            //tv_dias.setText(dias + "Lunes, ");
            dias = dias + "Lunes, ";
        }
        if(checkM.isChecked()){
            //tv_dias.setText(dias + "Martes, ");
            dias = dias + "Martes, ";
        }
        if(checkX.isChecked()){
            //tv_dias.setText(dias + "Miércoles, ");
            dias = dias + "Miércoles, ";
        }
        if(checkJ.isChecked()){
            //tv_dias.setText(dias + "Jueves, ");
            dias = dias + "Jueves, ";
        }
        if(checkV.isChecked()){
            //tv_dias.setText(dias + "Viernes, ");
            dias = dias + "Viernes, ";
        }
        if(checkS.isChecked()){
            //tv_dias.setText(dias + "Sábado, ");
            dias = dias + "Sábado, ";
        }
        if(checkD.isChecked()){
            //tv_dias.setText(dias + "Domingo");
            dias = dias + "Domingo";
        }
        tv_dias.setText(dias);
    }

    //Metodo para agregar el recordatorio
    public void agregar(View view){
        Intent i = new Intent(this, Recordatorios.class);
        i.putExtra("dato1", tv_hora.getText().toString());
        i.putExtra("dato2", tv_dias.getText().toString());
        startActivity(i);
    }
}
