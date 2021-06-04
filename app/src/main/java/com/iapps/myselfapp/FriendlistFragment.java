package com.iapps.myselfapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


//tgl pengerjaan : 30/05/2021
//Nim : 10118045
//Nama : Muhammad Ilham Apriyadi
//Kelas : IF2/S1/VI
public class FriendlistFragment extends Fragment {


    public FriendlistFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_friendlist, container, false);
    }
}