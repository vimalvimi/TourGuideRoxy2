package com.example.android.tourguideroxy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsFragment extends Fragment {

    public static final String NAME = "Events";

    public EventsFragment() {
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

        words.add(new ModuleCustomClass(getString(R.string.imagica), R.drawable.imagica));
        words.add(new ModuleCustomClass(getString(R.string.sunidhi), R.drawable.sunidhi));
        words.add(new ModuleCustomClass(getString(R.string.hotairbaloon), R.drawable.hotairballoon));
        words.add(new ModuleCustomClass(getString(R.string.kayaking), R.drawable.kayaking));
        words.add(new ModuleCustomClass(getString(R.string.yoga), R.drawable.yoga));

        ListView listView = (ListView) rootView.findViewById(R.id.location_lv);
        MyListAdapter tourAdapter = new MyListAdapter(rootView.getContext(), words);
        listView.setAdapter(tourAdapter);

        return rootView;
    }

}