package com.example.funcionmatematica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etnum1 = findViewById(R.id.etnum1),
                 etnum2 = findViewById(R.id.etnum2);

//Boton Suma
        Button sumas = findViewById(R.id.sumas);
        sumas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String enum1 = etnum1.getText().toString(),
                        enum2 = etnum2.getText().toString();
                if (enum1.equals("") || enum2.equals("")) {
                   return;
                }

               int numero1 = Integer.parseInt(enum1), numero2 = Integer.parseInt(enum2);

                int suma = numero1 + numero2;
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("datos", suma);

                startActivity(intent);
            }
        });

//Boton Resta
        Button restas = findViewById(R.id.restas);
        restas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String etnu1 = etnum1.getText().toString(),
                        etnu2 = etnum2.getText().toString();
                if (etnu1.equals("") || etnu2.equals("")) {
                    return;
                }

                int numer1 = Integer.parseInt(etnu1), numer2 = Integer.parseInt(etnu2);

                int resta = numer1 - numer2;
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("datos", resta);

                startActivity(intent);
            }
        });

//Boton Mulplicar
        Button multi = findViewById(R.id.multi);
        multi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String nu1 = etnum1.getText().toString(),
                       nu2 = etnum2.getText().toString();
                if (nu1.equals("") || nu2.equals("")) {
                    return;
                }

                int numers1 = Integer.parseInt(nu1), numers2 = Integer.parseInt(nu2);

                int multiplica = numers1 * numers2;
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("datos", multiplica);

                startActivity(intent);
            }
        });

//Boton Dividir
        Button divide = findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String num1 = etnum1.getText().toString(),
                        num2 = etnum2.getText().toString();
                if (num1.equals("") || num2.equals("")) {
                    return;
                }

                int nume1 = Integer.parseInt(num1), nume2 = Integer.parseInt(num2);

                int division = nume1 / nume2;
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("datos", division);

                startActivity(intent);
            }
        });
    }
}