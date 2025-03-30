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

public class obesidadegrau2 extends AppCompatActivity {

    private Button btnObesidadeDois;
    private TextView txtResultadoObesidadeDois;
    private TextView txtMensagemObesidadeDois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_obesidadegrau2);

        txtResultadoObesidadeDois = findViewById(R.id.txtResultadoObesidadeDois);
        txtMensagemObesidadeDois = findViewById(R.id.txtMensagemObesidadeDois);
        btnObesidadeDois = findViewById(R.id.btnObesidadeDois);

        // Receber os dados da Activity anterior
        Intent intent = getIntent();
        double imc = intent.getDoubleExtra("imc", 0.0);
        double altura = intent.getDoubleExtra("altura", 0.0);
        double peso = intent.getDoubleExtra("peso", 0.0);

        // Exibir os dados na tela
        txtResultadoObesidadeDois.setText("Seu IMC: " + String.format("%.2f", imc) + "\nAltura: " + altura + " m\nPeso: " + peso + " kg");
        txtMensagemObesidadeDois.setText("Você está abaixo do peso ideal. Tente manter uma alimentação saudável e equilibrada!");

        // Botão para voltar à tela principal
        btnObesidadeDois.setOnClickListener(view -> finish()); // Finaliza a Activity e volta à anterior

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}