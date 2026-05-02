package com.example.explicit;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    TextView name, course, year, skills;
    ImageView profileImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name = findViewById(R.id.name);
        course = findViewById(R.id.course);
        year = findViewById(R.id.year);
        skills = findViewById(R.id.skills);
        profileImg = findViewById(R.id.profileImage);

        // Get data
        String n = getIntent().getStringExtra("name");
        String c = getIntent().getStringExtra("course");
        String y = getIntent().getStringExtra("year");
        String s = getIntent().getStringExtra("skills");

        name.setText("Name: " + n);
        course.setText("Course: " + c);
        year.setText("Year: " + y);
        skills.setText("Skills: " + s);

        profileImg.setImageResource(R.drawable.image);
    }
}