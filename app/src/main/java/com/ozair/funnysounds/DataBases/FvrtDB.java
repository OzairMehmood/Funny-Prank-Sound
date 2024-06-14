package com.ozair.funnysounds.DataBases;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.ozair.funnysounds.Models.LangModel;

import java.util.ArrayList;
import java.util.List;

public class FvrtDB extends SQLiteOpenHelper {

    private static int DBVersion = 1;
    private static String DatabaseName = "FavouriteDB";
    private static String TableName = "FavouriteTable";
    private static String Key_ID = "ID";
    private static String ItemTitle = "ItemTitle";
    private static String soundsrc = "sound";
    private static String Item_Image = "ItemImage";
    public static String Favourite_Status = "FavouriteStatus";
    private static String Create_Table = "CREATE TABLE " + TableName +
            "(" + Key_ID + " TEXT," + ItemTitle + " TEXT," + soundsrc + " TEXT," + Item_Image +
            " TEXT," + Favourite_Status + " TEXT)";

    public FvrtDB(Context context) {
        super(context, DatabaseName, null, DBVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Create_Table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public void insertEmpty() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        for (int x = 1; x <= 200; x++) {
            cv.put(Key_ID, x);
            cv.put(Favourite_Status, "0");
            db.insert(TableName, null, cv);
        }
    }

    public void insertintoDataBase(String title, int soundSrc, int image, String id, String fav_status) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(ItemTitle, title);
        cv.put(soundsrc, soundSrc);
        cv.put(Item_Image, image);
        cv.put(Key_ID, id);
        cv.put(Favourite_Status, fav_status);
        db.insert(TableName, null, cv);
        Log.d("Fav DB Status", title + ", Fav Status - " + fav_status + " - ." + cv);
    }

    public Cursor readDataBase(String id) {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM " + TableName + " WHERE " + Key_ID + " = '" + id + "'";
        return db.rawQuery(sql, null);
    }

    public List<LangModel> getFavList() {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM " + TableName + " WHERE " + Favourite_Status + " = '1'";
        Cursor cursor = db.rawQuery(sql, null);
        List<LangModel> langModelList = new ArrayList<>();
        if (cursor != null && cursor.moveToFirst()) {
            do {
                String id = cursor.getString(cursor.getColumnIndex(Key_ID));
                String title = cursor.getString(cursor.getColumnIndex(ItemTitle));
                int image = cursor.getInt(cursor.getColumnIndex(Item_Image));
                int sound = cursor.getInt(cursor.getColumnIndex(soundsrc));
                String favStatus = cursor.getString(cursor.getColumnIndex(Favourite_Status));
                LangModel langModel = new LangModel(title, image, sound, id, favStatus);
                langModelList.add(langModel);
            } while (cursor.moveToNext());
            cursor.close();
        }
        return langModelList;
    }

    public boolean isItemFavourite(String itemId) {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT " + Favourite_Status + " FROM " + TableName + " WHERE " + ItemTitle + " = ?";
        Cursor cursor = db.rawQuery(sql, new String[]{itemId});

        boolean isFavourite = false;
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                String favStatus = cursor.getString(cursor.getColumnIndex(Favourite_Status));
                isFavourite = "1".equals(favStatus);
            }
            cursor.close();
        }
        return isFavourite;
    }

    public void removeFav(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "UPDATE " + TableName + " SET " + Favourite_Status + " = '0' WHERE " + Key_ID + " = '" + id + "'";
        db.execSQL(sql);
        Log.d("remove", id);
    }

    public Cursor selectFavList() {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM " + TableName + " WHERE " + Favourite_Status + " = '1'";
        return db.rawQuery(sql, null);
    }
}
