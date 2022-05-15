package com.example.recyclernumber;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        ArrayList<String> number = new ArrayList<>();
        number.add("0312");
        number.add("0312");
        number.add("0312");
        number.add("0312");
        number.add("0312");
        number.add("0312");
        number.add("0312");
        number.add("0312");
        number.add("0312");
        number.add("0312");
        number.add("0312");
        number.add("0312");
        number.add("0312");
        number.add("0312");
        number.add("0312");
        number.add("0312");

        NumberAdapter adapter = new NumberAdapter(number);
        recyclerView.setAdapter(adapter);
    }

}