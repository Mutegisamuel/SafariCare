package com.example.humungus.safaricare.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.humungus.safaricare.R;
import com.github.anastr.speedviewlib.AwesomeSpeedometer;

/**
 * A simple {@link Fragment} subclass.
 */
public class homeFragment extends Fragment {

    private AwesomeSpeedometer mAwesomeSpeedometer;



    public homeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);

        //speedDometer code
        mAwesomeSpeedometer= (AwesomeSpeedometer) view.findViewById(R.id.awesomeSpeedometer);


        return view;
    }

}
