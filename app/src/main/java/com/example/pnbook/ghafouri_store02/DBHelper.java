package com.example.pnbook.ghafouri_store02;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    final static int Version_DB = 2;
    final static String Name_DB = "store02_DB";
    private static DBHelper database;
    String TAG = "DBHelper";

    public static DBHelper getDatabase(Context context) {       //for singelton
        if (database == null) {
            database = new DBHelper(context);
        }
        return database;
    }

    public DBHelper(Context context) {
        super(context, Name_DB, null, Version_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createUserTable = "CREATE TABLE `favoriteProduct` (\n" +
                "\t`id`\tINTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,\n" +
                "\t`ImagePath`\tTEXT,\n" +
                "\t`ImagePath1`\tTEXT,\n" +
                "\t`ImagePath2`\tTEXT,\n" +
                "\t`MinPrice`\tTEXT,\n" +
                "\t`MaxPrice`\tTEXT,\n" +
                "\t`MaxDiscountPercent`\tTEXT,\n" +
                "\t`MaxDiscount`\tTEXT,\n" +
                "\t`ExistStatus`\tTEXT,\n" +
                "\t`Title`\tTEXT,\n" +
                "\t`favorite_status`\tINTEGER\n" +
                ");";
        sqLiteDatabase.execSQL(createUserTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("ALTER TABLE favoriteProduct ADD COLUMN favorite_status INTEGER DEFAULT 1");

    }

    public boolean insertProduct(recyclerItem item) {
        try {
            SQLiteDatabase database = this.getWritableDatabase();
            ContentValues content = new ContentValues();
            content.put("ImagePath", item.getImagePath());
            content.put("ImagePath1", item.getImagePath1());
            content.put("ImagePath2", item.getImagePath2());
            content.put("MinPrice", item.getMinPrice());
            content.put("MaxPrice", item.getMaxPrice());
            content.put("MaxDiscountPercent", item.getMaxDiscountPercent());
            content.put("MaxDiscount", item.getMaxDiscount());
            content.put("ExistStatus", item.getExistStatus());
            content.put("Title", item.getTitle());
            database.insert("favoriteProduct", null, content);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    public recyclerItem getProduct(String text) {
        recyclerItem getItem = new recyclerItem();
        SQLiteDatabase database = this.getWritableDatabase();
        String query = "select ImagePath,ImagePath1,ImagePath2,MinPrice,MaxPrice,MaxDiscountPercent,MaxDiscount,ExistStatus,Title from favoriteProduct where Title='" + text + "'";
        Cursor reader = database.rawQuery(query, null);
        while (reader.moveToNext()) {
            getItem.setImagePath(reader.getString(0));
            getItem.setImagePath1(reader.getString(1));
            getItem.setImagePath2(reader.getString(2));
            getItem.setMinPrice(reader.getString(3));
            getItem.setMaxPrice(reader.getString(4));
            getItem.setMaxDiscountPercent(reader.getString(5));
            getItem.setMaxDiscount(reader.getString(6));
            getItem.setExistStatus(reader.getString(7));
            getItem.setTitle(reader.getString(8));
        }
        return getItem;
    }

    public ArrayList<recyclerItem> getFavoriteProductlist() {
        ArrayList<recyclerItem> items = new ArrayList<>();
        SQLiteDatabase database = this.getWritableDatabase();
        String query = "select ImagePath,ImagePath1,ImagePath2,MinPrice,MaxPrice,MaxDiscountPercent,MaxDiscount,ExistStatus,Title from favoriteProduct";
        Cursor reader = database.rawQuery(query, null);
        while (reader.moveToNext()) {
            recyclerItem getItem = new recyclerItem();
            getItem.setImagePath(reader.getString(0));
            getItem.setImagePath1(reader.getString(1));
            getItem.setImagePath2(reader.getString(2));
            getItem.setMinPrice(reader.getString(3));
            getItem.setMaxPrice(reader.getString(4));
            getItem.setMaxDiscountPercent(reader.getString(5));
            getItem.setMaxDiscount(reader.getString(6));
            getItem.setExistStatus(reader.getString(7));
            getItem.setTitle(reader.getString(8));
            items.add(getItem);
        }
        return items;
    }

    public void deleteFavoriteProduct(recyclerItem itemdelete) {
        try {
            String query = "delete from favoriteProduct where Title = '" + itemdelete.getTitle() + "'";
            SQLiteDatabase database = this.getWritableDatabase();
            database.execSQL(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int Fstatus(recyclerItem item) {

        recyclerItem getItem = new recyclerItem();
        String query = "select Title from favoriteProduct where Title = '" + item.getTitle() + "'";
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor reader = database.rawQuery(query, null);
//        Log.d(TAG, "Fstatus: "+reader);
        while (reader.moveToNext()) {
            getItem.setTitle(reader.getString(0));
        }
        Log.d(TAG, "getItem.setFavorite_status: " + getItem.Title);
        if (getItem.Title == null)
            return 0;
        else
            return 1;
    }

}
