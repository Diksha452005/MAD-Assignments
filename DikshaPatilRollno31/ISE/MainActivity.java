package com.example.ise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;



import android.os.Bundle;
import android.content.Intent;
import android.provider.MediaStore;
import android.graphics.Bitmap;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnCamera, btnSubmit;
    ImageView imageView;
    RatingBar ratingBar;
    TextView txtRating;

    ActivityResultLauncher<Intent> cameraLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCamera = findViewById(R.id.btnCamera);
        btnSubmit = findViewById(R.id.btnSubmit);
        imageView = findViewById(R.id.imageView);
        ratingBar = findViewById(R.id.ratingBar);
        txtRating = findViewById(R.id.txtRating);


        cameraLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == RESULT_OK && result.getData() != null) {

                        Bundle extras = result.getData().getExtras();
                        if (extras != null) {
                            Bitmap photo = (Bitmap) extras.get("data");
                            imageView.setImageBitmap(photo);
                        }
                    }
                }
        );


        btnCamera.setOnClickListener(v -> {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            cameraLauncher.launch(intent);
        });


        btnSubmit.setOnClickListener(v -> {
            float rating = ratingBar.getRating();
            txtRating.setText("Submitted Rating: " + rating);
        });
    }
}