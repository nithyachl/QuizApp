package com.chintalapatinithya.firstapp.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.R.*;

import org.w3c.dom.Text;

public class StartPage extends AppCompatActivity {

    TextView startBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        startBox = findViewById(R.id.startBox);

        startBox.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(StartPage.this, MainActivity.class));
            }
        });

    }

}
