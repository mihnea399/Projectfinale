package com.example.android.project3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    ImageView monokumas;

    RadioButton years116, Monaco, a1, Hamlet, Armstrong, no, yes;

    boolean q1, q2, q3, q4, q5, q6, q7, qp, Ronaldo, Messi, Neymar;

    EditText Udacity;

    String site;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        years116 = (RadioButton) findViewById(R.id.years_116);
        Monaco = (RadioButton) findViewById(R.id.Monaco);
        a1 = (RadioButton) findViewById(R.id.a1);
        Hamlet = (RadioButton) findViewById(R.id.Hamlet);
        Armstrong = (RadioButton) findViewById(R.id.Armstrong);
        no = (RadioButton) findViewById(R.id.no);
        RadioButton no = (RadioButton) findViewById(R.id.no);
        yes = (RadioButton) findViewById(R.id.yes);


    }


    public void submit(View view) {

        Check_qp(view);
        Check_q7(view);
        Check_q6(view);
        Intent i = new Intent(MainActivity.this, Part2.class);
        i.putExtra("q1", q1);
        i.putExtra("q2", q2);
        i.putExtra("q3", q3);
        i.putExtra("q4", q4);
        i.putExtra("q5", q5);
        i.putExtra("q6", q6);
        i.putExtra("q7", q7);
        i.putExtra("qp", qp);
        startActivityForResult(i, 103);

    }


    public void Check_q1(View view) {

        if (view.getId() == R.id.years_116)

        {
            q1 = true;
        } else

        {
            q1 = false;
        }


    }


    public void Check_q2(View view) {

        if ((view.getId()) == R.id.Monaco)

        {
            q2 = true;
        } else

        {
            q2 = false;
        }

    }

    public void Check_q3(View view) {

        if ((view.getId()) == R.id.a1)

        {
            q3 = true;
        } else

        {
            q3 = false;
        }
    }

    public void Check_q4(View view) {

        if ((view.getId()) == R.id.Hamlet)

        {
            q4 = true;
        } else

        {
            q4 = false;
        }
    }

    public void Check_q5(View view) {

        if ((view.getId()) == R.id.Armstrong)


        {
            q5 = true;
        } else

        {
            q5 = false;
        }

    }

    public void Check_q6(View view) {

        if (Ronaldo && Messi) {

            {
                q6 = true;
            }

        } else

        {
            q6 = false;
        }

    }

    public void Ans(View view) {

        if ((view.getId()) == R.id.Messi)

        {

            {
                Messi = true;
            }

        } else if (view.getId() == R.id.Ronaldo) {

            {
                Ronaldo = true;
            }
        } else if (view.getId() == R.id.Neymar) {

            {
                Neymar = false;
            }

        }

    }

    private void Check_q7(View view) {

        Udacity = (EditText) findViewById(R.id.site);

        site = Udacity.getText().toString().toLowerCase();

        if (site.equals("udacity")) {

            q7 = true;

        } else {

            q7 = false;

        }


    }

    public void Check_qp(View view) {

        {

            if ((view.getId()) == R.id.no);

        }


        if ((view.getId()) == R.id.yes) ;

    }

}


