package com.example.rhuang.androidapp.mainPage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.rhuang.androidapp.R;
import com.example.rhuang.androidapp.resultListings.listingsActivity;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayout;
    private String[] mDataSet = new String[]{"Sports Tickets", "Theatre Tickets", "Concert Tickets", "Movie Tickets", "Others", "Placeholder"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.cardViews);
        mLayout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayout);
        Intent intent = new Intent(this, listingsActivity.class);
        mAdapter = new recyclerAdaptor(mDataSet, intent, this);
        recyclerView.setAdapter(mAdapter);
    }

//    public void clickButton(View view) {
//        Intent intent = new Intent(this, listingsActivity.class);
//        Button categoryBtn = (Button) findViewById(R.id.ticketType);
//        ArrayList<String> info = new ArrayList<String>();
//        String value = categoryBtn.getText().toString();
//        info.add(value);
//        info.add("item 2");
//        System.out.println(info.size());
//        intent.putStringArrayListExtra("DATA", info);
//        startActivity(intent);
//    }

}
