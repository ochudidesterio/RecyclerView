package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerItem>recyclerItems = new ArrayList<>();
        recyclerItems.add(new RecyclerItem(R.drawable.ic_android,"Line 1","Line 2"));
        recyclerItems.add(new RecyclerItem(R.drawable.ic_brightness,"Line 3","Line 4"));
        recyclerItems.add(new RecyclerItem(R.drawable.ic_audio,"Line 5","Line 6"));
        recyclerItems.add(new RecyclerItem(R.drawable.ic_android,"Line 7","Line 8"));
        recyclerItems.add(new RecyclerItem(R.drawable.ic_brightness,"Line 9","Line 10"));
        recyclerItems.add(new RecyclerItem(R.drawable.ic_audio,"Line 11","Line 12"));
        recyclerItems.add(new RecyclerItem(R.drawable.ic_android,"Line 13","Line 14"));
        recyclerItems.add(new RecyclerItem(R.drawable.ic_brightness,"Line 15","Line 16"));
        recyclerItems.add(new RecyclerItem(R.drawable.ic_audio,"Line 17","Line 18"));
        recyclerItems.add(new RecyclerItem(R.drawable.ic_android,"Line 19","Line 20"));
        recyclerItems.add(new RecyclerItem(R.drawable.ic_brightness,"Line 21","Line 22"));
        recyclerItems.add(new RecyclerItem(R.drawable.ic_audio,"Line 23","Line 24"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new RecyclerAdapter(recyclerItems);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}
