package com.ozair.funnysounds.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.ArhamZeeApps.funnysounds.R;
import com.ozair.funnysounds.Fragments.FavouriteFragment;
import com.ozair.funnysounds.Fragments.NigerianFragment;
import com.ozair.funnysounds.Fragments.PrankFragment;
import com.ozair.funnysounds.Fragments.SettingFragment;

import com.ozair.funnysounds.Tool;
import com.ozair.funnysounds.Utilz.SharedPrefs;
import com.ozair.funnysounds.Utilz.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.setLanguage(MainActivity.this, SharedPrefs.getLang(MainActivity.this));
        setContentView(R.layout.activity_main);

        Fragment fragment=new NigerianFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.mainlay, fragment);
        transaction.commit();

        findViewById(R.id.nigeriansounds).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadnewfragment(new NigerianFragment());

            }
        });
        findViewById(R.id.pranksounds).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadnewfragment(new PrankFragment());
            }
        });
        findViewById(R.id.fvrtsounds).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadnewfragment(new FavouriteFragment());

            }
        });
        findViewById(R.id.settingsounds).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadnewfragment(new SettingFragment());

            }
        });

    }
    public void loadnewfragment(Fragment fragment) {
        // fragment = new Fragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.mainlay, fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }
    public void onBackPressed() {
        Tool.showBottomSheetBanner(this);
    }
}