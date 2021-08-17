package com.example.randomimageswitcher;

import static android.widget.ImageView.*;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int[] images = {R.drawable.hotface1,
                    R.drawable.hotface2,
                    R.drawable.hotface3,
                    R.drawable.hotface4,
                    R.drawable.hotface5,
                    R.drawable.hotface6
    };
    ImageView image;
    Random r;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.imageView);
        button = findViewById(R.id.button);
        r = new Random();

            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    image.setImageResource(images[r.nextInt(images.length)]);
                }

            });
        }
}
