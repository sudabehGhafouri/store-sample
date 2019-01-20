package com.example.pnbook.ghafouri_store02;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AboutusFragment extends Fragment {

    @BindView(R.id.btn_call)
    Button btn_call;

    @OnClick(R.id.btn_call)
    public void callclick() {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:09149711756"));
        startActivity(callIntent);
    }
    @BindView(R.id.btn_back)
    Button btn_back;
    @OnClick(R.id.btn_back)public void backclick() {onBackPressed();}
    @BindView(R.id.btn_siteAddress) Button btn_siteAddress;
    @OnClick(R.id.btn_siteAddress)public void siteAddressclick() {startActivity(new Intent(getActivity(), WebActivity.class));}
    @BindView(R.id.btn_LocationAddress)Button btn_location;
    @OnClick(R.id.btn_LocationAddress)public void locationAddress(){startActivity(new Intent(getActivity(), MapsActivity.class));}
    public AboutusFragment() {

    }


    public static AboutusFragment newInstance() {
        AboutusFragment fragment = new AboutusFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_aboutus, container, false);
        ButterKnife.bind(this, view);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        return view;
    }
    public void onBackPressed()
    {
        FragmentManager fm = getActivity().getSupportFragmentManager();
        fm.popBackStack();
    }

}