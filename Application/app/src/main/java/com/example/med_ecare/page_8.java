package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class page_8 extends AppCompatActivity {
    Button yes;
    Button no;
    Button idk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_8);
        yes = (Button) findViewById(R.id.button12);
        no = (Button) findViewById(R.id.button13);
        idk = (Button) findViewById(R.id.button14);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent12 = new Intent(page_8.this,page_9.class);
                page_8.this.startActivity(Intent12);
                Toast.makeText(page_8.this, "Thank You for answering Question", Toast.LENGTH_LONG).show();
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent13 = new Intent(page_8.this,page_9.class);
                page_8.this.startActivity(Intent13);
                Toast.makeText(page_8.this, "Thank You for answering Question", Toast.LENGTH_LONG).show();
            }
        });
        idk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent14 = new Intent(page_8.this,page_9.class);
                page_8.this.startActivity(Intent14);
                Toast.makeText(page_8.this, "Thank You for answering Question", Toast.LENGTH_LONG).show();
            }
        });
    }
}
