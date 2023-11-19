package com.jpml.opbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class suma extends AppCompatActivity {
    EditText edNumero1,ednumero2;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        edNumero1=findViewById(R.id.txtNum1);
        ednumero2=findViewById(R.id.txtNum2);
        tvResultado=findViewById(R.id.txtResultadosum);
    }

    public  void Suma(View v){
        double numero1= Double.parseDouble(edNumero1.getText().toString());
        int numero2=Integer.parseInt(ednumero2.getText().toString());
        double resultado;
        resultado=numero1+numero2;
        tvResultado.setText(resultado+"");


    }
}