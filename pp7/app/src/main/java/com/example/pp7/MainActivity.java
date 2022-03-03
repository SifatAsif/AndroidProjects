package com.example.pp7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    contact o1=new contact(1,"sifat","01521443109");
    contact o2=new contact(1,"sifat","01521443109");
    contact o3=new contact(1,"sifat","01521443109");
    contact o4=new contact(1,"sifat","01521443109");
    contact o5=new contact(1,"sifat","01521443109");
    contact o6=new contact(1,"sifat","01521443109");
    contact o7=new contact(1,"sifat","01521443109");
    contact o8=new contact(1,"sifat","01521443109");
    contact o9=new contact(1,"sifat","01521443109");
    contact o10=new contact(1,"sifat","01521443109");
    contact[] contacts={o1,o2,o3,o4,o5,o6,o7,o8,o9,o10};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad=new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
}