package com.linda.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button proceedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        proceedButton = findViewById(R.id.proceed);
        proceedButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v== proceedButton){
            startActivity(new Intent(MainActivity.this,Converter.class));
        }
    }
}