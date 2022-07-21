package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class coldques extends AppCompatActivity {
Button kkkkkk;
Button nnnnnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coldques);
        kkkkkk = (Button) findViewById(R.id.button36);
        nnnnnn = (Button) findViewById(R.id.button37);

        kkkkkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent46 = new Intent(coldques.this,Fever.class);
                coldques.this.startActivity(Intent46);
                Toast.makeText(coldques.this, "You Have 60% chance of having Fever", Toast.LENGTH_LONG).show();

            }
        });
        nnnnnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent47 = new Intent(coldques.this,Cough.class);
                coldques.this.startActivity(Intent47);
                Toast.makeText(coldques.this, "You Have 70% chance of having Cough", Toast.LENGTH_LONG).show();


            }
        });
    }
}
