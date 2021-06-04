package com.iapps.myselfapp.DummyData;

import com.iapps.myselfapp.Entity.nama;

import java.util.ArrayList;

public class Nama {
    private static String [] nama ={
            "Muhammad Ilham Apriyadi"
    };


    private static String [] nim ={
            "10118045"
    };

    public static ArrayList<com.iapps.myselfapp.Entity.nama> getListData(){
        ArrayList<nama> list = new ArrayList<>();
        for (int position = 0; position < nama.length; position++){
            nama nam = new nama();
            nam.setNama(nama[position]);
            nam.setNim(nim[position]);
            list.add(nam);
        }
        return list;
    }
}
