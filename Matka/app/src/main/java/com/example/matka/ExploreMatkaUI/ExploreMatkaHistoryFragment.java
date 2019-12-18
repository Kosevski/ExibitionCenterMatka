package com.example.matka.ExploreMatkaUI;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.matka.R;

public class ExploreMatkaHistoryFragment extends Fragment {

    public ExploreMatkaHistoryFragment() {
        // Required empty public constructor
    }

    View rootView;
    TextView textBody, textNaslov;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       rootView = inflater.inflate(R.layout.fragment_history_matka, container, false);

        Toolbar toolbar = rootView.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back_button);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExploreMatkaCenterFragment mainExploreFragment = new ExploreMatkaCenterFragment(getFragmentManager());
                getFragmentManager().beginTransaction().replace(R.id.frame_layout, mainExploreFragment).commit();
            }
        });

       textBody = rootView.findViewById(R.id.text_body);
       textNaslov = rootView.findViewById(R.id.naslov);

       textNaslov.setText(R.string.istorija_eden_naslov);
       textBody.setText(R.string.istorija_eden_text);

        return rootView;
    }

}
