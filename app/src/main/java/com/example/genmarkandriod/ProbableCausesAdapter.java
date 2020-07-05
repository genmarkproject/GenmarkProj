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

public class ProbableCausesAdapter extends RecyclerView.Adapter<ProbableCausesAdapter.ProbableCauseViewHolder>{

    private final LinkedHashMap<String, String> mProbableCauses;
    private LayoutInflater mInflater;
    private String[] mKeys;
    private Context context;

    public ProbableCausesAdapter(Context context, LinkedHashMap<String, String> probableCauses){
        mInflater= LayoutInflater.from(context);
        this.mProbableCauses = probableCauses;
        mKeys = mProbableCauses.keySet().toArray(new String[probableCauses.size()]);
        this.context = context;
    }

    @NonNull
    @Override
    public ProbableCausesAdapter.ProbableCauseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.probablecause_item, parent, false);
        return new ProbableCauseViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProbableCausesAdapter.ProbableCauseViewHolder holder, int position) {
        holder.mProbableCause.setText(mKeys[position]);
        holder.mIcon.setImageResource(context.getResources().getIdentifier(mProbableCauses.get(mKeys[position]),"drawable", context.getPackageName()));
    }

    @Override
    public int getItemCount() {
        return mProbableCauses.size();
    }

    class ProbableCauseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public final TextView mProbableCause;
        public final ImageView mIcon;
        final ProbableCausesAdapter mAdapter;

        public ProbableCauseViewHolder(@NonNull View itemView, ProbableCausesAdapter adapter) {
            super(itemView);
            mProbableCause = itemView.findViewById(R.id.probablecause);
            mIcon = itemView.findViewById(R.id.icon);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        public void onClick(View v) {
            int mPosition = getLayoutPosition();
            Toast toast = Toast.makeText(context, mKeys[mPosition], Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
