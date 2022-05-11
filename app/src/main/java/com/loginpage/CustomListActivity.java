package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListActivity extends AppCompatActivity {
    ListView listView;
    String strLang[] =  {"Android","java","PHP","C","C++","IOS","python"};
    int imgLang[] = {R.mipmap.ic_launcher_round,R.drawable.java,R.drawable.php,R.drawable.clan,R.drawable.cpp,R.drawable.ios, R.drawable.python};
    ArrayList<LangModel>  langModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        listView = findViewById(R.id.list_view);
        langModelArrayList = new ArrayList<LangModel>();
        for(int i =0;i<strLang.length;i++) {
            LangModel langModel = new LangModel(strLang[i],imgLang[i]);
            langModelArrayList.add(langModel);
        }

        MyBaseAdapter myBaseAdapter = new MyBaseAdapter(this,langModelArrayList);
        listView.setAdapter(myBaseAdapter);

    }
}