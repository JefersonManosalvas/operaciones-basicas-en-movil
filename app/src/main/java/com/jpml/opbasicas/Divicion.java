package com.jpml.opbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Divicion extends AppCompatActivity {
    EditText edNumero1,ednumero2;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divicion);

        edNumero1=findViewById(R.id.txtNumDiv);
        ednumero2=findViewById(R.id.txtNumDiv2);
        tvResultado=findViewById(R.id.txtResultadoDiv);
    }

    public  void Multiplicaccion(View v){
        try {
            double numero1= Double.parseDouble(edNumero1.getText().toString());
            int numero2=Integer.parseInt(ednumero2.getText().toString());
            double resultado;
            resultado=numero1/numero2;
            tvResultado.setText(resultado+"");

        }catch (Exception e){
          //  Toast.makeText();

        }



    }
}