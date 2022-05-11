package com.loginpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyGridAdapter extends BaseAdapter {
    Context context;
    ArrayList<LangModel1> langModel1ArrayList;

    public MyGridAdapter(Context context, ArrayList<LangModel1> langModel1ArrayList) {
        this.context = context;
        this.langModel1ArrayList = langModel1ArrayList;
    }



    @Override
    public int getCount() {
        return langModel1ArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return langModel1ArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.raw_grid_practise,null);
        ImageView imgData = convertView.findViewById(R.id.img_data1);
        TextView tvData = convertView.findViewById(R.id.tv_data1);
        imgData.setImageResource(langModel1ArrayList.get(position).getImgLang());
        tvData.setText(langModel1ArrayList.get(position).getStrLang());
        return convertView;
    }
}
