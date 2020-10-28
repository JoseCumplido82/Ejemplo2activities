package com.example.ejemplo2activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_CIUDAD = "ciudad";
    public static final String EXTRA_HABITANTE = "habitante";
    public EditText edt_ciudad=null;
    public EditText edt_habitantes=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_ciudad = (EditText) findViewById(R.id.edtCiudad);
        edt_habitantes = (EditText) findViewById(R.id.edtHabitantes);
    }

    public void ir_activity(View view) {
        Intent intent= new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void enviar_activity2(View view) {
        Intent intent= new Intent(this, Activity2.class);
        //------------------------------------------------
        String ciudad = edt_ciudad.getText().toString();
        String textoHabitantes = edt_habitantes.getText().toString();
        int habitantes = 0;
        try{
            habitantes= Integer.valueOf(textoHabitantes);
            Bundle extras = new Bundle();
            extras.putString(EXTRA_CIUDAD, ciudad);
            extras.putInt(EXTRA_HABITANTE, habitantes);
            intent.putExtras(extras);
           // intent.putExtra(EXTRA_CIUDAD, ciudad);
            //intent.putExtra(EXTRA_HABITANTE, habitantes);
            startActivity(intent);
        }catch (Exception e){
            edt_habitantes.setError("añade un numero");
        }


    }

    //public void enviar_bundle(View view) {
      //  Bundle extras = new Bundle();
        //extras.putString(EXTRA_CIUDAD, "esta es la ciudad");
        //extras.putString(EXTRA_HABITANTE, "estos son los habitantes");
        //messageIntent.putExtras(extras);
        //StartActivity(messageIntent);
   // }
}