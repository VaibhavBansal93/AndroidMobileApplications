package com.example.tailorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText height;
    RadioButton male;
    RadioButton female;
    Boolean gender;
    EditText name, ph, address;
    String _name,_address,phone,size;
    Double _height;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.size);
        height = findViewById(R.id.height);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        name = findViewById(R.id.name);
        ph =  findViewById(R.id.ph);
        address = findViewById(R.id.address);
    }
    public void onRadioClick(View view)
    {
        if(male.isChecked())
            gender = true;
        if(female.isChecked())
            gender = false;
    }
    public void onClick(View view){
        _name = name.getText().toString();
        _height = Double.parseDouble(height.getText().toString());
        _address = address.getText().toString();
        phone = ph.getText().toString();
        size = spinner.getSelectedItem().toString();
        Double price = calculatePrice();
        TextView ans = findViewById(R.id.price);
        ans.setText(price.toString());
    }
    public double calculatePrice()
    {
        if(gender)
        {
            if(size == "L")
                return _height*300;
            else if(size == "XL")
                return _height*400;
            else if(size == "XXL")
                    return _height*500;
        }
        else
        {
            if(size == "L")
                return _height*500;
            else if(size == "XL")
                return _height*700;
            else if(size == "XXL")
                return _height*900;
        }
        return -1;
    }
}
