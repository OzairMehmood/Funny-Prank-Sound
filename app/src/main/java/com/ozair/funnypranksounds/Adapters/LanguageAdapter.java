package com.ozair.funnypranksounds.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ozair.funnypranksounds.Models.LangModel;
import com.ozair.funnypranksounds.R;

import java.util.ArrayList;
import java.util.List;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.ViewHolder> {
Context context;
List<LangModel> langlist;

    public LanguageAdapter(Context context, List<LangModel> langlist) {
        this.context = context;
        this.langlist = langlist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lang_card_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        LangModel langmodel = langlist.get(position);
holder.Languagename.setText(langmodel.getLanguage());
holder.country.setImageResource(langmodel.getCountries());
    }

    @Override
    public int getItemCount() {
        return langlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView Languagename;
        CardView cardView;
        ImageView country;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Languagename=itemView.findViewById(R.id.langtext);
            cardView=itemView.findViewById(R.id.langcard);
            country=itemView.findViewById(R.id.flagimg);
        }
    }
}
