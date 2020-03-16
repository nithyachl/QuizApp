package com.chintalapatinithya.firstapp.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
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
    Button nextQuestion;
    Button optionOne;
    Button optionTwo;
    Button optionThree;
    Button optionFour;
    TextView score;
    TextView curScore;
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
        score = findViewById(R.id.score);
        curScore = findViewById(R.id.curScore);
        highScore = 0;
        currentScore = 0;

        curScore.setText(currentScore + "");


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
                //     System.out.println("test: 1");
                }
            });

            optionTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    arrayMedium = getResources().getStringArray(R.array.arrayMedium);

                }
            });

            optionThree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    arrayHard = getResources().getStringArray(R.array.arrayHard);

                }
            });

            optionFour.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    arrayVeryHard = getResources().getStringArray(R.array.arrayVeryHard);

                }
            });

        }

        optionOne.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {

                if (i != 0) {
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        optionOne.setBackgroundColor(Color.GRAY);

                    }

                    if (optionOne.getText().equals(correctAnswer)) {
                        optionOne.setBackgroundColor(Color.GREEN);
                        currentScore++;
                        curScore.setText(currentScore + "");
                        SystemClock.sleep(500);



                    } else {
                        // Change the background color here
                        optionOne.setBackgroundColor(Color.RED);
                        SystemClock.sleep(500);
                        //optionOne.setBackgroundColor(Color.RED);

                        nextQuestion();


                    }

                }
                    return false;

            }


        });

        optionTwo.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {

                if (i != 0) {
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        optionTwo.setBackgroundColor(Color.GRAY);
                    }
                    if (optionTwo.getText().equals(correctAnswer)) {
                        optionTwo.setBackgroundColor(Color.GREEN);
                        currentScore++;
                        curScore.setText(currentScore + "");
                        SystemClock.sleep(500);

                    } else {
                        // Change the background color here
                        optionTwo.setBackgroundColor(Color.RED);
                        SystemClock.sleep(500);
                        //optionThree.setBackgroundColor(Color.RED);

                        nextQuestion();


                    }

                }
                return false;

            }


        });

        optionThree.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {

                if (i != 0) {
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        optionThree.setBackgroundColor(Color.GRAY);
                    }

                    if (optionThree.getText().equals(correctAnswer)) {
                        optionThree.setBackgroundColor(Color.GREEN);
                        currentScore++;
                        curScore.setText(currentScore + "");
                        SystemClock.sleep(500);

                    } else {
                        // Change the background color here
                        optionThree.setBackgroundColor(Color.RED);
                        SystemClock.sleep(500);
                      //  optionThree.setBackgroundColor(Color.RED);
                        nextQuestion();


                    }

                }
                return false;

            }


        });

        optionFour.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {

                if (i != 0) {
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        optionFour.setBackgroundColor(Color.GRAY);
                    }

                    if (optionFour.getText().equals(correctAnswer)) {
                        optionFour.setBackgroundColor(Color.GREEN);
                        currentScore++;
                        curScore.setText(currentScore + "");
                        SystemClock.sleep(500);

                    } else {
                        // Change the background color here
                        optionFour.setBackgroundColor(Color.RED);
                        SystemClock.sleep(500);
                       // optionThree.setBackgroundColor(Color.RED);
                        nextQuestion();


                    }

                }
                return false;

            }


        });

        nextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // System.out.println("test:  next");
                //   if(nextQuestion.isPressed()) {
                if (nextQuestion.isPressed()) {
                    nextQuestion();
                    //curScore.setText(currentScore);

                }
            }
            // }

        });

    }

    private void nextQuestion() {
        if (arrayEasy != null && i < arrayEasy.length) {

            optionFour.setBackgroundColor(Color.GRAY);
            optionThree.setBackgroundColor(Color.GRAY);
            optionTwo.setBackgroundColor(Color.GRAY);
            optionOne.setBackgroundColor(Color.GRAY);

            currentQuestion.setText(arrayEasy[i]);
            optionOne.setText(arrayEasy[++i]);
            optionTwo.setText(arrayEasy[++i]);
            optionThree.setText(arrayEasy[++i]);
            optionFour.setText(arrayEasy[++i]);

            //curScore.setText(currentScore);

            correctAnswer = arrayEasy[++i];
            i++;


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


}
