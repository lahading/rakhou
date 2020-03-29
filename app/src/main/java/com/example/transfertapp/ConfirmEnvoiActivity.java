package com.example.transfertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmEnvoiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_envoi);

        Intent intent = getIntent();
        if (intent != null) {
            String str = "";
            String str1 = "";
            String str2 = "";
            String str3 = "";

            if (((Intent) intent).hasExtra("editText")) {
                str = intent.getStringExtra("editText");
            } else if (((Intent) intent).hasExtra("editText1")) {
                str1 = intent.getStringExtra("editText1");
            } else if (((Intent) intent).hasExtra("editText2")) {
                str2 = intent.getStringExtra("editText2");
            } else if (((Intent) intent).hasExtra("editText3")) {
                str = intent.getStringExtra("editText3");
            }

            //int nbLettre = intent.getIntExtra("nbLettre", 0);

            TextView textView = (TextView) findViewById(R.id.tv1);
            textView.setText (str);
            textView.setText (str1);
            textView.setText (str2);
            textView.setText (str3);


        }
    }
}
