package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class page_7 extends AppCompatActivity {
    Button male;
    Button female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_7);
        male = (Button) findViewById(R.id.button10);
        female = (Button) findViewById(R.id.button11);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent10 = new Intent(page_7.this,page_8.class);
                page_7.this.startActivity(Intent10);
                Toast.makeText(page_7.this, "You have selected Male", Toast.LENGTH_LONG).show();
            }
        });
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent11 = new Intent(page_7.this,page_8.class);
                page_7.this.startActivity(Intent11);
                Toast.makeText(page_7.this, "You have selected Female", Toast.LENGTH_LONG).show();
            }
        });
    }
}
