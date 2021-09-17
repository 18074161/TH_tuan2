package com.example.th_tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class baiTaylorActivity extends AppCompatActivity {
    ImageView imgTaulor, imgnhac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_taylor);
        imgTaulor = findViewById(R.id.imageView3);
        imgnhac = findViewById(R.id.imageView6);

        Animation xoay = AnimationUtils.loadAnimation(this,R.anim.anim_taylor);
        Animation amnhac = AnimationUtils.loadAnimation(this,R.anim.anim_rotate);

        imgTaulor.startAnimation(xoay);
        imgnhac.startAnimation(amnhac);
    }
}