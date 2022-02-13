package com.example.funcionmatematica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView edt1;
    private Object Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

/*
        edt1 = (TextView) findViewById(R.id.edt1);
        String dato = getIntent().getStringExtra("dato");
        edt1.setText("" + dato);*/

       Intent intent = getIntent();
        int datos = intent.getIntExtra("datos", 0);

       TextView edt1 = findViewById(R.id.edt1);

        String mensaje = "el resultado es: " + datos;

        edt1.setText(mensaje);




        /*

        edt1 = (TextView) findViewById(R.id.edt1);

        String dato = getIntent().getStringExtra("dato");
        edt1.setText("El Resultado es: "+ dato);

    }*/

    }
    //metodo del boton regresar
    public void regresar(View view){
        Intent i= new Intent( this, MainActivity.class);
        startActivity(i);
    }
}