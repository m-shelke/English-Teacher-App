package com.example.englishteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    //init XML Views
    MaterialButton greenBtn,yellowBtn,redBtn,blueBtn,orangeBtn;

    //obj of MediaPlayer class
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //finding XML Views
        greenBtn = findViewById(R.id.greenBtn);
        yellowBtn = findViewById(R.id.yellowBtn);
        redBtn = findViewById(R.id.redBtn);
        blueBtn = findViewById(R.id.blueBtn);
        orangeBtn = findViewById(R.id.orangeBtn);

        //Handle click event on Button
        greenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creating MediaPlayer, and passing 1.Context 2.Resource File
                mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.greenn);
                //start playing MediaPlayer
                mediaPlayer.start();
            }
        });

        //Handle click event on Button
        yellowBtn.setOnClickListener(v -> {
            //Creating MediaPlayer, and passing 1.Context 2.Resource File
            mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.yellow);
            //start playing MediaPlayer
            mediaPlayer.start();
        });

        //Handle click event on Button
        redBtn.setOnClickListener(v -> {
            //Creating MediaPlayer, and passing 1.Context 2.Resource File
            mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.red);
            //start playing MediaPlayer
            mediaPlayer.start();
        });

        //Handle click event on Button
        blueBtn.setOnClickListener(v -> {
            //Creating MediaPlayer, and passing 1.Context 2.Resource File
            mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.blue);
            //start playing MediaPlayer
            mediaPlayer.start();
        });

        //Handle click event on Button
        orangeBtn.setOnClickListener(v -> {
            //Creating MediaPlayer, and passing 1.Context 2.Resource File
            mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.orange);
            //start playing MediaPlayer
            mediaPlayer.start();
        });


    }
}