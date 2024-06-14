package com.ozair.funnysounds.Fragments;

import static com.ozair.funnysounds.nativetemplates.ActionBottomDialogFragment.isNetworkConnected;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ArhamZeeApps.funnysounds.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ozair.funnysounds.Adapters.SoundsAdapter;
import com.ozair.funnysounds.DataBases.FvrtDB;
import com.ozair.funnysounds.Models.LangModel;

import com.ozair.funnysounds.Utilz.AdsUtilize;
import com.ozair.funnysounds.nativetemplates.TemplateView;

import java.util.List;

public class FavouriteFragment extends Fragment {
    private RecyclerView recyclerView;
    private SoundsAdapter adapter;
    private FvrtDB fvrtDB;
    List<LangModel> myFeavList;
   // public  static MutableLiveData<Boolean> mfavMuteable;

    ///SharedViewModel sharedViewModel;

    public FavouriteFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favourite, container, false);
     //   mfavMuteable = new MutableLiveData<>();
       /* mfavMuteable.observe(getViewLifecycleOwner(), new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean isFav) {
                myFeavList = fvrtDB.getFavList();
                setupRecyclerView();

            }
        });*/

        fvrtDB = new FvrtDB(getContext());

        myFeavList = fvrtDB.getFavList();

        if (myFeavList != null) {
            if (myFeavList.size() > 0) {

                String nativeAdsId = getString(R.string.native_ad);
                TemplateView nativeTemplate = view.findViewById(R.id.my_template);
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
            }
        }
        recyclerView = view.findViewById(R.id.favrec);


        setupRecyclerView();
        return view;
    }

    public void setupRecyclerView() {


        adapter = new SoundsAdapter(getContext(), myFeavList);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2)); // Set grid layout manager
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onResume() {
        super.onResume();
     //   setupRecyclerView();

    }
}
