package com.example.transfertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button meDeconnecter = (Button) findViewById(R.id.btnSeDeconnecter);
        Button eEnvoyer = (Button) findViewById(R.id.monEnvoi);
        Button rRetrait = (Button) findViewById(R.id.monRetrait);


        meDeconnecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formConnexion();
            }
        });
        eEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formEnvoie();

            }
        });
        rRetrait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formRetrait();

            }
        });
    }

    private void formEnvoie() {
        Intent intent = new Intent ( this, EnvoiActivity.class);
        startActivity(intent);

    }

    private void formConnexion(){
        Intent intent = new Intent ( this, MainActivity.class);
        startActivity(intent);
    }

    private void formRetrait(){
        Intent intent = new Intent ( this, RetraitActivity.class);
        startActivity(intent);
    }
}