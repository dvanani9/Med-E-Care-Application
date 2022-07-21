package com.example.database;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
Button ok;
EditText email;
EditText Pass;
EditText Confirm;
private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ok = (Button) findViewById(R.id.button);
        email = (EditText) findViewById(R.id.editText);
        Pass = (EditText) findViewById(R.id.editText2);
        Confirm = (EditText) findViewById(R.id.editText2);
        firebaseAuth=FirebaseAuth.getInstance();

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email1= email.getText().toString().trim();
                String pass= Pass.getText().toString().trim();
                String Conpass= Confirm.getText().toString().trim();

                if(TextUtils.isEmpty(email1)){
                    Toast.makeText(MainActivity.this,"Please enter email",Toast.LENGTH_SHORT).show();
                return;
                }


                if(TextUtils.isEmpty(pass)){
                    Toast.makeText(MainActivity.this,"Please enter Password",Toast.LENGTH_SHORT).show();
                return;
                }

                if(TextUtils.isEmpty(Conpass)){
                    Toast.makeText(MainActivity.this,"Please enter right password",Toast.LENGTH_SHORT).show();
                return;
                }

                if(pass.equals(Conpass)){
                    firebaseAuth.createUserWithEmailAndPassword(email1, pass)
                            .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        Toast.makeText(MainActivity.this,"Successful",Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(MainActivity.this,"Authentication failed",Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }
        });


    }
}
