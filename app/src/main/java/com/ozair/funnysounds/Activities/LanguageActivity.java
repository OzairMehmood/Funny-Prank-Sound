package com.ozair.funnysounds.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ArhamZeeApps.funnysounds.R;
import com.ozair.funnysounds.Adapters.LanguageAdapter;
import com.ozair.funnysounds.Models.LangModel;

import com.ozair.funnysounds.Repository.Repository;
import com.ozair.funnysounds.Utilz.SharedPrefs;

import java.util.ArrayList;

public class LanguageActivity extends AppCompatActivity {
    private LanguageAdapter languageAdapter;
    private RecyclerView recyclerViewCourse;
    AppCompatButton Donebtn;
    ArrayList<LangModel> langlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        Donebtn = findViewById(R.id.btndone);
        Donebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPrefs.setFirstTimeLanguageSelected(LanguageActivity.this, true);
                Intent intent = new Intent(LanguageActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        recyclerViewCourse = findViewById(R.id.langRec);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        languageAdapter = new LanguageAdapter(this, Repository.getLangData());
        recyclerViewCourse.setAdapter(languageAdapter);
    }
}
