package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class page_1 extends AppCompatActivity {
    Button email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_1);
        email = (Button) findViewById(R.id.button3);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent3 = new Intent(page_1.this,page_2.class);
                page_1.this.startActivity(Intent3);
                Toast.makeText(page_1.this, "Enter your Email id", Toast.LENGTH_LONG).show();
            }
        });
    }
}
