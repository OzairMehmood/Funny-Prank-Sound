package com.ozair.funnypranksounds.Adapters;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
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
import com.ozair.funnypranksounds.Models.LangModel;
import com.ozair.funnypranksounds.R;

import java.util.List;

public class SoundsAdapter extends RecyclerView.Adapter<SoundsAdapter.ViewHolder> {

    private final Context context;
    private final List<LangModel> soundList;
    private MediaPlayer mediaPlayer;

    public SoundsAdapter(Context context, List<LangModel> soundList) {
        this.context = context;
        this.soundList = soundList;
    }

    @NonNull
    @Override
    public SoundsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.soundl_ayout_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SoundsAdapter.ViewHolder holder, int position) {
        LangModel langModel = soundList.get(position);
        holder.soundName.setText(langModel.getSoundname());
        // Load image using Glide
        Glide.with(context)
                .load(langModel.getImgsrc())
                .into(holder.imageViewCard);

        holder.playBtn.setOnClickListener(v -> {
            Intent intent = new Intent(context, PlaySoundActivity.class);
            intent.putExtra("soundFile", langModel.getSoundsrc());
            intent.putExtra("imageFile", langModel.getImgsrc());
            intent.putExtra("soundname", langModel.getSoundname());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return soundList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView soundName;
        ImageView imageViewCard;
        CardView playBtn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            soundName = itemView.findViewById(R.id.soundname);
            imageViewCard = itemView.findViewById(R.id.imageviewcard);
            playBtn = itemView.findViewById(R.id.cardviewbtn);
        }
    }
}
