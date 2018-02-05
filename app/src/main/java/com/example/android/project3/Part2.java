package com.example.android.project3;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Part2 extends AppCompatActivity {

    int score;

    boolean q1, q2, q3, q4, q5, q6, q7, qp1,qp2;

    TextView answer1, answer2, answer3, answer4, answer5, answer6, answer7;

    ImageView answerqp1, answerqp2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2);
        Intent intent = getIntent();

        q1 = intent.getBooleanExtra("q1", false);
        q2 = intent.getBooleanExtra("q2", false);
        q3 = intent.getBooleanExtra("q3", false);
        q4 = intent.getBooleanExtra("q4", false);
        q5 = intent.getBooleanExtra("q5", false);
        q6 = intent.getBooleanExtra("q6", false);
        q7 = intent.getBooleanExtra("q7", false);
        int monokumas = getIntent().getIntExtra("monokumas", R.drawable.monokumas);
        answerqp1 = (ImageView) findViewById(R.id.monokumap);
        if (qp1);
        answerqp1.setImageResource(monokumas);
        int monokumah = getIntent().getIntExtra("monokumas", R.drawable.monokumah);
        answerqp2 = (ImageView) findViewById(R.id.monokumap);
        if (qp2);
        answerqp2.setImageResource(monokumah);


        show();
    }


    public void show() {
        answer1 = (TextView) findViewById(R.id.answer1);
        if (q1) {
            answer1.setTextColor(Color.parseColor("#4CAF50"));
            answer1.append("Corect well done!");
            score = score + 1;
        } else {
            answer1.setTextColor(Color.parseColor("#F44336"));
            answer1.append("Wrong try again!");
        }


        answer2 = (TextView) findViewById(R.id.answer2);
        if (q2) {
            answer2.setTextColor(Color.parseColor("#4CAF50"));
            answer2.append("Corect well done!");
            score = score + 1;
        } else {
            answer2.setTextColor(Color.parseColor("#F44336"));
            answer2.append("Wrong try again!");
        }


        answer3 = (TextView) findViewById(R.id.answer3);
        if (q3) {
            answer3.setTextColor(Color.parseColor("#4CAF50"));
            answer3.append("Corect well done!");
            score = score + 1;
        } else {
            answer3.setTextColor(Color.parseColor("#F44336"));
            answer3.append("Wrong try again!");
        }

        answer4 = (TextView) findViewById(R.id.answer4);
        if (q4) {
            answer4.setTextColor(Color.parseColor("#4CAF50"));
            answer4.append("Corect well done!");
            score = score + 1;
        } else {
            answer4.setTextColor(Color.parseColor("#F44336"));
            answer4.append("Wrong try again!");
        }

        answer5 = (TextView) findViewById(R.id.answer5);
        if (q2) {
            answer5.setTextColor(Color.parseColor("#4CAF50"));
            answer5.append("Corect well done!");
            score = score + 1;
        } else {
            answer5.setTextColor(Color.parseColor("#F44336"));
            answer5.append("Wrong try again!");
        }

        answer6 = (TextView) findViewById(R.id.answer6);
        if (q6) {
            answer6.setTextColor(Color.parseColor("#4CAF50"));
            answer6.append("Corect well done!");
            score = score + 1;
        } else {
            answer6.setTextColor(Color.parseColor("#F44336"));
            answer6.append("Wrong try again!");
        }

        answer7 = (TextView) findViewById(R.id.answer7);
        if (q7) {
            answer7.setTextColor(Color.parseColor("#4CAF50"));
            answer7.append("Corect well done!");
            score = score + 1;
        } else {
            answer7.setTextColor(Color.parseColor("#F44336"));
            answer7.append("Wrong try again!");
        }

        Context context = getApplicationContext();
        CharSequence text = " Your score is: " + score + "Out of 7";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();





    }



}


