package com.ozair.funnypranksounds.Models;

public class LangModel {
    String Language;
    int countries;

    public LangModel(String language, int countries) {
        Language = language;
        this.countries = countries;
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
}
