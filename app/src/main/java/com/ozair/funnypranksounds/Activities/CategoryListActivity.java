package com.ozair.funnypranksounds.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.ozair.funnypranksounds.Adapters.SoundsAdapter;
import com.ozair.funnypranksounds.Models.LangModel;
import com.ozair.funnypranksounds.R;
import com.ozair.funnypranksounds.Repository.Repository;

import java.util.ArrayList;
import java.util.Objects;

public class CategoryListActivity extends AppCompatActivity {
    private SoundsAdapter soundsAdapter;
    private RecyclerView recyclerViewCourse;
    ArrayList<LangModel> soundlist = new ArrayList<>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);
      String method= getIntent().getStringExtra("category");

        recyclerViewCourse = findViewById(R.id.categoryrec);
        recyclerViewCourse.setLayoutManager(new GridLayoutManager(this, 2));
        if(method!=null){
        if(method.equals("Animals")){
        soundsAdapter = new SoundsAdapter(this, Repository.getAnimalprankSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
       else if(method.equals("Cough")){
            soundsAdapter = new SoundsAdapter(this, Repository.getCoughprankSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Fart")){
            soundsAdapter = new SoundsAdapter(this, Repository.getFartprankSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Christmas")){
            soundsAdapter = new SoundsAdapter(this, Repository.getChristmasSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Police Siren")){
            soundsAdapter = new SoundsAdapter(this, Repository.getpolieceSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Baby Laugh")){
            soundsAdapter = new SoundsAdapter(this, Repository.getbabylaughSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Notifications")){
            soundsAdapter = new SoundsAdapter(this, Repository.getnotificationSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Door Bell")){
            soundsAdapter = new SoundsAdapter(this, Repository.getdoorbellSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Baby Cry")){
            soundsAdapter = new SoundsAdapter(this, Repository.getbabycrySound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Gun")){
            soundsAdapter = new SoundsAdapter(this, Repository.getgunSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Hair Cut")){
            soundsAdapter = new SoundsAdapter(this, Repository.getHairclipperSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Dog")){
            soundsAdapter = new SoundsAdapter(this, Repository.getdogSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Shout")){
            soundsAdapter = new SoundsAdapter(this, Repository.getshoutSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Cat")){
            soundsAdapter = new SoundsAdapter(this, Repository.getcatSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Burp")){
            soundsAdapter = new SoundsAdapter(this, Repository.getBurpSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Air Horn")){
            soundsAdapter = new SoundsAdapter(this, Repository.getAirHornSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Zombie")){
            soundsAdapter = new SoundsAdapter(this, Repository.getZombieSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Toilet Flush")){
            soundsAdapter = new SoundsAdapter(this, Repository.gettoiletflusgSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Snoring")){
            soundsAdapter = new SoundsAdapter(this, Repository.getsnoringSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Sneeze")){
            soundsAdapter = new SoundsAdapter(this, Repository.getsneezSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Shirt Tear")){
            soundsAdapter = new SoundsAdapter(this, Repository.getshirttearSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Car")){
            soundsAdapter = new SoundsAdapter(this, Repository.getcarSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Scissor")){
            soundsAdapter = new SoundsAdapter(this, Repository.getscissorSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Scary")){
            soundsAdapter = new SoundsAdapter(this, Repository.getscarySound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Plate Break")){
            soundsAdapter = new SoundsAdapter(this, Repository.getplatebreakSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Meme")){
            soundsAdapter = new SoundsAdapter(this, Repository.getmemeSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }
        else if(method.equals("Halloween")){
            soundsAdapter = new SoundsAdapter(this, Repository.gethalloweenSound());
            recyclerViewCourse.setAdapter(soundsAdapter); }


       else{

       }}


    }
}