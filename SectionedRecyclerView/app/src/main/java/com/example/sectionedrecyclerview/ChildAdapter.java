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
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ViewHolder> {

    Activity activity;
    ArrayList<String> list;
    private int selectedSection=-1;

    public ChildAdapter(Activity activity, ArrayList<String> list) {
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_slot,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       holder.textView.setText(list.get(position));


       holder.textView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(activity, ""+list.get(position), Toast.LENGTH_SHORT).show();
               selectedSection = position;
               notifyDataSetChanged();
           }
       });

        if (selectedSection == position) {
            holder.textView.setBackground(ContextCompat.getDrawable(activity, R.drawable.rectangle_fill));

            holder.textView.setTextColor(Color.WHITE);
        } else {
            holder.textView.setBackground(ContextCompat.getDrawable(activity, R.drawable.rectangle_outline));

            holder.textView.setTextColor(Color.BLACK);
        }



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.text_view);
        }
    }
}
