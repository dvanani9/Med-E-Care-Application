package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class page_10 extends AppCompatActivity {
    Button yasss;
    Button noooo;
    Button notsuree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_10);
        yasss = (Button) findViewById(R.id.button18);
        noooo = (Button) findViewById(R.id.button19);
        notsuree = (Button) findViewById(R.id.button20);

        yasss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent18 = new Intent(page_10.this,page_11.class);
                page_10.this.startActivity(Intent18);
                Toast.makeText(page_10.this, "Thank You for answering Question", Toast.LENGTH_LONG).show();
            }
        });
        noooo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent19 = new Intent(page_10.this,page_11.class);
                page_10.this.startActivity(Intent19);
                Toast.makeText(page_10.this, "Thank You for answering Question", Toast.LENGTH_LONG).show();
            }
        });
        notsuree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent20 = new Intent(page_10.this,page_11.class);
                page_10.this.startActivity(Intent20);
                Toast.makeText(page_10.this, "Thank You for answering Question", Toast.LENGTH_LONG).show();
            }
        });
    }
}
