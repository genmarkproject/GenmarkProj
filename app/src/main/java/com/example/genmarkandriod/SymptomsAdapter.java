package com.example.genmarkandriod;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedHashMap;

public class SymptomsAdapter extends RecyclerView.Adapter<SymptomsAdapter.SymptomViewHolder>{

    private final LinkedHashMap<String, String> mSymptoms;
    private LayoutInflater mInflater;
    private String[] mKeys;
    private Context context;

    public SymptomsAdapter(Context context, LinkedHashMap<String, String> symptoms){
        mInflater= LayoutInflater.from(context);
        this.mSymptoms = symptoms;
        mKeys = mSymptoms.keySet().toArray(new String[symptoms.size()]);
        this.context = context;
    }

    @NonNull
    @Override
    public SymptomsAdapter.SymptomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.symptom_item, parent, false);
        return new SymptomViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull SymptomsAdapter.SymptomViewHolder holder, int position) {
        holder.mSymptom.setText(mKeys[position]);
        holder.mIcon.setImageResource(context.getResources().getIdentifier(mSymptoms.get(mKeys[position]),"drawable", context.getPackageName()));
    }

    @Override
    public int getItemCount() {
        return mSymptoms.size();
    }

    class SymptomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public final TextView mSymptom;
        public final ImageView mIcon;
        final SymptomsAdapter mAdapter;

        public SymptomViewHolder(@NonNull View itemView, SymptomsAdapter adapter) {
            super(itemView);
            mSymptom = itemView.findViewById(R.id.symptom);
            mIcon = itemView.findViewById(R.id.icon);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int mPosition = getLayoutPosition();
            Toast toast = Toast.makeText(context, mKeys[mPosition], Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}
