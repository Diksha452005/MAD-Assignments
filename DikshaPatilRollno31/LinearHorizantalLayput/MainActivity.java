package com.example.linearhorizontallayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);

        b1.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,"A Clicked",Toast.LENGTH_SHORT).show());

        b2.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,"B Clicked",Toast.LENGTH_SHORT).show());
    }
}