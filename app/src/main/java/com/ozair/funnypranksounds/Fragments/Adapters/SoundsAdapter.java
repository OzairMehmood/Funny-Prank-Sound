package com.ozair.funnypranksounds.Fragments.Adapters;

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
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.ozair.funnypranksounds.Activities.PlaySoundActivity;
import com.ozair.funnypranksounds.DataBases.FvrtDB;
import com.ozair.funnypranksounds.Models.LangModel;
import com.ozair.funnypranksounds.R;

import java.util.List;

public class SoundsAdapter extends RecyclerView.Adapter<SoundsAdapter.ViewHolder> {

    private final Context context;
    private static  List<LangModel> soundList;
    private static FvrtDB fvrtDB;

    public SoundsAdapter(Context context, List<LangModel> soundList) {
        this.context = context;
        this.soundList = soundList;
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
        LangModel langModel = soundList.get(position);

        String soundName= String.valueOf(langModel.getSoundname());
         holder.soundName.setText(soundName);
        // Load image using Glide
        Glide.with(context)
                .load(langModel.getImgsrc())
                .into(holder.imageViewCard);

        holder.playBtn.setOnClickListener(v -> {
            Intent intent = new Intent(context, PlaySoundActivity.class);
            intent.putExtra("soundFile", langModel.getSoundsrc());
            intent.putExtra("position", position);
            intent.putExtra("imageFile", langModel.getImgsrc());
            intent.putExtra("soundname", langModel.getSoundname());
            intent.putExtra("keyId", langModel.getKey_Id());
            intent.putExtra("favStatus", langModel.getFavStatus());
            context.startActivity(intent);
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
}
