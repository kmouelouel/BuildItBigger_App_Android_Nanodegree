package com.udacity.gradle.builditbigger.paid;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.android.javajoker.Joker;
import com.udacity.gradle.builditbigger.JokeAsyncTask;
import com.udacity.gradle.builditbigger.R;

public class MainActivityFragment extends Fragment {
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_main_fragment, container, false);
        return root;
    }

}