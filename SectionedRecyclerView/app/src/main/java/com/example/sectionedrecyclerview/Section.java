package com.example.sectionedrecyclerview;

import java.util.ArrayList;

public class Section {

    String name;
    ArrayList<String> listItem ;

    public Section() {
    }

    public Section(String name, ArrayList<String> listItem) {
        this.name = name;
        this.listItem = listItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getListItem() {
        return listItem;
    }

    public void setListItem(ArrayList<String> listItem) {
        this.listItem = listItem;
    }
}
