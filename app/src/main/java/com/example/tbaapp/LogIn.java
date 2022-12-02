package com.example.tbaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class LogIn extends AppCompatActivity {

    TabLayout tab ;
    ViewPager view;
    float j=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        tab = findViewById(R.id.tablayout);
        view = findViewById(R.id.viewPager);

        tab.addTab(tab.newTab().setText("Log-In"));
        tab.addTab(tab.newTab().setText("Sign-In"));
        tab.setTabGravity(TabLayout.GRAVITY_FILL);

        final loginAdapter adapter = new loginAdapter(getSupportFragmentManager(), this, tab.getTabCount());
        view.setAdapter(adapter);

        view.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));
    }
}