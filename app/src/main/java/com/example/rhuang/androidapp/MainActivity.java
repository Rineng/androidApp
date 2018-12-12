package com.example.rhuang.androidapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayout;
    private String[] mDataSet = new String[]{"Sports Tickets", "Theatre Tickets", "Concert Tickets", "Movie Tickets"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.cardViews);
        mLayout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayout);

        mAdapter = new recyclerAdaptor(mDataSet);
        recyclerView.setAdapter(mAdapter);
        Button button = (Button) findViewById(R.id.ticketType);

    }

    public void clickButton(View view){
        Intent intent = new Intent(this, listingsActivity.class);
        Button categoryBtn = (Button) findViewById(R.id.ticketType);


        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);    }
}
