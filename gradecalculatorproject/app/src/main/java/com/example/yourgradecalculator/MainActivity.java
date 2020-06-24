package com.example.yourgradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                    //connect xml with java

        final EditText quizs = findViewById(R.id.Quizs);
        final EditText homeworks = findViewById(R.id.homeworks);
        final EditText midterms = findViewById(R.id.midterm);
        final EditText finals = findViewById(R.id.Final);
        final TextView results = findViewById(R.id.result);
        Button calc = findViewById(R.id.calc);
        Button reset = findViewById(R.id.reset);

                    // the calculate function

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                     // variables

                double quiz = Double.parseDouble(quizs.getText().toString());
                double hm = Double.parseDouble(homeworks.getText().toString());
                double mt = Double.parseDouble(midterms.getText().toString());
                double f = Double.parseDouble(finals.getText().toString());
                TextView r = results;

                    //result equation

                double result = quiz + hm + mt + f ;

                 // if statment for the results

                if (result > 100 || result < 0){
                    //error invalid number
                    results.setText("ERROR");
                    //bonus
                    results.setTextColor(Color.rgb(105,105,105));

                }
                //A student 90+

                else if ( result >= 90){

                    results.setText("A!");
                    //bonus
                    results.setTextColor(Color.rgb(124,252,0));

                }

                //B student 80-90

                else if( result >= 80){

                    results.setText("B!");
                    //bonus
                    results.setTextColor(Color.rgb(32,178,170));

                }

                //c student 70-80

                else if( result >= 70){

                    results.setText("C!");
                    //bonus
                    results.setTextColor(Color.rgb(0,0,255));


                }

                //d student 60-70

                else if( result >= 60){

                    results.setText("D!");
                    //bonus
                    results.setTextColor(Color.rgb(255, 165, 0));


                }

                //f student 0-60

                else{
                    //mathmatically all the number from -infinty to infinty are in the top except {0-60}
                    results.setText("F");
                    //bonus
                    results.setTextColor(Color.rgb(255, 0, 0));


                }

            }
        });

                // reseting and deleting every thing
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quizs.setText("");
                homeworks.setText("");
                midterms.setText("");
                finals.setText("");
                results.setText("");
            }
        });



    }
}