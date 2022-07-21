package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button newacc;
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newacc = (Button) findViewById(R.id.button);
        signup = (Button) findViewById(R.id.button2);

        newacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent1 = new Intent(MainActivity.this,page_1.class);
                MainActivity.this.startActivity(Intent1);
                Toast.makeText(MainActivity.this, "Create New Account", Toast.LENGTH_LONG).show();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent2 = new Intent(MainActivity.this,page_14.class);
                MainActivity.this.startActivity(Intent2);
                Toast.makeText(MainActivity.this, "Sign In", Toast.LENGTH_LONG).show();
            }
        });
    }
}
