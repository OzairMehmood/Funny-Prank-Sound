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
    sounds.add(new LangModel(R.string.Mental_Gear_Alert, R.drawable.k, R.raw.a10));
    sounds.add(new LangModel(R.string.Screaming, R.drawable.l, R.raw.a11));
    sounds.add(new LangModel(R.string.Fail_1, R.drawable.m, R.raw.a12));
    sounds.add(new LangModel(R.string.Fail_2, R.drawable.n, R.raw.a13));
    sounds.add(new LangModel(R.string.Drum_Roll, R.drawable.o, R.raw.a14));
    sounds.add(new LangModel(R.string.Laughing, R.drawable.p, R.raw.a15));
    sounds.add(new LangModel(R.string.Funny_Sounds, R.drawable.q, R.raw.a16));
    sounds.add(new LangModel(R.string.Fart, R.drawable.r, R.raw.a17));
    sounds.add(new LangModel(R.string.Bass_Boosted, R.drawable.s, R.raw.a18));
    sounds.add(new LangModel(R.string.Are_You_Serious, R.drawable.t, R.raw.a19));
    sounds.add(new LangModel(R.string.Falling, R.drawable.a, R.raw.a20));
    sounds.add(new LangModel(R.string.Drop, R.drawable.b, R.raw.a21));
    sounds.add(new LangModel(R.string.Door_Knocking, R.drawable.c, R.raw.a22));
    sounds.add(new LangModel(R.string.Anime_Wow, R.drawable.d, R.raw.a23));
    sounds.add(new LangModel(R.string.Funny_Laugh, R.drawable.e, R.raw.a24));
    sounds.add(new LangModel(R.string.Most_Used_Effect_1, R.drawable.f, R.raw.a25));
    sounds.add(new LangModel(R.string.Most_Used_Effect_2, R.drawable.g, R.raw.a26));
    sounds.add(new LangModel(R.string.Most_Used_Effect_3, R.drawable.h, R.raw.a27));
    sounds.add(new LangModel(R.string.Most_Used_Effect_4, R.drawable.i, R.raw.a28));
    sounds.add(new LangModel(R.string.You_Will_End_Up_In_Mcdonald, R.drawable.j, R.raw.a29));
    sounds.add(new LangModel(R.string.You_Can_Be_Prosecuted, R.drawable.k, R.raw.a30));
    sounds.add(new LangModel(R.string.Funny_1, R.drawable.m, R.raw.a31));
    sounds.add(new LangModel(R.string.Funny_2, R.drawable.n, R.raw.a32));
    sounds.add(new LangModel(R.string.Funny_3, R.drawable.o, R.raw.a33));
    sounds.add(new LangModel(R.string.Funny_4, R.drawable.p, R.raw.a34));
    sounds.add(new LangModel(R.string.Funny_5, R.drawable.q, R.raw.a35));
    sounds.add(new LangModel(R.string.Car_Horn, R.drawable.r, R.raw.a36));
    sounds.add(new LangModel(R.string.Car_Horn_2, R.drawable.s, R.raw.a37));
    sounds.add(new LangModel(R.string.Camera_Shutter, R.drawable.t, R.raw.a38));
    sounds.add(new LangModel(R.string.Alert, R.drawable.a, R.raw.a39));
    sounds.add(new LangModel(R.string.Suspense_1, R.drawable.b, R.raw.a40));
    sounds.add(new LangModel(R.string.Suspense_2, R.drawable.c, R.raw.a41));
    sounds.add(new LangModel(R.string.Suspense_3, R.drawable.d, R.raw.a42));
    sounds.add(new LangModel(R.string.Punch_1, R.drawable.e, R.raw.a43));
    sounds.add(new LangModel(R.string.Punch_2, R.drawable.f, R.raw.a44));
    sounds.add(new LangModel(R.string.How_Many_Times_Will_They_Tell_You, R.drawable.g, R.raw.a45));
    sounds.add(new LangModel(R.string.Fast_Rewind, R.drawable.h, R.raw.a46));
    sounds.add(new LangModel(R.string.Dun_Dun, R.drawable.i, R.raw.a47));
    sounds.add(new LangModel(R.string.Apostle_Will_Hear_Of_This, R.drawable.j, R.raw.a48));
    sounds.add(new LangModel(R.string.It_is_What_It_is, R.drawable.k, R.raw.a49));
    sounds.add(new LangModel(R.string.Nope, R.drawable.l, R.raw.a50));
    sounds.add(new LangModel(R.string.Movie, R.drawable.m, R.raw.a51));
    sounds.add(new LangModel(R.string.Our_Mumu_NO_Too_Much, R.drawable.n, R.raw.a52));
    sounds.add(new LangModel(R.string.Something_About_To_Happen, R.drawable.o, R.raw.a53));
    sounds.add(new LangModel(R.string.Dancing_Funeral, R.drawable.p, R.raw.a54));
    sounds.add(new LangModel(R.string.Sudden_Suspense, R.drawable.q, R.raw.a55));
    sounds.add(new LangModel(R.string.You_Are_A_Failure, R.drawable.r, R.raw.a56));
    sounds.add(new LangModel(R.string.Rewind, R.drawable.s, R.raw.a57));
    sounds.add(new LangModel(R.string.There_Is_God, R.drawable.t, R.raw.a58));
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
    public static List<LangModel> getAnimalprankSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.animals, R.raw.gun_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.animals, R.raw.gun_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.animals, R.raw.gun_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.animals, R.raw.gun_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.animals, R.raw.gun_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.animals, R.raw.gun_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.animals, R.raw.gun_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.animals, R.raw.gun_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.animals, R.raw.gun_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.animals, R.raw.gun_10));
        sounds.add(new LangModel(R.string.sound11, R.drawable.animals, R.raw.gun_10));


        return sounds;
    }
    public static List<LangModel> getCoughprankSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.cough, R.raw.funny_man_cough_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.cough, R.raw.funny_man_cough_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.cough, R.raw.funny_man_cough_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.cough, R.raw.funny_man_cough_3));
        sounds.add(new LangModel(R.string.sound5, R.drawable.cough, R.raw.funny_man_cough_4));
        sounds.add(new LangModel(R.string.sound6, R.drawable.cough, R.raw.funny_man_cough_5));
        sounds.add(new LangModel(R.string.sound7, R.drawable.cough, R.raw.funny_woman_cough_1));
        sounds.add(new LangModel(R.string.sound8, R.drawable.cough, R.raw.funny_woman_cough_2));
        sounds.add(new LangModel(R.string.sound9, R.drawable.cough, R.raw.funny_woman_cough_3));
        sounds.add(new LangModel(R.string.sound10, R.drawable.cough, R.raw.funny_man_cough_strong_1));
        return sounds;
    }
    public static List<LangModel> getFartprankSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.fart, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.fart, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.fart, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.fart, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.fart, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.fart, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.fart, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.fart, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.fart, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.fart, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getChristmasSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.christmis, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.christmis, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.christmis, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.christmis, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.christmis, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.christmis, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.christmis, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.christmis, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.christmis, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.christmis, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getpolieceSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.christmis, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.christmis, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.christmis, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.christmis, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.christmis, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.christmis, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.christmis, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.christmis, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.christmis, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.christmis, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getbabylaughSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.babylaugh, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.babylaugh, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.babylaugh, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.babylaugh, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.babylaugh, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.babylaugh, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.babylaugh, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.babylaugh, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.babylaugh, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.babylaugh, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getnotificationSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.notification, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.notification, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.notification, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.notification, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.notification, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.notification, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.notification, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.notification, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.notification, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.notification, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getdoorbellSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.doorbell, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.doorbell, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.doorbell, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.doorbell, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.doorbell, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.doorbell, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.doorbell, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.doorbell, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.doorbell, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.doorbell, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getbabycrySound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.babycry, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.babycry, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.babycry, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.babycry, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.babycry, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.babycry, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.babycry, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.babycry, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.babycry, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.babycry, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getgunSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.gun, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.gun, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.gun, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.gun, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.gun, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.gun, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.gun, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.gun, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.gun, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.gun, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getHairclipperSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.hairclipper, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.hairclipper, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.hairclipper, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.hairclipper, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.hairclipper, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.hairclipper, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.hairclipper, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.hairclipper, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.hairclipper, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.hairclipper, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getdogSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.dog, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.dog, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.dog, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.dog, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.dog, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.dog, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.dog, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.dog, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.dog, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.dog, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getshoutSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.shout, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.shout, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.shout, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.shout, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.shout, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.shout, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.shout, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.shout, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.shout, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.shout, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getcatSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.cat, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.cat, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.cat, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.cat, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.cat, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.cat, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.cat, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.cat, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.cat, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.cat, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getBurpSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.burp, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.burp, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.burp, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.burp, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.burp, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.burp, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.burp, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.burp, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.burp, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.burp, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getAirHornSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.airhorn, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.airhorn, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.airhorn, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.airhorn, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.airhorn, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.airhorn, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.airhorn, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.airhorn, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.airhorn, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.airhorn, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getZombieSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.zombie, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.zombie, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.zombie, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.zombie, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.zombie, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.zombie, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.zombie, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.zombie, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.zombie, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.zombie, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> gettoiletflusgSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.flush, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.flush, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.flush, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.flush, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.flush, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.flush, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.flush, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.flush, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.flush, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.flush, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getsnoringSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.snoring, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.snoring, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.snoring, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.snoring, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.snoring, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.snoring, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.snoring, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.snoring, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.snoring, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.snoring, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getsneezSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.sneez, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.sneez, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.sneez, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.sneez, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.sneez, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.sneez, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.sneez, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.sneez, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.sneez, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.sneez, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getshirttearSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.shirt, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.shirt, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.shirt, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.shirt, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.shirt, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.shirt, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.shirt, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.shirt, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.shirt, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.shirt, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getcarSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.car, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.car, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.car, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.car, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.car, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.car, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.car, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.car, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.car, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.car, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getscissorSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.a, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.b, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.c, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.d, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.e, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.f, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.g, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.h, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.i, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.j, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getscarySound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.a, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.b, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.c, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.d, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.e, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.f, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.g, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.h, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.i, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.j, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getplatebreakSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.a, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.b, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.c, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.d, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.e, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.f, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.g, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.h, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.i, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.j, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> getmemeSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.a, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.b, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.c, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.d, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.e, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.f, R.raw.fart_song_6));
        sounds.add(new LangModel(R.string.sound7, R.drawable.g, R.raw.fart_song_7));
        sounds.add(new LangModel(R.string.sound8, R.drawable.h, R.raw.fart_song_8));
        sounds.add(new LangModel(R.string.sound9, R.drawable.i, R.raw.fart_song_9));
        sounds.add(new LangModel(R.string.sound10, R.drawable.j, R.raw.fart_song_10));
        return sounds;
    }
    public static List<LangModel> gethalloweenSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.a, R.raw.fart_song_1));
        sounds.add(new LangModel(R.string.sound2, R.drawable.b, R.raw.fart_song_2));
        sounds.add(new LangModel(R.string.sound3, R.drawable.c, R.raw.fart_song_3));
        sounds.add(new LangModel(R.string.sound4, R.drawable.d, R.raw.fart_song_4));
        sounds.add(new LangModel(R.string.sound5, R.drawable.e, R.raw.fart_song_5));
        sounds.add(new LangModel(R.string.sound6, R.drawable.f, R.raw.fart_song_6));

        return sounds;
    }
    public static List<LangModel> getCategoryName(){

        List<LangModel> category=new ArrayList<>();
        category.add(new LangModel(R.string.Animals, "Animals", " "));
        category.add(new LangModel(R.string.Cough, "Cough", " "));
        category.add(new LangModel(R.string.Fart, "Fart", " "));
        category.add(new LangModel(R.string.Christmas, "Christmas", " "));
        category.add(new LangModel(R.string.Police_Siren, "Police Siren", " "));
        category.add(new LangModel(R.string.Baby_Laugh, "Baby Laugh", " "));
        category.add(new LangModel(R.string.Notifications, "Notifications", " "));
        category.add(new LangModel(R.string.Door_Bell, "Door Bell", " "));
        category.add(new LangModel(R.string.Baby_Cry, "Baby Cry", " "));
        category.add(new LangModel(R.string.Gun, "Gun", " "));
        category.add(new LangModel(R.string.Hair_Cut, "Hair Cut", " "));
        category.add(new LangModel(R.string.Dog, "Dog", " "));
        category.add(new LangModel(R.string.Shout, "Shout", " "));
        category.add(new LangModel(R.string.Cat, "Cat", " "));
        category.add(new LangModel(R.string.Burp, "Burp", " "));
        category.add(new LangModel(R.string.Air_Horn, "Air Horn", " "));
        category.add(new LangModel(R.string.Zombie, "Zombie", " "));
        category.add(new LangModel(R.string.Toilet_Flush, "Toilet Flush", " "));
        category.add(new LangModel(R.string.Snoring, "Snoring", " "));
        category.add(new LangModel(R.string.Sneeze, "Sneeze", " "));
        category.add(new LangModel(R.string.Shirt_Tear, "Shirt Tear", " "));
        category.add(new LangModel(R.string.Car, "Car", " "));
        category.add(new LangModel(R.string.Scissor, "Scissor", " "));
        category.add(new LangModel(R.string.Scary, "Scary", " "));
        category.add(new LangModel(R.string.Plate_Break, "Plate Break", " "));
        category.add(new LangModel(R.string.Meme, "Meme", " "));
        category.add(new LangModel(R.string.Halloween, "Halloween", " "));


        return category;
    }

}
