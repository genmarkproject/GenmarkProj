package com.example.genmarkandriod;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.LinkedHashMap;

public class SymptomsActivity extends AppCompatActivity {

    private final LinkedHashMap<String, String> symptoms = new LinkedHashMap<String, String>(){{
        put("Starter motor does not operate or low cranking speed", "ic_battery");
        put("Starter motor operates but engine does not start", "ic_battery");
        put("Starter operates and engages, but dies after a few seconds", "ic_battery");
        put("Starter engages, but engine does not turn", "ic_battery");
        put("Engine stops after start", "ic_battery");
        put("Engine will not stop", "ic_battery");
        put("Starter motor will not operate or turns slowly", "ic_battery");
        put("Starter motor turns, but pinion does not engage", "ic_battery");
        put("Starter motor does not disengage after start", "ic_battery");
        put("Pinion does not disengage after engine is running", "ic_battery");
        put("No power to starter motor solenoid", "ic_battery");
        put("Fuel solenoid does not energize or does not remain energized", "ic_battery");
    }};;
    private RecyclerView mRecyclerView;
    private SymptomsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new SymptomsAdapter(this, symptoms);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
