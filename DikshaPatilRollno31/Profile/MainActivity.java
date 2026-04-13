package com.example.profile;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView name, dept, year, college, skills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        dept = findViewById(R.id.dept);
        year = findViewById(R.id.year);
        college = findViewById(R.id.college);
        skills = findViewById(R.id.skills);

        
        name.setText("Name: Diksha Ravindra Patil");
        dept.setText("Department: CSE");
        year.setText("Year: 3rd Year");
        college.setText("College: DYPCET");
        skills.setText("Skills: C, C++, Python, HTML, CSS");
    }
}