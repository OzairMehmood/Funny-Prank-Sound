package com.ozair.funnypranksounds.Fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ozair.funnypranksounds.Adapters.SoundsAdapter;
import com.ozair.funnypranksounds.Models.LangModel;
import com.ozair.funnypranksounds.R;
import com.ozair.funnypranksounds.Repository.Repository;

import java.util.ArrayList;


public class NigerianFragment extends Fragment {

    private SoundsAdapter soundsAdapter;
    private RecyclerView recyclerViewCourse;
    ArrayList<LangModel> soundlist = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NigerianFragment() {

        // Required empty public constructor
    }


/*    public static NigerianFragment newInstance(String param1, String param2) {
        NigerianFragment fragment = new NigerianFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nigerian, container, false);

        recyclerViewCourse = view.findViewById(R.id.nigerianrec);
        recyclerViewCourse.setLayoutManager(new GridLayoutManager(requireActivity(), 2));
        soundsAdapter = new SoundsAdapter(getContext(), Repository.getSoundnsme());
        recyclerViewCourse.setAdapter(soundsAdapter);
        return view;
    }
    public void onViewCreated(@NonNull View v, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(v, savedInstanceState);

        // Assuming privacybtn functionality needs to be defined, add here if any
    }


}