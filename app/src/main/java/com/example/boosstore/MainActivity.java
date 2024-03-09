package com.example.boosstore;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvBoostore;

    private ImageView igcnovel, igself, igbukuKul;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBoostore=findViewById(R.id.tvBoostore);
        igcnovel= findViewById(R.id.igcnovel);
        igself = findViewById(R.id.igself);
        igbukuKul = findViewById(R.id.igbukuKul);


       igcnovel.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent Bukunovel = new Intent(MainActivity.this, novelActivity.class);
               startActivity(Bukunovel);
           }
       });

       igself.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent SelfImprovement = new Intent(MainActivity.this, selfimprovementActivity.class);
               startActivity(SelfImprovement);
           }
       });

       igbukuKul.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent BukuKuliah = new Intent(MainActivity.this, kuliahActivity.class);
               startActivity(BukuKuliah);
           }
       });

    }


}