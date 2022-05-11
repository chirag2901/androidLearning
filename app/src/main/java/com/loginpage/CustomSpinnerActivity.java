package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;

public class CustomSpinnerActivity extends AppCompatActivity {

    Spinner spinner;
    String countriesName[] = {"Select Option","Australia","India","Netherlands","Sri lanka"};
    int countriesImage[] = {R.drawable.ic_launcher_background,R.drawable.ic_australia,R.drawable.ic_india,R.drawable.ic_netherlands,R.drawable.ic_srilanka};
    int pos;
    ArrayList<CountryModel1> countryModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner);
        spinner = findViewById(R.id.spinner);
        countryModelArrayList = new ArrayList<CountryModel1>();

        for(int i=0 ;i<countriesName.length;i++){

            CountryModel1 countryModel = new CountryModel1(countriesName[i],countriesImage[i]);
            countryModelArrayList.add(countryModel);

        }
        MySpinnerAdapter mySpinnerAdapter = new MySpinnerAdapter(this,countryModelArrayList);
        spinner.setAdapter((SpinnerAdapter) mySpinnerAdapter);

    }
}