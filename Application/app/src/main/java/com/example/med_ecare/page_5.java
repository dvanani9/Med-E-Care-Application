package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page_5 extends AppCompatActivity {
    Button con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_5);
        con = (Button) findViewById(R.id.button8);

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent8 = new Intent(page_5.this,page_4.class);
                page_5.this.startActivity(Intent8);
            }
        });

    }
}
