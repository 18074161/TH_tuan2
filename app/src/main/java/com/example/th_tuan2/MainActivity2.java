package com.example.th_tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView imgAmnhac, imgMayanh, imgXbox;
    Button btnAdd1, btnAdd2, btnAdd3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imgAmnhac = findViewById(R.id.imgAmnhac);
        imgMayanh = findViewById(R.id.imgMayanh);
        imgXbox = findViewById(R.id.imgXbox);
        btnAdd1 = findViewById(R.id.btnAdd1);
        btnAdd2 = findViewById(R.id.btnAdd2);
        btnAdd3 = findViewById(R.id.btnAdd3);

        Animation amnhac = AnimationUtils.loadAnimation(this,R.anim.anim_amnhac);
        Animation cam = AnimationUtils.loadAnimation(this,R.anim.anim_cam);
        Animation xbox = AnimationUtils.loadAnimation(this,R.anim.anim_xbox);

        btnAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgAmnhac.startAnimation(amnhac);
            }
        });
        btnAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgMayanh.startAnimation(cam);
            }
        });
        btnAdd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgXbox.startAnimation(xbox);
            }
        });
    }
}