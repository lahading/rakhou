package com.example.transfertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnvoiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envoi);

        Button eenvoyer = (Button) findViewById(R.id.envoyer);

        eenvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formEnvoyer();
            }
        });

    }

    private void formEnvoyer(){
        EditText editText = (EditText) findViewById(R.id.pnomexp);
        String str = editText.getText().toString();
        EditText editText1 = (EditText) findViewById(R.id.nomexp);
        String str1 = editText1.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.montantenvoi);
        String str2 = editText2.getText().toString();
        EditText editText3 = (EditText) findViewById(R.id.numexp);
        String str3 = editText3.getText().toString();



        //int nbLettre = str.length();

        Intent intent = new Intent(this, ConfirmEnvoiActivity.class);
        intent.putExtra("editText", str);
        intent.putExtra("editText1", str1);
        intent.putExtra("editText2", str2);
        intent.putExtra("editText3", str3);



        //intent.putExtra("nbLettre", nbLettre);
        startActivity(intent);
    }


}
