package com.ozair.funnypranksounds.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ozair.funnypranksounds.Adapters.LanguageAdapter;
import com.ozair.funnypranksounds.Models.LangModel;
import com.ozair.funnypranksounds.R;
import com.ozair.funnypranksounds.Repository.Repository;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private LanguageAdapter languageAdapter;
    private RecyclerView recyclerViewCourse;
    ArrayList<LangModel> langlist= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerViewCourse=findViewById(R.id.langRec);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        languageAdapter=new LanguageAdapter(this, Repository.getLangData());
        recyclerViewCourse.setAdapter(languageAdapter);
    }
}