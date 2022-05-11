package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WhatsAppActivity extends AppCompatActivity {
    Button btnChat,btnStatus,btnCalls;
    View chats,status,calls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app);
        btnChat = findViewById(R.id.btn_chat);
        btnStatus = findViewById(R.id.btn_status);
        btnCalls = findViewById(R.id.btn_calls);
        chats = findViewById(R.id.view_chats);
        status = findViewById(R.id.view_status);
        calls = findViewById(R.id.view_calls);
        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chats.setVisibility(View.VISIBLE);
                status.setVisibility(View.INVISIBLE);
                calls.setVisibility(View.INVISIBLE);

                ChatFragment chatFragment = new ChatFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame,chatFragment);
                fragmentTransaction.commit();
            }
        });
        btnStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status.setVisibility(View.VISIBLE);
                chats.setVisibility(View.INVISIBLE);
                calls.setVisibility(View.INVISIBLE);
                StatusFragment statusFragment = new StatusFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame,statusFragment);
                fragmentTransaction.commit();
            }
        });
        btnCalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calls.setVisibility(View.VISIBLE);
                chats.setVisibility(View.INVISIBLE);
                status.setVisibility(View.INVISIBLE);
                CallFragment callFragment = new CallFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame,callFragment);
                fragmentTransaction.commit();
            }
        });

    }
}