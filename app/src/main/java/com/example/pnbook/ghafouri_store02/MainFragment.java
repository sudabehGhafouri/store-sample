package com.example.pnbook.ghafouri_store02;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.google.gson.Gson;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainFragment extends Fragment {
    @BindView(R.id.recycler_main) RecyclerView recyclerView;
    @BindView(R.id.slider)SliderLayout slider;
    public MainFragment() {

    }


    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();

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

      View view= inflater.inflate(R.layout.fragment_main, container, false);
         ButterKnife.bind(this,view);
        ((AppCompatActivity) getActivity()).getSupportActionBar().show();
        String json = "{\n" +
                "    \"status\": 1,\n" +
                "    \"code\": 200,\n" +
                "    \"msg\": \"\",\n" +
                "    \"page\": 0,\n" +
                "    \"totalpages\": 0,\n" +
                "    \"totalitems\": 0,\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"rowType\": 101,\n" +
                "            \"Title\": \"گوشی موبایل\",\n" +
                "            \"data\": [\n" +
                "                {\n" +
                "                    \"Id\": \"5884724321394d49662042c6\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_128320/Original/Mobile-Phone-Microsoft-Lumia-6501dc9ca.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_128320/Original/Mobile-Phone-Microsoft-Lumia-6501dc9ca.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_128320/Original/Mobile-Phone-Microsoft-Lumia-6501dc9ca.jpg\",\n" +
                "                    \"MinPrice\": 0,\n" +
                "                    \"MaxPrice\": 290000,\n" +
                "                    \"MaxDiscount\": 290000,\n" +
                "                    \"MaxDiscountPercent\": 100,\n" +
                "                    \"Title\": \"گوشي موبايل مايکروسافت مدل Lumia 650\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5ae0823fd305001ba4f1cd2b\",\n" +
                "                    \"ImagePath\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_555523/Original/Hope-F88-Dual-SIM-Mobile-Phone-902f2c.JPG\",\n" +
                "                    \"ImagePath1\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_555523/Original/Hope-F88-Dual-SIM-Mobile-Phone-902f2c.JPG\",\n" +
                "                    \"ImagePath2\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_555523/Original/Hope-F88-Dual-SIM-Mobile-Phone-902f2c.JPG\",\n" +
                "                    \"MinPrice\": 3980000,\n" +
                "                    \"MaxPrice\": 7500000,\n" +
                "                    \"MaxDiscount\": 3520000,\n" +
                "                    \"MaxDiscountPercent\": 47,\n" +
                "                    \"Title\": \"گوشی موبایل هوپ مدل F88 دوسیم کارت\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5884a6f521394d496622fe36\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_200132/Original/Samsung-Galaxy-A7-(2017)-Dual-SIM-Mobile-Phone-035a4f.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_200132/Original/Samsung-Galaxy-A7-(2017)-Dual-SIM-Mobile-Phone-035a4f.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_200132/Original/Samsung-Galaxy-A7-(2017)-Dual-SIM-Mobile-Phone-035a4f.jpg\",\n" +
                "                    \"MinPrice\": 150000,\n" +
                "                    \"MaxPrice\": 220000,\n" +
                "                    \"MaxDiscount\": 70000,\n" +
                "                    \"MaxDiscountPercent\": 32,\n" +
                "                    \"Title\": \"گوشي موبايل سامسونگ مدل Galaxy A7 2017 دو سيم\\u200cکارت\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5884a6f721394d496622fe41\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_200194/Original/Samsung-Galaxy-A3-(2017)-Dual-SIM-Mobile-Phone-8a7f8c.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_200194/Original/Samsung-Galaxy-A3-(2017)-Dual-SIM-Mobile-Phone-8a7f8c.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_200194/Original/Samsung-Galaxy-A3-(2017)-Dual-SIM-Mobile-Phone-8a7f8c.jpg\",\n" +
                "                    \"MinPrice\": 150000,\n" +
                "                    \"MaxPrice\": 260000,\n" +
                "                    \"MaxDiscount\": 70000,\n" +
                "                    \"MaxDiscountPercent\": 32,\n" +
                "                    \"Title\": \"گوشي موبايل سامسونگ مدل Galaxy A3 2017 دو سيم\\u200c کارت\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5884a70921394d496622fede\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_200169/Original/Samsung-Galaxy-A5-(2017)-Dual-SIM-Mobile-Phone-6dea6e.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_200169/Original/Samsung-Galaxy-A5-(2017)-Dual-SIM-Mobile-Phone-6dea6e.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_200169/Original/Samsung-Galaxy-A5-(2017)-Dual-SIM-Mobile-Phone-6dea6e.jpg\",\n" +
                "                    \"MinPrice\": 150000,\n" +
                "                    \"MaxPrice\": 19900000,\n" +
                "                    \"MaxDiscount\": 70000,\n" +
                "                    \"MaxDiscountPercent\": 32,\n" +
                "                    \"Title\": \"گوشي موبايل سامسونگ مدل Galaxy A5 2017 دو سيم\\u200cکارت\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5967078caec69b30b81c3967\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_275481/Original/OROD-HERO-Dual-SIM-Mobile-Phone-63406f.JPG\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_275481/Original/OROD-HERO-Dual-SIM-Mobile-Phone-63406f.JPG\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_275481/Original/OROD-HERO-Dual-SIM-Mobile-Phone-63406f.JPG\",\n" +
                "                    \"MinPrice\": 1010000,\n" +
                "                    \"MaxPrice\": 1490000,\n" +
                "                    \"MaxDiscount\": 480000,\n" +
                "                    \"MaxDiscountPercent\": 32,\n" +
                "                    \"Title\": \"گوشی موبایل ارد مدل HERO دو سیم\\u200cکارت\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"594e70cbaec69b3acb57827c\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_267580/Original/Tonino-Lamborghini-88-Tauri-Dual-SIM-Mobile-Phone-9f2a43.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_267580/Original/Tonino-Lamborghini-88-Tauri-Dual-SIM-Mobile-Phone-9f2a43.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_267580/Original/Tonino-Lamborghini-88-Tauri-Dual-SIM-Mobile-Phone-9f2a43.jpg\",\n" +
                "                    \"MinPrice\": 200000000,\n" +
                "                    \"MaxPrice\": 280000000,\n" +
                "                    \"MaxDiscount\": 80000000,\n" +
                "                    \"MaxDiscountPercent\": 29,\n" +
                "                    \"Title\": \"گوشی موبایل تونینو لامبورگینی مدل 88 Tauri دو سیم کارت\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5884a76b21394d496623076d\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_120175/Original/Mobile-Phone-Samsung-Galaxy-J1-20168bc7de.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_120175/Original/Mobile-Phone-Samsung-Galaxy-J1-20168bc7de.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_120175/Original/Mobile-Phone-Samsung-Galaxy-J1-20168bc7de.jpg\",\n" +
                "                    \"MinPrice\": 150000,\n" +
                "                    \"MaxPrice\": 270000,\n" +
                "                    \"MaxDiscount\": 50000,\n" +
                "                    \"MaxDiscountPercent\": 25,\n" +
                "                    \"Title\": \"گوشي موبايل سامسونگ مدل Galaxy J1 2016\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588472d321394d4966204439\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_56776/Original/Mobile-Phone-ASUS-ZenFone-Zoom-Dual-SIM-ZX551ML-64GB597eaa.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_56776/Original/Mobile-Phone-ASUS-ZenFone-Zoom-Dual-SIM-ZX551ML-64GB597eaa.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_56776/Original/Mobile-Phone-ASUS-ZenFone-Zoom-Dual-SIM-ZX551ML-64GB597eaa.jpg\",\n" +
                "                    \"MinPrice\": 13600000,\n" +
                "                    \"MaxPrice\": 18000000,\n" +
                "                    \"MaxDiscount\": 4200000,\n" +
                "                    \"MaxDiscountPercent\": 24,\n" +
                "                    \"Title\": \"گوشي موبايل ايسوس مدل ZenFone Zoom ZX551ML ظرفيت 64 گيگابايت\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5ae081fed305001ba4f1cd14\",\n" +
                "                    \"ImagePath\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_341933/Original/Ken-Xin-Da-Star-Dual-Sim-Mobile-Phone-with-a-powerbank-bfdbb3.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_341933/Original/Ken-Xin-Da-Star-Dual-Sim-Mobile-Phone-with-a-powerbank-bfdbb3.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_341933/Original/Ken-Xin-Da-Star-Dual-Sim-Mobile-Phone-with-a-powerbank-bfdbb3.jpg\",\n" +
                "                    \"MinPrice\": 3890000,\n" +
                "                    \"MaxPrice\": 4990000,\n" +
                "                    \"MaxDiscount\": 1100000,\n" +
                "                    \"MaxDiscountPercent\": 22,\n" +
                "                    \"Title\": \"گوشي موبايل کن شين دا مدل Star دو سيم کارت همراه با شارژر همراه\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5967078aaec69b30b81c3965\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_275310/Original/OROD-GB101-Dual-SIM-Mobile-Phone-77bdf9.JPG\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_275310/Original/OROD-GB101-Dual-SIM-Mobile-Phone-77bdf9.JPG\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_275310/Original/OROD-GB101-Dual-SIM-Mobile-Phone-77bdf9.JPG\",\n" +
                "                    \"MinPrice\": 1190000,\n" +
                "                    \"MaxPrice\": 1490000,\n" +
                "                    \"MaxDiscount\": 300000,\n" +
                "                    \"MaxDiscountPercent\": 20,\n" +
                "                    \"Title\": \"گوشی موبایل ارد مدل GB101 دو سیم\\u200c کارت\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5962a13caec69b77544c4e15\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_275181/Original/OROD-GB101G-Dual-SIM-Mobile-Phone-dbdfc8.JPG\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_275181/Original/OROD-GB101G-Dual-SIM-Mobile-Phone-dbdfc8.JPG\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_275181/Original/OROD-GB101G-Dual-SIM-Mobile-Phone-dbdfc8.JPG\",\n" +
                "                    \"MinPrice\": 1590000,\n" +
                "                    \"MaxPrice\": 1890000,\n" +
                "                    \"MaxDiscount\": 300000,\n" +
                "                    \"MaxDiscountPercent\": 16,\n" +
                "                    \"Title\": \"گوشی موبایل ارد مدل GB101G دو سیم\\u200cکارت\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5ae081d6d305001ba4f1cd0d\",\n" +
                "                    \"ImagePath\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_291779/Original/Ken-Xin-Da-Delta-dual-sim-mobile-phone-with-a-powerbank-42d6ca.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_291779/Original/Ken-Xin-Da-Delta-dual-sim-mobile-phone-with-a-powerbank-42d6ca.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_291779/Original/Ken-Xin-Da-Delta-dual-sim-mobile-phone-with-a-powerbank-42d6ca.jpg\",\n" +
                "                    \"MinPrice\": 2690000,\n" +
                "                    \"MaxPrice\": 3190000,\n" +
                "                    \"MaxDiscount\": 500000,\n" +
                "                    \"MaxDiscountPercent\": 16,\n" +
                "                    \"Title\": \"گوشی موبایل کن شین دا مدل Delta دو سیم کارت به همراه یک شارژر همراه و یک کاور\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588457f621394d49661ea84b\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_117480/Original/Mobile-Phone-Lenovo-Vibe-S1-Liteb942ef.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_117480/Original/Mobile-Phone-Lenovo-Vibe-S1-Liteb942ef.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_117480/Original/Mobile-Phone-Lenovo-Vibe-S1-Liteb942ef.jpg\",\n" +
                "                    \"MinPrice\": 8390000,\n" +
                "                    \"MaxPrice\": 9500000,\n" +
                "                    \"MaxDiscount\": 1110000,\n" +
                "                    \"MaxDiscountPercent\": 12,\n" +
                "                    \"Title\": \"گوشي موبايل دو سيم کارت لنوو مدل Vibe S1 Lite\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"592ae33421394d24a87f42a6\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_199558/Original/Marshal-ME-349-Dual-SIM-Mobile-Phone-b2b113.JPG\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_199558/Original/Marshal-ME-349-Dual-SIM-Mobile-Phone-b2b113.JPG\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_199558/Original/Marshal-ME-349-Dual-SIM-Mobile-Phone-b2b113.JPG\",\n" +
                "                    \"MinPrice\": 2960000,\n" +
                "                    \"MaxPrice\": 3350000,\n" +
                "                    \"MaxDiscount\": 390000,\n" +
                "                    \"MaxDiscountPercent\": 12,\n" +
                "                    \"Title\": \"گوشي موبايل مارشال مدل ME-349 دو سيم کارت\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5884580621394d49661ea9ba\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_132131/Original/Mobile-Phone-Lenovo-Vibe-S1-Dual-SIM93b3ed.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_132131/Original/Mobile-Phone-Lenovo-Vibe-S1-Dual-SIM93b3ed.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_132131/Original/Mobile-Phone-Lenovo-Vibe-S1-Dual-SIM93b3ed.jpg\",\n" +
                "                    \"MinPrice\": 12990000,\n" +
                "                    \"MaxPrice\": 14500000,\n" +
                "                    \"MaxDiscount\": 1510000,\n" +
                "                    \"MaxDiscountPercent\": 10,\n" +
                "                    \"Title\": \"گوشي موبايل لنوو مدل Vibe S1 دو سيم\\u200cکارت\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"rowType\": 101,\n" +
                "            \"Title\": \"دوربین\",\n" +
                "            \"data\": [\n" +
                "                {\n" +
                "                    \"Id\": \"5afc6051ed99b87d2721e7f9\",\n" +
                "                    \"ImagePath\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_584630/Original/TECHNICAL-Car-Camcorder-Model-FULL-HD-73a6b4.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_584630/Original/TECHNICAL-Car-Camcorder-Model-FULL-HD-73a6b4.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_584630/Original/TECHNICAL-Car-Camcorder-Model-FULL-HD-73a6b4.jpg\",\n" +
                "                    \"MinPrice\": 2900000,\n" +
                "                    \"MaxPrice\": 5000000,\n" +
                "                    \"MaxDiscount\": 2100000,\n" +
                "                    \"MaxDiscountPercent\": 42,\n" +
                "                    \"Title\": \"دوربین فیلم برداری خودرو تکنیکال مدل Full HD\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5ae6fba0ed99b803f3d43e5f\",\n" +
                "                    \"ImagePath\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_531645/Original/Mini-DV-Q7-Wifi-HD-P2P-Camera-c660f2.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_531645/Original/Mini-DV-Q7-Wifi-HD-P2P-Camera-c660f2.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_531645/Original/Mini-DV-Q7-Wifi-HD-P2P-Camera-c660f2.jpg\",\n" +
                "                    \"MinPrice\": 1620000,\n" +
                "                    \"MaxPrice\": 2350000,\n" +
                "                    \"MaxDiscount\": 730000,\n" +
                "                    \"MaxDiscountPercent\": 31,\n" +
                "                    \"Title\": \"دوربین جیبی مدل Q7\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588458a221394d49661ebbeb\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_12039/Original/Digital-Camera-Samsung-ST150F5a27ff.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_12039/Original/Digital-Camera-Samsung-ST150F5a27ff.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_12039/Original/Digital-Camera-Samsung-ST150F5a27ff.jpg\",\n" +
                "                    \"MinPrice\": 3500000,\n" +
                "                    \"MaxPrice\": 4990000,\n" +
                "                    \"MaxDiscount\": 1490000,\n" +
                "                    \"MaxDiscountPercent\": 30,\n" +
                "                    \"Title\": \"دوربين ديجيتال سامسونگ مدل ST150F\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5b007a83ed99b845e611bbb2\",\n" +
                "                    \"ImagePath\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_582962/Original/d93c2cf2-716d-4ad2-8e45-11790fd31cfd-bb1087.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_582962/Original/d93c2cf2-716d-4ad2-8e45-11790fd31cfd-bb1087.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_582962/Original/d93c2cf2-716d-4ad2-8e45-11790fd31cfd-bb1087.jpg\",\n" +
                "                    \"MinPrice\": 2490000,\n" +
                "                    \"MaxPrice\": 3490000,\n" +
                "                    \"MaxDiscount\": 1000000,\n" +
                "                    \"MaxDiscountPercent\": 29,\n" +
                "                    \"Title\": \"دوربین فیلمبرداری جاکوم مدل CC2\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588457f421394d49661ea818\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_170831/Original/Canon-EOS-5D-Mark-IV-Digital-Camera-08b39b.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_170831/Original/Canon-EOS-5D-Mark-IV-Digital-Camera-08b39b.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_170831/Original/Canon-EOS-5D-Mark-IV-Digital-Camera-08b39b.jpg\",\n" +
                "                    \"MinPrice\": 121000000,\n" +
                "                    \"MaxPrice\": 172000000,\n" +
                "                    \"MaxDiscount\": 44000000,\n" +
                "                    \"MaxDiscountPercent\": 27,\n" +
                "                    \"Title\": \"دوربين ديجيتال کانن مدل EOS 5D Mark IV\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5ae6fbcfed99b803f3d43e8d\",\n" +
                "                    \"ImagePath\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_527077/Original/wifi-camera-Model-M1026P-2ffc81.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_527077/Original/wifi-camera-Model-M1026P-2ffc81.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_527077/Original/wifi-camera-Model-M1026P-2ffc81.jpg\",\n" +
                "                    \"MinPrice\": 5990000,\n" +
                "                    \"MaxPrice\": 7990000,\n" +
                "                    \"MaxDiscount\": 2000000,\n" +
                "                    \"MaxDiscountPercent\": 25,\n" +
                "                    \"Title\": \"دوربین فیلمبرداری ورزشی مدل M1026P \",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5afc6051ed99b87d2721e7fb\",\n" +
                "                    \"ImagePath\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_444420/Original/EKEN-W9s-Action-Camera-49bb40.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_444420/Original/EKEN-W9s-Action-Camera-49bb40.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_444420/Original/EKEN-W9s-Action-Camera-49bb40.jpg\",\n" +
                "                    \"MinPrice\": 3130000,\n" +
                "                    \"MaxPrice\": 3990000,\n" +
                "                    \"MaxDiscount\": 860000,\n" +
                "                    \"MaxDiscountPercent\": 22,\n" +
                "                    \"Title\": \"دوربين فيلم برداري ورزشي اکن مدل W9s\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5ae6fbd8ed99b803f3d43e94\",\n" +
                "                    \"ImagePath\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_442940/Original/Puluz-G1-Stabilizer-Camcorder-For-Gopro-Sport-Camera-e75137.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_442940/Original/Puluz-G1-Stabilizer-Camcorder-For-Gopro-Sport-Camera-e75137.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digikala.com/digikala/Image/Webstore/Product/P_442940/Original/Puluz-G1-Stabilizer-Camcorder-For-Gopro-Sport-Camera-e75137.jpg\",\n" +
                "                    \"MinPrice\": 11000000,\n" +
                "                    \"MaxPrice\": 13000000,\n" +
                "                    \"MaxDiscount\": 2000000,\n" +
                "                    \"MaxDiscountPercent\": 15,\n" +
                "                    \"Title\": \"دسته لرزشگیر فیلم برداری پلوز مدل G1 Stabilizer مناسب برای دوربین ورزشی گوپرو\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"592ae3f621394d24a87f4dd2\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_255982/Original/Lomography-Lomo-Instant-Mumbai-Digital-Camera-With-Lenses-e23e81.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_255982/Original/Lomography-Lomo-Instant-Mumbai-Digital-Camera-With-Lenses-e23e81.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_255982/Original/Lomography-Lomo-Instant-Mumbai-Digital-Camera-With-Lenses-e23e81.jpg\",\n" +
                "                    \"MinPrice\": 6490000,\n" +
                "                    \"MaxPrice\": 7500000,\n" +
                "                    \"MaxDiscount\": 1010000,\n" +
                "                    \"MaxDiscountPercent\": 13,\n" +
                "                    \"Title\": \"دوربين چاپ سريع لوموگرافي مدل Mumbai به همراه سه لنز\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588457ef21394d49661ea7bc\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_180645/Original/Nikon-D3400-18-55mm-VR-Lens-Kit-Digital-Camera.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_180645/Original/Nikon-D3400-18-55mm-VR-Lens-Kit-Digital-Camera.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_180645/Original/Nikon-D3400-18-55mm-VR-Lens-Kit-Digital-Camera.jpg\",\n" +
                "                    \"MinPrice\": 25350000,\n" +
                "                    \"MaxPrice\": 28590000,\n" +
                "                    \"MaxDiscount\": 3240000,\n" +
                "                    \"MaxDiscountPercent\": 11,\n" +
                "                    \"Title\": \"دوربين ديجيتال نيکون مدل D3400 kit 18-55mm VR\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"59810927aec69b5ad4b34f38\",\n" +
                "                    \"ImagePath\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_287796/Original/Lomography-Lomo-Instant-Automat-Cabo-Verde-Camera-With-Lenses-258cf0.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_287796/Original/Lomography-Lomo-Instant-Automat-Cabo-Verde-Camera-With-Lenses-258cf0.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_287796/Original/Lomography-Lomo-Instant-Automat-Cabo-Verde-Camera-With-Lenses-258cf0.jpg\",\n" +
                "                    \"MinPrice\": 8950000,\n" +
                "                    \"MaxPrice\": 10000000,\n" +
                "                    \"MaxDiscount\": 1050000,\n" +
                "                    \"MaxDiscountPercent\": 11,\n" +
                "                    \"Title\": \"دوربين چاپ سريع لوموگرافي مدل Automat-Cabo Verde به همراه سه لنز\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"59b20913aec69b71e592a2c9\",\n" +
                "                    \"ImagePath\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_301612/Original/Eken-H9R-Action-Camera-69eb8c.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_301612/Original/Eken-H9R-Action-Camera-69eb8c.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_301612/Original/Eken-H9R-Action-Camera-69eb8c.jpg\",\n" +
                "                    \"MinPrice\": 4790000,\n" +
                "                    \"MaxPrice\": 5300000,\n" +
                "                    \"MaxDiscount\": 510000,\n" +
                "                    \"MaxDiscountPercent\": 10,\n" +
                "                    \"Title\": \"دوربین فیلمبرداری ورزشی اکن مدل H9R\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588458b421394d49661ebe8c\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_185799/Original/Rollei-300-Plus-Action-Camera-c29fb0.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_185799/Original/Rollei-300-Plus-Action-Camera-c29fb0.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_185799/Original/Rollei-300-Plus-Action-Camera-c29fb0.jpg\",\n" +
                "                    \"MinPrice\": 3290000,\n" +
                "                    \"MaxPrice\": 3600000,\n" +
                "                    \"MaxDiscount\": 310000,\n" +
                "                    \"MaxDiscountPercent\": 9,\n" +
                "                    \"Title\": \"دوربين فيلمبرداري ورزشي رولي مدل 300 Plus\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5884581421394d49661eab23\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_48958/Original/GoPro-HERO4-Black-Action-Camera.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_48958/Original/GoPro-HERO4-Black-Action-Camera.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_48958/Original/GoPro-HERO4-Black-Action-Camera.jpg\",\n" +
                "                    \"MinPrice\": 14380000,\n" +
                "                    \"MaxPrice\": 19990000,\n" +
                "                    \"MaxDiscount\": 1320000,\n" +
                "                    \"MaxDiscountPercent\": 8,\n" +
                "                    \"Title\": \"دوربين فيلم برداري ورزشي گوپرو مدل HERO4 Black\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5884584921394d49661eb065\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_137751/Original/Digital-Camera-Canon-EOS-70D-18-55-IS-STM9742ff.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_137751/Original/Digital-Camera-Canon-EOS-70D-18-55-IS-STM9742ff.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_137751/Original/Digital-Camera-Canon-EOS-70D-18-55-IS-STM9742ff.jpg\",\n" +
                "                    \"MinPrice\": 36350000,\n" +
                "                    \"MaxPrice\": 39350000,\n" +
                "                    \"MaxDiscount\": 3000000,\n" +
                "                    \"MaxDiscountPercent\": 8,\n" +
                "                    \"Title\": \"دوربين ديجيتال کانن مدل EOS 70D + 18-55 IS STM\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5884a71921394d496622ff74\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_133620/Original/Digital-Camera-Sony-Alpha-A6300-Body668279.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_133620/Original/Digital-Camera-Sony-Alpha-A6300-Body668279.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_133620/Original/Digital-Camera-Sony-Alpha-A6300-Body668279.jpg\",\n" +
                "                    \"MinPrice\": 66000000,\n" +
                "                    \"MaxPrice\": 72000000,\n" +
                "                    \"MaxDiscount\": 6000000,\n" +
                "                    \"MaxDiscountPercent\": 8,\n" +
                "                    \"Title\": \"دوربين ديجيتال سوني مدل Alpha A6300 Body\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"rowType\": 101,\n" +
                "            \"Title\": \"صنایع دستی\",\n" +
                "            \"data\": [\n" +
                "                {\n" +
                "                    \"Id\": \"588dfe1a21394d2301e7d78b\",\n" +
                "                    \"ImagePath\": \"http://zpvliimg.bamilo.com/p/bosch-0432-1111481-1-product.jpg\",\n" +
                "                    \"ImagePath1\": \"http://zpvliimg.bamilo.com/p/bosch-0432-1111481-1-product.jpg\",\n" +
                "                    \"ImagePath2\": \"http://zpvliimg.bamilo.com/p/bosch-0432-1111481-1-product.jpg\",\n" +
                "                    \"MinPrice\": 4050000,\n" +
                "                    \"MaxPrice\": 4050000,\n" +
                "                    \"MaxDiscount\": 0,\n" +
                "                    \"MaxDiscountPercent\": 0,\n" +
                "                    \"Title\": \"همزن دستی سه کاره 450 وات مدل MFQ36GOLD\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588dfe2c21394d2301e7d814\",\n" +
                "                    \"ImagePath\": \"http://zpvliimg.bamilo.com/p/bosch-0385-5939381-1-product.jpg\",\n" +
                "                    \"ImagePath1\": \"http://zpvliimg.bamilo.com/p/bosch-0385-5939381-1-product.jpg\",\n" +
                "                    \"ImagePath2\": \"http://zpvliimg.bamilo.com/p/bosch-0385-5939381-1-product.jpg\",\n" +
                "                    \"MinPrice\": 3770000,\n" +
                "                    \"MaxPrice\": 3770000,\n" +
                "                    \"MaxDiscount\": 0,\n" +
                "                    \"MaxDiscountPercent\": 0,\n" +
                "                    \"Title\": \"همزن دستی دو کاره 500 وات مدل MFQ40302\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"rowType\": 101,\n" +
                "            \"Title\": \"عطر و ادکلن\",\n" +
                "            \"data\": [\n" +
                "                {\n" +
                "                    \"Id\": \"5884751721394d49662057d1\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_54761/Original/Perfume-Chanel-Bleu-Eau-De-Toilette-100ml761564.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_54761/Original/Perfume-Chanel-Bleu-Eau-De-Toilette-100ml761564.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_54761/Original/Perfume-Chanel-Bleu-Eau-De-Toilette-100ml761564.jpg\",\n" +
                "                    \"MinPrice\": 2250000,\n" +
                "                    \"MaxPrice\": 8200000,\n" +
                "                    \"MaxDiscount\": 4550000,\n" +
                "                    \"MaxDiscountPercent\": 67,\n" +
                "                    \"Title\": \"ادو تويلت مردانه مدل شانل Bleu de Chanel حجم 100 ميلي ليتر\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5884a11d21394d49662270b3\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_125907/Original/Perfume-Dolce-and-Gabbana-The-One-Gold-Limited-Edition-Eau-De-Parfum-For-Women-75ml2abb45.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_125907/Original/Perfume-Dolce-and-Gabbana-The-One-Gold-Limited-Edition-Eau-De-Parfum-For-Women-75ml2abb45.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_125907/Original/Perfume-Dolce-and-Gabbana-The-One-Gold-Limited-Edition-Eau-De-Parfum-For-Women-75ml2abb45.jpg\",\n" +
                "                    \"MinPrice\": 1600000,\n" +
                "                    \"MaxPrice\": 4145000,\n" +
                "                    \"MaxDiscount\": 1850000,\n" +
                "                    \"MaxDiscountPercent\": 54,\n" +
                "                    \"Title\": \"ادو پرفيوم زنانه دولچه اند گابانا مدل The One Gold Limited Edition حجم 75 ميلي ليتر\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5884597a21394d49661ed510\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_148292/Original/Paco-Rabanne-1-Million-Eau-De-Toilette-For-Men-50ml.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_148292/Original/Paco-Rabanne-1-Million-Eau-De-Toilette-For-Men-50ml.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_148292/Original/Paco-Rabanne-1-Million-Eau-De-Toilette-For-Men-50ml.jpg\",\n" +
                "                    \"MinPrice\": 1350000,\n" +
                "                    \"MaxPrice\": 2950000,\n" +
                "                    \"MaxDiscount\": 1550000,\n" +
                "                    \"MaxDiscountPercent\": 53,\n" +
                "                    \"Title\": \"ادو تويلت مردانه پاکو رابان مدل 1 Million حجم 50 ميلي ليتر\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5afc6098ed99b87d27235c38\",\n" +
                "                    \"ImagePath\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_583462/Original/Chanel-Allure-Homme-Eau-De-Toilette-For-Men-100ml-02c0e1.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_583462/Original/Chanel-Allure-Homme-Eau-De-Toilette-For-Men-100ml-02c0e1.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_583462/Original/Chanel-Allure-Homme-Eau-De-Toilette-For-Men-100ml-02c0e1.jpg\",\n" +
                "                    \"MinPrice\": 2250000,\n" +
                "                    \"MaxPrice\": 5900000,\n" +
                "                    \"MaxDiscount\": 2500000,\n" +
                "                    \"MaxDiscountPercent\": 53,\n" +
                "                    \"Title\": \"ادوتویلت مردانه شانل مدل Allure Homme حجم 100 میلی لیتر \",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5afc609bed99b87d2723685a\",\n" +
                "                    \"ImagePath\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_546627/Original/EADU-DE-PARFUME-WOMEN-FRENCH-ATTITUDE-PARIS-100-ML-CUTE-10b832.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_546627/Original/EADU-DE-PARFUME-WOMEN-FRENCH-ATTITUDE-PARIS-100-ML-CUTE-10b832.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_546627/Original/EADU-DE-PARFUME-WOMEN-FRENCH-ATTITUDE-PARIS-100-ML-CUTE-10b832.jpg\",\n" +
                "                    \"MinPrice\": 3900000,\n" +
                "                    \"MaxPrice\": 7500000,\n" +
                "                    \"MaxDiscount\": 3600000,\n" +
                "                    \"MaxDiscountPercent\": 48,\n" +
                "                    \"Title\": \"ادو پرفيوم زنانه فرنچ اتيتود پاريس مدل کيوت حجم 100 ميلي ليتر\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"59b8567caec69b4c72c609e0\",\n" +
                "                    \"ImagePath\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_307574/Original/Antonio-Banderas-Play-In-Blue-Seduction-Eau-De-Toilette-For-Women-80ml-e63330.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_307574/Original/Antonio-Banderas-Play-In-Blue-Seduction-Eau-De-Toilette-For-Women-80ml-e63330.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_307574/Original/Antonio-Banderas-Play-In-Blue-Seduction-Eau-De-Toilette-For-Women-80ml-e63330.jpg\",\n" +
                "                    \"MinPrice\": 1190000,\n" +
                "                    \"MaxPrice\": 1880000,\n" +
                "                    \"MaxDiscount\": 690000,\n" +
                "                    \"MaxDiscountPercent\": 37,\n" +
                "                    \"Title\": \"ادو تويلت زنانه آنتونيو باندراس مدل Play In Blue Seduction حجم 80 ميلي ليتر\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5884938f21394d496621cc46\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_81403/Original/Perfume-Histoires-De-Parfums-1804-Eau-De-Parfum-For-Women-120ml5d99f1.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_81403/Original/Perfume-Histoires-De-Parfums-1804-Eau-De-Parfum-For-Women-120ml5d99f1.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_81403/Original/Perfume-Histoires-De-Parfums-1804-Eau-De-Parfum-For-Women-120ml5d99f1.jpg\",\n" +
                "                    \"MinPrice\": 6240000,\n" +
                "                    \"MaxPrice\": 9700000,\n" +
                "                    \"MaxDiscount\": 3460000,\n" +
                "                    \"MaxDiscountPercent\": 36,\n" +
                "                    \"Title\": \"ادو پرفيوم زنانه ايستوار دو پرفم 1804 حجم 120ml\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588483c821394d4966210256\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_117721/Original/Perfume-Davidoff-The-Brilliant-Game-Eau-De-Toilette-For-Men-100ml640111.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_117721/Original/Perfume-Davidoff-The-Brilliant-Game-Eau-De-Toilette-For-Men-100ml640111.jpg\",\n" +
                "                    \"ImagePat2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_117721/Original/Perfume-Davidoff-The-Brilliant-Game-Eau-De-Toilette-For-Men-100ml640111.jpg\",\n" +
                "                    \"MinPrice\": 1440000,\n" +
                "                    \"MaxPrice\": 2380000,\n" +
                "                    \"MaxDiscount\": 760000,\n" +
                "                    \"MaxDiscountPercent\": 35,\n" +
                "                    \"Title\": \"ادو تويلت مردانه داويدف مدل The Brilliant Game حجم 100 ميلي ليتر\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588487ca21394d49662139bf\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_81397/Original/Perfume-Linari-Eleganza-Luminosa-Eau-De-Parfum-100ml15031e.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_81397/Original/Perfume-Linari-Eleganza-Luminosa-Eau-De-Parfum-100ml15031e.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_81397/Original/Perfume-Linari-Eleganza-Luminosa-Eau-De-Parfum-100ml15031e.jpg\",\n" +
                "                    \"MinPrice\": 7070000,\n" +
                "                    \"MaxPrice\": 10900000,\n" +
                "                    \"MaxDiscount\": 3830000,\n" +
                "                    \"MaxDiscountPercent\": 35,\n" +
                "                    \"Title\": \"ادو پرفيوم ليناري مدل Eleganza Luminosa حجم 100 ميلي ليتر\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5afc609eed99b87d27237461\",\n" +
                "                    \"ImagePath\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_426397/Original/Henry-James-1843-Eau-De-Parfum-Set-100ml-b497c0.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_426397/Original/Henry-James-1843-Eau-De-Parfum-Set-100ml-b497c0.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_426397/Original/Henry-James-1843-Eau-De-Parfum-Set-100ml-b497c0.jpg\",\n" +
                "                    \"MinPrice\": 3035000,\n" +
                "                    \"MaxPrice\": 4690000,\n" +
                "                    \"MaxDiscount\": 1655000,\n" +
                "                    \"MaxDiscountPercent\": 35,\n" +
                "                    \"Title\": \"ست ادو پرفیوم هنری جیمز مدل 1843 حجم 100 میلی لیتر\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588480ca21394d496620d9bb\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_54733/Original/Perfume-Mont-Blanc-Legend-Eau-De-Perfume-100ml9e1521.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_54733/Original/Perfume-Mont-Blanc-Legend-Eau-De-Perfume-100ml9e1521.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_54733/Original/Perfume-Mont-Blanc-Legend-Eau-De-Perfume-100ml9e1521.jpg\",\n" +
                "                    \"MinPrice\": 6300000,\n" +
                "                    \"MaxPrice\": 9600000,\n" +
                "                    \"MaxDiscount\": 3300000,\n" +
                "                    \"MaxDiscountPercent\": 34,\n" +
                "                    \"Title\": \"ادو پرفيوم زنانه مون بلان Legend حجم 75ml\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"599b5549aec69b132fb9ce17\",\n" +
                "                    \"ImagePath\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_299539/Original/Antonio-Banderas-Play-In-Blue-Seduction-Eau-De-Toilette-For-Men-100ml-05ebfa.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_299539/Original/Antonio-Banderas-Play-In-Blue-Seduction-Eau-De-Toilette-For-Men-100ml-05ebfa.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_299539/Original/Antonio-Banderas-Play-In-Blue-Seduction-Eau-De-Toilette-For-Men-100ml-05ebfa.jpg\",\n" +
                "                    \"MinPrice\": 1250000,\n" +
                "                    \"MaxPrice\": 1880000,\n" +
                "                    \"MaxDiscount\": 630000,\n" +
                "                    \"MaxDiscountPercent\": 34,\n" +
                "                    \"Title\": \"ادوتويلت مردانه آنتونيو باندراس مدل Play In Blue Seduction حجم 100 ميلي ليتر\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5afc609aed99b87d27236577\",\n" +
                "                    \"ImagePath\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_564797/Original/TESTER-BON-BON-07dafc.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_564797/Original/TESTER-BON-BON-07dafc.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_564797/Original/TESTER-BON-BON-07dafc.jpg\",\n" +
                "                    \"MinPrice\": 4275000,\n" +
                "                    \"MaxPrice\": 6500000,\n" +
                "                    \"MaxDiscount\": 2225000,\n" +
                "                    \"MaxDiscountPercent\": 34,\n" +
                "                    \"Title\": \" تستر ادوپرفیوم زنانه ویکتور اند رولف مدل BON BON حجم 90 میل\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"5afc6097ed99b87d272359a5\",\n" +
                "                    \"ImagePath\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_572844/Original/aff37150-4fbc-4d06-a743-07758e643fb0-3ea66e.jpg\",\n" +
                "                    \"ImagePath1\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_572844/Original/aff37150-4fbc-4d06-a743-07758e643fb0-3ea66e.jpg\",\n" +
                "                    \"ImagePath2\": \"https://file.digi-kala.com/digikala/Image/Webstore/Product/P_572844/Original/aff37150-4fbc-4d06-a743-07758e643fb0-3ea66e.jpg\",\n" +
                "                    \"MinPrice\": 9000000,\n" +
                "                    \"MaxPrice\": 13500000,\n" +
                "                    \"MaxDiscount\": 4500000,\n" +
                "                    \"MaxDiscountPercent\": 33,\n" +
                "                    \"Title\": \"تستر ادوپرفیوم زنانه شیخ مدل 33 حجم 100 میل\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588475fc21394d4966206246\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_56590/Original/Perfume-Versace-Bright-Crystal-Eau-De-Toilette-For-Women-90ml687ec4.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_56590/Original/Perfume-Versace-Bright-Crystal-Eau-De-Toilette-For-Women-90ml687ec4.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_56590/Original/Perfume-Versace-Bright-Crystal-Eau-De-Toilette-For-Women-90ml687ec4.jpg\",\n" +
                "                    \"MinPrice\": 1684700,\n" +
                "                    \"MaxPrice\": 2470000,\n" +
                "                    \"MaxDiscount\": 785300,\n" +
                "                    \"MaxDiscountPercent\": 32,\n" +
                "                    \"Title\": \"ادو تويلت زنانه ورساچه مدل Bright Crystal حجم 90 ميلي ليتر\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"58847d0821394d496620ad1b\",\n" +
                "                    \"ImagePath\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_148107/Original/Perfume-Burberry-Mr-Burberry-Eau-De-Toilette-For-Men-100ml.jpg\",\n" +
                "                    \"ImagePath1\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_148107/Original/Perfume-Burberry-Mr-Burberry-Eau-De-Toilette-For-Men-100ml.jpg\",\n" +
                "                    \"ImagePath2\": \"http://file.digi-kala.com/Digikala/Image/Webstore/Product/P_148107/Original/Perfume-Burberry-Mr-Burberry-Eau-De-Toilette-For-Men-100ml.jpg\",\n" +
                "                    \"MinPrice\": 2019000,\n" +
                "                    \"MaxPrice\": 2980000,\n" +
                "                    \"MaxDiscount\": 961000,\n" +
                "                    \"MaxDiscountPercent\": 32,\n" +
                "                    \"Title\": \"ادو تويلت مردانه بربري مدل Mr Burberry حجم 100 ميلي ليتر\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"rowType\": 101,\n" +
                "            \"Title\": \"کفش ورزشی\",\n" +
                "            \"data\": [\n" +
                "                {\n" +
                "                    \"Id\": \"588e05c621394d2301e81563\",\n" +
                "                    \"ImagePath\": \"http://zpvliimg.bamilo.com/p/albertini-7059-5742981-1-product.jpg\",\n" +
                "                    \"ImagePath1\": \"http://zpvliimg.bamilo.com/p/albertini-7059-5742981-1-product.jpg\",\n" +
                "                    \"ImagePath2\": \"http://zpvliimg.bamilo.com/p/albertini-7059-5742981-1-product.jpg\",\n" +
                "                    \"MinPrice\": 149000,\n" +
                "                    \"MaxPrice\": 590000,\n" +
                "                    \"MaxDiscount\": 341000,\n" +
                "                    \"MaxDiscountPercent\": 70,\n" +
                "                    \"Title\": \"کفش ورزشی دخترانه\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588e371f21394d2301e914dd\",\n" +
                "                    \"ImagePath\": \"http://zpvliimg.bamilo.com/p/volkan-4417-0671402-1-product.jpg\",\n" +
                "                    \"ImagePath1\": \"http://zpvliimg.bamilo.com/p/volkan-4417-0671402-1-product.jpg\",\n" +
                "                    \"ImagePath2\": \"http://zpvliimg.bamilo.com/p/volkan-4417-0671402-1-product.jpg\",\n" +
                "                    \"MinPrice\": 590000,\n" +
                "                    \"MaxPrice\": 1390000,\n" +
                "                    \"MaxDiscount\": 760000,\n" +
                "                    \"MaxDiscountPercent\": 56,\n" +
                "                    \"Title\": \"کفش ورزشی\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588e05c721394d2301e8156e\",\n" +
                "                    \"ImagePath\": \"http://zpvliimg.bamilo.com/p/albertini-6349-4142981-1-product.jpg\",\n" +
                "                    \"ImagePath1\": \"http://zpvliimg.bamilo.com/p/albertini-6349-4142981-1-product.jpg\",\n" +
                "                    \"ImagePath2\": \"http://zpvliimg.bamilo.com/p/albertini-6349-4142981-1-product.jpg\",\n" +
                "                    \"MinPrice\": 590000,\n" +
                "                    \"MaxPrice\": 800000,\n" +
                "                    \"MaxDiscount\": 210000,\n" +
                "                    \"MaxDiscountPercent\": 26,\n" +
                "                    \"Title\": \"کفش ورزشی پسرانه\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588de6ae21394d2301e6e04f\",\n" +
                "                    \"ImagePath\": \"http://zpvliimg.bamilo.com/p/diadora-6058-4816601-1-product.jpg\",\n" +
                "                    \"ImagePath1\": \"http://zpvliimg.bamilo.com/p/diadora-6058-4816601-1-product.jpg\",\n" +
                "                    \"ImagePath2\": \"http://zpvliimg.bamilo.com/p/diadora-6058-4816601-1-product.jpg\",\n" +
                "                    \"MinPrice\": 490000,\n" +
                "                    \"MaxPrice\": 800000,\n" +
                "                    \"MaxDiscount\": 0,\n" +
                "                    \"MaxDiscountPercent\": 0,\n" +
                "                    \"Title\": \"کفش ورزشی مدل Blade 2 L JR\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"rowType\": 101,\n" +
                "            \"Title\": \"ساعت\",\n" +
                "            \"data\": [\n" +
                "                {\n" +
                "                    \"Id\": \"588e31d021394d2301e8f53e\",\n" +
                "                    \"ImagePath\": \"http://zpvliimg.bamilo.com/p/soxy-3562-9439202-1-product.jpg\",\n" +
                "                    \"ImagePath1\": \"http://zpvliimg.bamilo.com/p/soxy-3562-9439202-1-product.jpg\",\n" +
                "                    \"ImagePath2\": \"http://zpvliimg.bamilo.com/p/soxy-3562-9439202-1-product.jpg\",\n" +
                "                    \"MinPrice\": 500000,\n" +
                "                    \"MaxPrice\": 8500000,\n" +
                "                    \"MaxDiscount\": 8000000,\n" +
                "                    \"MaxDiscountPercent\": 94,\n" +
                "                    \"Title\": \"ساعت مدل کژوال مردانه\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588e31d821394d2301e8f578\",\n" +
                "                    \"ImagePath\": \"http://zpvliimg.bamilo.com/p/soxy-9968-4929202-1-product.jpg\",\n" +
                "                    \"ImagePath1\": \"http://zpvliimg.bamilo.com/p/soxy-9968-4929202-1-product.jpg\",\n" +
                "                    \"ImagePath2\": \"http://zpvliimg.bamilo.com/p/soxy-9968-4929202-1-product.jpg\",\n" +
                "                    \"MinPrice\": 69000,\n" +
                "                    \"MaxPrice\": 480000,\n" +
                "                    \"MaxDiscount\": 411000,\n" +
                "                    \"MaxDiscountPercent\": 86,\n" +
                "                    \"Title\": \"ساعت کلاسیک دخترانه\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588e31db21394d2301e8f594\",\n" +
                "                    \"ImagePath\": \"http://zpvliimg.bamilo.com/p/soxy-9176-3729202-1-product.jpg\",\n" +
                "                    \"ImagePath1\": \"http://zpvliimg.bamilo.com/p/soxy-9176-3729202-1-product.jpg\",\n" +
                "                    \"ImagePath2\": \"http://zpvliimg.bamilo.com/p/soxy-9176-3729202-1-product.jpg\",\n" +
                "                    \"MinPrice\": 599000,\n" +
                "                    \"MaxPrice\": 1400000,\n" +
                "                    \"MaxDiscount\": 801000,\n" +
                "                    \"MaxDiscountPercent\": 57,\n" +
                "                    \"Title\": \"ساعت عقربه ای زنانه\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588e31d321394d2301e8f554\",\n" +
                "                    \"ImagePath\": \"http://zpvliimg.bamilo.com/p/soxy-1755-3139202-1-product.jpg\",\n" +
                "                    \"ImagePath1\": \"http://zpvliimg.bamilo.com/p/soxy-1755-3139202-1-product.jpg\",\n" +
                "                    \"ImagePath2\": \"http://zpvliimg.bamilo.com/p/soxy-1755-3139202-1-product.jpg\",\n" +
                "                    \"MinPrice\": 349000,\n" +
                "                    \"MaxPrice\": 600000,\n" +
                "                    \"MaxDiscount\": 251000,\n" +
                "                    \"MaxDiscountPercent\": 42,\n" +
                "                    \"Title\": \"ساعت صفحه مثلثی مردانه\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588df53e21394d2301e79d3f\",\n" +
                "                    \"ImagePath\": \"http://zpvliimg.bamilo.com/p/hadaya_market-9296-1466331-1-product.jpg\",\n" +
                "                    \"ImagePath1\": \"http://zpvliimg.bamilo.com/p/hadaya_market-9296-1466331-1-product.jpg\",\n" +
                "                    \"ImagePath2\": \"http://zpvliimg.bamilo.com/p/hadaya_market-9296-1466331-1-product.jpg\",\n" +
                "                    \"MinPrice\": 1360000,\n" +
                "                    \"MaxPrice\": 1360000,\n" +
                "                    \"MaxDiscount\": 0,\n" +
                "                    \"MaxDiscountPercent\": 0,\n" +
                "                    \"Title\": \"ساعت دیواری خاتم طرح چوگان\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588dfae221394d2301e7c41e\",\n" +
                "                    \"ImagePath\": \"http://zpvliimg.bamilo.com/p/hadaya_market-1690-2221471-1-product.jpg\",\n" +
                "                    \"ImagePath1\": \"http://zpvliimg.bamilo.com/p/hadaya_market-1690-2221471-1-product.jpg\",\n" +
                "                    \"ImagePath2\": \"http://zpvliimg.bamilo.com/p/hadaya_market-1690-2221471-1-product.jpg\",\n" +
                "                    \"MinPrice\": 4930000,\n" +
                "                    \"MaxPrice\": 5450000,\n" +
                "                    \"MaxDiscount\": 0,\n" +
                "                    \"MaxDiscountPercent\": 0,\n" +
                "                    \"Title\": \"ساعت دیواری خاتم با صفحه مینا کاری\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Id\": \"588e31d721394d2301e8f570\",\n" +
                "                    \"ImagePath\": \"http://zpvliimg.bamilo.com/p/soxy-0399-9929202-1-product.jpg\",\n" +
                "                    \"ImagePath1\": \"http://zpvliimg.bamilo.com/p/soxy-0399-9929202-1-product.jpg\",\n" +
                "                    \"ImagePath2\": \"http://zpvliimg.bamilo.com/p/soxy-0399-9929202-1-product.jpg\",\n" +
                "                    \"MinPrice\": 4400000,\n" +
                "                    \"MaxPrice\": 40000000,\n" +
                "                    \"MaxDiscount\": 0,\n" +
                "                    \"MaxDiscountPercent\": 0,\n" +
                "                    \"Title\": \"ساعت عقربه ای زنانه\",\n" +
                "                    \"ExistStatus\": 2\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";



        webServiceResult result = new Gson().fromJson(json,webServiceResult.class);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        RecyclerVerticalAdapter adapter=new RecyclerVerticalAdapter(getActivity(),result.getData());

        adapter.setonVerticalRecyclerClick(new RecyclerVerticalAdapter.VerticalRecyclerClick() {
            @Override
            public void onClick(int row, recyclerItem item) {
                Log.d("mainActivity ", "item Selected row : " + row + " index : " + item.getTitle());
               Toast.makeText(getActivity(), "yes", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getActivity(),DetailActivity.class);
                intent.putExtra("data",item);
                intent.putExtra("row",row);

                startActivity(intent);
            }
        });
        recyclerView.setAdapter(adapter);

        HashMap<String,String> url_maps = new HashMap<String, String>();
        url_maps.put("Hannibal", "http://static2.hypable.com/wp-content/uploads/2013/12/hannibal-season-2-release-date.jpg");
        url_maps.put("Big Bang Theory", "http://tvfiles.alphacoders.com/100/hdclearart-10.png");
        url_maps.put("House of Cards", "http://cdn3.nflximg.net/images/3093/2043093.jpg");
//        url_maps.put("Game of Thrones", "http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");

        for(String name : url_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(getActivity());
            // initialize a SliderLayout
            textSliderView
//                  .description(name)
                    .image(url_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit);
//                  .setOnSliderClickListener(this);


//                 add your extra information
//                 textSliderView.bundle(new Bundle());
//                 textSliderView.getBundle()
//                 .putString("extra",name);

            slider.addSlider(textSliderView);
        }
        slider.setPresetTransformer(SliderLayout.Transformer.Default);
        slider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        slider.setCustomAnimation(new DescriptionAnimation());
        slider.setDuration(10000);
        return view;
    }
//
//    @Override
//    public void onStop() {
//        // To prevent a memory leak on rotation, make sure to call stopAutoCycle() on the slider before activity or fragment is destroyed
//        slider.stopAutoCycle();
//        super.onStop();
//    }
}
