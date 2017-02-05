package com.example.android.tourguideroxy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    public static final String NAME = "Top Foods";

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_type_one, container, false);

        ArrayList<ModuleCustomClass> words = new ArrayList<>();

        words.add(new ModuleCustomClass(getString(R.string.dhokla), R.drawable.dhokla));
        words.add(new ModuleCustomClass(getString(R.string.jalebi), R.drawable.jalebi));
        words.add(new ModuleCustomClass(getString(R.string.samosa), R.drawable.samosa));
        words.add(new ModuleCustomClass(getString(R.string.bhelpuri), R.drawable.bhelpuri));
        words.add(new ModuleCustomClass(getString(R.string.lassi), R.drawable.lassi));
        words.add(new ModuleCustomClass(getString(R.string.naan), R.drawable.naan));
        words.add(new ModuleCustomClass(getString(R.string.dosa), R.drawable.dosa));

        ListView listView = (ListView) rootView.findViewById(R.id.location_lv);
        MyListAdapter tourAdapter = new MyListAdapter(rootView.getContext(), words);
        listView.setAdapter(tourAdapter);

        return rootView;
    }

}