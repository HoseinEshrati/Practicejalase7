package com.example.hosein.practic7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, family, email, age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = (Button) findViewById(R.id.btsubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                name = (EditText) findViewById(R.id.editname);
                family = (EditText) findViewById(R.id.editfamily);
                email = (EditText) findViewById(R.id.editemail);
                age = (EditText) findViewById(R.id.editage);
                String name1 = name.getText().toString();
                String family1 = family.getText().toString();
                String emil1 = email.getText().toString();
                int age1 = Integer.parseInt(age.getText().toString());
                if (!name1.equals("") && !family1.equals("") && !emil1.equals("") && age1 <= 100 && age1 > 5) {
                    intent.putExtra("namego", name1);
                    intent.putExtra("familygo", family1);
                    intent.putExtra("emailgo", emil1);
                    intent.putExtra("agego", age1);
                    startActivity(intent);
                }
                else {

                    Toast.makeText(MainActivity.this, "Please Check your information input correctly ", Toast.LENGTH_SHORT).show();

                }


                }

            }

            );

        }
    }
