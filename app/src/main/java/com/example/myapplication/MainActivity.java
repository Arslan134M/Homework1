package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.Characters);
        ArrayList <String> chr =new ArrayList<String>();
        char x='A';
        for (int i = 1; i <27 ; i++,x++)
        {
            chr.add(Character.toString(x));
            ArrayAdapter <String> y=new ArrayAdapter <String> ( this, android.R.layout.simple_list_item_1,chr);
            listView.setAdapter(y);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("name",chr.get(position));
                    startActivity(intent);
                }
            });

        }
    }
}