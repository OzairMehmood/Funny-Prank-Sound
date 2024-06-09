package com.ozair.funnypranksounds.Models;

public class FavModel {
  private   String Key_Id,favStatus;
  private   int item_image, item_title;

    public FavModel(int item_title, String key_Id, String favStatus, int item_image) {
        this.item_title = item_title;
        Key_Id = key_Id;
        this.favStatus = favStatus;
        this.item_image = item_image;
    }

    public String getFavStatus() {
        return favStatus;
    }

    public void setFavStatus(String favStatus) {
        this.favStatus = favStatus;
    }

    public int getItem_title() {
        return item_title;
    }

    public void setItem_title(int item_title) {
        this.item_title = item_title;
    }

    public String getKey_Id() {
        return Key_Id;
    }

    public void setKey_Id(String key_Id) {
        Key_Id = key_Id;
    }

    public int getItem_image() {
        return item_image;
    }

    public void setItem_image(int item_image) {
        this.item_image = item_image;
    }
}
