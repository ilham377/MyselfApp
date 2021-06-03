package com.iapps.myselfapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    //tgl : 16/05/2021
    //NIM : 10118045
    //Nama: Muhammad Ilham Apriyadi
    //Kls : IF-2


    Timer timer;

    Animation topAnim, bottomAnim;
    ImageView image;
    TextView text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        //animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //hooks
        image = findViewById(R.id.gambar);
        text1 = findViewById(R.id.txtmyself);
        text2 = findViewById(R.id.txtapplikasi);

        image.setAnimation(topAnim);
        text2.setAnimation(topAnim);
        text1.setAnimation(bottomAnim);


        //delay
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, WalkthroughActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);

    }
}