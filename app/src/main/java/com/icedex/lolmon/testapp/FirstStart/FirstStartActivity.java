package com.icedex.lolmon.testapp.FirstStart;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.Window;

import com.icedex.lolmon.testapp.R;


public class FirstStartActivity extends FragmentActivity {

    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setExitTransition(new Slide(Gravity.START).setDuration(300));
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first_start);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentPageAdapter pagerAdapter = new FragmentPageAdapter(fragmentManager);
        viewPager.setAdapter(pagerAdapter);

    }
}

