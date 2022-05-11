package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView tvEmail,tvratingbar,tvseekbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvEmail = findViewById(R.id.tv_email);
        tvratingbar = findViewById(R.id.tv_ratingbar);
        tvseekbar= findViewById(R.id.tv_seekbar);
        Intent i = getIntent();
        String str = i.getStringExtra("key email");
        String str1 = i.getStringExtra("key seekbar");
        String str2 = i.getStringExtra("key ratingbar");
        tvEmail.setText("Email "+str);
        tvratingbar.setText("Rating is "+str2);
        tvseekbar.setText("Seekbar value is " + str1);
    }
}