package com.example.e2p1_bernataparicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.myList);

        String[] options = new String[]{"DONUTS", "FROYO", "GINGERBREAD", "HONEYCOMB", "ICE CREAM", "JELLY BEAN", "KITKAT", "LOLLIPOP"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options);

        list.setAdapter(adapter);

    }
}