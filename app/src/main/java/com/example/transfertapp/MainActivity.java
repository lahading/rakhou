package com.example.transfertapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText inputIdentifiant;
    EditText inputmotPasse;

    private Intent packageContext;

    private void afficherMenu() {
        Intent packageContext;
        Intent intent = new Intent( this, MenuActivity.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button meConnecter = (Button) findViewById(R.id.btnSeConnecter);
        inputIdentifiant = (EditText) findViewById(R.id.identifiant);
        inputmotPasse = (EditText) findViewById(R.id.motPasse);

        meConnecter.setOnClickListener(new View.OnClickListener() {
            @Override



            public void onClick(View v) {
                String id = inputIdentifiant.getText().toString();
                String mdp = inputmotPasse.getText().toString();
                if (id.equals("khaly")&& mdp.equals("1234")) {
                    afficherMenu();
                }
                else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                    builder.setTitle(R.string.app_titre_err_conn);
                    builder.setMessage(R.string.app_msg_err_conn);
                    builder.setPositiveButton(R.string.app_ok,null);
                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
            }
        });

    }
}

