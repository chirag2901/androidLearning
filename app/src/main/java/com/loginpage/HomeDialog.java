package com.loginpage;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.EditText;
import android.widget.TextView;

public class HomeDialog extends AppCompatActivity {
//    EditText tvdata;
    TextView tvTime;
    TextView tvDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dialog);
//        tvdata = findViewById(R.id.tv_data1);
        tvTime = findViewById(R.id.tv_time);
        tvDate = findViewById(R.id.tv_date);
        Intent i = getIntent();
        String str = i.getStringExtra("key data");
        String time = i.getStringExtra("key time");
        String date = i.getStringExtra("key date");
//        tvdata.setText(" Data : "+str);
        tvTime.setText("Time "+time);
        tvDate.setText("Date : "+date);


    }
}


