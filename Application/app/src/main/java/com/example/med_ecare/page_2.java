package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class page_2 extends AppCompatActivity {
    EditText id;
    Button done;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2);
        id = (EditText) findViewById(R.id.editText);
        done = (Button) findViewById(R.id.button4);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String mail = id.getText().toString();
                if (mail.isEmpty()) {
                    id.setError("Provide Email Id");
                    id.requestFocus();
                }
                else if (!(mail.isEmpty())) {
                    Intent Intent4 = new Intent(page_2.this, page_3.class);
                    page_2.this.startActivity(Intent4);
                    Toast.makeText(page_2.this, "Enter Password", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
