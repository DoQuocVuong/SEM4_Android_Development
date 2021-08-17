package com.example.catswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

     ImageView image;
     Button button;
     Boolean cat1 = true;

     public void switcher(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cat1){
                    image.setImageResource(R.drawable.cat2);
                    cat1 = false;
                }else{
                    image.setImageResource(R.drawable.cat1);
                    cat1 = true;
                }
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imageView);
        button = findViewById(R.id.button);
        switcher();
    }
}