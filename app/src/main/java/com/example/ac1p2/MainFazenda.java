package com.example.ac1p2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainFazenda extends AppCompatActivity {

    private Button btnSite;
    private Button btnTelefonar;
    private Button btnMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fazenda);

        btnSite = findViewById(R.id.btnSite);
        btnTelefonar = findViewById(R.id.btnTelefonar);
        btnMapa = findViewById(R.id.btnMapa);

        btnSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSite();
            }
        });

        btnTelefonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telefonar();
            }
        });

        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verMapa();
            }
        });
    }

    private void abrirSite() {
        String url = "https://www.instagram.com/flona_ipanema/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    private void telefonar() {
        String numero = "1532669099";
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + numero));
        startActivity(intent);
    }

    private void verMapa() {
        double latitude = -23.4282;
        double longitude = -47.5928;
        String label = "Fazenda Ipanema";

        Uri gmmIntentUri = Uri.parse("geo:" + latitude + "," + longitude + "?q=" + label);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}