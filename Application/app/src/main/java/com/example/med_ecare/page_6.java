package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class page_6 extends AppCompatActivity {
    Button send;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_6);
        name = (EditText) findViewById(R.id.editText3);
        send = (Button) findViewById(R.id.button9);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String nam = name.getText().toString();
                if (nam.isEmpty()) {
                    name.setError("Provide Name");
                    name.requestFocus();
                }
                else if (!(nam.isEmpty())) {
                Intent Intent9 = new Intent(page_6.this, page_7.class);
                page_6.this.startActivity(Intent9);
                Toast.makeText(page_6.this, "Name Entered Successfully", Toast.LENGTH_LONG).show();
            }
            }
        });
    }
}
