package com.example.hosein.jalase7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name1, family1, email1, age1;
    Button subbtn;
    int age3;
    String age2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subbtn = (Button) findViewById(R.id.btsubmit);
        name1 = (EditText) findViewById(R.id.edittextname);
        family1 = (EditText) findViewById(R.id.edittextfamily);
        email1 = (EditText) findViewById(R.id.edittextemail);
        age1 = (EditText) findViewById(R.id.edittextage);


        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
                String name2 = name1.getText().toString();
                String family2 = family1.getText().toString();
                String email2 = email1.getText().toString();
               if (!age1.getText().toString().equals("")){

                age3 = Integer.parseInt(age1.getText().toString());

               }
                else {

                 age2  = age1.getText().toString();
               }
                if (name2.equals(null) || name2.equals("") || family2.equals(null) || family2.equals("") || email2.equals(null) || age2.equals("")|| email2.equals("")) {
                    Toast.makeText(MainActivity.this, "please enter something in text box", Toast.LENGTH_LONG).show();
                }

               else if (!name2.equals("") && !family2.equals("") && !email1.equals("") && age3 > 5 && age3 <= 100) {
                    intent2.putExtra("n", name2);
                    intent2.putExtra("f", family2);
                    intent2.putExtra("e", email2);
                    intent2.putExtra("Age", age3);

                    startActivity(intent2);
                }
               else {

                    Toast.makeText(MainActivity.this, "Enter corecctly", Toast.LENGTH_LONG).show();

                }

            }
        });

    }
}
