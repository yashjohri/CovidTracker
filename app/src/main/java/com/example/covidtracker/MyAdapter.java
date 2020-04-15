package com.example.covidtracker;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    private ArrayList<StateInfo> list;
    private Context context;

    public MyAdapter(ArrayList<StateInfo> list, Context context) {
        this.list = list;
        this.context=context;
    }

    @NonNull
    @Override
    public MyAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyHolder holder, int position) {

        StateInfo obj=list.get(position);
        holder.tvName.setText(obj.getState());
        holder.tvConfirmed.setText(obj.getConfirmed());
        holder.tvRecovered.setText(obj.getRecovered());
        holder.tvDeaths.setText(obj.getDeaths());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        TextView tvName, tvRecovered, tvDeaths, tvConfirmed;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            tvConfirmed=itemView.findViewById(R.id.tvConfirmed);
            tvDeaths=itemView.findViewById(R.id.tvDeaths);
            tvName=itemView.findViewById(R.id.tvName);
            tvRecovered=itemView.findViewById(R.id.tvRecovered);

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    String s="Updated "+list.get(getLayoutPosition()).getLastupdatedtime();
                    Toast.makeText(context, s, Toast.LENGTH_LONG).show();
                    return true;
                }
            });
        }
    }
}
