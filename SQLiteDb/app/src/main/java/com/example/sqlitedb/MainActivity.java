package com.example.sqlitedb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DbHandler handler= new DbHandler(this,"empdb", null,1);
        handler.addEmployee(new Employee(1,"sifat",3.33));
        handler.getEmployee(1);
        handler.close();
    }

}