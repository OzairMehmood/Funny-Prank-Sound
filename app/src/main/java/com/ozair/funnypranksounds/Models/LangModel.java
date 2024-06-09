package com.ozair.funnypranksounds.Models;

public class LangModel {
    String Language,category,EmptyString;
    int countries;
     String soundname;
    int imgsrc;
     int soundsrc;
    int categoryName;
    public  String Key_Id;
    public  String favStatus;





    public LangModel(String language, int countries) {
        Language = language;
        this.countries = countries;
    }

    public LangModel(String soundname, int imgsrc, int soundsrc, String key_Id, String favStatus) {
        this.soundname = soundname;
        this.imgsrc = imgsrc;
        this.soundsrc = soundsrc;
        Key_Id = key_Id;
        this.favStatus = favStatus;
    }

    public LangModel(int categoryName, String emptyString,String category ) {
        this.category = category;
        EmptyString = emptyString;
        this.categoryName = categoryName;

    }

    public LangModel(String id, String title, int image, String favStatus) {
        Key_Id = id;
        soundname=title;
        imgsrc=image;
        this.favStatus=favStatus;

    }

    public LangModel() {

    }

    public  String getKey_Id() {
        return Key_Id;
    }

    public void setKey_Id(String key_Id) {
        Key_Id = key_Id;
    }

    public  String getFavStatus() {
        return favStatus;
    }

    public void setFavStatus(String favStatus) {
        this.favStatus = favStatus;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEmptyString() {
        return EmptyString;
    }

    public void setEmptyString(String emptyString) {
        EmptyString = emptyString;
    }

    public int getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(int categoryName) {
        this.categoryName = categoryName;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public int getCountries() {
        return countries;
    }

    public void setCountries(int countries) {
        this.countries = countries;
    }

    public  String getSoundname() {
        return soundname;
    }

    public void setSoundname(String soundname) {
        this.soundname = soundname;
    }

    public  int getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(int imgsrc) {
        this.imgsrc = imgsrc;
    }

    public  int getSoundsrc() {
        return soundsrc;
    }

    public void setSoundsrc(int soundsrc) {
        this.soundsrc = soundsrc;
    }
}
