package com.miguelrisquelme.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularIMC(View v){
        EditText etxtPeso = findViewById(R.id.etxtPeso);
        EditText etxtAltura = findViewById(R.id.etxtAltura);
        TextView txtResultado = findViewById(R.id.txtResultado);

        float peso = Float.parseFloat(etxtPeso.getText().toString());
        float altura = Float.parseFloat(etxtAltura.getText().toString());

        float resultado = (peso / (altura * altura));

        txtResultado.setText(valueOf(resultado));
    }
}
