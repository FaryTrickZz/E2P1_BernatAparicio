package com.example.e2p1_bernataparicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.myList);

        GridLayout[] options = new GridLayout[]{findViewById(R.id.grid1)};

        ArrayAdapter<GridLayout> adapter = new ArrayAdapter<GridLayout>(this, android.R.layout.simple_list_item_1, options);

        list.setAdapter(adapter);

    }
}