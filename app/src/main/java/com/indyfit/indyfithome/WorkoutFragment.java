package com.indyfit.indyfithome;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class WorkoutFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    String workout_search_param= "";


    private String mParam1;
    private String mParam2;

    public WorkoutFragment() {

    }


    public static WorkoutFragment newInstance(String param1, String param2) {
        WorkoutFragment fragment = new WorkoutFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View RootView = inflater.inflate(R.layout.fragment_workout, container, false);
        Button workoutSearch = (Button) RootView.findViewById(R.id.button2);
        final EditText searchBar = (EditText) RootView.findViewById(R.id.editTextSearchBar);
        workoutSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                workout_search_param = searchBar.getText().toString().trim();
                Toast.makeText(getActivity(),workout_search_param,Toast.LENGTH_SHORT).show();
                searchDatabase(workout_search_param);
            }// end onClick
        });

        return RootView;
    }

    private void searchDatabase(String param) {
        String query = param;



    }


}