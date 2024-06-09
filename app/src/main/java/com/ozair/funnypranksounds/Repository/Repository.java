package com.ozair.funnypranksounds.Repository;

import androidx.annotation.NonNull;

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
    // Adding sound models to the sounds list with incremented 4th argument and fixed 5th argument
    sounds.add(new LangModel(R.string.WrongAnswer, R.drawable.a, R.raw.a9, "0", "0"));
    sounds.add(new LangModel(R.string.ToyDuck, R.drawable.b, R.raw.a8, "1", "0"));
    sounds.add(new LangModel(R.string.Swoosh, R.drawable.c, R.raw.a7, "2", "0"));
    sounds.add(new LangModel(R.string.Speechless, R.drawable.d, R.raw.a64, "3", "0"));
    sounds.add(new LangModel(R.string.Slap, R.drawable.e, R.raw.a63, "4", "0"));
    sounds.add(new LangModel(R.string.Shoot, R.drawable.f, R.raw.a62, "5", "0"));
    sounds.add(new LangModel(R.string.Record_Scratch_2, R.drawable.g, R.raw.a61, "6", "0"));
    sounds.add(new LangModel(R.string.Record_Scratch_1, R.drawable.h, R.raw.a60, "7", "0"));
    sounds.add(new LangModel(R.string.Rocket_Effect, R.drawable.i, R.raw.a6, "8", "0"));
    sounds.add(new LangModel(R.string.The_Earlier_We_Realise_This, R.drawable.j, R.raw.a59, "9", "0"));
    sounds.add(new LangModel(R.string.Mental_Gear_Alert, R.drawable.k, R.raw.a58, "10", "0"));
    sounds.add(new LangModel(R.string.Screaming, R.drawable.l, R.raw.a57, "11", "0"));
    sounds.add(new LangModel(R.string.Fail_1, R.drawable.m, R.raw.a56, "12", "0"));
    sounds.add(new LangModel(R.string.Fail_2, R.drawable.n, R.raw.a55, "13", "0"));
    sounds.add(new LangModel(R.string.Drum_Roll, R.drawable.o, R.raw.a54, "14", "0"));
    sounds.add(new LangModel(R.string.Laughing, R.drawable.p, R.raw.a53, "15", "0"));
    sounds.add(new LangModel(R.string.Funny_Sounds, R.drawable.q, R.raw.a52, "16", "0"));
    sounds.add(new LangModel(R.string.Fart, R.drawable.r, R.raw.a51, "17", "0"));
    sounds.add(new LangModel(R.string.Bass_Boosted, R.drawable.s, R.raw.a50, "18", "0"));
    sounds.add(new LangModel(R.string.Are_You_Serious, R.drawable.t, R.raw.a5, "19", "0"));
    sounds.add(new LangModel(R.string.Falling, R.drawable.a, R.raw.a49, "20", "0"));
    sounds.add(new LangModel(R.string.Drop, R.drawable.b, R.raw.a48, "21", "0"));
    sounds.add(new LangModel(R.string.Door_Knocking, R.drawable.c, R.raw.a47, "22", "0"));
    sounds.add(new LangModel(R.string.Anime_Wow, R.drawable.d, R.raw.a46, "23", "0"));
    sounds.add(new LangModel(R.string.Funny_Laugh, R.drawable.e, R.raw.a45, "24", "0"));
    sounds.add(new LangModel(R.string.Most_Used_Effect_1, R.drawable.f, R.raw.a44, "25", "0"));
    sounds.add(new LangModel(R.string.Most_Used_Effect_2, R.drawable.g, R.raw.a43, "26", "0"));
    sounds.add(new LangModel(R.string.Most_Used_Effect_3, R.drawable.h, R.raw.a42, "27", "0"));
    sounds.add(new LangModel(R.string.Most_Used_Effect_4, R.drawable.i, R.raw.a41, "28", "0"));
    sounds.add(new LangModel(R.string.You_Will_End_Up_In_Mcdonald, R.drawable.j, R.raw.a40, "29", "0"));
    sounds.add(new LangModel(R.string.You_Can_Be_Prosecuted, R.drawable.k, R.raw.a4, "30", "0"));
    sounds.add(new LangModel(R.string.Funny_1, R.drawable.m, R.raw.a39, "31", "0"));
    sounds.add(new LangModel(R.string.Funny_2, R.drawable.n, R.raw.a38, "32", "0"));
    sounds.add(new LangModel(R.string.Funny_3, R.drawable.o, R.raw.a37, "33", "0"));
    sounds.add(new LangModel(R.string.Funny_4, R.drawable.p, R.raw.a36, "34", "0"));
    sounds.add(new LangModel(R.string.Funny_5, R.drawable.q, R.raw.a35, "35", "0"));
    sounds.add(new LangModel(R.string.Car_Horn, R.drawable.r, R.raw.a34, "36", "0"));
    sounds.add(new LangModel(R.string.Car_Horn_2, R.drawable.s, R.raw.a33, "37", "0"));
    sounds.add(new LangModel(R.string.Camera_Shutter, R.drawable.t, R.raw.a32, "38", "0"));
    sounds.add(new LangModel(R.string.Alert, R.drawable.a, R.raw.a31, "39", "0"));
    sounds.add(new LangModel(R.string.Suspense_1, R.drawable.b, R.raw.a30, "40", "0"));
    sounds.add(new LangModel(R.string.Suspense_2, R.drawable.c, R.raw.a3, "41", "0"));
    sounds.add(new LangModel(R.string.Suspense_3, R.drawable.d, R.raw.a29, "42", "0"));
    sounds.add(new LangModel(R.string.Punch_1, R.drawable.e, R.raw.a28, "43", "0"));
    sounds.add(new LangModel(R.string.Punch_2, R.drawable.f, R.raw.a27, "44", "0"));
    sounds.add(new LangModel(R.string.How_Many_Times_Will_They_Tell_You, R.drawable.g, R.raw.a26, "45", "0"));
    sounds.add(new LangModel(R.string.Fast_Rewind, R.drawable.h, R.raw.a25, "46", "0"));
    sounds.add(new LangModel(R.string.Dun_Dun, R.drawable.i, R.raw.a24, "47", "0"));
    sounds.add(new LangModel(R.string.Apostle_Will_Hear_Of_This, R.drawable.j, R.raw.a23, "48", "0"));
    sounds.add(new LangModel(R.string.It_is_What_It_is, R.drawable.k, R.raw.a22, "49", "0"));
    sounds.add(new LangModel(R.string.Nope, R.drawable.l, R.raw.a21, "50", "0"));
    sounds.add(new LangModel(R.string.Movie, R.drawable.m, R.raw.a20, "51", "0"));
    sounds.add(new LangModel(R.string.Our_Mumu_NO_Too_Much, R.drawable.n, R.raw.a2, "52", "0"));
    sounds.add(new LangModel(R.string.Something_About_To_Happen, R.drawable.o, R.raw.a19, "53", "0"));
    sounds.add(new LangModel(R.string.Dancing_Funeral, R.drawable.p, R.raw.a18, "54", "0"));
    sounds.add(new LangModel(R.string.Sudden_Suspense, R.drawable.q, R.raw.a17, "55", "0"));
    sounds.add(new LangModel(R.string.You_Are_A_Failure, R.drawable.r, R.raw.a16, "56", "0"));
    sounds.add(new LangModel(R.string.Rewind, R.drawable.s, R.raw.a15, "57", "0"));
    sounds.add(new LangModel(R.string.There_Is_God, R.drawable.t, R.raw.a14, "58", "0"));
    sounds.add(new LangModel(R.string.Why_Are_You_Running, R.drawable.a, R.raw.a13, "59", "0"));
    sounds.add(new LangModel(R.string.You_Are_Mumu_Man, R.drawable.a, R.raw.a12, "60", "0"));
    sounds.add(new LangModel(R.string.Investigations, R.drawable.a, R.raw.a11, "61", "0"));
    sounds.add(new LangModel(R.string.I_no_Dey_Hear_Word, R.drawable.a, R.raw.a108, "62", "0"));
    sounds.add(new LangModel(R.string.Broda_Shaggi, R.drawable.a, R.raw.a107, "63", "0"));
    sounds.add(new LangModel(R.string.Nollywood_Laugh, R.drawable.a, R.raw.a106, "64", "0"));
    sounds.add(new LangModel(R.string.What_Is_Going_On, R.drawable.a, R.raw.a105, "65", "0"));
    sounds.add(new LangModel(R.string.Is_It_For_Eba, R.drawable.a, R.raw.a104, "66", "0"));
    sounds.add(new LangModel(R.string.Help_Me, R.drawable.a, R.raw.a103, "67", "0"));
    sounds.add(new LangModel(R.string.What_Type_Of_Playing_Is_This, R.drawable.a, R.raw.a102, "68", "0"));
    sounds.add(new LangModel(R.string.I_Want_Problem, R.drawable.a, R.raw.a101, "69", "0"));
    sounds.add(new LangModel(R.string.Murife_Dont_Run, R.drawable.a, R.raw.a10, "70", "0"));
    sounds.add(new LangModel(R.string.Just_Dey_Play, R.drawable.a, R.raw.a1, "71", "0"));
    sounds.add(new LangModel(R.string.Wetin_Be_This, R.drawable.a, R.raw.a0, "72", "0"));

    return sounds;
}
    public static List<LangModel> getAnimalprankSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.animals, R.raw.gun_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.animals, R.raw.gun_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.animals, R.raw.gun_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.animals, R.raw.gun_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.animals, R.raw.gun_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.animals, R.raw.gun_6, "5", "0"));
        sounds.add(new LangModel(R.string.sound7, R.drawable.animals, R.raw.gun_7, "6", "0"));
        sounds.add(new LangModel(R.string.sound8, R.drawable.animals, R.raw.gun_8, "7", "0"));
        sounds.add(new LangModel(R.string.sound9, R.drawable.animals, R.raw.gun_9, "8", "0"));
        sounds.add(new LangModel(R.string.sound10, R.drawable.animals, R.raw.gun_10, "9", "0"));
        sounds.add(new LangModel(R.string.sound11, R.drawable.animals, R.raw.gun_10, "10", "0"));



        return sounds;
    }
    public static List<LangModel> getCoughprankSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.cough, R.raw.funny_man_cough_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.cough, R.raw.funny_man_cough_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.cough, R.raw.funny_man_cough_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.cough, R.raw.funny_man_cough_3, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.cough, R.raw.funny_man_cough_4, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.cough, R.raw.funny_man_cough_5, "5", "0"));
        sounds.add(new LangModel(R.string.sound7, R.drawable.cough, R.raw.funny_woman_cough_1, "6", "0"));
        sounds.add(new LangModel(R.string.sound8, R.drawable.cough, R.raw.funny_woman_cough_2, "7", "0"));
        sounds.add(new LangModel(R.string.sound9, R.drawable.cough, R.raw.funny_woman_cough_3, "8", "0"));
        sounds.add(new LangModel(R.string.sound10, R.drawable.cough, R.raw.funny_man_cough_strong_1, "9", "0"));

        return sounds;
    }
    public static List<LangModel> getFartprankSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.fart, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.fart, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.fart, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.fart, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.fart, R.raw.fart_song_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.fart, R.raw.fart_song_6, "5", "0"));
        sounds.add(new LangModel(R.string.sound7, R.drawable.fart, R.raw.fart_song_7, "6", "0"));
        sounds.add(new LangModel(R.string.sound8, R.drawable.fart, R.raw.fart_song_8, "7", "0"));
        sounds.add(new LangModel(R.string.sound9, R.drawable.fart, R.raw.fart_song_9, "8", "0"));
        sounds.add(new LangModel(R.string.sound10, R.drawable.fart, R.raw.fart_song_10, "9", "0"));

        return sounds;
    }
    public static List<LangModel> getChristmasSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.christmis, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.christmis, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.christmis, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.christmis, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.christmis, R.raw.fart_song_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.christmis, R.raw.fart_song_6, "5", "0"));
        sounds.add(new LangModel(R.string.sound7, R.drawable.christmis, R.raw.fart_song_7, "6", "0"));
        sounds.add(new LangModel(R.string.sound8, R.drawable.christmis, R.raw.fart_song_8, "7", "0"));
        sounds.add(new LangModel(R.string.sound9, R.drawable.christmis, R.raw.fart_song_9, "8", "0"));
        sounds.add(new LangModel(R.string.sound10, R.drawable.christmis, R.raw.fart_song_10, "9", "0"));

        return sounds;
    }
    public static List<LangModel> getpolieceSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.poliecesiren, R.raw.funny_police_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.poliecesiren, R.raw.funny_police_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.poliecesiren, R.raw.funny_police_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.poliecesiren, R.raw.funny_police_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.poliecesiren, R.raw.funny_police_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.poliecesiren, R.raw.funny_police_6, "5", "0"));


        return sounds;
    }
    public static List<LangModel> getbabylaughSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.babylaugh, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.babylaugh, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.babylaugh, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.babylaugh, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.babylaugh, R.raw.fart_song_5, "4", "0"));

        return sounds;
    }
    public static List<LangModel> getnotificationSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.notification, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.notification, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.notification, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.notification, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.notification, R.raw.fart_song_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.notification, R.raw.fart_song_6, "5", "0"));
        sounds.add(new LangModel(R.string.sound7, R.drawable.notification, R.raw.fart_song_7, "6", "0"));
        sounds.add(new LangModel(R.string.sound8, R.drawable.notification, R.raw.fart_song_8, "7", "0"));

        return sounds;
    }
    @NonNull
    public static List<LangModel> getdoorbellSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.doorbell, R.raw.funny_doorbell_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.doorbell, R.raw.funny_doorbell_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.doorbell, R.raw.funny_doorbell_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.doorbell, R.raw.funny_doorbell_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.doorbell, R.raw.funny_doorbell_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.doorbell, R.raw.funny_doorbell_6, "5", "0"));
        sounds.add(new LangModel(R.string.sound7, R.drawable.doorbell, R.raw.funny_doorbell_7, "6", "0"));
        sounds.add(new LangModel(R.string.sound8, R.drawable.doorbell, R.raw.funny_doorbell_8, "7", "0"));
        sounds.add(new LangModel(R.string.sound9, R.drawable.doorbell, R.raw.funny_doorbell_9, "8", "0"));
        sounds.add(new LangModel(R.string.sound10, R.drawable.doorbell, R.raw.funny_doorbell_10, "9", "0"));

        return sounds;
    }
    public static List<LangModel> getbabycrySound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.babycry, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.babycry, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.babycry, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.babycry, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.babycry, R.raw.fart_song_5, "4", "0"));


        return sounds;
    }
    public static List<LangModel> getgunSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.gun, R.raw.gun_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.gun, R.raw.gun_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.gun, R.raw.gun_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.gun, R.raw.gun_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.gun, R.raw.gun_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.gun, R.raw.gun_6, "5", "0"));



        return sounds;
    }
    public static List<LangModel> getHairclipperSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.hairclipper, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.hairclipper, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.hairclipper, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.hairclipper, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.hairclipper, R.raw.fart_song_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.hairclipper, R.raw.fart_song_6, "5", "0"));
        sounds.add(new LangModel(R.string.sound7, R.drawable.hairclipper, R.raw.fart_song_7, "6", "0"));
        sounds.add(new LangModel(R.string.sound8, R.drawable.hairclipper, R.raw.fart_song_8, "7", "0"));
        sounds.add(new LangModel(R.string.sound9, R.drawable.hairclipper, R.raw.fart_song_9, "8", "0"));
        sounds.add(new LangModel(R.string.sound10, R.drawable.hairclipper, R.raw.fart_song_10, "9", "0"));
        sounds.add(new LangModel(R.string.sound11, R.drawable.hairclipper, R.raw.fart_song_10, "10", "0"));

        return sounds;
    }
    public static List<LangModel> getdogSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.dog, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.dog, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.dog, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.dog, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.dog, R.raw.fart_song_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.dog, R.raw.fart_song_6, "5", "0"));
        sounds.add(new LangModel(R.string.sound7, R.drawable.dog, R.raw.fart_song_7, "6", "0"));


        return sounds;
    }
    public static List<LangModel> getshoutSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.shout, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.shout, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.shout, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.shout, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.shout, R.raw.fart_song_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.shout, R.raw.fart_song_6, "5", "0"));
        sounds.add(new LangModel(R.string.sound7, R.drawable.shout, R.raw.fart_song_7, "6", "0"));


        return sounds;
    }
    public static List<LangModel> getcatSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.cat, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.cat, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.cat, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.cat, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.cat, R.raw.fart_song_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.cat, R.raw.fart_song_6, "5", "0"));
        sounds.add(new LangModel(R.string.sound7, R.drawable.cat, R.raw.fart_song_7, "6", "0"));
        sounds.add(new LangModel(R.string.sound8, R.drawable.cat, R.raw.fart_song_8, "7", "0"));
        sounds.add(new LangModel(R.string.sound9, R.drawable.cat, R.raw.fart_song_9, "8", "0"));


        return sounds;
    }
    public static List<LangModel> getBurpSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.burp, R.raw.funny_burp_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.burp, R.raw.funny_burp_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.burp, R.raw.funny_burp_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.burp, R.raw.funny_burp_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.burp, R.raw.funny_burp_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.burp, R.raw.funny_burp_6, "5", "0"));
        sounds.add(new LangModel(R.string.sound7, R.drawable.burp, R.raw.funny_burp_7, "6", "0"));
        sounds.add(new LangModel(R.string.sound8, R.drawable.burp, R.raw.funny_burp_8, "7", "0"));
        sounds.add(new LangModel(R.string.sound9, R.drawable.burp, R.raw.funny_burp_9, "8", "0"));
        sounds.add(new LangModel(R.string.sound10, R.drawable.burp, R.raw.funny_burp_10, "9", "0"));

        return sounds;
    }
    public static List<LangModel> getAirHornSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.airhorn, R.raw.funny_airhorn_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.airhorn, R.raw.funny_airhorn_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.airhorn, R.raw.funny_airhorn_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.airhorn, R.raw.funny_airhorn_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.airhorn, R.raw.funny_airhorn_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.airhorn, R.raw.funny_airhorn_6, "5", "0"));
        sounds.add(new LangModel(R.string.sound7, R.drawable.airhorn, R.raw.funny_airhorn_7, "6", "0"));
        sounds.add(new LangModel(R.string.sound8, R.drawable.airhorn, R.raw.funny_airhorn_8, "7", "0"));
        sounds.add(new LangModel(R.string.sound9, R.drawable.airhorn, R.raw.funny_airhorn_9, "8", "0"));


        return sounds;
    }
    public static List<LangModel> getZombieSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.zombie, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.zombie, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.zombie, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.zombie, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.zombie, R.raw.fart_song_5, "4", "0"));


        return sounds;
    }
    public static List<LangModel> gettoiletflusgSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.flush, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.flush, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.flush, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.flush, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.flush, R.raw.fart_song_5, "4", "0"));


        return sounds;
    }
    public static List<LangModel> getsnoringSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.snoring, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.snoring, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.snoring, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.snoring, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.snoring, R.raw.fart_song_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.snoring, R.raw.fart_song_6, "5", "0"));
        sounds.add(new LangModel(R.string.sound7, R.drawable.snoring, R.raw.fart_song_7, "6", "0"));
        sounds.add(new LangModel(R.string.sound8, R.drawable.snoring, R.raw.fart_song_8, "7", "0"));


        return sounds;
    }
    public static List<LangModel> getsneezSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.sneez, R.raw.funny_man_sneeze_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.sneez, R.raw.funny_man_sneeze_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.sneez, R.raw.funny_man_sneeze_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.sneez, R.raw.funny_man_sneeze_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.sneez, R.raw.funny_man_sneeze_strong_1, "4", "0"));


        return sounds;
    }
    public static List<LangModel> getshirttearSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.shirt, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.shirt, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.shirt, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.shirt, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.shirt, R.raw.fart_song_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.shirt, R.raw.fart_song_6, "5", "0"));


        return sounds;
    }
    public static List<LangModel> getcarSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.car, R.raw.funny_carhorn_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.car, R.raw.funny_carhorn_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.car, R.raw.funny_carhorn_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.car, R.raw.funny_carhorn_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.car, R.raw.funny_carhorn_5, "4", "0"));


        return sounds;
    }
    public static List<LangModel> getscissorSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.scissor, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.scissor, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.scissor, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.scissor, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.scissor, R.raw.fart_song_5, "4", "0"));


        return sounds;
    }
    public static List<LangModel> getscarySound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound2, R.drawable.scary, R.raw.fart_song_2, "0", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.scary, R.raw.fart_song_3, "1", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.scary, R.raw.fart_song_4, "2", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.scary, R.raw.fart_song_5, "3", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.scary, R.raw.fart_song_6, "4", "0"));
        sounds.add(new LangModel(R.string.sound7, R.drawable.scary, R.raw.fart_song_7, "5", "0"));
        sounds.add(new LangModel(R.string.sound8, R.drawable.scary, R.raw.fart_song_8, "6", "0"));
        sounds.add(new LangModel(R.string.sound9, R.drawable.scary, R.raw.fart_song_9, "7", "0"));
        sounds.add(new LangModel(R.string.sound10, R.drawable.scary, R.raw.fart_song_10, "8", "0"));
        sounds.add(new LangModel(R.string.sound1, R.drawable.scary, R.raw.fart_song_1,"9","0"));

        return sounds;
    }
    public static List<LangModel> getplatebreakSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.plate, R.raw.breaking_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.plate, R.raw.breaking_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.plate, R.raw.breaking_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.plate, R.raw.breaking_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.plate, R.raw.breaking_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.plate, R.raw.breaking_6, "5", "0"));



        return sounds;
    }
    public static List<LangModel> getmemeSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.meme, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.meme, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.meme, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.meme, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.meme, R.raw.fart_song_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.meme, R.raw.fart_song_6, "5", "0"));
        sounds.add(new LangModel(R.string.sound7, R.drawable.meme, R.raw.fart_song_7, "6", "0"));
        sounds.add(new LangModel(R.string.sound8, R.drawable.meme, R.raw.fart_song_8, "7", "0"));
        sounds.add(new LangModel(R.string.sound9, R.drawable.meme, R.raw.fart_song_9, "8", "0"));
        sounds.add(new LangModel(R.string.sound10, R.drawable.meme, R.raw.fart_song_10, "9", "0"));

        return sounds;
    }
    public static List<LangModel> gethalloweenSound(){
        List<LangModel> sounds=new ArrayList<>();
        sounds.add(new LangModel(R.string.sound1, R.drawable.halloween, R.raw.fart_song_1, "0", "0"));
        sounds.add(new LangModel(R.string.sound2, R.drawable.halloween, R.raw.fart_song_2, "1", "0"));
        sounds.add(new LangModel(R.string.sound3, R.drawable.halloween, R.raw.fart_song_3, "2", "0"));
        sounds.add(new LangModel(R.string.sound4, R.drawable.halloween, R.raw.fart_song_4, "3", "0"));
        sounds.add(new LangModel(R.string.sound5, R.drawable.halloween, R.raw.fart_song_5, "4", "0"));
        sounds.add(new LangModel(R.string.sound6, R.drawable.halloween, R.raw.fart_song_6, "5", "0"));


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
