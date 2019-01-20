package com.example.pnbook.ghafouri_store02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FavoriteItemAdapter extends BaseAdapter {
    Context context;
    ViewHolder holder;
    ArrayList<recyclerItem> item=new ArrayList<>();

    public FavoriteItemAdapter(Context context, ArrayList<recyclerItem> item) {
        this.context = context;
        this.item = item;
    }

    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int i) {
        return item.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.favorite_item_layout,viewGroup,false);
            holder = new ViewHolder();
            holder.TitleTextView   = view.findViewById(R.id.TitleTextView);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        recyclerItem item  = (recyclerItem) getItem(i);
        holder.TitleTextView.setText(item.getTitle() + "");
        return view;

    }
    static class ViewHolder{
        TextView TitleTextView;

    }

}