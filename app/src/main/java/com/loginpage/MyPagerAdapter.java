package com.loginpage;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    int tabCount;
    public MyPagerAdapter(FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                ChatFragment chatFragment = new ChatFragment();
                return chatFragment;
        case 1:
                StatusFragment statusFragmentFragment = new StatusFragment();
                return statusFragmentFragment;

            case 2:
                CallFragment callFragment = new CallFragment();
                return callFragment;

        }
        return null;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
