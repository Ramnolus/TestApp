package com.icedex.lolmon.testapp.FirstStart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.icedex.lolmon.testapp.FirstStart.Fragments.Fragmentcontrol;
import com.icedex.lolmon.testapp.FirstStart.Fragments.guidefragment2;
import com.icedex.lolmon.testapp.FirstStart.Fragments.guidefragment3;
import com.icedex.lolmon.testapp.FirstStart.Fragments.guidefragment4;

public class FragmentPageAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;

    public FragmentPageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Fragmentcontrol guideFragment1 = new Fragmentcontrol();
                Bundle data = new Bundle();
                data.putInt("current_page", position + 1);
                guideFragment1.setArguments(data);
                return guideFragment1;
            case 1:
                return new guidefragment2();
            case 2:
                return new guidefragment3();
            case 3:
                return new guidefragment4();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {

        return PAGE_COUNT;
    }


}
