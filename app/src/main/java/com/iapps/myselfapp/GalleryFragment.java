package com.iapps.myselfapp;

import android.app.Dialog;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//tgl pengerjaan : 29/05/2021
//Nim : 10118045
//Nama : Muhammad Ilham Apriyadi
//Kelas : IF2/S1/VI
public class GalleryFragment extends Fragment {

    View view;

    GridView gridView;

    ImageView imageView;

    Button btnfull, btnclose;

    ArrayList<Integer> mImageIds = new ArrayList<>(Arrays.asList(
            R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8,
            R.drawable.img9, R.drawable.img10, R.drawable.img11, R.drawable.img12
            ));

    public GalleryFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = (View) inflater.inflate(R.layout.fragment_gallery, container, false);

        gridView = (GridView) view.findViewById(R.id.myGrid);
        gridView.setAdapter(new ImageAdaptor(mImageIds, getContext()));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int item_pos = mImageIds.get(position);

                ShowDialogBox(item_pos);
            }
        });


        // Inflate the layout for this fragment
        return view;
    }

    public void ShowDialogBox(final int item_pos){
        final Dialog dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.cutom_gallerydialog);

        //Getting custom dialog views
        imageView = dialog.findViewById(R.id.img);
        btnfull = dialog.findViewById(R.id.btnfull);
        btnclose = dialog.findViewById(R.id.btnclose);


        //extrating name
        imageView.setImageResource(item_pos);

        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        btnfull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), FullView.class);
                intent.putExtra("img_id", item_pos);
                startActivity(intent);
            }
        });
        dialog.show();
    }
}