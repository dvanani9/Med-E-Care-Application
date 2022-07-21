package com.example.med_ecare;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class page_11 extends AppCompatActivity {
private DrawerLayout dl;
private ActionBarDrawerToggle abdt;
    Button st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_11);
        st = (Button) findViewById(R.id.button23);
        dl=(DrawerLayout)findViewById(R.id.dl);
        abdt=new ActionBarDrawerToggle(this,dl,R.string.Open,R.string.Close);
        abdt.setDrawerIndicatorEnabled(true);

        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent22 = new Intent(page_11.this,page_13.class);
                page_11.this.startActivity(Intent22);
                Toast.makeText(page_11.this, "Assessment Started", Toast.LENGTH_LONG).show();
            }
        });

        dl.addDrawerListener(abdt);
        abdt.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView nav_view=(NavigationView)findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id=menuItem.getItemId();
                if(id==R.id.videos)
                {
                    Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.huffpost.com/entry/free-online-workout_b_7722024"));
                    startActivity(browserIntent);
                    Toast.makeText(page_11.this,"You have selected Videos",Toast.LENGTH_SHORT).show();
                }
                else if(id==R.id.articles)
                {
                    Intent browserIntent1= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.betterhealth.vic.gov.au/health/HealthyLiving/physical-activity-choosing-the-one-for-you"));
                    startActivity(browserIntent1);
                    Toast.makeText(page_11.this,"You have selected Articles",Toast.LENGTH_SHORT).show();
                }
                else if(id==R.id.help)
                {
                    Toast.makeText(page_11.this,"You have selected Help",Toast.LENGTH_SHORT).show();
                }
                else if(id==R.id.us)
                {
                    Toast.makeText(page_11.this,"About Us",Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}
