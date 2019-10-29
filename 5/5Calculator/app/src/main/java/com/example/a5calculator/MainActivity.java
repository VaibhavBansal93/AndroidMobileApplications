package com.example.a5calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
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
    Double num1, num2 ;
    Boolean add, sub, div, mul;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = (TextView)findViewById(R.id.display);

        setButtons();
        setlisteners();

    }

    public void onClick(View v)
    {
        String text = display.getText().toString();
        switch (v.getId())
        {
            case R.id.btnone : text = text + '1';
                break;
            case R.id.btntwo : text = text + '2';
                break;
            case R.id.btnthree : text = text + '3';
                break;
            case R.id.btnfour : text = text + '4';
                break;
            case R.id.btnfive : text = text + '5';
                break;
            case R.id.btnsix : text = text + '6';
                break;
            case R.id.btnseven : text = text + '7';
                break;
            case R.id.btneight : text = text + '8';
                break;
            case R.id.btnnine : text = text + '9';
                break;
            case R.id.btnzero : text = text + '0';
                break;
            case R.id.btndot : text = text + '.';

            case R.id.btnplus : num1 = Double.parseDouble(display.getText().toString());
                add = true;
                display.setText(null);
                break;
            case R.id.btnminus : num1 = Double.parseDouble(display.getText().toString());
                sub = true;
                display.setText(null);
                break;
            case R.id.btndivision : num1 = Double.parseDouble(display.getText().toString());
                div = true;
                display.setText(null);
                break;
            case R.id.btnmultiply: num1 = Double.parseDouble(display.getText().toString());
                mul = true;
                display.setText(null);
                break;

            case R.id.btnresult: num2 = Double.parseDouble(display.getText().toString());
                if(add)
                {
                    Double ans = num1 + num2;
                    display.setText(ans.toString());
                }
                if(sub)
                {
                    Double ans = num1 - num2;
                    display.setText(ans.toString());
                }
                if(mul)
                {
                    Double ans = num1 * num2;
                    display.setText(ans.toString());
                }
                if(div)
                {
                    Double ans = num1 / num2;
                    display.setText(ans.toString());
                }


        }

        display.setText(text);

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

}




