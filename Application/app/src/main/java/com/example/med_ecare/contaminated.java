package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class contaminated extends AppCompatActivity {
Button kkkk;
Button nnnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contaminated);
        kkkk = (Button) findViewById(R.id.button32);
        nnnn = (Button) findViewById(R.id.button33);

        kkkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent42 = new Intent(contaminated.this,expity.class);
                contaminated.this.startActivity(Intent42);


            }
        });
        nnnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent43 = new Intent(contaminated.this,expity.class);
                contaminated.this.startActivity(Intent43);



            }
        });
    }
}
