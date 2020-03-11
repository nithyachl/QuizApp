package com.chintalapatinithya.firstapp.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView currentQuestion;
    TextView nextQuestion;
    Button optionOne;
    Button optionTwo;
    Button optionThree;
    Button optionFour;
    int i = 0;
    int x =0;
    String[] arrayEasy;
    String[] arrayMedium;
    String[] arrayHard;
    String[] arrayVeryHard;
    String[] arrayEasyAns;
    String[] arrayMediumAns;
    String[] arrayHardAns;
    String[] arrayVeryHardAns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentQuestion = findViewById(R.id.currentQuestion);
        nextQuestion = findViewById(R.id.nextQuestion);
        optionOne = findViewById(R.id.optionOne);
        optionTwo = findViewById(R.id.optionTwo);
        optionThree = findViewById(R.id.optionThree);
        optionFour = findViewById(R.id.optionFour);
        if(i == 0)
        {
            currentQuestion.setText("Which Difficulty?");
            optionOne.setText("Easy");
            optionTwo.setText("Medium");
            optionThree.setText("Hard");
            optionFour.setText("Very Hard");
            optionOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    arrayEasy = getResources().getStringArray(R.array.arrayEasy);
                    arrayEasyAns = getResources().getStringArray(R.array.arrayEasyAns);
                }
            });

            optionTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    arrayMedium = getResources().getStringArray(R.array.arrayMedium);
                    arrayMediumAns = getResources().getStringArray(R.array.arrayMediumAns);
                }
            });

            optionThree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    arrayHard = getResources().getStringArray(R.array.arrayHard);
                    arrayHardAns = getResources().getStringArray(R.array.arrayHardAns);
                }
            });

            optionFour.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    arrayVeryHard = getResources().getStringArray(R.array.arrayVeryHard);
                    arrayVeryHardAns = getResources().getStringArray(R.array.arrayVeryHardAns);
                }
            });

        }
        nextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(nextQuestion.isPressed()) {
                    if (arrayEasy != null && i < arrayEasy.length && x < arrayEasyAns.length) {
                        currentQuestion.setText(arrayEasy[i]);
                        optionOne.setText(arrayEasyAns[x]);
                        optionTwo.setText(arrayEasyAns[++x]);
                        optionThree.setText(arrayEasyAns[++x]);
                        optionFour.setText(arrayEasyAns[++x]);

                    }

                    if (arrayMedium != null && i < arrayMedium.length) {
                        currentQuestion.setText(arrayMedium[i]);
                        optionOne.setText(arrayMediumAns[x]);
                        optionTwo.setText(arrayMediumAns[x++]);
                        optionThree.setText(arrayMediumAns[x++]);
                        optionFour.setText(arrayMediumAns[x++]);

                    }


                    if (arrayHard != null && i < arrayHard.length) {
                        currentQuestion.setText(arrayHard[i]);
                        optionOne.setText(arrayHardAns[x]);
                        optionTwo.setText(arrayHardAns[x++]);
                        optionThree.setText(arrayHardAns[x++]);
                        optionFour.setText(arrayHardAns[x++]);

                    }


                    if (arrayHard != null && i < arrayHard.length) {
                        currentQuestion.setText(arrayHard[i]);
                        optionOne.setText(arrayVeryHardAns[x]);
                        optionTwo.setText(arrayVeryHardAns[x++]);
                        optionThree.setText(arrayVeryHardAns[x++]);
                        optionFour.setText(arrayVeryHardAns[x++]);

                    }

                    i++;
                }
            }

        });


    }


}
