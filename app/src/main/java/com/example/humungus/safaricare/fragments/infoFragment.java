package com.example.humungus.safaricare.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.humungus.safaricare.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class infoFragment extends Fragment {


    public infoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info,container,false);
        return view;
    }

}