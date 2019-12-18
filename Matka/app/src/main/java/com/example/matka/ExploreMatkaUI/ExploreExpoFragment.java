package com.example.matka.ExploreMatkaUI;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.matka.R;
import com.google.android.material.tabs.TabLayout;
import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.TitlePageIndicator;
import com.viewpagerindicator.UnderlinePageIndicator;

import static com.viewpagerindicator.TitlePageIndicator.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreExpoFragment extends Fragment {

    public ExploreExpoFragment() {
        // Required empty public constructor
    }

    int [] expo_slika_vp;
    String [] expo_naslov_vp;
    String[] expo_textbody_vp;

    View rootView;
    CirclePageIndicator mIndicator;
    ViewPager viewPager;
    PagerAdapter pagerAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       rootView =inflater.inflate(R.layout.fragment_explore_expo, container, false);

        Toolbar toolbar = rootView.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back_button);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExploreMatkaCenterFragment mainExploreFragment = new ExploreMatkaCenterFragment(getFragmentManager());
                getFragmentManager().beginTransaction().replace(R.id.frame_layout, mainExploreFragment).commit();
            }
        });
       expo_slika_vp = new int[] {
               R.drawable.elektrodistributiven_prikaz,
               R.drawable.kontrolna_soba,
               R.drawable.dispecerska_tabla,
               R.drawable.svetilki,
               R.drawable.fotovoltaici,
               R.drawable.veternica,
               R.drawable.vandergraf,
               R.drawable.plazma_topka
       };
        expo_naslov_vp = new String [] {
             getString(R.string.Expo_naslov_1),
               getString(R.string.Expo_naslov_2),
               getString(R.string.Expo_naslov_3),
               getString(R.string.Expo_naslov_4),
               getString(R.string.Expo_naslov_5),
               getString(R.string.Expo_naslov_6),
               getString(R.string.Expo_naslov_7),
               getString(R.string.Expo_naslov_8),
        };
        expo_textbody_vp = new String[] {
                getString(R.string.Expo_text_1),
                getString(R.string.Expo_text_2),
                getString(R.string.Expo_text_3),
                getString(R.string.Expo_text_4),
                getString(R.string.Expo_text_5),
                getString(R.string.Expo_text_6),
                getString(R.string.Expo_text_7),
                getString(R.string.Expo_text_8),
        };
        viewPager = rootView.findViewById(R.id.view_pager);
        pagerAdapter = new ViewPagerAdapter(getContext(), expo_slika_vp, expo_naslov_vp, expo_textbody_vp);
        mIndicator = rootView.findViewById(R.id.page_indicator);
        viewPager.setAdapter(pagerAdapter);
        mIndicator.setViewPager(viewPager);

        return rootView;
    }

}
