package com.example.rhuang.androidapp.resultListings;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rhuang.androidapp.R;

import java.util.ArrayList;

public class resultsAdaptor extends RecyclerView.Adapter<resultsAdaptor.MyViewHolder> {
    private ArrayList<String> mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public MyViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.results);
        }

    }

    public resultsAdaptor(ArrayList<String> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ticket_listings, parent, false);
        final MyViewHolder vh = new MyViewHolder(v);
//        vh.textView.setOnClickListener(new View.OnClickListener(){
////            @Override
////            public void onClick(View view){
////                System.out.println("Position clicked is: " + vh.getAdapterPosition());
////            }
////        });
        return vh;

    }

    // Replace the contents of a view (invoked by the layout manager)
//    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
//        Drawable myDrawable = getResources().getDrawable(R.drawable.ic_launcher_background);
        holder.textView.setText(mDataset.get(position));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}