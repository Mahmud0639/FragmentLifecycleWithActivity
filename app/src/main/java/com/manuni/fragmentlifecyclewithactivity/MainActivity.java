package com.manuni.fragmentlifecyclewithactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showLifeCycle(View view) {
        getSupportFragmentManager().beginTransaction().add(R.id.fragContainer,new LifeCycleFragment()).commit();
    }
}