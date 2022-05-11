package com.loginpage;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ChatFragment extends Fragment {
    GridView gridView;
    ArrayList<GridModel> gridModels ;
    String strLang[] =  {"Android","java","PHP","C","C++","IOS","python"};


    int imgLang[] = {R.mipmap.ic_launcher_round,R.drawable.java,R.drawable.php,R.drawable.clan,R.drawable.cpp,R.drawable.ios, R.drawable.python};


    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_chat,container,false);

        gridView = rootView.findViewById(R.id.grid_view);
        gridModels = new ArrayList<GridModel>();
        for(int i =0;i<strLang.length;i++) {

            GridModel Model = new GridModel(strLang[i],imgLang[i]);
            gridModels.add(Model);

        }
        MyWhatsAppAdapter mywhatsAppAdapter = new MyWhatsAppAdapter(getActivity(),gridModels);
        gridView.setAdapter(mywhatsAppAdapter);

        return rootView;
    }


}
