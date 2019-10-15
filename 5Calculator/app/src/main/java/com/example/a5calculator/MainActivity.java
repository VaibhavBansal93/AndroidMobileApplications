package com.example.a5calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button plus;
    Button minus;
    Button multiply;
    Button divide;
    Button equals;
    Button one,two,three,four,five,six,seven,eight,nine,zero;
    Button clear,dot;
    TextView display;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setButtons();
        setlisteners();

    }

    public void numberclick(View v)
    {

    }

    public void setButtons()
    {
        plus = (Button) findViewById(R.id.btnplus);
        minus = (Button) findViewById(R.id.btnminus);
        multiply = (Button) findViewById(R.id.btnmultiply);
        divide = (Button) findViewById(R.id.btndivision);

        one = (Button) findViewById(R.id.btnone);
        two = (Button) findViewById(R.id.btntwo);
        three = (Button) findViewById(R.id.btnthree);
        four = (Button) findViewById(R.id.btnfour);
        five = (Button) findViewById(R.id.btnfive);
        six = (Button) findViewById(R.id.btnsix);
        seven = (Button) findViewById(R.id.btnseven);
        eight = (Button) findViewById(R.id.btneight);
        nine = (Button) findViewById(R.id.btnnine);
        zero = (Button) findViewById(R.id.btnzero);

        equals = (Button) findViewById(R.id.btnresult);
        dot = (Button) findViewById(R.id.btndot);
        clear = (Button) findViewById(R.id.btnclear);

    }

    public void setlisteners()
    {
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);

        equals.setOnClickListener(this);
        dot.setOnClickListener(this);
        clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.btnplus :
                break;
            case R.id.btnminus :
                break;
            case R.id.btnmultiply :
                break;
            case R.id.btndivision :
                break;

            case R.id.btnone :
                break;
            case R.id.btntwo :
                break;
            case R.id.btnthree :
                break;
            case R.id.btnfour :
                break;
            case R.id.btnfive :
                break;
            case R.id.btnsix :
                break;
            case R.id.btnseven :
                break;
            case R.id.btneight :
                break;
            case R.id.btnnine :
                break;
            case R.id.btnzero :
                break;

            case R.id.btnresult :
                break;
            case R.id.btndot :
                break;
            case R.id.btnclear :
                break;
        }
    }
}
