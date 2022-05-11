package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.GridView;

public class SplashActivity extends AppCompatActivity {
    int time = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
            Intent i =new Intent(SplashActivity.this, AlarmActivity.class);
            startActivity(i);
            finish();
          }
      },time);
    }
}