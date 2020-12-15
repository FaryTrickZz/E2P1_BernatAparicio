package com.example.e2p1_bernataparicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.myList);

        LinearLayout[] options = new LinearLayout[]{findViewById(R.id.linearLayout1),
                                                    findViewById(R.id.linearLayout2),
                                                    findViewById(R.id.linearLayout3),
                                                    findViewById(R.id.linearLayout4),
                                                    findViewById(R.id.linearLayout5),
                                                    findViewById(R.id.linearLayout6),
                                                    findViewById(R.id.linearLayout7),
                                                    findViewById(R.id.linearLayout8)};

        ArrayAdapter<LinearLayout> adapter = new ArrayAdapter<LinearLayout>(this, android.R.layout.simple_list_item_1, options);

        list.setAdapter(adapter);


    }
}