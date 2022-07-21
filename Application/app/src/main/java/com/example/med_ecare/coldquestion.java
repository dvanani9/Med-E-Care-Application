package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class coldquestion extends AppCompatActivity {
    Button o;
    Button noo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coldquestion);
        o = (Button) findViewById(R.id.button26);
        noo = (Button) findViewById(R.id.button27);

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent36 = new Intent(coldquestion.this,coughquestion.class);
                coldquestion.this.startActivity(Intent36);

            }
        });
        noo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent37 = new Intent(coldquestion.this,coughquestion.class);
                coldquestion.this.startActivity(Intent37);


            }
        });
    }
}
