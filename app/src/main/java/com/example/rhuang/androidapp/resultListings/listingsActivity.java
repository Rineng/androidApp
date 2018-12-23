package com.example.rhuang.androidapp.resultListings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.rhuang.androidapp.R;

import java.util.ArrayList;

public class listingsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayout;
    ArrayList<String> results = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listings_recycler);
        recyclerView = findViewById(R.id.listingsRecycler);
        mLayout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayout);
        Bundle receiveBundle = getIntent().getExtras();
        results = receiveBundle.getStringArrayList("DATA");
        mAdapter = new resultsAdaptor(results);
        recyclerView.setAdapter(mAdapter);
    }
}
