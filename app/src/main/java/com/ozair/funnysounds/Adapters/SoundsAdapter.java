package com.ozair.funnysounds.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ArhamZeeApps.funnysounds.R;
import com.ads.control.ads.AperoAd;
import com.ads.control.ads.AperoAdCallback;
import com.ads.control.ads.wrapper.ApAdError;
import com.ads.control.ads.wrapper.ApInterstitialAd;
import com.bumptech.glide.Glide;
import com.ozair.funnysounds.Activities.PlaySoundActivity;
import com.ozair.funnysounds.DataBases.FvrtDB;
import com.ozair.funnysounds.Models.LangModel;

import com.ozair.funnysounds.appconstants;

import java.util.List;

public class SoundsAdapter extends RecyclerView.Adapter<SoundsAdapter.ViewHolder> {

    private final Context context;
    private static  List<LangModel> soundList;
    private static FvrtDB fvrtDB;
    LangModel langModel;
    private ApInterstitialAd mInterstitialAd;
    public SoundsAdapter(Context context, List<LangModel> soundList) {
        this.context = context;
        this.soundList = soundList;
        loadAdInterstitial();
    }

    @NonNull
    @Override
    public SoundsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//        SharedPreferences prefs = context.getSharedPreferences("prefs", Context.MODE_PRIVATE);
//        boolean firstStart = prefs.getBoolean("firstStart", true);
//        if (firstStart) {
//            createTableonFirst();
//        }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.soundl_ayout_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SoundsAdapter.ViewHolder holder, int position) {

        langModel = soundList.get(position);

        String soundName = String.valueOf(langModel.getSoundname());
        holder.soundName.setText(soundName);
        // Load image using Glide
        Glide.with(context)
                .load(langModel.getImgsrc())
                .into(holder.imageViewCard);

        holder.playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                langModel = soundList.get(position);
                if (appconstants.isSplashRecentlyShown) {
                    appconstants.isSplashRecentlyShown=false;
                    Intent intent = new Intent(context, PlaySoundActivity.class);
                    intent.putExtra("soundFile", langModel.getSoundsrc());
                    intent.putExtra("position", position);
                    intent.putExtra("imageFile", langModel.getImgsrc());
                    intent.putExtra("soundname", langModel.getSoundname());
                    intent.putExtra("keyId", langModel.getKey_Id());
                    intent.putExtra("favStatus", langModel.getFavStatus());

                    context.startActivity(intent);}
                else{
                    if (mInterstitialAd != null && mInterstitialAd.isReady()) {
                        AperoAd.getInstance().forceShowInterstitial(context, mInterstitialAd, new AperoAdCallback() {
                            @Override
                            public void onNextAction() {
                                Intent intent = new Intent(context, PlaySoundActivity.class);
                                intent.putExtra("soundFile", langModel.getSoundsrc());
                                intent.putExtra("position", position);
                                intent.putExtra("imageFile", langModel.getImgsrc());
                                intent.putExtra("soundname", langModel.getSoundname());
                                intent.putExtra("keyId", langModel.getKey_Id());
                                intent.putExtra("favStatus", langModel.getFavStatus());

                                context.startActivity(intent);
                            }

                            @Override
                            public void onAdFailedToShow(@Nullable ApAdError adError) {
                                super.onAdFailedToShow(adError);

                                Intent intent = new Intent(context, PlaySoundActivity.class);
                                intent.putExtra("soundFile", langModel.getSoundsrc());
                                intent.putExtra("position", position);
                                intent.putExtra("imageFile", langModel.getImgsrc());
                                intent.putExtra("soundname", langModel.getSoundname());
                                intent.putExtra("keyId", langModel.getKey_Id());
                                intent.putExtra("favStatus", langModel.getFavStatus());

                                context.startActivity(intent);
                            }
                        }, true);
                    } else {
                        // Handle the case where mInterstitialAd is null or not ready
                        Intent intent = new Intent(context, PlaySoundActivity.class);
                        intent.putExtra("soundFile", langModel.getSoundsrc());
                        intent.putExtra("position", position);
                        intent.putExtra("imageFile", langModel.getImgsrc());
                        intent.putExtra("soundname", langModel.getSoundname());
                        intent.putExtra("keyId", langModel.getKey_Id());
                        intent.putExtra("favStatus", langModel.getFavStatus());

                        context.startActivity(intent);
                    }

                }
            }


        });


    }

    @Override
    public int getItemCount() {
        return soundList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView soundName;
        ImageView imageViewCard,favimg;
        CardView playBtn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            soundName = itemView.findViewById(R.id.soundname);
            imageViewCard = itemView.findViewById(R.id.imageviewcard);
            playBtn = itemView.findViewById(R.id.cardviewbtn);



        }
    }
    private void createTableonFirst() {
        fvrtDB.insertEmpty();
        SharedPreferences prefs = context.getSharedPreferences("prefs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstStart", false);
        editor.apply();
    }
    private void readCursorData(LangModel favModel, SoundsAdapter.ViewHolder viewHolder) {
        Cursor cursor = fvrtDB.readDataBase(favModel.getKey_Id());
        SQLiteDatabase db = fvrtDB.getReadableDatabase();
        try {
            while (cursor.moveToNext()) {
                @SuppressLint("Range") String item_Fav_status = cursor.getString(cursor.getColumnIndex(FvrtDB.Favourite_Status));
                favModel.setFavStatus(item_Fav_status);
                if (item_Fav_status != null && item_Fav_status.equals("1")) {
                    viewHolder.imageViewCard.setImageResource(R.drawable.fvrtimg2);
                }else  if (item_Fav_status != null && item_Fav_status.equals("0")) {
                    viewHolder.imageViewCard.setImageResource(R.drawable.fvrtimg);
                }
            }
        }finally {
            if(cursor!=null&&cursor.isClosed()){
                cursor.close();
                db.close();
            }
        }
    }
    private void loadAdInterstitial() {


        mInterstitialAd = AperoAd.getInstance().getInterstitialAds(context, context.getResources().getString(R.string.intersitialMain));
    }
}
