package com.ozair.funnypranksounds.Models;

public class LangModel {
    String Language,category,EmptyString;
    int countries;
    int soundname;
    int imgsrc,soundsrc;
    int categoryName;



    public LangModel(String language, int countries) {
        Language = language;
        this.countries = countries;
    }

    public LangModel(int soundname, int imgsrc, int soundsrc) {
        this.soundname = soundname;
        this.imgsrc = imgsrc;
        this.soundsrc = soundsrc;
    }

    public LangModel( int categoryName,String category, String emptyString) {
        this.category = category;
        EmptyString = emptyString;
        this.categoryName = categoryName;
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

    public int getSoundname() {
        return soundname;
    }

    public void setSoundname(int soundname) {
        this.soundname = soundname;
    }

    public int getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(int imgsrc) {
        this.imgsrc = imgsrc;
    }

    public int getSoundsrc() {
        return soundsrc;
    }

    public void setSoundsrc(int soundsrc) {
        this.soundsrc = soundsrc;
    }
}
