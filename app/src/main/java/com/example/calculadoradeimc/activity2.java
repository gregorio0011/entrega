package com.example.calculadoradeimc;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.calculadoradeimc.R;
import com.example.calculadoradeimc.abaixodopeso;
import com.example.calculadoradeimc.obesidadegrau1;
import com.example.calculadoradeimc.obesidadegrau2;
import com.example.calculadoradeimc.obesidadegrau3;
import com.example.calculadoradeimc.pesonormal;
import com.example.calculadoradeimc.sobrepeso;

public class activity2 extends AppCompatActivity {

    private Button btnVoltar;
    private Button btnCalcular;
    private EditText campoAltura;
    private EditText campoPeso;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Ciclo de Vida", "Tela 3 - onCreate");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity2);

        btnVoltar = findViewById(R.id.btnVoltar);
        btnCalcular = findViewById(R.id.btnAnalisar);
        campoAltura = findViewById(R.id.DigiteAltura);
        campoPeso = findViewById(R.id.DigitePeso);
        resultado = findViewById(R.id.Resultado);

        btnVoltar.setOnClickListener(view -> finish());

        btnCalcular.setOnClickListener(view -> enviar(view));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void enviar(View view){
        try {
            double peso = Double.parseDouble(campoPeso.getText().toString());
            double altura = Double.parseDouble(campoAltura.getText().toString());
            double imc = peso / (altura * altura);

            resultado.setText("Seu IMC é: " + imc);

            Class<?> destino;
            if (imc < 18.5) destino = abaixodopeso.class;
            else if (imc < 25) destino = pesonormal.class;
            else if (imc < 30) destino = sobrepeso.class;
            else if (imc < 35) destino = obesidadegrau1.class;
            else if (imc < 40) destino = obesidadegrau2.class;
            else destino = obesidadegrau3.class;

            Intent intent = new Intent(this, destino);
            intent.putExtra("peso", peso);
            intent.putExtra("altura", altura);
            intent.putExtra("imc", imc);
            startActivity(intent);
        } catch (NumberFormatException e) {
            resultado.setText("Por favor, insira valores válidos.");
        }
    }

    public void limpar(View view){
        resultado.setText("-------");
        campoPeso.setText("");
        campoAltura.setText("");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ciclo de Vida", "Tela 3 - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ciclo de Vida", "Tela 3 - onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ciclo de Vida", "Tela 3 - onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ciclo de Vida", "Tela 3 - onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Ciclo de Vida", "Tela 3 - onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ciclo de Vida", "Tela 3 - onStart");
    }




}