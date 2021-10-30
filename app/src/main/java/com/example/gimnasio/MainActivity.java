package com.example.gimnasio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button botonCalcular;
    EditText editPeso, editAltura;
    TextView imc;
    Button llamarActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonCalcular = findViewById(R.id.button);
        editPeso = findViewById(R.id.editTextNumberDecimal2);
        editAltura = findViewById(R.id.editTextNumberDecimal);

        //activar action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
       // getSupportActionBar().setIcon(R.mipmap.olimpo_logo_round);

        llamarActivity2 = findViewById(R.id.button2);
        llamarActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CallActivity2 = new Intent(MainActivity.this,SegundaActivity.class);
                startActivity(CallActivity2);
            }
        });


        botonCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                double peso,s;
                double altura;

                peso = Double.valueOf(editPeso.getText().toString()).doubleValue();
                altura = Double.valueOf(editAltura.getText().toString()).doubleValue();

                s = (peso/(altura*altura));

                if (editPeso.equals("")&&editAltura.equals("")){
                    Toast.makeText(MainActivity.this, "Faltan datos", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Su Indice de masa corporal es : "+s, Toast.LENGTH_LONG).show();
                }

            }






        });


        
    }
}