package com.example.pnbook.ghafouri_store02;

import android.os.Parcel;
import android.os.Parcelable;

public class recyclerItem implements Parcelable{
    String Id;
    String ImagePath ;
    String ImagePath1 ;
    String ImagePath2 ;
    String MinPrice ;
    String MaxPrice;
    String MaxDiscountPercent;
    String MaxDiscount;
    String  ExistStatus;
    String Title ;
    int favorite_status=0;


    public recyclerItem() {

    }

    protected recyclerItem(Parcel in) {
        Id = in.readString();
        ImagePath = in.readString();
        ImagePath1 = in.readString();
        ImagePath2 = in.readString();
        MinPrice = in.readString();
        MaxPrice = in.readString();
        MaxDiscountPercent = in.readString();
        MaxDiscount = in.readString();
        ExistStatus = in.readString();
        Title = in.readString();
        favorite_status=in.readInt();
    }

    public static final Creator<recyclerItem> CREATOR = new Creator<recyclerItem>() {
        @Override
        public recyclerItem createFromParcel(Parcel in) {
            return new recyclerItem(in);
        }

        @Override
        public recyclerItem[] newArray(int size) {
            return new recyclerItem[size];
        }
    };

    public String getId() { return Id; }

    public void setId(String id) { Id = id; }

    public String getImagePath() { return ImagePath; }

    public void setImagePath(String imagePath) { ImagePath = imagePath; }

    public String getMinPrice() { return MinPrice; }

    public void setMinPrice(String minPrice) { MinPrice = minPrice; }

    public String getMaxPrice() { return MaxPrice; }

    public void setMaxPrice(String maxPrice) { MaxPrice = maxPrice; }

    public String getImagePath1() {
        return ImagePath1;
    }

    public void setImagePath1(String imagePath1) {
        ImagePath1 = imagePath1;
    }

    public String getImagePath2() {
        return ImagePath2;
    }

    public void setImagePath2(String imagePath2) {
        ImagePath2 = imagePath2;
    }

    public String getTitle() { return Title; }

    public void setTitle(String title) { Title = title; }

    public String getMaxDiscountPercent() {
        return MaxDiscountPercent;
    }

    public void setMaxDiscountPercent(String maxDiscountPercent) {
        MaxDiscountPercent = maxDiscountPercent;
    }

    public String getMaxDiscount() {
        return MaxDiscount;
    }

    public void setMaxDiscount(String maxDiscount) {
        MaxDiscount = maxDiscount;
    }

    public String getExistStatus() {
        return ExistStatus;
    }

    public void setExistStatus(String existStatus) {
        ExistStatus = existStatus;
    }

    public int getFavorite_status() {
        return favorite_status;
    }

    public void setFavorite_status(int favorite_statuse) {
        this.favorite_status = favorite_statuse;
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Id);
        parcel.writeString(ImagePath);
        parcel.writeString(ImagePath1);
        parcel.writeString(ImagePath2);
        parcel.writeString(MinPrice);
        parcel.writeString(MaxPrice);

        parcel.writeString(MaxDiscount);
        parcel.writeString(MaxDiscountPercent);
        parcel.writeString(ExistStatus);
        parcel.writeString(Title);
        parcel.writeInt(favorite_status);
    }



}
