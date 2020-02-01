package com.example.winter2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    WinterLayout winter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        winter=(WinterLayout)findViewById(R.id.winter);
    }
    public  void start(View view){winter.startWinter();}
    public void stop(View view){winter.stopWinter();}
}
