package com.example.android.tourguideroxy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LocationsFragment extends Fragment {

    public static final String NAME = "Monuments";

    public LocationsFragment() {
        //EMPTY REQUIRED
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_type_one, container, false);

        ArrayList<ModuleCustomClass> words = new ArrayList<>();

        words.add(new ModuleCustomClass(getString(R.string.taj), R.drawable.taj));
        words.add(new ModuleCustomClass(getString(R.string.golden), R.drawable.golden));
        words.add(new ModuleCustomClass(getString(R.string.hawa), R.drawable.hawa));
        words.add(new ModuleCustomClass(getString(R.string.igate), R.drawable.igate));
        words.add(new ModuleCustomClass(getString(R.string.minar), R.drawable.minar));
        words.add(new ModuleCustomClass(getString(R.string.mysorepalace), R.drawable.mysorepalace));
        words.add(new ModuleCustomClass(getString(R.string.ltemple), R.drawable.ltemple));

        ListView listView = (ListView) rootView.findViewById(R.id.location_lv);
        MyListAdapter tourAdapter = new MyListAdapter(rootView.getContext(), words);
        listView.setAdapter(tourAdapter);

        return rootView;
    }

}
