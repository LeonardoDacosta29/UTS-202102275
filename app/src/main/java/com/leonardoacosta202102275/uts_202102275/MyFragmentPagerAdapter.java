package com.leonardoacosta202102275.uts_202102275;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter
{
    private WebresmiFragment _webresmiFragment = new WebresmiFragment();
    private Context _context;
    private WebinternalFragment _webinternalFragment = new WebinternalFragment();
    private int _tabCount;

    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount)
    {
        super(fragmentManager);

        _context = context;
        _tabCount = tabCount;
    }
    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return _webresmiFragment;
            default:
                return _webinternalFragment;
        }
    }

    @Override
    public int getCount() {
        return _tabCount;
    }
}
