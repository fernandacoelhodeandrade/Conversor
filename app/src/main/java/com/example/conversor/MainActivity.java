package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void converter(View view){

        EditText editDolar;
        TextView textResultado;

        editDolar = findViewById(R.id.editDolar);
        textResultado = findViewById(R.id.textResultado);

        Double valorDolar = Double.parseDouble(editDolar.getText().toString());

        Double valorConvertido = valorDolar * 5.28;

        textResultado.setText("Valor em R$: " + valorConvertido);

    }

    public void converter2(View view){

        EditText editReal;
        TextView textResultado2;

        editReal = findViewById(R.id.editReal);
        textResultado2 = findViewById(R.id.textResultado2);

        Double valorReal = Double.parseDouble(editReal.getText().toString());

        Double valorConvertido = valorReal * 0.19;

        textResultado2.setText("Valor em U$$: " + valorConvertido);

    }


}