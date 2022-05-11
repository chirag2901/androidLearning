package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class CustomGridActivity extends AppCompatActivity {
    GridView gridView;
    String strLang[] =  {"Android","java","PHP","C","C++","IOS","python"};
    int imgLang[] = {R.mipmap.ic_launcher_round,R.drawable.java,R.drawable.php,R.drawable.clan,R.drawable.cpp,R.drawable.ios, R.drawable.python};

    ArrayList<LangModel1> langModel1ArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid);
        gridView = findViewById(R.id.grid_view);
        langModel1ArrayList = new ArrayList<LangModel1>();
        for(int i =0;i<strLang.length;i++) {

            LangModel1 langModel1 = new LangModel1(strLang[i],imgLang[i]);
            langModel1ArrayList.add(langModel1);

        }
        MyGridAdapter myGridAdapter = new MyGridAdapter(this,langModel1ArrayList);
        gridView.setAdapter(myGridAdapter);

    }
}