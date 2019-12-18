package com.example.matka.ExploreMatkaUI;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.matka.R;


public class VideosFragment extends Fragment {


    public VideosFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_videos, container, false);


        RelativeLayout denNaTesla, crtezi, istorijaNaElektrifikacija, energetskaEfikasnost, patotNaStr, kakoSePrenesuvaStr;
        RelativeLayout obnovliviIzvori, shtoeStr;


        Toolbar toolbar = rootView.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back_button);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExploreMatkaCenterFragment mainExploreFragment = new ExploreMatkaCenterFragment(getFragmentManager());
                getFragmentManager().beginTransaction().replace(R.id.frame_layout, mainExploreFragment).commit();
            }
        });

        denNaTesla = rootView.findViewById(R.id.denotnatesla);
        crtezi = rootView.findViewById(R.id.crtezinatesla);
        istorijaNaElektrifikacija = rootView.findViewById(R.id.istorija_na_elektrifikacija);
        energetskaEfikasnost = rootView.findViewById(R.id.energetska_efikasnost);
        patotNaStr = rootView.findViewById(R.id.patot_na_strujata);
        kakoSePrenesuvaStr = rootView.findViewById(R.id.kako_se_prenesuva);
        obnovliviIzvori = rootView.findViewById(R.id.obnovlivi_izvori);
        shtoeStr = rootView.findViewById(R.id.shtoe_struja);


        denNaTesla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ui2-ca-Cr7o")));
            }
        });

        crtezi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=g28xG1R15Lo")));
            }
        });

        istorijaNaElektrifikacija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ci93H59m2IY")));
            }
        });

        energetskaEfikasnost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=u8Yr9vqyU_8")));
            }
        });

        patotNaStr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=mXEulg0a1Yk")));
            }
        });

        kakoSePrenesuvaStr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Y0roxYTwLwQ")));
            }
        });

        obnovliviIzvori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=qwkQVShCklw")));
            }
        });

        shtoeStr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ohWQvr7y93k")));
            }
        });

        return rootView;

    }

}
