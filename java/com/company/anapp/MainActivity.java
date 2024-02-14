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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button2);
        t1=(TextView) findViewById(R.id.textView);
        e1=(EditText) findViewById(R.id.editTextNumber1);
        e2=(EditText) findViewById(R.id.editTextNumber2);


    }
    public void button1Clicked(View v) {
        int number1 = Integer.parseInt(e1.getText().toString());
        int number2 = Integer.parseInt(e2.getText().toString());
        t1.setText(String.valueOf(number1 * number2));
    }
}