package com.iapps.myselfapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class ProfileFragment extends Fragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ViewPagerAdapter adapter;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.viewpager_profid);
        tabLayout = (TabLayout) view.findViewById(R.id.tablay_profid);
        adapter = new ViewPagerAdapter(getChildFragmentManager());
        //adding Fragment
        adapter.AddFragment(new AbouFragment(), "About Me");
        adapter.AddFragment(new FindMeFragment(), "Find Me");

        //adapter setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        // Inflate the layout for this fragment
        return view;


    }
}