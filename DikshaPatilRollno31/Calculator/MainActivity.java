package com.example.calculator;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView result;
    Button add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        add.setOnClickListener(v -> calculate('+'));
        sub.setOnClickListener(v -> calculate('-'));
        mul.setOnClickListener(v -> calculate('*'));
        div.setOnClickListener(v -> calculate('/'));
    }

    private void calculate(char op) {
        double a = Double.parseDouble(num1.getText().toString());
        double b = Double.parseDouble(num2.getText().toString());
        double r = 0;

        if (op == '+') r = a + b;
        else if (op == '-') r = a - b;
        else if (op == '*') r = a * b;
        else if (op == '/') {
            if (b == 0) {
                result.setText("Divide by zero");
                return;
            }
            r = a / b;
        }

        result.setText("Result: " + r);
    }
}