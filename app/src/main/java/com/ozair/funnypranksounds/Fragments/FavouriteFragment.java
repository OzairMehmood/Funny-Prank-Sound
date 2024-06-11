package com.ozair.funnypranksounds.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ozair.funnypranksounds.Fragments.Adapters.SoundsAdapter;
import com.ozair.funnypranksounds.DataBases.FvrtDB;
import com.ozair.funnypranksounds.R;

public class FavouriteFragment extends Fragment {
    private RecyclerView recyclerView;
    private SoundsAdapter adapter;
    private FvrtDB fvrtDB;

    public FavouriteFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favourite, container, false);


        recyclerView = view.findViewById(R.id.favrec);
        fvrtDB = new FvrtDB(getContext());
        setupRecyclerView();
        return view;
    }

    private void setupRecyclerView() {



        adapter = new SoundsAdapter(getContext(),fvrtDB.getFavList());
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2)); // Set grid layout manager
        recyclerView.setAdapter(adapter);
    }
}
