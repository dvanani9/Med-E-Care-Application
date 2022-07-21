package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class page_9 extends AppCompatActivity {
    Button ya;
    Button na;
    Button not;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_9);
        ya = (Button) findViewById(R.id.button15);
        na = (Button) findViewById(R.id.button16);
        not = (Button) findViewById(R.id.button17);

        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent15 = new Intent(page_9.this,page_10.class);
                page_9.this.startActivity(Intent15);
                Toast.makeText(page_9.this, "Thank You for answering Question", Toast.LENGTH_LONG).show();
            }
        });
        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent16 = new Intent(page_9.this,page_10.class);
                page_9.this.startActivity(Intent16);
                Toast.makeText(page_9.this, "Thank You for answering Question", Toast.LENGTH_LONG).show();
            }
        });
        not.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent17 = new Intent(page_9.this,page_10.class);
                page_9.this.startActivity(Intent17);
                Toast.makeText(page_9.this, "Thank You for answering Question", Toast.LENGTH_LONG).show();
            }
        });
    }
}
