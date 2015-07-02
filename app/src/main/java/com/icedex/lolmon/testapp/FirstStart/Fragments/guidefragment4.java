package com.icedex.lolmon.testapp.FirstStart.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.icedex.lolmon.testapp.MainActivity;

public class guidefragment4 extends Fragment {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startMain();
    }

    public void startMain() {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
        getActivity().finish();
    }
}
