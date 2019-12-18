package com.example.matka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.matka.ExploreMatkaUI.ExploreMatkaActivity;
import com.example.matka.ExploreMatkaUI.MapsActivity;
import com.example.matka.VisitMatkaUI.VisitMatkaActivity;

public class MainActivity extends AppCompatActivity {

    private VideoView mVideoView;
    Button explore;
    TextView visit;
    Uri uri;
    ImageView fbIcon, instaIcon, ytIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fbIcon = findViewById(R.id.facebookSocialIcon);
        instaIcon = findViewById(R.id.instagramSocialIcon);
        ytIcon = findViewById(R.id.youtubeSocialIcon);

        fbIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/MatkaExhibitionCenter")));
//                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/<AMS_z1-h7XDrh7z10nIl0sf>")));
            }
        });

        ytIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UC9DqoUpWlJSyIvIDZDOXxuw/")));
            }
        });

        instaIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/matka.exhibition.center")));

            }
        });

        explore = findViewById(R.id.exploreMatkaBtn);
        visit = findViewById(R.id.visitMatkaTV);

        mVideoView = (VideoView) findViewById(R.id.mVideoView);


        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.matkavideo);

        mVideoView.setVideoURI(uri);
        mVideoView.start();

        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });


        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentExplore = new Intent(MainActivity.this, ExploreMatkaActivity.class);
                startActivity(intentExplore);
            }
        });

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVisit = new Intent(MainActivity.this, VisitMatkaActivity.class);
                startActivity(intentVisit);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        mVideoView.setVideoURI(uri);
        mVideoView.start();
    }
}
