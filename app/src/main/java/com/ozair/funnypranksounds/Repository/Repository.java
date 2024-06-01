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

public static List<LangModel> getSoundnsme(){
    List<LangModel> sounds=new ArrayList<>();
    sounds.add(new LangModel(R.string.WrongAnswer, R.drawable.a, R.raw.a0));
    sounds.add(new LangModel(R.string.ToyDuck, R.drawable.b, R.raw.a1));
    sounds.add(new LangModel(R.string.Swoosh, R.drawable.c, R.raw.a2));
    sounds.add(new LangModel(R.string.Speechless, R.drawable.d, R.raw.a3));
    sounds.add(new LangModel(R.string.Slap, R.drawable.e, R.raw.a4));
    sounds.add(new LangModel(R.string.Shoot, R.drawable.f, R.raw.a5));
    sounds.add(new LangModel(R.string.Record_Scratch_2, R.drawable.g, R.raw.a6));
    sounds.add(new LangModel(R.string.Record_Scratch_1, R.drawable.h, R.raw.a7));
    sounds.add(new LangModel(R.string.Rocket_Effect, R.drawable.i, R.raw.a8));
    sounds.add(new LangModel(R.string.The_Earlier_We_Realise_This, R.drawable.j, R.raw.a9));
    sounds.add(new LangModel(R.string.Mental_Gear_Alert, R.drawable.a, R.raw.a10));
    sounds.add(new LangModel(R.string.Screaming, R.drawable.a, R.raw.a11));
    sounds.add(new LangModel(R.string.Fail_1, R.drawable.a, R.raw.a12));
    sounds.add(new LangModel(R.string.Fail_2, R.drawable.a, R.raw.a13));
    sounds.add(new LangModel(R.string.Drum_Roll, R.drawable.a, R.raw.a14));
    sounds.add(new LangModel(R.string.Laughing, R.drawable.a, R.raw.a15));
    sounds.add(new LangModel(R.string.Funny_Sounds, R.drawable.a, R.raw.a16));
    sounds.add(new LangModel(R.string.Fart, R.drawable.a, R.raw.a17));
    sounds.add(new LangModel(R.string.Bass_Boosted, R.drawable.a, R.raw.a18));
    sounds.add(new LangModel(R.string.Are_You_Serious, R.drawable.a, R.raw.a19));
    sounds.add(new LangModel(R.string.Falling, R.drawable.a, R.raw.a20));
    sounds.add(new LangModel(R.string.Drop, R.drawable.a, R.raw.a21));
    sounds.add(new LangModel(R.string.Door_Knocking, R.drawable.a, R.raw.a22));
    sounds.add(new LangModel(R.string.Anime_Wow, R.drawable.a, R.raw.a23));
    sounds.add(new LangModel(R.string.Funny_Laugh, R.drawable.a, R.raw.a24));
    sounds.add(new LangModel(R.string.Most_Used_Effect_1, R.drawable.a, R.raw.a25));
    sounds.add(new LangModel(R.string.Most_Used_Effect_2, R.drawable.a, R.raw.a26));
    sounds.add(new LangModel(R.string.Most_Used_Effect_3, R.drawable.a, R.raw.a27));
    sounds.add(new LangModel(R.string.Most_Used_Effect_4, R.drawable.a, R.raw.a28));
    sounds.add(new LangModel(R.string.You_Will_End_Up_In_Mcdonald, R.drawable.a, R.raw.a29));
    sounds.add(new LangModel(R.string.You_Can_Be_Prosecuted, R.drawable.a, R.raw.a30));
    sounds.add(new LangModel(R.string.Funny_1, R.drawable.a, R.raw.a31));
    sounds.add(new LangModel(R.string.Funny_2, R.drawable.a, R.raw.a32));
    sounds.add(new LangModel(R.string.Funny_3, R.drawable.a, R.raw.a33));
    sounds.add(new LangModel(R.string.Funny_4, R.drawable.a, R.raw.a34));
    sounds.add(new LangModel(R.string.Funny_5, R.drawable.a, R.raw.a35));
    sounds.add(new LangModel(R.string.Car_Horn, R.drawable.a, R.raw.a36));
    sounds.add(new LangModel(R.string.Car_Horn_2, R.drawable.a, R.raw.a37));
    sounds.add(new LangModel(R.string.Camera_Shutter, R.drawable.a, R.raw.a38));
    sounds.add(new LangModel(R.string.Alert, R.drawable.a, R.raw.a39));
    sounds.add(new LangModel(R.string.Suspense_1, R.drawable.a, R.raw.a40));
    sounds.add(new LangModel(R.string.Suspense_2, R.drawable.a, R.raw.a41));
    sounds.add(new LangModel(R.string.Suspense_3, R.drawable.a, R.raw.a42));
    sounds.add(new LangModel(R.string.Punch_1, R.drawable.a, R.raw.a43));
    sounds.add(new LangModel(R.string.Punch_2, R.drawable.a, R.raw.a44));
    sounds.add(new LangModel(R.string.How_Many_Times_Will_They_Tell_You, R.drawable.a, R.raw.a45));
    sounds.add(new LangModel(R.string.Fast_Rewind, R.drawable.a, R.raw.a46));
    sounds.add(new LangModel(R.string.Dun_Dun, R.drawable.a, R.raw.a47));
    sounds.add(new LangModel(R.string.Apostle_Will_Hear_Of_This, R.drawable.a, R.raw.a48));
    sounds.add(new LangModel(R.string.It_is_What_It_is, R.drawable.a, R.raw.a49));
    sounds.add(new LangModel(R.string.Nope, R.drawable.a, R.raw.a50));
    sounds.add(new LangModel(R.string.Movie, R.drawable.a, R.raw.a51));
    sounds.add(new LangModel(R.string.Our_Mumu_NO_Too_Much, R.drawable.a, R.raw.a52));
    sounds.add(new LangModel(R.string.Something_About_To_Happen, R.drawable.a, R.raw.a53));
    sounds.add(new LangModel(R.string.Dancing_Funeral, R.drawable.a, R.raw.a54));
    sounds.add(new LangModel(R.string.Sudden_Suspense, R.drawable.a, R.raw.a55));
    sounds.add(new LangModel(R.string.You_Are_A_Failure, R.drawable.a, R.raw.a56));
    sounds.add(new LangModel(R.string.Rewind, R.drawable.a, R.raw.a57));
    sounds.add(new LangModel(R.string.There_Is_God, R.drawable.a, R.raw.a58));
    sounds.add(new LangModel(R.string.Why_Are_You_Running, R.drawable.a, R.raw.a59));
    sounds.add(new LangModel(R.string.You_Are_Mumu_Man, R.drawable.a, R.raw.a60));
    sounds.add(new LangModel(R.string.Investigations, R.drawable.a, R.raw.a61));
    sounds.add(new LangModel(R.string.I_no_Dey_Hear_Word, R.drawable.a, R.raw.a62));
    sounds.add(new LangModel(R.string.Broda_Shaggi, R.drawable.a, R.raw.a63));
    sounds.add(new LangModel(R.string.Nollywood_Laugh, R.drawable.a, R.raw.a64));
    sounds.add(new LangModel(R.string.What_Is_Going_On, R.drawable.a, R.raw.a101));
    sounds.add(new LangModel(R.string.Is_It_For_Eba, R.drawable.a, R.raw.a102));
    sounds.add(new LangModel(R.string.Help_Me, R.drawable.a, R.raw.a103));
    sounds.add(new LangModel(R.string.What_Type_Of_Playing_Is_This, R.drawable.a, R.raw.a104));
    sounds.add(new LangModel(R.string.I_Want_Problem, R.drawable.a, R.raw.a105));
    sounds.add(new LangModel(R.string.Murife_Dont_Run, R.drawable.a, R.raw.a106));
    sounds.add(new LangModel(R.string.Just_Dey_Play, R.drawable.a, R.raw.a107));
    sounds.add(new LangModel(R.string.Wetin_Be_This, R.drawable.a, R.raw.a108));

    return sounds;
}

}
