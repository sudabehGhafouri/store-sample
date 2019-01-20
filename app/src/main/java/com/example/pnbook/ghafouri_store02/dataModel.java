package com.example.pnbook.ghafouri_store02;

import java.util.ArrayList;

public class dataModel {

    int rowType=100;
    String Title="";
    ArrayList<recyclerItem> data=new ArrayList<>();

    public dataModel() {

    }

    public int getRowType() { return rowType; }

    public void setRowType(int rowType) { this.rowType = rowType; }

    public String getTitle() { return Title;}

    public void setTitle(String title) { Title = title; }

    public ArrayList<recyclerItem> getData() { return data; }

    public void setData(ArrayList<recyclerItem> data) { this.data = data; }
}
