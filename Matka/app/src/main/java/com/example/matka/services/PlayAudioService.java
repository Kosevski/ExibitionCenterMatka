package com.example.matka.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import android.widget.RemoteViews;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.example.matka.R;

public class PlayAudioService extends Service {

    private MediaPlayer mp;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("PlayAudioService", "onStartCommand");
        String resultQR = intent.getStringExtra("ResultContents");
        createNotificationChannel();

        Intent stopIntent = new Intent(this, StopPlayerBroadcastReceiver.class);
        PendingIntent stopPendingIntent = PendingIntent.getBroadcast(this, 0, stopIntent, 0);

        RemoteViews contentView = new RemoteViews(getPackageName(), R.layout.notification_layout);

        contentView.setOnClickPendingIntent(R.id.stop_audio, stopPendingIntent);
        Notification notification = new NotificationCompat.Builder(this, "CHANNEL_ID")
//                .setContentTitle("Foreground Service")
//                .setContentText(resultQR)
                .setSmallIcon(R.drawable.logo)
                .setStyle(new NotificationCompat.DecoratedCustomViewStyle())
                .setCustomContentView(contentView)
                .build();

        if ((intent.getStringExtra("ResultContents")) != null) {
            switch ((intent.getStringExtra("ResultContents"))) {
                case "citati_od_naucnici":
                    mp = MediaPlayer.create(this, R.raw.citati_od_naucnici);
                    mp.start();
                    startForeground(1, notification);
                    break;
                case "elektrifikacija_vo_mk":
                    mp = MediaPlayer.create(this, R.raw.elektrifikacija_vo_mk);
                    mp.start();
                    startForeground(1, notification);
                    break;
                case "kontrolna_soba":
                    mp = MediaPlayer.create(this, R.raw.kontrolna_soba);
                    mp.start();
                    startForeground(1, notification);
                    break;
                case "maketa_na_elektrodistributiven_sistem":
                    mp = MediaPlayer.create(this, R.raw.maketa_na_elektrodistributiven_sistem);
                    mp.start();
                    startForeground(1, notification);
                    break;
                case "mapa_na_elektrifikacija":
                    mp = MediaPlayer.create(this, R.raw.mapa_na_elektrifikacija);
                    mp.start();
                    startForeground(1, notification);
                    break;
                case "masinska_sala":
                    mp = MediaPlayer.create(this, R.raw.masinska_sala);
                    mp.start();
                    startForeground(1, notification);
                    break;
                case "originalen_alat":
                    mp = MediaPlayer.create(this, R.raw.originalen_alat);
                    mp.start();
                    startForeground(1, notification);
                    break;
                case "plazma_paneli":
                    mp = MediaPlayer.create(this, R.raw.plazma_paneli);
                    mp.start();
                    startForeground(1, notification);
                    break;
                case "plazma_topka":
                    mp = MediaPlayer.create(this, R.raw.plazma_topka);
                    mp.start();
                    startForeground(1, notification);
                    break;
                case "transformator":
                    mp = MediaPlayer.create(this, R.raw.transformator);
                    mp.start();
                    startForeground(1, notification);
                    break;
                case "upotreba_na_elektricna_energija_vo_svetot":
                    mp = MediaPlayer.create(this, R.raw.upotreba_na_elektricna_energija_vo_svetot);
                    mp.start();
                    startForeground(1, notification);
                    break;
                case "veternica":
                    mp = MediaPlayer.create(this, R.raw.veternica);
                    mp.start();
                    startForeground(1, notification);
                    break;
            }
        }
        return START_NOT_STICKY;
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mp != null) {
            mp.stop();
        }
        stopForeground(true);
    }
    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel serviceChannel = new NotificationChannel(
                    "CHANNEL_ID",
                    "Foreground Service Channel",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            NotificationManager manager = getSystemService(NotificationManager.class);
            if (manager != null) {
                manager.createNotificationChannel(serviceChannel);
            }
        }
    }
    public static class StopPlayerBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            context.stopService(new Intent(context, PlayAudioService.class));
        }
    }
}