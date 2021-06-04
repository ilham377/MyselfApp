package com.iapps.myselfapp.DummyData;

import com.iapps.myselfapp.Entity.profile;

import java.util.ArrayList;

public class Profile {
    private static String [] judul ={
            "Alamat",
            "Tempat Tanggal Lahir",
            "Jenis Kelamin",
            "Golongan Darah",
            "Makanan Kesukaan",
            "Minuman Kesukaan",
            "Hobi",
            "Lagu Favorit",
            "Film Favorit"
    };
    private static String [] detail ={
            "Jl. Mendut 4, No M35, RT02/RW18, Kel. Melong, Kec. Cimahi Selatan",
            "Bandung, 16 April 2000",
            "Laki-laki",
            "A",
            "Sayur Bayam",
            "Macha",
            "Bermain game, Membaca komik",
            "Ghost - Hoshimachi Suisei",
            "Spider-man"
    };


    public static ArrayList<profile> getListData(){
        ArrayList<profile> list = new ArrayList<>();
        for (int position = 0; position < judul.length; position++){
            profile prof = new profile();
            prof.setJudul(judul[position]);
            prof.setDetail(detail[position]);
            list.add(prof);
        }
        return list;
    }
}
