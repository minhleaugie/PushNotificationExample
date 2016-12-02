package com.example.pushnotificationexample;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class CreateNotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_notification);
    }

    public void createNotification(){
        // Prepare intent which is triggered if the
        // notification is selected
        Intent intent = new Intent(CreateNotificationActivity.this, ReceiveNotificationActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);

        Notification notification = new Notification.Builder(this)
                .setContentTitle("Title")
                .setContentText("Subject").setSmallIcon(R.drawable.ic_donut_large_white_24dp)
                .setContentIntent(pendingIntent)
                .addAction(R.drawable.ic_donut_large_white_24dp, "Call", pendingIntent)
                .addAction(R.drawable.ic_donut_large_white_24dp, "More", pendingIntent)
                .addAction(R.drawable.ic_donut_large_white_24dp, "And more", pendingIntent)
                .build();
    }
}
