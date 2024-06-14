package com.ozair.funnysounds.Fragments;

import static com.ozair.funnysounds.nativetemplates.ActionBottomDialogFragment.isNetworkConnected;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.ArhamZeeApps.funnysounds.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ozair.funnysounds.Adapters.SoundsAdapter;
import com.ozair.funnysounds.Models.LangModel;

import com.ozair.funnysounds.Repository.Repository;
import com.ozair.funnysounds.Utilz.AdsUtilize;
import com.ozair.funnysounds.nativetemplates.TemplateView;

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
        String nativeAdsId = getString(R.string.native_ad);
        TemplateView nativeTemplate =view.findViewById(R.id.my_template);
        ShimmerFrameLayout nativeShimmer = view.findViewById(R.id.load_native);
        RelativeLayout layNative = view.findViewById(R.id.Laynative);

        if (isNetworkConnected(getContext()) && !TextUtils.isEmpty(nativeAdsId)) {
            if (TextUtils.isEmpty(nativeAdsId)) {
                layNative.setVisibility(View.GONE);
            } else {
                layNative.setVisibility(View.VISIBLE);
                AdsUtilize.getInstance().load_NativeAD(
                        requireActivity(),
                        nativeAdsId,
                        nativeTemplate,
                        nativeShimmer,
                        layNative
                );
            }
        } else {
            layNative.setVisibility(View.GONE);
        }
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