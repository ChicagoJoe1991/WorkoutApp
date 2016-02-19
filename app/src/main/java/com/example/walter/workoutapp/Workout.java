package com.example.walter.workoutapp;

/**
 * Created by Walter on 2/19/2016.
 */
public class Workout {
    //each workout has a name and a description; we will create getters for these variables
    private String name;
    private String description;

    //workouts is an array of four workouts
    public static final Workout[] workouts = {
            new Workout("The Limb Loosener",
                    "5 Handstand push-ups/n10 1-legged squats/n15 Pull-ups"),
            new Workout("Core Agony",
                    "100 Pull-ups/n100 Push-ups/n100 Sit-ups/n100 Squats"),
            new Workout("The Wimp Special",
                    "5 Pull-ups/n10 Push-ups/n15 Squats"),
            new Workout("Strength and Length",
                    "500 meter run/n21 x 1.p pound kettleball swing/n21 x pull-ups")
    };

    //each workout has a name and a description
    private Workout(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return this.name;
    }
}
