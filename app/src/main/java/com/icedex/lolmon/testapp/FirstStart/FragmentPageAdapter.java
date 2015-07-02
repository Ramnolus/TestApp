package com.icedex.lolmon.testapp.FirstStart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.icedex.lolmon.testapp.FirstStart.Fragments.Fragmentcontrol;
import com.icedex.lolmon.testapp.FirstStart.Fragments.guidefragment_2;
import com.icedex.lolmon.testapp.FirstStart.Fragments.guidefragment_3;
import com.icedex.lolmon.testapp.FirstStart.Fragments.guidefragment_4;

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
                return new guidefragment_2();
            case 2:
                return new guidefragment_3();
            case 3:
                return new guidefragment_4();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {

        return PAGE_COUNT;
    }


}
