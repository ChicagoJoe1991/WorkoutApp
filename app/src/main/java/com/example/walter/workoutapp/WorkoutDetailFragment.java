package com.example.walter.workoutapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {


    public WorkoutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    //onCreateView() method is called when android needs the fragments layout
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment; the equivalent of the setContentView for activity
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

}
