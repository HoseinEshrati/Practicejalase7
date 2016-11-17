package com.example.hosein.practic7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView namet, familyt, emait, aget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        namet = (TextView) findViewById(R.id.textname);
        familyt = (TextView) findViewById(R.id.textfamily);
        emait = (TextView) findViewById(R.id.textemail);
        aget = (TextView) findViewById(R.id.textage);
        Intent intent = getIntent();
        String name2= intent.getStringExtra("namego");
        namet.setText(name2);
        String family2= intent.getStringExtra("familygo");
        familyt.setText(family2);
        String email2= intent.getStringExtra("emailgo");
        emait.setText(email2);
       int age2 = intent.getIntExtra("agego" ,0);
        aget.setText(String.valueOf(age2));


    }
}
