package com.example.med_ecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class page_4 extends AppCompatActivity {
    Button accept;
    Button terms;
    CheckBox checkBox,checkBox1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_4);
        accept = (Button) findViewById(R.id.button6);
        terms = (Button) findViewById(R.id.button7);
        checkBox=findViewById(R.id.checkbox);
        checkBox1=findViewById(R.id.checkbox1);

        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent6 = new Intent(page_4.this,page_6.class);
                page_4.this.startActivity(Intent6);
                Toast.makeText(page_4.this, "Terms and Conditions Accepted Successfully", Toast.LENGTH_LONG).show();
            }
        });
        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent7 = new Intent(page_4.this,page_5.class);
                page_4.this.startActivity(Intent7);
            }
        });
    }
    public void selectItem(View view)
    {
        boolean checked = ((CheckBox)view).isChecked();
        switch (view.getId())
        {
            case R.id.checkbox:
                break;
            case R.id.checkbox1:
                break;
        }
    }
}
