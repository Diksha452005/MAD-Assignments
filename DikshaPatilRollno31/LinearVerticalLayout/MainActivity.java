package com.example.linearverticallayout;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        EditText et = findViewById(R.id.et1);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,
                        et.getText().toString(),
                        Toast.LENGTH_SHORT).show());
    }
}