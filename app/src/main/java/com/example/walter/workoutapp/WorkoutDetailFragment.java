package com.example.walter.workoutapp;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {


    private long workoutId;

    public void setWorkoutId(long id) {
        this.workoutId = id;
    }

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

    @Override
    public void onStart(){
        //always call up to the superclass for lifecycle overrides
        super.onStart();
        //The getView() method gets the fragments root view. we can then use this to get
        //references to the workout title and description text views.
        View view = getView();
        if(view != null){
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Workout workout = Workout.workouts[(int) workoutId];
            title.setText(workout.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());
        }
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putLong("workoutId", workoutId);
    }
    public void setWorkout(long id){
        this.workoutId = id;
    }

}
