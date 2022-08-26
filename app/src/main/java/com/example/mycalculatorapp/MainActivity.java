package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1ET = findViewById(R.id.num1ET);
        EditText num2ET = findViewById(R.id.num2ET);

        // hide the keyboard when entering numbers
        num1ET.setShowSoftInputOnFocus(false);
        num2ET.setShowSoftInputOnFocus(false);

    }
    // snackbar formatting taken from Schoology
    public void snackbarClicked(View view) {
        Snackbar.make(view, "Please Enter A Number", Snackbar.LENGTH_INDEFINITE)
                .setBackgroundTint(getResources().getColor(R.color.blue))
                .setTextColor(getResources().getColor(R.color.yellow))
                .setAction("Got It", new View.OnClickListener(){
                    public void onClick(View view) {
                    }
                })
                .setActionTextColor(getResources().getColor(R.color.yellow))
                .show();
    }

    public void makeToast  (String str) {
        Toast toast = Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT);
        toast.show();
    }

    //try catch to find errors

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        try {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = num1 + num2;

            numberSumTV.setText("" + sum);
        }

        catch (Exception e) {
            snackbarClicked(view);
        }
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberDifferenceTV = findViewById(R.id.resultTV);

        try {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double difference = num1 - num2;

            numberDifferenceTV.setText("" + difference);
        }

        catch (Exception e) {
            snackbarClicked(view);
        }
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberProductTV = findViewById(R.id.resultTV);

        try {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double product = num1 * num2;;

            numberProductTV.setText("" + product);
        }

        catch (Exception e) {
            snackbarClicked(view);
        }
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberQuotientTV = findViewById(R.id.resultTV);

        try {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double quotient = num1 / num2;

            numberQuotientTV.setText("" + quotient);
        }

        catch (Exception e) {
            snackbarClicked(view);
        }
    }

    public void findExponent(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberExponentTV = findViewById(R.id.resultTV);

        try{
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double exponent = Math.pow(num1, num2);

            numberExponentTV.setText("" + exponent);
        }

        catch (Exception e) {
            snackbarClicked(view);
        }
    }

    public void findLog(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberLogTV = findViewById(R.id.resultTV);

        try {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            // use change of base log formula
            double log = Math.log(num1)/Math.log(num2);

            numberLogTV.setText("" + log);
        }

        catch (Exception e) {
            snackbarClicked(view);
        }
    }

    public void findMod(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberModTV = findViewById(R.id.resultTV);

        try {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            // use change of base log formula
            double mod = num1 % num2;

            numberModTV.setText("" + mod);
        }

        catch (Exception e) {
            snackbarClicked(view);
        }
    }

    public void clear(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);

        number1ET.getText().clear();
        number2ET.getText().clear();
    }


}