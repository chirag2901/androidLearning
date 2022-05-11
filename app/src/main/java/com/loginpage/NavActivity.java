package com.loginpage;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.loginpage.databinding.ActivityNavBinding;

import org.jetbrains.annotations.NotNull;

public class  NavActivity extends AppCompatActivity {


    Toolbar toolbar;
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationView = findViewById(R.id.nav_view);
        drawerLayout = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle  actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                int id = item.getItemId();
                if(id == R.id.nav_home){
                    Toast.makeText(NavActivity.this,"Home",Toast.LENGTH_LONG).show();
                    toolbar.setTitle("House");
                    ChatFragment chatFragment = new ChatFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.add(R.id.frame,chatFragment);
                    fragmentTransaction.commit();


                }else if(id == R.id.nav_gallery){
                    Toast.makeText(NavActivity.this,"Gallery",Toast.LENGTH_LONG).show();
                    toolbar.setTitle("Gallery");
                    StatusFragment statusFragment = new StatusFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.add(R.id.frame,statusFragment);
                    fragmentTransaction.commit();

                }
                else if(id == R.id.nav_slideshow){
                Toast.makeText(NavActivity.this,"SlideShow",Toast.LENGTH_LONG).show();
                toolbar.setTitle("SlideShow");
                CallFragment callFragment = new CallFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame,callFragment);
                fragmentTransaction.commit();

            }

                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });

    }

}