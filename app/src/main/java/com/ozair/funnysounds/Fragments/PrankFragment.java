package com.ozair.funnysounds.Fragments;

import static com.ozair.funnysounds.nativetemplates.ActionBottomDialogFragment.isNetworkConnected;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.ArhamZeeApps.funnysounds.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ozair.funnysounds.Adapters.PrankAdapter;
import com.ozair.funnysounds.Models.LangModel;

import com.ozair.funnysounds.Repository.Repository;
import com.ozair.funnysounds.Utilz.AdsUtilize;
import com.ozair.funnysounds.nativetemplates.TemplateView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PrankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PrankFragment extends Fragment {
    private PrankAdapter prankAdapter;
    private RecyclerView recyclerViewCourse;
    ArrayList<LangModel> soundlist = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PrankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PrankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PrankFragment newInstance(String param1, String param2) {
        PrankFragment fragment = new PrankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

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
        View view= inflater.inflate(R.layout.fragment_prank, container, false);
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
        recyclerViewCourse = view.findViewById(R.id.prankRec);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(requireActivity()));
        prankAdapter = new PrankAdapter(getContext(), Repository.getCategoryName());
        recyclerViewCourse.setAdapter(prankAdapter);
        return view;
    }
}