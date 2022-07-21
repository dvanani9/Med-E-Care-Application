package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class page_3 extends AppCompatActivity {
    EditText password;
    Button done1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_3);
        password = (EditText) findViewById(R.id.editText2);
        done1 = (Button) findViewById(R.id.button5);

        done1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String pas = password.getText().toString();
                if (pas.isEmpty()) {
                    password.setError("Provide Password");
                    password.requestFocus();
                }
                else if (!(pas.isEmpty())) {
                    Intent Intent5 = new Intent(page_3.this, page_4.class);
                    page_3.this.startActivity(Intent5);
                    Toast.makeText(page_3.this, "Password entered Successfully", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}