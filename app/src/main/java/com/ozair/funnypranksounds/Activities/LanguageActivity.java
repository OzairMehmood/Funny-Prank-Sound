package com.ozair.funnypranksounds.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;
import com.ozair.funnypranksounds.Adapters.LanguageAdapter;
import com.ozair.funnypranksounds.Models.LangModel;
import com.ozair.funnypranksounds.R;
import com.ozair.funnypranksounds.Repository.Repository;

import java.util.ArrayList;

public class LanguageActivity extends AppCompatActivity {
    private LanguageAdapter languageAdapter;
    private RecyclerView recyclerViewCourse;
    AppCompatButton Donebtn;
    ArrayList<LangModel> langlist= new ArrayList<>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

Donebtn=findViewById(R.id.btndone);
Donebtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(LanguageActivity.this, MainActivity.class);
        startActivity(intent);
    }
});


        recyclerViewCourse=findViewById(R.id.langRec);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        languageAdapter=new LanguageAdapter(this, Repository.getLangData());
        recyclerViewCourse.setAdapter(languageAdapter);
    }
}