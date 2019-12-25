package com.example.matka.ExploreMatkaUI;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.matka.R;
import com.example.matka.scan.MainScannerActivity;
import com.viewpagerindicator.CirclePageIndicator;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreExpoFragment extends Fragment {

    public final int CUSTOMIZED_REQUEST_CODE = 0x0000ffff;
    ImageView play, pause, stop, replay;
    String result;

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

                Button scannerbtn = rootView.findViewById(R.id.scannerbtn);
        scannerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainScannerActivity.class);
                startActivity(intent);
         }
        });



        final MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.danceoftheknights);

        play = rootView.findViewById(R.id.play_audio);
        pause = rootView.findViewById(R.id.pause_audio);
        stop = rootView.findViewById(R.id.stop_audio);
        replay = rootView.findViewById(R.id.replay_audio);


        Bundle bundle = this.getArguments();
        if(bundle!=null){
           result = bundle.getString("ResultContentsKey");
        }

        if (result != null && result.equals("Test")) {
            mp.start();
        }

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });

        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.reset();
            }
        });

        return rootView;
    }


//    public void scanMarginScanner(View view) {
//        IntentIntegrator integrator = new IntentIntegrator(getActivity());
//        integrator.setOrientationLocked(false);
//        integrator.setCaptureActivity(BarcodeCaptureActivity.class);
//        integrator.initiateScan();
//    }

//    @Override
//    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        if (requestCode != CUSTOMIZED_REQUEST_CODE && requestCode != IntentIntegrator.REQUEST_CODE) {
//            // This is important, otherwise the result will not be passed to the fragment
//            super.onActivityResult(requestCode, resultCode, data);
//            return;
//        }
//        switch (requestCode) {
//            case CUSTOMIZED_REQUEST_CODE: {
//                Toast.makeText(getContext(), "REQUEST_CODE = " + requestCode, Toast.LENGTH_LONG).show();
//                break;
//            }
//            default:
//                break;
//        }
//
//        IntentResult result = IntentIntegrator.parseActivityResult(resultCode, data);
//
//        if(result.getContents() == null) {
//            Log.d("MainActivity", "Cancelled scan");
//            Toast.makeText(getContext(), "Cancelled", Toast.LENGTH_LONG).show();
//        } else {
//            Log.d("MainActivity", "Scanned");
//            Toast.makeText(getContext(), "Scanned: " + result.getContents(), Toast.LENGTH_LONG).show();
//        }    }
}

