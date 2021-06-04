package com.iapps.myselfapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

//tgl pengerjaan : 30/05/2021
//Nim : 10118045
//Nama : Muhammad Ilham Apriyadi
//Kelas : IF2/S1/VI
public class DailyFragment extends Fragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ViewPagerAdapter adapter;

    public DailyFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_daily, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.viewpager_profid1);
        tabLayout = (TabLayout) view.findViewById(R.id.tablayout_profid);
        adapter = new ViewPagerAdapter(getChildFragmentManager());
        //adding Fragment
        adapter.AddFragment(new DailyactivityFragment(), "Daily Activity");
        adapter.AddFragment(new FriendlistFragment(), "Friend List");

        //adapter setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        // Inflate the layout for this fragment
        return view;
    }
}