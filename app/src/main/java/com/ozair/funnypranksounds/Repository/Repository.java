package com.ozair.funnypranksounds.Repository;

import com.ozair.funnypranksounds.Models.LangModel;
import com.ozair.funnypranksounds.R;

import java.util.ArrayList;
import java.util.List;

public class Repository {

public  static List<LangModel> getLangData(){
    List<LangModel> language=new ArrayList<>();
    language.add(new LangModel("English", R.drawable.englishflag));
    language.add(new LangModel("Urdu", R.drawable.pkflag));
    language.add(new LangModel("Spanish", R.drawable.spanishflag));
    language.add(new LangModel("Hindi", R.drawable.indianflag));
    language.add(new LangModel("Russian", R.drawable.russianflag));
    language.add(new LangModel("French", R.drawable.franceflag));
    language.add(new LangModel("Portuguese", R.drawable.potugeseflag));
    language.add(new LangModel("Arabic", R.drawable.saudiflag));
    language.add(new LangModel("Greek", R.drawable.greekflag));
    language.add(new LangModel("Turkish", R.drawable.turkeyflag));

    return language;
}

}
