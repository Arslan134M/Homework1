package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String name= getIntent().getStringExtra("name").toLowerCase();
        int id=getResources().getIdentifier(name,"drawable",getPackageName());
        ImageView imageView=findViewById(R.id.imageView);
        imageView.setImageResource(id);
    }
}