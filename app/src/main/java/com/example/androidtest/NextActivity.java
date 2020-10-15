package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class NextActivity extends AppCompatActivity {
   // private String[] friends = {"Dipisha", "Purvi", "Abhay", "Suhani", "Rashmi"};
   TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
      /*  String[] friends = new String[]{"Dipisha", "Purvi", "Abhay", "Suhani", "Rashmi"};
        mtext = (TextView)findViewById(R.id.textView);
        Random random = new Random();
        String val = friends[random.nextInt()];
        mtext.setText(val);*/
        Bundle bundle = getIntent().getExtras();
        textView = findViewById(R.id.textView);
        textView.setText(bundle.getString("str"));



    }
}