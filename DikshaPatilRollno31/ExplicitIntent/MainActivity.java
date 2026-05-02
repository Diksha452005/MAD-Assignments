package com.example.explicit;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(v -> {
            String u = username.getText().toString();
            String p = password.getText().toString();

            if (u.equals("Diksha") && p.equals("1234")) {

                Intent i = new Intent(MainActivity.this, ProfileActivity.class);

                i.putExtra("name", "Diksha Patil");
                i.putExtra("course", "Computer Engineering");
                i.putExtra("year", "3rd Year");
                i.putExtra("skills", "Java, C++, HTML");

                startActivity(i);

            } else {
                Toast.makeText(this, "Invalid Login", Toast.LENGTH_SHORT).show();
            }
        });
    }
}