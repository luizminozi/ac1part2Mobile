package com.example.ac1p2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button pdaButton = findViewById(R.id.pda);
        Button fazendaButton = findViewById(R.id.fazenda);
        Button jardimBotanicoButton = findViewById(R.id.jardimbotanico);


        fazendaButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainFazenda.class);
            startActivity(intent);
        });



        pdaButton.setOnClickListener(v -> {
            Intent intent = new Intent(this,MainPDA.class);
            startActivity(intent);
        });

        jardimBotanicoButton.setOnClickListener(v -> {
            Intent intent = new Intent(this,MainJardim.class);
            startActivity(intent);
        });
    }
}