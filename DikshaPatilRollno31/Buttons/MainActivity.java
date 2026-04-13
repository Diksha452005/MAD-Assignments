package com.example.buttons;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.ToggleButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioMale, radioFemale;
    CheckBox checkReading, checkGaming;
    ToggleButton toggleStatus;
    RatingBar ratingBar;
    Spinner spinner;
    ProgressBar progressBar;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        radioMale = findViewById(R.id.radioMale);
        radioFemale = findViewById(R.id.radioFemale);
        checkReading = findViewById(R.id.checkReading);
        checkGaming = findViewById(R.id.checkGaming);
        toggleStatus = findViewById(R.id.toggleStatus);
        ratingBar = findViewById(R.id.ratingBar);
        spinner = findViewById(R.id.spinner);
        progressBar = findViewById(R.id.progressBar);
        btnSubmit = findViewById(R.id.btnSubmit);

        String[] cities = {"Select City", "Kolhapur", "Pune", "Mumbai"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_dropdown_item, cities);
        spinner.setAdapter(adapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId = radioGroup.getCheckedRadioButtonId();
                String gender = "Not Selected";

                if (selectedId != -1) {
                    RadioButton rb = findViewById(selectedId);
                    gender = rb.getText().toString();
                }

                String hobbies = "";
                if (checkReading.isChecked()) hobbies += "Reading ";
                if (checkGaming.isChecked()) hobbies += "Gaming ";

                String status = toggleStatus.isChecked() ? "Active" : "Inactive";
                String city = spinner.getSelectedItem().toString();
                float rating = ratingBar.getRating();

                int progress = progressBar.getProgress() + 20;
                progressBar.setProgress(progress);

                String result = "Gender: " + gender +
                        "\nHobbies: " + hobbies +
                        "\nStatus: " + status +
                        "\nCity: " + city +
                        "\nRating: " + rating;

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
            }
        });
    }
}