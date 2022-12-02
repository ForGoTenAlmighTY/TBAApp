package com.example.tbaapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class loginAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;



    public loginAdapter( FragmentManager fm, Context context, int totalTabs) {
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    public Fragment getItem(int position){
        switch (position){
            case 0:
                logintab_frag logintabFrag= new logintab_frag();
                return logintabFrag;
            case 1:
                signintab_frag  signintabFrag= new signintab_frag();
                return signintabFrag;
            default:
                return null;

        }
    }
}
