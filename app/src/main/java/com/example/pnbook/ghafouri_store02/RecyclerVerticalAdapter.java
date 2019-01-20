package com.example.pnbook.ghafouri_store02;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerVerticalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<dataModel> vertucalItems;

    public RecyclerVerticalAdapter(Context context, ArrayList<dataModel> vertucalItems) {
        this.context = context;
        this.vertucalItems = vertucalItems;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.vertical_item, parent, false);

        return new verticalHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        dataModel item = vertucalItems.get(position);
        verticalHolder myHolder = (verticalHolder) holder;
        myHolder.titleVertical.setText(item.Title);
        myHolder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));

        RecyclerHorizontalAdapter adapter = new RecyclerHorizontalAdapter(context, item.getData());
        adapter.setonHorizontalRecyclerClick(new RecyclerHorizontalAdapter.horizontalRecyclerClick() {
            @Override
            public void onclick(recyclerItem item) {
                verticalListener.onClick(position, item);
            }
        });

        myHolder.recyclerView.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return vertucalItems.size();
    }

    public class verticalHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.recyclerVertical)
        RecyclerView recyclerView;
        @BindView(R.id.text_VerticalTitle)
        TextView titleVertical;

        public verticalHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    private VerticalRecyclerClick verticalListener;

    public interface VerticalRecyclerClick {
        void onClick(int row, recyclerItem item);
    }

    public void setonVerticalRecyclerClick(VerticalRecyclerClick listener) {    //dastresi dadn be layebala
        this.verticalListener = listener;
    }
}

