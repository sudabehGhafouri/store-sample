package com.example.pnbook.ghafouri_store02;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.amlcurran.showcaseview.OnShowcaseEventListener;
import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.ViewTarget;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetailActivity extends AppCompatActivity {
    ShowcaseView.Builder showcaseView;
    recyclerItem item;
    Context context;
    DBHelper database;
    int state_favorite;
    @BindView(R.id.text_item2)
    TextView title2;
    @BindView(R.id.text_item)
    TextView textView;
    Button btn_favorite;
    String TAG = "DetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().hide();
        ButterKnife.bind(this);
        favoriteButton();
        int position = getIntent().getIntExtra("row", 0);
        item = getIntent().getParcelableExtra("data");
        String title = item.getTitle();
        textView.setText(title);
        title2.setText(item.getTitle());

        final ViewPager pager = findViewById(R.id.pager);
        pager.setAdapter(new pagerAdapter(getSupportFragmentManager()));

        TabLayout tab = findViewById(R.id.tabLayout);
        ViewPager pager2 = findViewById(R.id.pager2);
        pager2.setAdapter(new pagerAdapter2(getSupportFragmentManager()));
        tab.setupWithViewPager(pager2);

        database = DBHelper.getDatabase(this);
        btn_favorite = findViewById(R.id.btn_favorite);

        btn_favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (state_favorite == 0) {
                    recyclerItem productModel = new recyclerItem();
                    productModel.setTitle(item.getTitle());
                    productModel.setImagePath(item.getImagePath());
                    productModel.setImagePath1(item.getImagePath1());
                    productModel.setImagePath2(item.getImagePath2());
                    productModel.setMinPrice(item.getMinPrice());
                    productModel.setMaxPrice(item.getMaxPrice());
                    productModel.setMaxDiscountPercent(item.getMaxDiscountPercent());
                    productModel.setMaxDiscount(item.getMaxDiscount());
                    productModel.setExistStatus(item.getExistStatus());
                    database.insertProduct(productModel);
                    state_favorite = 1;
                    btn_favorite.setBackgroundResource(R.drawable.favorite);

                } else {
                    recyclerItem productModel = new recyclerItem();
                    productModel.setTitle(item.getTitle());
                    productModel.setFavorite_status(0);
                    database.deleteFavoriteProduct(productModel);
                    state_favorite = 0;
                    btn_favorite.setBackgroundResource(R.drawable.unfavorite);
                }
            }
        });
        setShowcaseView();
    }

    private void setShowcaseView() {
        showcaseView = new ShowcaseView.Builder(this)
//              .withMaterialShowcase()
//              .withHoloShowcase()
                .withNewStyleShowcase()
                .setTarget(new ViewTarget(R.id.btn_favorite, this))
                .setContentTitle("favorite button")
                .setContentText("این دکمه را فشار دهید تا اطلاعات محصول به پایگاه داده اضافه شود")

                //.hideOnTouchOutside()
                // .singleShot(showId)

                .setStyle(R.style.CustomShowcaseTheme3)
                .setShowcaseEventListener(new OnShowcaseEventListener() {
                    @Override
                    public void onShowcaseViewHide(ShowcaseView showcaseView) {

                    }

                    @Override
                    public void onShowcaseViewDidHide(ShowcaseView showcaseView) {

                    }

                    @Override
                    public void onShowcaseViewShow(ShowcaseView showcaseView) {

                    }

                    @Override
                    public void onShowcaseViewTouchBlocked(MotionEvent motionEvent) {

                    }
                });
        showcaseView.build();
    }

    public void favoriteButton() {
        btn_favorite = findViewById(R.id.btn_favorite);
        database = DBHelper.getDatabase(this);
        item = getIntent().getParcelableExtra("data");
        int status = database.Fstatus(item);
        if (status == 1) {
            btn_favorite.setBackgroundResource(R.drawable.favorite);
            state_favorite = 0;
        } else {
            btn_favorite.setBackgroundResource(R.drawable.unfavorite);
            state_favorite = 1;
        }
    }

    class pagerAdapter extends FragmentPagerAdapter {
        int pagenumber = 3;


        public pagerAdapter(FragmentManager fm) {
            super(fm);

        }

        @Override
        public Fragment getItem(int position) {
            return Pager1Fragment.newInstance(position, item);
        }

        @Override
        public int getCount() {
            return pagenumber;
        }
    }


    class pagerAdapter2 extends FragmentPagerAdapter {
        int pagecount = 2;
        String[] title = {"قیمت", "مشخصات"};

        public pagerAdapter2(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return PriceFragment.newInstance(position, item);
        }

        @Override
        public int getCount() {
            return pagecount;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return title[position];
        }
    }
}

