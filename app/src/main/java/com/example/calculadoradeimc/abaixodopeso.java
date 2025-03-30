package com.example.calculadoradeimc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class abaixodopeso extends AppCompatActivity {
    private Button btnVoltarPesoAbaixo;
    private TextView txtResultadoAbaixo;
    private TextView txtMensagemAbaixo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_abaixodopeso);


        txtResultadoAbaixo = findViewById(R.id.txtResultadoAbaixo);
        txtMensagemAbaixo = findViewById(R.id.txtMensagemAbaixo);
        btnVoltarPesoAbaixo = findViewById(R.id.btnVoltarPesoAbaixo);

        // Receber os dados da Activity anterior
        Intent intent = getIntent();
        double imc = intent.getDoubleExtra("imc", 0.0);
        double altura = intent.getDoubleExtra("altura", 0.0);
        double peso = intent.getDoubleExtra("peso", 0.0);

        // Exibir os dados na tela
        txtResultadoAbaixo.setText("Seu IMC: " + String.format("%.2f", imc) + "\nAltura: " + altura + " m\nPeso: " + peso + " kg");
        txtMensagemAbaixo.setText("Você está abaixo do peso ideal. Tente manter uma alimentação saudável e equilibrada!");

        // Botão para voltar à tela principal
        btnVoltarPesoAbaixo.setOnClickListener(view -> finish()); // Finaliza a Activity e volta à anterior


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}