package com.example.sectionedrecyclerview;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.afollestad.sectionedrecyclerview.SectionedRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    Activity activity;
    ArrayList<Section> sectionList ;

    public MainAdapter(Activity activity, ArrayList<Section> sectionList) {
        this.activity = activity;
        this.sectionList = sectionList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_header,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Section section= sectionList.get(position);
        holder.textView.setText(section.getName());

        ArrayList<String> items =  section.getListItem();

        ChildAdapter childAdapter = new ChildAdapter(activity,items);
        holder.recyclerView.setLayoutManager(new GridLayoutManager(activity,3));
        holder.recyclerView.setAdapter(childAdapter);



    }

    @Override
    public int getItemCount() {

        return sectionList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        RecyclerView recyclerView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.text_view_header);
            recyclerView = itemView.findViewById(R.id.header_recyclerView);
        }
    }
}
