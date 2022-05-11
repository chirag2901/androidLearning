package com.loginpage;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;
import java.util.Random;

public class MyWhatsAppAdapter extends BaseAdapter {
    Context context;
    ArrayList<GridModel> gridModels;

    ChatFragment chatFragment;

    public MyWhatsAppAdapter(Context context, ArrayList<GridModel> gridModels) {
        this.context = context;
//        this.chatFragment = chatFragment;
        this.gridModels = gridModels;

    }



    @Override
    public int getCount() {
        return gridModels.size();
    }

    @Override
    public Object getItem(int position) {
        return gridModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.raw_grid_practise,null);
        Random random = new Random();

        convertView.setBackgroundColor(random.nextInt());
        ImageView imgData = convertView.findViewById(R.id.img_data1);
        TextView tvData = convertView.findViewById(R.id.tv_data1);
        imgData.setImageResource(gridModels.get(position).getImgLang());
        tvData.setText(gridModels.get(position).getStrLang());
        return convertView;
    }
}
