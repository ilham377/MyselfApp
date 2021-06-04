package com.iapps.myselfapp;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iapps.myselfapp.viewModel.profileVM;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Home extends Fragment {

    private View view;
    private profileVM viewModel;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Home.
     */
    // TODO: Rename and change types and number of parameters
    public static Home newInstance(String param1, String param2) {
        Home fragment = new Home();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        viewModel = ViewModelProviders.of((FragmentActivity) getContext()).get(profileVM.class);

        //dao.insert(new homeProfile(1, "Bandung, 16 April 2000", "Muhammad Ilham Apriyadi" ,"Jl. Mendut 4, No M35, RT02/RW18, Kel. Melong, Kec. Cimahi Selatan","Laki-laki","A","10118045","Sayur Bayam","Macha","Ghost - Hoshimachi Suisei","Spider-Man","Bermain game, Membaca komik"));
        TextView nama = view.findViewById(R.id.tv_nama);
        TextView nim = view.findViewById(R.id.tv_nim);
        TextView gender = view.findViewById(R.id.tv_jk);
        TextView alamat = view.findViewById(R.id.tv_alamat);
        TextView goldar = view.findViewById(R.id.tv_goldar);
        TextView ttl = view.findViewById(R.id.tv_ttl);
        TextView lagu = view.findViewById(R.id.tv_music);
        TextView film = view.findViewById(R.id.tv_film);
        TextView makanan = view.findViewById(R.id.tv_makanan);
        TextView minuman = view.findViewById(R.id.tv_minuman);
        TextView hobi = view.findViewById(R.id.tv_hobi);
        String[] strProfile = new String[5];

        nama.setText(viewModel.getProfile().getNama());
        nim.setText(viewModel.getProfile().getNim());
        gender.setText(viewModel.getProfile().getJk());
        alamat.setText(viewModel.getProfile().getAlamat());
        goldar.setText(viewModel.getProfile().getGoldar());
        ttl.setText(viewModel.getProfile().getTtl());
        lagu.setText(viewModel.getProfile().getLagu());
        film.setText(viewModel.getProfile().getFilm());
        makanan.setText(viewModel.getProfile().getMakanan());
        minuman.setText(viewModel.getProfile().getMinuman());
        hobi.setText(viewModel.getProfile().getHoby());

        return view;
    }
}