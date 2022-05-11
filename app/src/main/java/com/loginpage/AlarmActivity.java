package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AlarmActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        editText = findViewById(R.id.edt_alarm);
        button = findViewById(R.id.btnalarm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int time = Integer.parseInt(editText.getText().toString());
                Intent intent = new Intent(AlarmActivity.this,MyBroadcast.class);
                PendingIntent pendingIntent = PendingIntent.getBroadcast(AlarmActivity.this,1,intent,PendingIntent.FLAG_ONE_SHOT);
                AlarmManager alarmManager= (AlarmManager) getSystemService(Context.ALARM_SERVICE);
                alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(time*1000),pendingIntent);
            }
        });
    }
}