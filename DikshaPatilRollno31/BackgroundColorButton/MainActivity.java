package com.example.backgroundcolorbutton;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    Button btnBlue, btnYellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.mainLayout);
        btnBlue = findViewById(R.id.btnBlue);
        btnYellow = findViewById(R.id.btnYellow);

        btnBlue.setOnClickListener(v ->
                layout.setBackgroundColor(Color.BLUE)
        );

        btnYellow.setOnClickListener(v ->
                layout.setBackgroundColor(Color.YELLOW)
        );
    }
}