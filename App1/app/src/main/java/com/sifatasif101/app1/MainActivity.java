package com.sifatasif101.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int item=0;

    public void inc(View view){
        item=item+1;
        display(item);
    }
    public void dec(View view){
        item=item-1;
        display(item);
    }

    //use of methods
    private int price(){
        return item*5;
    }
    private boolean toppings(){
        CheckBox checkBox= (CheckBox) findViewById(R.id.checkBox);
        return checkBox.isChecked();
    }
    private String message(){
        return "Name : Sifat Asif "+ "\nChocogranate : "+toppings()+"\nQuantity : "+item+ "\nTotal Price : $"+price()+"\nThank You";
    }
    public void submit(View view){
        Toast.makeText(MainActivity.this, "You have charged $"+(item*5), Toast.LENGTH_SHORT).show();
        orderDetails(message());
    }
    private void display(int num){
        TextView textView1= (TextView) findViewById(R.id.textView1);
        textView1.setText(""+num);
    }
    private void orderDetails(String details){
        TextView textView3= (TextView) findViewById(R.id.textView3);
        textView3.setText(details);
    }

}