//package com.ozair.funnypranksounds.Adapters;
//
//import android.annotation.SuppressLint;
//import android.content.Context;
//import android.content.SharedPreferences;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextClock;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.ozair.funnypranksounds.DataBases.FvrtDB;
//import com.ozair.funnypranksounds.Fragments.FavouriteFragment;
//import com.ozair.funnypranksounds.Models.FavModel;
//import com.ozair.funnypranksounds.Models.LangModel;
//import com.ozair.funnypranksounds.R;
//
//import java.util.ArrayList;
//
//public class FavAdapter extends RecyclerView.Adapter<FavAdapter.ViewHolder> {
//    private ArrayList<FavModel> favitems;
//    private Context context;
//    private FvrtDB fvrtDB;
//
//    public FavAdapter(ArrayList<FavModel> favitems, Context context) {
//        this.favitems = favitems;
//        this.context = context;
//    }
//
//    @NonNull
//    @Override
//    public FavAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        fvrtDB = new FvrtDB(context);
//        SharedPreferences prefs = context.getSharedPreferences("prefs", Context.MODE_PRIVATE);
//        boolean firstStart = prefs.getBoolean("firstStart", true);
//        if (firstStart) {
//            createTableonFirst();
//        }
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fav_itemdesign, parent, false);
//
//        return new ViewHolder(view);
//    }
//
//    private void createTableonFirst() {
//        fvrtDB.insertEmpty();
//        SharedPreferences prefs = context.getSharedPreferences("prefs", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = prefs.edit();
//        editor.putBoolean("firstStart", false);
//        editor.apply();
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull FavAdapter.ViewHolder holder, int position) {
//        final FavModel favModel = favitems.get(position);
//        readCursorData(favModel,holder);
//        holder.image.setImageResource(favModel.getItem_image());
//        holder.title.setText(favModel.getItem_title());
//
//    }
//
//    @SuppressLint("ResourceType")
//    private void readCursorData(FavModel favModel, ViewHolder viewHolder) {
//        Cursor cursor = fvrtDB.readdataBase(favModel.getKey_Id());
//        SQLiteDatabase db = fvrtDB.getReadableDatabase();
//        try {
//            while (cursor.moveToNext()) {
//                @SuppressLint("Range") String item_Fav_status = cursor.getString(cursor.getColumnIndex(FvrtDB.Favourite_Status));
//                favModel.setFavStatus(item_Fav_status);
//                if (item_Fav_status != null && item_Fav_status.equals("1")) {
//                    viewHolder.favimg.setImageResource(R.drawable.fvrtimg2);
//                }else  if (item_Fav_status != null && item_Fav_status.equals("0")) {
//                    viewHolder.favimg.setImageResource(R.drawable.fvrtimg);
//                }
//            }
//        }finally {
//            if(cursor!=null&&cursor.isClosed()){
//                cursor.close();
//                db.close();
//            }
//        }
//    }
//
//    @Override
//    public int getItemCount() {
//        return favitems.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        ImageView image, favimg;
//        TextView title;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            image = itemView.findViewById(R.id.imageviewcard);
//            favimg = itemView.findViewById(R.id.favrtimg);
//            title = itemView.findViewById(R.id.soundname);
//
//            favimg.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    int position = getAdapterPosition();
//                    FavModel favModel = favitems.get(position);
//                    if (favModel.getFavStatus().equals("0")) {
//                        favModel.setFavStatus("1");
//                        fvrtDB.insertintoDataBase(favModel.getItem_title(), favModel.getItem_image(), favModel.getKey_Id(), favModel.getFavStatus());
//                        favimg.setImageResource(R.drawable.fvrtimg2);
//                    } else {
//                        favModel.setFavStatus("0");
//                        fvrtDB.removeFav(favModel.getKey_Id());
//                        favimg.setImageResource(R.drawable.fvrtimg);
//                    }
//                }
//            });
//        }
//    }
//}
