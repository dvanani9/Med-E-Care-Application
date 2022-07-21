package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class page_14 extends AppCompatActivity {
    EditText user;
    EditText pass;
    Button log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_14);
        user = (EditText) findViewById(R.id.editText4);
        pass = (EditText) findViewById(R.id.editText5);
        log = (Button) findViewById(R.id.button22);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = user.getText().toString();
                String pwd = pass.getText().toString();
                if (email.isEmpty()) {
                    user.setError("Provide Email Id");
                    user.requestFocus();
                } else if (pwd.isEmpty()) {
                    pass.setError("Provide Password");
                    pass.requestFocus();
                } else if (email.isEmpty() && pwd.isEmpty()) {
                    Toast.makeText(page_14.this, "Please enter Email Id and Password", Toast.LENGTH_LONG).show();
                } else if (!(email.isEmpty() && pwd.isEmpty())) {


                    Intent Intent23 = new Intent(page_14.this, page_11.class);
                    page_14.this.startActivity(Intent23);
                    Toast.makeText(page_14.this, "Sign In Successful", Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}