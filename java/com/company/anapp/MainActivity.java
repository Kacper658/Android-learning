package com.company.anapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1;
    EditText e1;
    EditText e2;
    TextView err1;
    TextView err2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button2);
        t1=(TextView) findViewById(R.id.textView);
        e1=(EditText) findViewById(R.id.editTextNumber1);
        e2=(EditText) findViewById(R.id.editTextNumber2);
        err1=(TextView) findViewById(R.id.error1);
        err2=(TextView) findViewById(R.id.error2);


    }
    public void button1Clicked(View v) {
        if (err1.getVisibility() == View.VISIBLE || err2.getVisibility() == View.VISIBLE) {
            err1.setVisibility(View.INVISIBLE);
            err2.setVisibility(View.INVISIBLE);
        }
        if (!e1.getText().toString().isEmpty() && !e2.getText().toString().isEmpty()) {
            double number1 = Double.parseDouble(e1.getText().toString());
            double number2 = Double.parseDouble(e2.getText().toString());
            double consumption = number1/100*number2;
            t1.setText(String.valueOf(consumption) + " " + getText(R.string.result));
            t1.setVisibility(View.VISIBLE);
        } else if (!e1.getText().toString().isEmpty()) {
            err1.setVisibility(View.VISIBLE);
        }
        else if (!e2.getText().toString().isEmpty()){
            err2.setVisibility(View.VISIBLE);
        }
        else {
            err1.setVisibility(View.VISIBLE);
            err2.setVisibility(View.VISIBLE);
            t1.setVisibility(View.INVISIBLE);
        }
    }
}