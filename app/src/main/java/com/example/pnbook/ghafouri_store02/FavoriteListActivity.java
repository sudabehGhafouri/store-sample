package com.example.pnbook.ghafouri_store02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FavoriteListActivity extends AppCompatActivity {
    DBHelper database;
    private ArrayList<recyclerItem> useritems;
    recyclerItem selectItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_list);


        database = DBHelper.getDatabase(this);
        loaduserList();
    }

    private void loaduserList() {
        Log.d("favorateList", "loaduserList");
        useritems = database.getFavoriteProductlist();
        ListView list = findViewById(R.id.list_favoriteItem);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView) view.findViewById(R.id.TitleTextView);
                String text = textView.getText().toString();
                Toast.makeText(FavoriteListActivity.this, text, Toast.LENGTH_SHORT).show();
                selectItem = database.getProduct(text); //sending selected item to shown in detail activity
                Intent intent=new Intent(FavoriteListActivity.this,DetailActivity.class);
                intent.putExtra("data",selectItem);
                intent.putExtra("position",i);
                startActivity(intent);
            }

        });
        list.setAdapter(new FavoriteItemAdapter(this, useritems));
    }
}
