package com.loginpage;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
public class MySpinnerAdapter extends BaseAdapter{
    Context context;
    ArrayList<CountryModel1> countryModelArrayList;

    public MySpinnerAdapter(Context context, ArrayList<CountryModel1> countryModelArrayList) {

        this.context = context;
        this.countryModelArrayList = countryModelArrayList;

    }


    @Override
    public int getCount() {
        return countryModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return countryModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.raw_spinner,null);

        ImageView imageView = convertView.findViewById(R.id.img_data);
        TextView textView = convertView.findViewById(R.id.tv_text);

        imageView.setImageResource(countryModelArrayList.get(position).getCountriesImage());
        textView.setText(countryModelArrayList.get(position).getCountriesName());

        return convertView;
    }
}
