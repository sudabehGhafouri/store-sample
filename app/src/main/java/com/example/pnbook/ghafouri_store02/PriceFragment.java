package com.example.pnbook.ghafouri_store02;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class PriceFragment extends Fragment {
@BindView(R.id.txt_max)TextView textView_max;
@BindView(R.id.txt_min)TextView textView_min;
@BindView(R.id.txt_percent)TextView textView_percent;
    recyclerItem item;
    int position;


    public PriceFragment() {
        // Required empty public constructor
    }


    public static PriceFragment newInstance(int position,recyclerItem item) {
        PriceFragment fragment = new PriceFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("data",item);
        bundle.putInt("position",position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt("position");
            item = getArguments().getParcelable("data");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_price, container, false);
        ButterKnife.bind(this,view);
        switch (position) {
            case 0:
                textView_max.setText("بیشترین قیمت"+item.getMaxPrice());
                textView_min.setText("کمترین قیمت"+item.getMinPrice());
                textView_percent.setText("بیشترین تخفیف"+item.getMaxPrice());
                break;
            case 1:
                textView_max.setText("good");
                textView_min.setText(item.getMinPrice());
                textView_percent.setText(item.getMaxPrice());
                break;
        }
        return view;
    }

}
