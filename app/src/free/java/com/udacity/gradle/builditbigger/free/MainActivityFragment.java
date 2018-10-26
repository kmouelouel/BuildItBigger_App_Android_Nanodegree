package com.udacity.gradle.builditbigger.free;

import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.udacity.gradle.builditbigger.R;

public class MainActivityFragment  extends Fragment {
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_main_fragment, container, false);
        MobileAds.initialize(getActivity().getApplicationContext(), getString(R.string.ad_app_id));

        AdView mAdView = root.findViewById(R.id.adView1);

        AdRequest adRequest = new AdRequest.Builder()
                //.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
        return root;
    }
}
