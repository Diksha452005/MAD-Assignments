package com.example.implicit1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnYouTube = findViewById(R.id.btnYouTube);
        Button btnGoogle = findViewById(R.id.btnGoogle);
        Button btnCamera = findViewById(R.id.btnCamera);
        image = findViewById(R.id.imageView);

        // Open YouTube
        btnYouTube.setOnClickListener(v -> {
            Intent i = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com"));
            startActivity(i);
        });

        // Open Google
        btnGoogle.setOnClickListener(v -> {
            Intent i = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com"));
            startActivity(i);
        });

        // Open Camera
        btnCamera.setOnClickListener(v -> {
            Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(i, 1);
        });
    }

    @Override
    protected void onActivityResult(int req, int res, Intent data) {
        super.onActivityResult(req, res, data);

        if (req == 1 && data != null) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            image.setImageBitmap(photo);
        }
    }
}