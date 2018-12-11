package com.example.rhuang.androidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayout;
    private String[] mDataSet = new String[]{"APPLES", "Oranges", "Grapes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.cardViews);
        mLayout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayout);

        mAdapter = new recyclerAdaptor(mDataSet);
        recyclerView.setAdapter(mAdapter);
    }
}
