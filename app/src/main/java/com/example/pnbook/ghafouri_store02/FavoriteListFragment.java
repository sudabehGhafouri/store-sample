package com.example.pnbook.ghafouri_store02;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class FavoriteListFragment extends Fragment {

    DBHelper database;
    private ArrayList<recyclerItem> favoriteItems;
    @BindView(R.id.list_favoriteItem)
    ListView list;

    public FavoriteListFragment() {

    }


    public static FavoriteListFragment newInstance(String param1, String param2) {
        FavoriteListFragment fragment = new FavoriteListFragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_favorite_list, container, false);
        ButterKnife.bind(this, view);
        database = DBHelper.getDatabase(getActivity());
        loadFavoriteList();
        return view;
    }

    private void loadFavoriteList() {
        Log.d("favorateList", "loaduserList");
        favoriteItems = database.getFavoriteProductlist();
        list.setAdapter(new FavoriteItemAdapter(getActivity(), favoriteItems));
    }

}