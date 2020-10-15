package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    String val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  mtext = (TextView)findViewById(R.id.textView);
        Random random = new Random();
        val = friends[random.nextInt()];
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });*/
    }
  /*  public void openActivity(){
        Intent intent = new Intent(this, NextActivity.class);
        intent.putExtra("EXTRA", val);
        startActivity(intent);
        finish();
    }*/

    public void friend_function(View view)
    {
        final String[] friends = {"Dipisha", "Purvi", "Abhay", "Suhani", "Rashmi"};
        Random random = new Random();
        int index = random.nextInt(friends.length);
        Intent intent = new Intent(this, NextActivity.class);
        intent.putExtra("str",friends[index]);
        startActivity(intent);
    }
}
