package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class feverquestion extends AppCompatActivity {
    Button kk;
    Button nn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feverquestion);
        kk = (Button) findViewById(R.id.button28);
        nn = (Button) findViewById(R.id.button29);

        kk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent38 = new Intent(feverquestion.this,coughques.class);
                feverquestion.this.startActivity(Intent38);

            }
        });
        nn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent39 = new Intent(feverquestion.this,coughques.class);
                feverquestion.this.startActivity(Intent39);


            }
        });
    }
}
