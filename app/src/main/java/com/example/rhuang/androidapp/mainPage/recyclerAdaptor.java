package com.example.rhuang.androidapp.mainPage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.rhuang.androidapp.R;

import java.util.ArrayList;

public class recyclerAdaptor extends RecyclerView.Adapter<recyclerAdaptor.MyViewHolder> {
    private String[] mDataset;
    Intent intent;
    Context currContext;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public MyViewHolder(View v) {
            super(v);
            mTextView = v.findViewById(R.id.ticketType);
        }
    }

    public recyclerAdaptor(String[] myDataset, Intent intent, Context context) {
        mDataset = myDataset;
        this.intent = intent;
        currContext = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_cardview, parent, false);
        final MyViewHolder vh = new MyViewHolder(v);
        vh.mTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                System.out.println("Position clicked is: " + vh.getAdapterPosition());
                Button categoryBtn = (Button) v.findViewById(R.id.ticketType);
                ArrayList<String> info = new ArrayList<String>();
                String value = categoryBtn.getText().toString();
                info.add(value);
                info.add("item 2");
                System.out.println("SIZE IS : " + info.size());
                intent.putStringArrayListExtra("DATA", info);
                currContext.startActivity(intent);
            }
        });
        return vh;

    }

    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mTextView.setText(mDataset[position]);

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}