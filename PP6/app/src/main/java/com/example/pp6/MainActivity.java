package com.example.pp6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] ques={"java is a Human?","java was created using python?","Java was created in 1993 ?","Java supports interfaces?"
                            ,"Java has abstract classes"};
    private boolean[] ans={false, false, false, true, true};
    private int score=0;
    private int index=0;
    Button yes;
    Button no;
    TextView question;
    String thank="Thank You !!!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question=findViewById(R.id.question);
        question.setText(ques[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index<=ques.length-1){
                    if (ans[index]==true){
                        score++;
                    }
                    index++;
                    if (index<=ques.length-1){
                        question.setText(ques[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    question.setText(thank);
                    Toast.makeText(MainActivity.this, "Your Exam is over !!!\nRestart the app to play again.", Toast.LENGTH_LONG).show();
                }

            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index<=ques.length-1){
                    if (ans[index]==false){
                        score++;
                    }
                    index++;
                    if (index<=ques.length-1){
                        question.setText(ques[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    question.setText(thank);
                    Toast.makeText(MainActivity.this, "Your Exam is over !!!\nRestart the app to play again.", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}