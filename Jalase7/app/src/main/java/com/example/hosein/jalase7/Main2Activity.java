package com.example.hosein.jalase7;

import android.content.Intent;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView name3,famil3,email3,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name3= (TextView) findViewById(R.id.textname3);
        famil3= (TextView) findViewById(R.id.textfamily3);
        email3= (TextView) findViewById(R.id.textemail3);
        age= (TextView) findViewById(R.id.textage);

        Intent intent =getIntent();


        String n = intent.getStringExtra("n");
        name3.setText(n);
        String f = intent.getStringExtra("f");
        famil3.setText(f);
        String e = intent.getStringExtra("e");
        email3.setText(e);
        int a =intent.getIntExtra("Age",0);




        age.setText(String.valueOf(a));

    }
}
