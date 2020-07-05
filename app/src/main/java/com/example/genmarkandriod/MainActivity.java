package com.example.genmarkandriod;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedHashMap;

public class MainActivity extends AppCompatActivity {

    private final LinkedHashMap<String, String> probableCauses = new LinkedHashMap<String, String>(){{
        put("um5", "ic_battery");
        put("ms5", "ic_battery");
    }};;
    private RecyclerView mRecyclerView;
    private ProbableCausesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new ProbableCausesAdapter(this, probableCauses);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}


