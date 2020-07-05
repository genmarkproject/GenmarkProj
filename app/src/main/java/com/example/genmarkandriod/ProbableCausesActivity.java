package com.example.genmarkandriod;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedHashMap;

public class ProbableCausesActivity extends AppCompatActivity {

    private final LinkedHashMap<String, String> probableCauses = new LinkedHashMap<String, String>(){{
        put("Battery low voltage", "ic_battery");
        put("Battery contacts or battery defective", "ic_battery");
        put("12 V connection or ground at starter are bad", "ic_battery");
        put("Starter motor malfunctions", "ic_battery");
        put("Starter motor solenoid defective", "ic_battery");
        put("Loose connection(s)", "ic_battery");
        put("Incorrect grade of lubricating oil", "ic_battery");
    }};;
    private RecyclerView mRecyclerView;
    private ProbableCausesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_probable_causes);
        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new ProbableCausesAdapter(this, probableCauses);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
