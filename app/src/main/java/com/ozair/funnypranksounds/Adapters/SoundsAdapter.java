package com.ozair.funnypranksounds.Adapters;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ozair.funnypranksounds.Activities.PlaySoundActivity;
import com.ozair.funnypranksounds.Models.LangModel;
import com.ozair.funnypranksounds.R;

import java.util.ArrayList;
import java.util.List;

public class SoundsAdapter extends RecyclerView.Adapter<SoundsAdapter.ViewHOlder> {

    Context context;
    List<LangModel> soundlist;
    MediaPlayer mediaPlayer;

    public SoundsAdapter(Context context,List<LangModel> soundlist) {
        this.context = context;
        this.soundlist = soundlist;
    }

    @NonNull
    @Override
    public SoundsAdapter.ViewHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.soundl_ayout_design,parent,false);
    return new ViewHOlder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SoundsAdapter.ViewHOlder holder, int position) {
LangModel langModel=soundlist.get(position);
holder.soundname.setText(langModel.getSoundname());
holder.imageviewcard.setImageResource(langModel.getImgsrc());
holder.playbtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    Intent intent=new Intent(context, PlaySoundActivity.class);
    context.startActivity(intent);
    }
});

    }

    @Override
    public int getItemCount() {
        return soundlist.size();
    }

    public class ViewHOlder extends RecyclerView.ViewHolder {
        TextView soundname;
        ImageView imageviewcard;
        CardView playbtn;
        public ViewHOlder(@NonNull View itemView) {
            super(itemView);
            soundname=itemView.findViewById(R.id.soundname);
            imageviewcard=itemView.findViewById(R.id.imageviewcard);
            playbtn=itemView.findViewById(R.id.cardviewbtn);
        }
    }
}
