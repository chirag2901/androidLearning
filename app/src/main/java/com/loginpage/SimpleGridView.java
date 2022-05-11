package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SimpleGridView extends AppCompatActivity {
        GridView gridView;

        String strLang[] = {"Android","java","PHP","C","C++"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_grid_view);

        gridView = findViewById(R.id.grid_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.raw_grid,R.id.tv_data,strLang);
        gridView.setAdapter(arrayAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.YELLOW);
            }
        });

    }
}