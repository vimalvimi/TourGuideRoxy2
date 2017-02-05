package com.example.android.tourguideroxy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class StatesFragment extends Fragment {

    public static final String NAME = "States";

    public StatesFragment() {
        //EMPTY REQUIRED
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_type_two, container, false);

        ArrayList<ModuleCustomClass> words = new ArrayList<>();

        words.add(new ModuleCustomClass(getString(R.string.andaman), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.andhra), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.arunacha), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.assam), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.bihar), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.chandigarh), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.chhattisgarh), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.dadra), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.daman), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.delhi), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.goa), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.gujarat), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.haryana), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.himachal), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.jammu), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.jharkhand), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.karnataka), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.kerala), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.lakshadweep), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.madhya), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.Maharashtra), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.manipur), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.meghalaya), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.mizoram), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.nagaland), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.odisha), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.puducherry), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.punjab), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.rajasthan), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.sikkim), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.tamil), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.telangana), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.tripura), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.up), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.uk), R.drawable.bg));
        words.add(new ModuleCustomClass(getString(R.string.westbengal), R.drawable.bg));

        ListView listView = (ListView) rootView.findViewById(R.id.location_lv);
        MyListAdapterTwo tourAdapter = new MyListAdapterTwo(rootView.getContext(), words);
        listView.setAdapter(tourAdapter);

        return rootView;
    }

}