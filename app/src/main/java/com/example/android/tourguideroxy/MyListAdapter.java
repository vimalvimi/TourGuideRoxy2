package com.example.android.tourguideroxy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter extends ArrayAdapter<ModuleCustomClass> {

    private Context mContext;

    public MyListAdapter(Context context, ArrayList<ModuleCustomClass> moduleCustomClass) {
        super(context, 0, moduleCustomClass);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ModuleCustomClass myClass = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.location_image);
        imageView.setImageResource(myClass.getImageSource());

        TextView textView = (TextView) convertView.findViewById(R.id.location_text);
        textView.setText(myClass.getName());

        return convertView;
    }
}