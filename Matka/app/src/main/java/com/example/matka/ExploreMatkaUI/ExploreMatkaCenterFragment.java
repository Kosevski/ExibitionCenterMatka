package com.example.matka.ExploreMatkaUI;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.matka.R;

public class ExploreMatkaCenterFragment extends Fragment {
    FragmentManager fragmentManager;

    public ExploreMatkaCenterFragment(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    public ExploreMatkaCenterFragment() {
        // Required empty public constructor
    }

    View rootView;
    Button historyBtn, expoBtn, videaBtn;
    ImageView perki1, perki2, perki3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main_explore, container, false);

        Toolbar toolbar = rootView.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back_button);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getActivity()!= null) {
                    getActivity().onBackPressed();
                }
            }
        });

        historyBtn = rootView.findViewById(R.id.history);
        expoBtn = rootView.findViewById(R.id.expo);
        videaBtn = rootView.findViewById(R.id.videa);

        historyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExploreMatkaHistoryFragment fragment = new ExploreMatkaHistoryFragment();
                fragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).commit();
            }
        });

        expoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExploreExpoFragment fragment = new ExploreExpoFragment(getFragmentManager());
                fragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).commit();
            }
        });

        videaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideosFragment fragment = new VideosFragment();
                fragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).commit();
            }
        });

        perki1 = rootView.findViewById(R.id.perki1);
        RotateAnimation rotateAnimation = new RotateAnimation(0, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(2500);
        rotateAnimation.setRepeatCount(Animation.INFINITE);

        perki1.startAnimation(rotateAnimation);

        perki2 = rootView.findViewById(R.id.perki2);
        rotateAnimation = new RotateAnimation(0, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(1000);
        rotateAnimation.setRepeatCount(Animation.INFINITE);

        perki2.startAnimation(rotateAnimation);

        perki3 = rootView.findViewById(R.id.perki3);
        rotateAnimation = new RotateAnimation(0, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(3000);
        rotateAnimation.setRepeatCount(Animation.INFINITE);

        perki3.startAnimation(rotateAnimation);

        return rootView;
    }
}
