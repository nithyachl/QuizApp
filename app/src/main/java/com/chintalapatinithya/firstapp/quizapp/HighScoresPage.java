package com.chintalapatinithya.firstapp.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.chintalapatinithya.firstapp.quizapp.MainActivity.highScore;
import static com.chintalapatinithya.firstapp.quizapp.MainActivity.name;

public class HighScoresPage extends AppCompatActivity  {

    TextView position;
    HighG staff;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high);
        position = findViewById(R.id.position);
        staff = new HighG(MainActivity.highScore, MainActivity.name);
        position.setText("1. " + MainActivity.name + " --> Score: " + MainActivity.highScore);

    }

    public static class HighG {

        int highScore;
        String name;


        public HighG(int HighScore, String Name) {
            highScore = HighScore;
            name = Name;

        }

        public void setName(String namets)
        {
            name = namets;
        }

        public void setHighScore(int highscorets)
        {
            highScore = highscorets;
        }



    }

}



