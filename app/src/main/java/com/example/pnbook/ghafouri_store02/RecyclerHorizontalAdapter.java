package com.example.pnbook.ghafouri_store02;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerHorizontalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    Context contex;
    ArrayList<recyclerItem> horizontalItems;

    public RecyclerHorizontalAdapter(Context contex, ArrayList<recyclerItem> horizontalItems) {
        this.contex = contex;
        this.horizontalItems = horizontalItems;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(contex).inflate(R.layout.horizontal_item, parent, false);
        return new horizontalHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        final recyclerItem item=horizontalItems.get(position);
        horizontalHolder myHolder = (horizontalHolder) holder;

        myHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listiner.onclick(item);
            }
        });
        myHolder.titleTextView.setText(item.getTitle());
        myHolder.subtitleTextView.setText(item.getMinPrice());
        GlideApp.with(contex).load(item.getImagePath()).into(myHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return horizontalItems.size();
    }


    public class horizontalHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.liner_horizontal)
        LinearLayout linearLayout;
        @BindView(R.id.img_horizontal)
        ImageView imageView;
        @BindView(R.id.text_title)
        TextView titleTextView;
        @BindView(R.id.text_sutitle)
        TextView subtitleTextView;

        public horizontalHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    private  horizontalRecyclerClick listiner;

    public interface horizontalRecyclerClick {
        void onclick(recyclerItem item);

    }

    public void setonHorizontalRecyclerClick(horizontalRecyclerClick listiner) {
        this.listiner = listiner;
    }
}
