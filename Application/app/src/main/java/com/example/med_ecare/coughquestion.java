package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class coughquestion extends AppCompatActivity {
Button k;
Button n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coughquestion);
        k = (Button) findViewById(R.id.button24);
        n = (Button) findViewById(R.id.button25);

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent34 = new Intent(coughquestion.this,Fever.class);
                coughquestion.this.startActivity(Intent34);
                Toast.makeText(coughquestion.this, "You Have 40% chance of getting Fever", Toast.LENGTH_LONG).show();
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent35 = new Intent(coughquestion.this,Headache.class);
                coughquestion.this.startActivity(Intent35);
                Toast.makeText(coughquestion.this, "You Have 55% chance of getting Headache", Toast.LENGTH_LONG).show();

            }
        });


    }
}
