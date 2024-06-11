package com.ozair.funnypranksounds.Fragments.Adapters;

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
import com.ozair.funnypranksounds.Utilz.SharedPrefs;

import java.util.List;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.ViewHolder> {
    Context context;
    List<LangModel> langlist;
    private int SelectedPosition = 0;

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
        if (SelectedPosition == position) {
            holder.tick.setVisibility(View.VISIBLE);
        } else {
            holder.tick.setVisibility(View.GONE);
        }
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {


                int previousSelectedPosition = SelectedPosition;
                SelectedPosition = position;

                switch (SelectedPosition) {
                    case 0:
                        SharedPrefs.setLang(context, "en");
                        break;
                    case 1:
                        SharedPrefs.setLang(context, "ur");
                        break;
                    case 2:
                        SharedPrefs.setLang(context, "es");
                        break;
                    case 3:
                        SharedPrefs.setLang(context, "hi");
                        break;
                    case 4:
                        SharedPrefs.setLang(context, "ru");
                        break;
                    case 5:
                        SharedPrefs.setLang(context, "fr");
                        break;
                    case 6:
                        SharedPrefs.setLang(context, "pt");
                        break;
                    case 7:
                        SharedPrefs.setLang(context, "ar");
                        break;
                    case 8:
                        SharedPrefs.setLang(context, "el");
                        break;
                    case 9:
                        SharedPrefs.setLang(context, "tr");
                        break;
                    default:

                }


                notifyItemChanged(previousSelectedPosition);
                notifyItemChanged(SelectedPosition);
            }

        });
    }

    @Override
    public int getItemCount() {
        return langlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView Languagename;
        CardView cardView;
        ImageView country, tick;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Languagename = itemView.findViewById(R.id.langtext);
            cardView = itemView.findViewById(R.id.langcard);
            country = itemView.findViewById(R.id.flagimg);
            tick = itemView.findViewById(R.id.tickimg);
        }
    }
}
