package com.iapps.myselfapp;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

//tgl pengerjaan : 26/05/2021
//Nim : 10118045
//Nama : Muhammad Ilham Apriyadi
//Kelas : IF2/S1/VI
public class AbouFragment extends Fragment {


    View view;

    Button btn, btn1, btnabout, btnok;

    ImageButton twitter, youtube, facebook;

    Dialog dialog;

    public AbouFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_abou,container,false);

        //contact
        btn = (Button) view.findViewById(R.id.call_me);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:081394584130");
                Intent it = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(it);
            }
        });

        btn1 = (Button) view.findViewById(R.id.email_me);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"ilham377@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari MyselfApps");

                try {
                    startActivity(Intent.createChooser(intent, "Ingin Mengirim Email?"));
                } catch (android.content.ActivityNotFoundException ex){

                }
            }
        });


        //social media
        twitter = (ImageButton) view.findViewById(R.id.btntwitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://twitter.com/AzusaKyo377");
                Intent it = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(it);
            }
        });

        youtube = (ImageButton) view.findViewById(R.id.btnyoutube);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCIhTmNsyuIX_XwjIj_Qh0yw");
                Intent it = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(it);
            }
        });

        facebook = (ImageButton) view.findViewById(R.id.btnfacebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.facebook.com/AzusaKyo/");
                Intent it = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(it);
            }
        });

        //about
        btnabout = (Button) view.findViewById(R.id.btn_about);
        dialog = (Dialog) new Dialog(getContext());

        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }

            private void openDialog() {
                dialog.setContentView(R.layout.custom_alertdialog);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                btnok=dialog.findViewById(R.id.btn_ok);
                btnok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });


        // Inflate the layout for this fragment

        return view;
    }




}