package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceActivty extends AppCompatActivity implements View.OnClickListener {
    Button bntStart,btnStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_activty);
        bntStart = findViewById(R.id.btnstart);
        btnStop = findViewById(R.id.bntstop);
        btnStop.setOnClickListener(this);
        bntStart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnstart:
                Intent i = new Intent(ServiceActivty.this,MyService.class);
                startService(i);
                break;
            case R.id.bntstop:
                Intent i1 = new Intent(ServiceActivty.this,MyService.class);
                stopService(i1);
                break;
        }
    }
}