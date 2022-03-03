package com.example.practiceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    EditText n1,n2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Good Morning!!!", Toast.LENGTH_SHORT).show();
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        t1=findViewById(R.id.t1);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum=(Integer.parseInt(n1.getText().toString())+Integer.parseInt(n2.getText().toString()));
                t1.setText("The sum is :" + sum);
            }
        });
    }
}