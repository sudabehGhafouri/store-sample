package com.example.pnbook.ghafouri_store02;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Pager1Fragment extends Fragment {

    recyclerItem item;
    int position;
@BindView(R.id.img_pager) ImageView imageView;



    public Pager1Fragment() {
    }


    public static Pager1Fragment newInstance(int position,recyclerItem item) {
        Pager1Fragment fragment = new Pager1Fragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("data",item);
        bundle.putInt("position",position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null){
            position = getArguments().getInt("position");
            item=getArguments().getParcelable("data");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_pager1, container, false);
        ButterKnife.bind(this,view);
switch (position){
    case 0:
        GlideApp.with(this).load(item.getImagePath()).into(imageView);
        break;
    case 1:
        GlideApp.with(this).load(item.getImagePath1()).into(imageView);
        break;
    case 2:
        GlideApp.with(this).load(item.getImagePath2()).into(imageView);
        break;
}

        return view;
    }


}
