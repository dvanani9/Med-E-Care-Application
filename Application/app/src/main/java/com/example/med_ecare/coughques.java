package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class coughques extends AppCompatActivity {
    Button kkk;
    Button nnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coughques);
        kkk = (Button) findViewById(R.id.button30);
        nnn = (Button) findViewById(R.id.button31);

        kkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent40 = new Intent(coughques.this,Coronavirus.class);
                coughques.this.startActivity(Intent40);
                Toast.makeText(coughques.this, "You Have 35% chance of having Corona Virus. Please do check up", Toast.LENGTH_LONG).show();

            }
        });
        nnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent41 = new Intent(coughques.this,Fever.class);
                coughques.this.startActivity(Intent41);
                Toast.makeText(coughques.this, "You Have 55% chance of having Fever", Toast.LENGTH_LONG).show();


            }
        });
    }
}
