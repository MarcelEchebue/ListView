package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CountryListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> countryNames;
    private ArrayList<Integer> countryImages;

    public CountryListAdapter(Context context, ArrayList<String> countryNames, ArrayList<Integer> countryImages) {
        this.context = context;
        this.countryNames = countryNames;
        this.countryImages = countryImages;
    }

    @Override
    public int getCount() {
        return countryNames.size();
    }

    @Override
    public Object getItem(int position) {
        return countryNames.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.countries_list, parent, false);
        }

        ImageView countryImage = convertView.findViewById(R.id.img_country);
        TextView countryName = convertView.findViewById(R.id.tvName);

        countryImage.setImageResource(countryImages.get(position));
        countryName.setText(countryNames.get(position));

        return convertView;
    }

}
