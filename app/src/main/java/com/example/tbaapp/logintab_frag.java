package com.example.tbaapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class logintab_frag extends Fragment {

    EditText Username,Password;
    Button button;int j=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root= (ViewGroup) inflater. inflate(R.layout.logintab_frag,container,false);


        Username =root.findViewById(R.id.txtUsername);
        Password =root. findViewById(R.id.txtPassword);
        button= root.findViewById(R.id.btnLogin);


        Username.setTranslationX(800);
        Password.setTranslationX(800);
        button.setTranslationX(800);


        Username.setAlpha(j);
        Password.setAlpha(j);
        button.setAlpha(j);


        Username.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        Password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        button.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();



        return root;
    }


}
