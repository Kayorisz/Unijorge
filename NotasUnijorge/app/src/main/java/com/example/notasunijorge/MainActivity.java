package com.example.notasunijorge;
import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private EditText notaA1, notaA2, notaA3;
    private TextView resultadoMedia;
    private Button calcularMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notaA1 = findViewById(R.id.notaA1);
        notaA2 = findViewById(R.id.notaA2);
        notaA3 = findViewById(R.id.notaA3);

        resultadoMedia = findViewById(R.id.resultadoMedia);
        calcularMedia = findViewById(R.id.calcularMedia);

        calcularMedia.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calcularMediaFinal();
            }
        });
    }

    private void calcularMediaFinal()
    {
        double a1 = Double.parseDouble(notaA1.getText().toString());
        double a2 = Double.parseDouble(notaA2.getText().toString());
        double a3 = Double.parseDouble(notaA3.getText().toString());

        double media = (a1 + a2 + a3) / 3;

        resultadoMedia.setText(String.format(new Locale("pt", "BR"), "Média Final: %.2f", media));

    }
}
