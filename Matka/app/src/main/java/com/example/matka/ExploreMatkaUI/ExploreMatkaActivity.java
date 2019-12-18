package com.example.matka.ExploreMatkaUI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.matka.R;

public class ExploreMatkaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        FragmentManager fragmentManager = getSupportFragmentManager();
        ExploreMatkaCenterFragment mainExploreFragment = new ExploreMatkaCenterFragment(fragmentManager);
        fragmentManager.beginTransaction().replace(R.id.frame_layout, mainExploreFragment).commit();
    }
}
