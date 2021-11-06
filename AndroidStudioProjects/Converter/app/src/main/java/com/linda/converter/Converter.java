package com.linda.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Converter extends AppCompatActivity implements View.OnClickListener {
    EditText metersInput;
    Button convert;
    TextView kilometersResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        metersInput =(EditText) findViewById(R.id.metersInput);
        convert =(Button) findViewById(R.id.convertButton);
        kilometersResult =(TextView) findViewById(R.id.kilometersResult);

        convert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        float input = Integer.parseInt(metersInput.getText().toString().trim());
        float result = (input/1000);
        kilometersResult.setText("Result: " + Float.toString((float) result)+" Kilometers");
        }
    }
