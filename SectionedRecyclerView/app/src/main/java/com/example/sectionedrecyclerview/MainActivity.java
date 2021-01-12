package com.example.sectionedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Section> sectionList = new ArrayList<>();

    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        ArrayList<String> arrayListOne = new ArrayList<>();
        //add morning value

        arrayListOne.add("05:00 AM");
        arrayListOne.add("06:00 AM");
        arrayListOne.add("07:00 AM");
        arrayListOne.add("08:00 AM");
        arrayListOne.add("09:00 AM");
        arrayListOne.add("10:00 AM");
        arrayListOne.add("11:00 AM");


        //add afternoon value

        ArrayList<String> arrayListTwo = new ArrayList<>();

        arrayListTwo.add("12:00 PM");
        arrayListTwo.add("01:00 PM");
        arrayListTwo.add("02:00 PM");
        arrayListTwo.add("03:00 PM");
        arrayListTwo.add("04:00 PM");


        //add evening value


        ArrayList<String> arrayListThree= new ArrayList<>();

        arrayListThree.add("05:00 PM");
        arrayListThree.add("06:00 PM");
        arrayListThree.add("07:00 PM");
        arrayListThree.add("08:00 PM");


        //add night value

        ArrayList<String> arrayListFour = new ArrayList<>();
        arrayListFour.add("09:00 PM");
        arrayListFour.add("10:00 PM");
        arrayListFour.add("11:00 PM");
        arrayListFour.add("12:00 AM");
        arrayListFour.add("01:00 AM");
        arrayListFour.add("02:00 AM");
        arrayListFour.add("03:00 AM");
        arrayListFour.add("04:00 AM");



        sectionList.add(new Section("Morning",arrayListOne));
        sectionList.add(new Section("Afternoon",arrayListTwo));
        sectionList.add(new Section("Evening",arrayListThree));
        sectionList.add(new Section("Night",arrayListFour));

        adapter = new MainAdapter(this,sectionList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }


    private void init() {
        recyclerView = findViewById(R.id.recycler_view);
    }
}