package com.manuni.fragmentlifecyclewithactivity;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class LifeCycleFragment extends Fragment {

    public static final String TAG = "MyTag";

    public LifeCycleFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach: called.");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: called.");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: called.");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_life_cycle, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated: called.");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: called.");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: called.");
        Log.d(TAG, "what happened : And from now Activity and Fragment Running... ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: called.");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: called.");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView: called.");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: called.");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach: called.");
    }
}