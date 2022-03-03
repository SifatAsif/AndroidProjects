package com.sifatasif101.basketcourtcount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //team A
    int scoreA = 0;

    public void three(View view) {
        scoreA = scoreA + 3;
        scoreDisplayA(scoreA);
    }

    public void two(View view) {
        scoreA = scoreA + 2;
        scoreDisplayA(scoreA);
    }

    public void free(View view) {
        scoreA = scoreA + 1;
        scoreDisplayA(scoreA);
    }

    private void scoreDisplayA(int num) {
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(String.valueOf(num));
    }

    //team B
    int scoreB = 0;

    public void threeB(View view) {
        scoreB = scoreB + 3;
        scoreDisplayB(scoreB);
    }

    public void twoB(View view) {
        scoreB = scoreB + 2;
        scoreDisplayB(scoreB);
    }

    public void freeB(View view) {
        scoreB = scoreB + 1;
        scoreDisplayB(scoreB);
    }

    private void scoreDisplayB(int num) {
        TextView textView2B = (TextView) findViewById(R.id.textView2B);
        textView2B.setText(String.valueOf(num));
    }

    //reset
    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        scoreDisplayA(scoreA);
        scoreDisplayB(scoreB);
        Toast.makeText(MainActivity.this, "All Scores has been reset !", Toast.LENGTH_LONG).show();

    }


}