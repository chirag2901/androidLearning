package com.loginpage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        bottomNavigationView = findViewById(R.id.bottom_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull  MenuItem item) {
                int id = item.getItemId();
                if(id == R.id.add){
//                    Toast.makeText(BottomActivity.this,"Addd",Toast.LENGTH_LONG).show();
                        ChatFragment chatFragment = new ChatFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.add(R.id.home_page,chatFragment);
                    fragmentTransaction.commit();

                }else if(id == R.id.update){
//                    Toast.makeText(BottomActivity.this,"Update",Toast.LENGTH_LONG).show();
                    StatusFragment statusFragment = new StatusFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.add(R.id.home_page,statusFragment);
                    fragmentTransaction.commit();

                }
                else if(id == R.id.setting){
//                    Toast.makeText(BottomActivity.this,"setting",Toast.LENGTH_LONG).show();
                    CallFragment callFragment = new CallFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.add(R.id.home_page,callFragment);
                    fragmentTransaction.commit();
                }
                else{
                    Toast.makeText(BottomActivity.this,"logout",Toast.LENGTH_LONG).show();

                }


                return true;
            }
        });
    }
}