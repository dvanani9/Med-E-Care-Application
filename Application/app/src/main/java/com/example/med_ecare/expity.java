package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class expity extends AppCompatActivity {
Button kkkkk;
Button nnnnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expity);
        kkkkk = (Button) findViewById(R.id.button34);
        nnnnn = (Button) findViewById(R.id.button35);

        kkkkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent44 = new Intent(expity.this,LooseMotion.class);
                expity.this.startActivity(Intent44);
                Toast.makeText(expity.this, "You Have 60% chance of having Loose Motion", Toast.LENGTH_LONG).show();

            }
        });
        nnnnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent45 = new Intent(expity.this,FoodPoisoning.class);
                expity.this.startActivity(Intent45);
                Toast.makeText(expity.this, "You Have 55% chance of having Stomachache", Toast.LENGTH_LONG).show();


            }
        });
    }
}
