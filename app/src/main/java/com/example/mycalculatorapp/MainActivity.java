package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberDifferenceTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double difference = num1 - num2;

        numberDifferenceTV.setText("" + difference);
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberProductTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double product = num1 * num2;

        numberProductTV.setText("" + product);
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberQuotientTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double quotient = num1 / num2;

        numberQuotientTV.setText("" + quotient);

        // try catch
    }

    public void findExponent(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberExponentTV = findViewById(R.id.resultTV);

        double num1 = Double.parseDouble((number1ET.getText().toString()));
        double num2 = Double.parseDouble((number2ET.getText().toString()));
        double exponent = Math.pow(num1, num2);

        numberExponentTV.setText("" + exponent);
    }


}