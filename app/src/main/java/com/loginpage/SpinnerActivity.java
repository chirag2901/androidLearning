package com.loginpage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {
    Spinner spinner;
    String strlang[] ={"Select City","Android","Java","C","C++","IOS",".net"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner = findViewById(R.id.spinner);
//        spinner.setPrompt("Select One");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,strlang){
            @Override
            public View getDropDownView(int position, @Nullable  View convertView, @NonNull  ViewGroup parent) {
                TextView tvData = (TextView)super.getDropDownView(position, convertView, parent);
                //                return super.getDropDownView(position, convertView, parent);
            if(position==0) {
                tvData.setTextColor(Color.GRAY);
            }else {
                tvData.setTextColor(Color.MAGENTA);

            }
                return tvData;

            }
        };

        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position!=0) {
                    String strData = parent.getItemAtPosition(position).toString();
                       Toast.makeText(SpinnerActivity.this, "Item is " + strData, Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}