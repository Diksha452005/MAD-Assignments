package com.example.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.loginBtn);

        login.setOnClickListener(v -> {
            String u = username.getText().toString();
            String p = password.getText().toString();

            if (u.equals("Diksha") && p.equals("1234")) {
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(i);
            } else {
                Toast.makeText(this, "Invalid Login", Toast.LENGTH_SHORT).show();
            }
        });
    }
}