package com.example.android.project3;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Part2 extends AppCompatActivity {

    RadioButton no;

    boolean q1, q2, q3, q4, q5, q6, q7, qp;

    TextView answer1, answer2, answer3, answer4, answer5, answer6, answer7;




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
        qp = intent.getBooleanExtra("qp",false);
            show();
        }



    public void show() {
        answer1 = (TextView) findViewById(R.id.answer1);
        if (q1) {
            answer1.setTextColor(Color.parseColor("#0cc922"));
            answer1.append("Corrct");
        } else {
            answer1.setTextColor(Color.parseColor("#F44336"));
            answer1.append("Wrong");
        }


        answer2 = (TextView) findViewById(R.id.answer2);
        if (q2) {
            answer2.setTextColor(Color.parseColor("#4CAF50"));
            answer2.append("Corrct");
        } else {
            answer2.setTextColor(Color.parseColor("#F44336"));
            answer2.append("Wrong");
        }


        answer3 = (TextView) findViewById(R.id.answer3);
        if (q3) {
            answer3.setTextColor(Color.parseColor("#4CAF50"));
            answer3.append("Corrct");
        } else {
            answer3.setTextColor(Color.parseColor("#F44336"));
            answer3.append("Wrong");
        }

        answer4 = (TextView) findViewById(R.id.answer4);
        if (q4) {
            answer4.setTextColor(Color.parseColor("#4CAF50"));
            answer4.append("Corrct");
        } else {
            answer4.setTextColor(Color.parseColor("#F44336"));
            answer4.append("Wrong");
        }

        answer5 = (TextView) findViewById(R.id.answer5);
        if (q2) {
            answer5.setTextColor(Color.parseColor("#4CAF50"));
            answer5.append("Corrct");
        } else {
            answer5.setTextColor(Color.parseColor("#F44336"));
            answer5.append("Wrong");
        }

        answer6 = (TextView) findViewById(R.id.answer6);
        if (q6) {
            answer6.setTextColor(Color.parseColor("#4CAF50"));
            answer6.append("Corrct");
        } else {
            answer6.setTextColor(Color.parseColor("#F44336"));
            answer6.append("Wrong");
        }

        answer7 = (TextView) findViewById(R.id.answer7);
        if (q7) {
            answer7.setTextColor(Color.parseColor("#4CAF50"));
            answer7.append("Corrct");
        } else {
            answer7.setTextColor(Color.parseColor("#F44336"));
            answer7.append("Wrong");
        }

        qp = (TextView) findViewById(R.id.monokumas)


        }

    }




