package com.ozair.funnypranksounds.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;
import com.ozair.funnypranksounds.Activities.CategoryListActivity;
import com.ozair.funnypranksounds.Models.LangModel;
import com.ozair.funnypranksounds.R;

import java.util.List;

public class PrankAdapter extends RecyclerView.Adapter<PrankAdapter.ViewHolder> {
    Context context;
    List<LangModel> prankcategory;

    public PrankAdapter(Context context, List<LangModel> prankcategory) {
        this.context = context;
        this.prankcategory = prankcategory;
    }

    @NonNull
    @Override
    public PrankAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.prank_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PrankAdapter.ViewHolder holder, int position) {
        LangModel langModel = prankcategory.get(position);
        holder.categoryName.setText(langModel.getCategoryName());
        holder.catergorycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, CategoryListActivity.class);
                intent.putExtra("category", langModel.getCategory());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return prankcategory.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView categoryName;
        MaterialCardView catergorycard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryName = itemView.findViewById(R.id.categoryname);
            catergorycard=itemView.findViewById(R.id.catergorycard);
        }
    }
}
