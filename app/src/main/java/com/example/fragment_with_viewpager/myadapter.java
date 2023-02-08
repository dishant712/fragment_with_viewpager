package com.example.fragment_with_viewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class myadapter extends FragmentPagerAdapter {
    public myadapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if(position==0)
        {
            fragment=new chats();
        }
        if(position==1)
        {
            fragment=new status();
        }
        if(position==2)
        {
            fragment=new calls();
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String s="";
        if(position==0)
        {
            s="Chat";
        }
        if(position==1)
        {
            s="Status";
        }
        if(position==2)
        {
            s="Calls";
        }
        return s;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
