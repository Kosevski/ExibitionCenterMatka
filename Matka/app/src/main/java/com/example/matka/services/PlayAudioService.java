package com.example.matka.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.example.matka.MainActivity;
import com.example.matka.R;

public class PlayAudioService extends Service {

    final MediaPlayer mp = MediaPlayer.create(this, R.raw.danceoftheknights);

    @Override
    public void onCreate() {
        super.onCreate();
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        String resultQR = intent.getStringExtra("ResultContents");
        createNotificationChannel();

        Intent notificationIntent = new Intent(this, MainActivity.class);
//        PendingIntent pendingIntent = PendingIntent.getActivity(this,
//                0, notificationIntent, 0);
        PendingIntent notificationPendingIntent;
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addNextIntentWithParentStack(notificationIntent);
        notificationPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        Notification notification = new NotificationCompat.Builder(this, "CHANNEL_ID")
                .setContentTitle("Foreground Service")
                .setContentText(resultQR)
                .setSmallIcon(R.drawable.media_play_icon)
                .setContentIntent(notificationPendingIntent)
                .build();

        startForeground(1, notification);

//        final MediaPlayer mp = MediaPlayer.create(this, R.raw.danceoftheknights);
//        mp.start();

//        stopSelf();

        return START_NOT_STICKY;

//
//        if((intent.getStringExtra("ResultContents"))!=null){
//            if((intent.getStringExtra("ResultContents")).equals("Test")){
//                mp.start();
//            }}

    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    private void createNotificationChannel() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel serviceChannel = new NotificationChannel(
                    "CHANNEL_ID",
                    "Foreground Service Channel",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(serviceChannel);
        }
    }
}
