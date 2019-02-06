package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resTextView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt((secondNumEditText.getText().toString()));
                int result = num1 + num2;
                resultTextView.setText("+:" + result);
            }
        });

        final Button mulBtn = (Button) findViewById(R.id.mulBtn);

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText first = (EditText) findViewById(R.id.firstNumEditText);
                EditText second = (EditText) findViewById(R.id.secondNumEditText);
                TextView result = (TextView) findViewById(R.id.resTextView);

                int num1 = Integer.parseInt(first.getText().toString());
                int num2 = Integer.parseInt(second.getText().toString());
                int res = num1 * num2;
                result.setText("x:"+ res);
            }
        });
    }
}
