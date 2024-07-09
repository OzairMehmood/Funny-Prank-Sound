package com.ozair.funnysounds;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.ArhamZeeApps.funnysounds.R;
import com.ads.control.ads.wrapper.ApInterstitialAd;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;


public class Tool {
    public static ApInterstitialAd mInterstitialAd;
    public static BottomSheetDialog bottomSheetDialog;
    public static AdView adView;
    public static FrameLayout adContainerView;


    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivity == null) {
            return false;
        } else {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            for (NetworkInfo networkInfo : info) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }
//////exit dialog bottom sheet native exit
    /*public static void showBottomSheetDialog(MainActivity_ArkhamZeeApps context, AperoAd maperoAd) {

        bottomSheetDialog = new BottomSheetDialog(context);
        bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog_layout);
        if (isNetworkAvailable(context)) {
            maperoAd.loadNativeAdResultCallback(context, context.getString(R.string.native_exit), R.layout.custom_native_admob_free_size, new AperoAdCallback() {
                @Override
                public void onNativeAdLoaded(@NonNull ApNativeAd nativeAd) {
                    super.onNativeAdLoaded(nativeAd);
                    ShimmerFrameLayout ShimmeView = bottomSheetDialog.findViewById(com.ads.control.R.id.shimmer_container_native);
                    FrameLayout nativeFrmeView = bottomSheetDialog.findViewById(com.ads.control.R.id.fl_adplaceholder);

                    CardView exitCard = bottomSheetDialog.findViewById(R.id.cardExit);
                    exitCard.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                context.finish();
                            } catch (Exception e) {
                                System.exit(0);
                            }


                        }
                    });

                    AperoAd.getInstance().populateNativeAdView((Activity) context, nativeAd, nativeFrmeView, ShimmeView);
                }

                @Override
                public void onAdFailedToLoad(@Nullable ApAdError adError) {
                    super.onAdFailedToLoad(adError);

                    Log.d("bottomad", adError.getMessage());
                }
            });

        } else {
            FrameLayout layout = bottomSheetDialog.findViewById(R.id.layout);
            CardView exitCard = bottomSheetDialog.findViewById(R.id.cardExit);
            layout.setVisibility(View.GONE);
            exitCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        context.finish();
                    } catch (Exception e) {
                        System.exit(0);
                    }
                }
            });
//            System.exit(0);

        }

        bottomSheetDialog.show();
    }*/

    public static void showBottomSheetBanner(Activity context) {

        bottomSheetDialog = new BottomSheetDialog(context);
        bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog_layout);
        //AperoAd.getInstance().loadBanner(context,context.getString(R.string.Banner));
        if (isNetworkAvailable(context)) {
            /// AperoAd.getInstance().loadBanner(MainActivity,context.getString(R.string));
            adView = new AdView(context);
            //adContainerView = findViewById(R.id.ad_oneframe);
            adContainerView = bottomSheetDialog.findViewById(R.id.banner_container);
            adContainerView.setVisibility(View.VISIBLE);
            adContainerView.removeAllViews();
            Bundle extras = new Bundle();
            // extras.putString("collapsible", "top");

            AdRequest adRequest = new AdRequest.Builder()
                    //.addNetworkExtrasBundle(AdMobAdapter.class, extras)
                    .build();
            adView.setAdUnitId(context.getString(R.string.bannerExit));


            // AdSize adSize = getAdSize(context);
            adView.setAdSize(AdSize.MEDIUM_RECTANGLE);
            adView.loadAd(adRequest);
            adView.setAdListener(new AdListener() {
                @Override
                public void onAdImpression() {
                    super.onAdImpression();
                    CardView exitCard = bottomSheetDialog.findViewById(R.id.cardExit);
                    exitCard.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                context.finish();
                            } catch (Exception e) {
                                System.exit(0);
                            }
                        }
                    });
                }

                @Override
                public void onAdLoaded() {
                    super.onAdLoaded();
                    //findViewById(R.id.include).setVisibility(View.INVISIBLE);
                    bottomSheetDialog.findViewById(com.ads.control.R.id.fl_shimemr).setVisibility(View.INVISIBLE);

                }

                @Override
                public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                    super.onAdFailedToLoad(loadAdError);
                    RelativeLayout layout = bottomSheetDialog.findViewById(R.id.layout);
                    CardView exitCard = bottomSheetDialog.findViewById(R.id.cardExit);
                    layout.setVisibility(View.GONE);
                    exitCard.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                context.finish();
                            } catch (Exception e) {
                                System.exit(0);
                            }
                        }
                    });
                }
            });

            //adContainerView.addView(adView);
            RelativeLayout.LayoutParams adContainerParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
            adContainerParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);

            adContainerView.addView(adView, adContainerParams);
        } else {
            //FrameLayout layout = bottomSheetDialog.findViewById(R.id.layout);
            RelativeLayout layout = bottomSheetDialog.findViewById(R.id.layout);
            CardView exitCard = bottomSheetDialog.findViewById(R.id.cardExit);
            layout.setVisibility(View.GONE);
            exitCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        context.finish();
                    } catch (Exception e) {
                        System.exit(0);
                    }
                }
            });
//            System.exit(0);

        }

        bottomSheetDialog.show();
    }
    ///////////////////////////ask for rating
    public static void askRatings(Activity mContext) {
        ReviewManager manager = ReviewManagerFactory.create(mContext);
        Task<ReviewInfo> request = manager.requestReviewFlow();
        request.addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                // We can get the ReviewInfo object
                ReviewInfo reviewInfo = task.getResult();
                Task<Void> flow = manager.launchReviewFlow(mContext, reviewInfo);
                flow.addOnCompleteListener(task2 -> {
                    // The flow has finished. The API does not indicate whether the user
                    // reviewed or not, or even whether the review dialog was shown. Thus, no
                    // matter the result, we continue our app flow.
                    //  mPrefUtils.saveBoolean("isreviewd",true);
                });
            } else {
                // There was some problem, continue regardless of the result.
            }
        });
    }

    public static void hideBottomNavigation(final Activity context) {
        // Get the root view of your activity
        View decorView = context.getWindow().getDecorView();

// Hide the navigation bar
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);

    }

    ////////////////////////////////
    public static boolean isStoragePermisson(Activity mActivity) {
        boolean isPermissongranted = false;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(mActivity, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                Log.v("TAG", "Permission is granted");
                // Do the file write
                //Toast.makeText(mActivity, "granted", Toast.LENGTH_SHORT).show();
                isPermissongranted = true;
            } else {
                isPermissongranted = false;
                Log.v("TAG", "Permission is revoked");
                // Toast.makeText(mActivity, "removed", Toast.LENGTH_SHORT).show();
                ActivityCompat.requestPermissions(mActivity, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
            }
        } else {
            isPermissongranted = true;
            //permission is automatically granted on sdk<23 upon installation
            Log.v("TAG", "Permission is granted");
            ///  Toast.makeText(mActivity, "not granted", Toast.LENGTH_SHORT).show();
            // Do the file write
        }
        return isPermissongranted;

    }

}
