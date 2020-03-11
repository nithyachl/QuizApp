package com.chintalapatinithya.firstapp.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int highScore;
    int currentScore;
    String correctAnswer;
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
        highScore = 0;
        currentScore = 0;
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
                    System.out.println("test: 1");
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
                System.out.println("test:  next");
                //   if(nextQuestion.isPressed()) {
                if(arrayEasy != null && i < arrayEasy.length) {
                    currentQuestion.setText(arrayEasy[i]);
                    optionOne.setText(arrayEasy[++i]);
                    optionTwo.setText(arrayEasy[++i]);
                    optionThree.setText(arrayEasy[++i]);
                    optionFour.setText(arrayEasy[++i]);

                    correctAnswer = arrayEasy[++i];



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

            }
            // }

        });

        optionOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("test:  one");
                if(i != 0) {
                    if (optionOne.getText().equals(correctAnswer)) {
                        optionOne.setBackgroundColor(Color.parseColor("#2EFE2E"));
                        currentScore++;
                    } else
                        optionOne.setBackgroundColor(Color.parseColor("#FE2E2E"));
                }
            }
        });

        optionTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i !=0) {
                    if (optionTwo.getText().equals(correctAnswer)) {
                        optionTwo.setBackgroundColor(Color.parseColor("#2EFE2E"));
                        currentScore++;
                    } else
                        optionTwo.setBackgroundColor(Color.parseColor("#FE2E2E"));
                }
            }
        });

        optionThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( i != 0)
                {
                    if (optionThree.getText().equals(correctAnswer)) {
                        optionThree.setBackgroundColor(Color.parseColor("#2EFE2E"));
                        currentScore++;
                    } else
                        optionThree.setBackgroundColor(Color.parseColor("#FE2E2E"));
                }
            }
        });

        optionFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i != 0) {
                    if (optionFour.getText().equals(correctAnswer)) {
                        optionFour.setBackgroundColor(Color.parseColor("#2EFE2E"));
                    } else
                        optionFour.setBackgroundColor(Color.parseColor("#FE2E2E"));
                }
            }
        });


    }


}
