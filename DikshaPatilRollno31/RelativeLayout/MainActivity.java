package com.example.relativelayout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends Activity {

    EditText username;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(v -> {
            String name = username.getText().toString();
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        });
    }
}