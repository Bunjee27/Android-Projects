package com.example.virtualpet;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    CountDownTimer timer;
    ProgressBar progBar;
    TextView mTextField;
    int myInteger;
    int currentEgg = 0;
    ImageView petPic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextField = findViewById(R.id.timertxtView);
        progBar = findViewById(R.id.progressBar);
        petPic = findViewById(R.id.petPic);
        progBar.setMax(30);
        progBar.setProgress(30);
        timer = new CountDownTimer(15000, 1000) {

            public void onTick(long millisUntilFinished) {
                mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
                myInteger = ((int) millisUntilFinished)/1000;
                progBar.setProgress(myInteger);
            }

            public void onFinish() {
                mTextField.setText("done!");
                timer.start();
            }
        };

    }

    public void fire(View view) {
        petPic.setImageResource(R.drawable.fire1);
        currentEgg = 1;
    }

    public void grass(View view) {
        petPic = findViewById(R.id.petPic);
        petPic.setImageResource(R.drawable.grass1);
        currentEgg = 2;
    }

    public void rock(View view) {
        petPic = findViewById(R.id.petPic);
        petPic.setImageResource(R.drawable.rock1);
        currentEgg = 3;
    }

    public void lightning(View view) {

        petPic.setImageResource(R.drawable.lightning1);
        currentEgg = 4;
    }

    public void water(View view) {
        petPic.setImageResource(R.drawable.water1);
        currentEgg = 5;
    }

    public void dark(View view) {
        petPic = findViewById(R.id.petPic);
        petPic.setImageResource(R.drawable.dark1);
        currentEgg = 6;
    }

    public void magic(View view) {
        petPic = findViewById(R.id.petPic);
        petPic.setImageResource(R.drawable.magic1);
        currentEgg = 7;
    }

    public void light(View view) {
        petPic = findViewById(R.id.petPic);
        petPic.setImageResource(R.drawable.light1);
        currentEgg = 8;
    }

    public void metal(View view) {
        petPic.setImageResource(R.drawable.metal1);
        currentEgg = 9;
    }

    public void hatch(View View){

        if (currentEgg == 1) {
            petPic.setImageResource(R.drawable.fire2);
            timer.start();
        }

        else if (currentEgg == 2) {
            petPic.setImageResource(R.drawable.grass2);
            timer.start();
        }

        else if (currentEgg == 3) {
            petPic.setImageResource(R.drawable.rock2);
            timer.start();
        }

        else if (currentEgg == 4) {
            petPic.setImageResource(R.drawable.lightning2);
            timer.start();
        }

        else if (currentEgg == 5) {
            petPic.setImageResource(R.drawable.water2);
            timer.start();
        }

        else if (currentEgg == 6) {
            petPic.setImageResource(R.drawable.dark2);
            timer.start();
        }

        else if (currentEgg == 7) {
            petPic.setImageResource(R.drawable.magic2);
            timer.start();
        }

        else if (currentEgg == 8) {
            petPic.setImageResource(R.drawable.light2);
            timer.start();
        }

        else if (currentEgg == 9) {
            petPic.setImageResource(R.drawable.metal2);
            timer.start();
        }

        else {
            petPic.setImageResource(R.drawable.mlegg);

        }



    }
};