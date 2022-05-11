package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificationActivity extends AppCompatActivity {
    Button btnnotifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        btnnotifi = findViewById(R.id.btnnotification);
        btnnotifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    NotificationChannel notificationChannel =  new NotificationChannel("com.loginpage",getString(R.string.app_name), NotificationManager.IMPORTANCE_DEFAULT);
                    Intent intent = new Intent(NotificationActivity.this,WhatsAppDemoActivity.class);
                    PendingIntent pendingIntent = PendingIntent.getActivity(NotificationActivity.this,11,intent,PendingIntent.FLAG_ONE_SHOT);
                    NotificationCompat.Builder builder =new  NotificationCompat.Builder(NotificationActivity.this);
                    builder.setSmallIcon(R.drawable.ic_email);
                    builder.setContentTitle("LOGINPAGE APPP");
                    builder.setContentText("Message Set");
                    builder.setContentIntent(pendingIntent);
                    builder.setChannelId("com.loginpage");

                    NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                    notificationManager.notify(1,builder.build());
                    notificationManager.createNotificationChannel(notificationChannel);
                }

            }
        });
    }
}