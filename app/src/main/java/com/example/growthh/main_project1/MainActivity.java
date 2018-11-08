package com.example.growthh.main_project1;

import android.support.v7.app.AppCompatActivity;
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
        public void onButtonClick (View v) {
            EditText num1 = (EditText)findViewById(R.id.num1);
            EditText num2 = (EditText)findViewById(R.id.num2);
            TextView resText = (TextView)findViewById(R.id.result);

            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());
            int result = number1 + number2;
            resText.setText(Integer.toString(result));
        }
    public void onButtonClick2 (View v) {
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);
        TextView resText = (TextView)findViewById(R.id.result);

        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int result = number1 - number2;
        resText.setText(Integer.toString(result));
    }
    }
