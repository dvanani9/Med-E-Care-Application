package com.example.med_ecare;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.miguelcatalan.materialsearchview.MaterialSearchView;

public class page_13 extends AppCompatActivity {
ListView listview;
    final String[] values=new String[]{
            "Fever","Headache","Back pain","Migrane","Typhoid","Fainting","Corona Virus","Seizure","Loose Motion","Stomachache","Cough"
    };
    private MaterialSearchView materialSearchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_13);
        listview=(ListView)findViewById(R.id.listview);

        ArrayAdapter<String>mAdapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,android.R.id.text1,values);
        listview.setAdapter(mAdapter);

        final Toolbar toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));

        materialSearchView=findViewById(R.id.serachView);
        materialSearchView.setSuggestions(values);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent Intent24 = new Intent(page_13.this, coughques.class);
                    page_13.this.startActivity(Intent24);

                }
                if(position==1){
                    Intent Intent25 = new Intent(view.getContext(),coldquestion.class);
                    startActivityForResult(Intent25,1);
                }
                if(position==2){
                    Intent Intent26 = new Intent(page_13.this, Backpain.class);
                    page_13.this.startActivity(Intent26);
                    Toast.makeText(page_13.this, "You Have Back pain", Toast.LENGTH_LONG).show();

                }
                if(position==3){
                    Intent Intent27 = new Intent(page_13.this, Migrane.class);
                    page_13.this.startActivity(Intent27);
                    Toast.makeText(page_13.this, "You Have Migrane", Toast.LENGTH_LONG).show();
                }
                if(position==4){
                    Intent Intent28 = new Intent(page_13.this, Typhoid.class);
                    page_13.this.startActivity(Intent28);
                    Toast.makeText(page_13.this, "You Have Typhoid", Toast.LENGTH_LONG).show();

                }
                if(position==5){
                    Intent Intent29 = new Intent(page_13.this, Fainting.class);
                    page_13.this.startActivity(Intent29);
                    Toast.makeText(page_13.this, "You Have Fainting", Toast.LENGTH_LONG).show();

                }
                if(position==6){
                    Intent Intent30 = new Intent(page_13.this, feverquestion.class);
                    page_13.this.startActivity(Intent30);

                }
                if(position==7){
                    Intent Intent31 = new Intent(page_13.this, Seizure.class);
                    page_13.this.startActivity(Intent31);
                    Toast.makeText(page_13.this, "You Have Seizure", Toast.LENGTH_LONG).show();
                }
                if(position==8){
                    Intent Intent32 = new Intent(page_13.this, contaminated.class);
                    page_13.this.startActivity(Intent32);

                }
                if(position==9){
                    Intent Intent33 = new Intent(page_13.this, contaminated.class);
                    page_13.this.startActivity(Intent33);

                }
                if(position==10){
                    Intent Intent48 = new Intent(page_13.this, coldques.class);
                    page_13.this.startActivity(Intent48);

                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        MenuItem menuItem=menu.findItem(R.id.searchMenu);
        materialSearchView.setMenuItem(menuItem);
        return super.onCreateOptionsMenu(menu);
    }
}
