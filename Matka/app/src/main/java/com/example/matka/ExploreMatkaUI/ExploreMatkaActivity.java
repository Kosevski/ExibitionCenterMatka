package com.example.matka.ExploreMatkaUI;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.matka.R;

public class ExploreMatkaActivity extends AppCompatActivity {
//    ImageView play, pause, stop, replay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        FragmentManager fragmentManager = getSupportFragmentManager();
        ExploreMatkaCenterFragment mainExploreFragment = new ExploreMatkaCenterFragment(fragmentManager);
        fragmentManager.beginTransaction().replace(R.id.frame_layout, mainExploreFragment).commit();

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.danceoftheknights);

//        play = findViewById(R.id.play_audio);
//        pause = findViewById(R.id.pause_audio);
//        stop = findViewById(R.id.stop_audio);
//        replay =findViewById(R.id.replay_audio);
//
//
//        play.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mp.start();
//            }
//        });
//
//        pause.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mp.pause();
//            }
//        });
//
//        stop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mp.stop();
//            }
//        });
//
//        replay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mp.reset();
//            }
//        });

        if((getIntent().getStringExtra("ResultContents"))!=null){
        if((getIntent().getStringExtra("ResultContents")).equals("Test")){
            mp.start();
            ExploreExpoFragment fragment = new ExploreExpoFragment(getSupportFragmentManager());
            fragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).commit();
        }}
    }
}
