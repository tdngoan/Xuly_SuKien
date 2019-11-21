package com.itnn.xuly_sukien;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Constraints;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView img_hinh;
    Button btn_vang,btn_cam,btn_lam;
    @Override
    public void onClick(View v) {
        if(v==btn_cam) {
            img_hinh.setBackgroundColor(getResources().getColor(R.color.cam));
        }
        if(v==btn_lam){
            img_hinh.setBackgroundColor(getResources().getColor(R.color.lam));
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_xanhla = findViewById(R.id.btn_xanhla);
        Button btn_do = findViewById(R.id.btn_do);
        btn_vang = findViewById(R.id.btn_vang);
        btn_cam = findViewById(R.id.btn_cam);
        Button btn_tim = findViewById(R.id.btn_tim);
        btn_lam = findViewById(R.id.btn_lam);
        img_hinh = findViewById(R.id.img_hinh);

        btn_xanhla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_hinh.setBackgroundColor(getResources().getColor(R.color.xanhla));
            }
        });

        btn_cam.setOnClickListener(this);
        btn_lam.setOnClickListener(this);

        btn_vang.setOnClickListener(listener);

        btn_tim.setOnClickListener(new MauTim());
    }

    public void  click_do(View view){
        img_hinh.setBackgroundColor(getResources().getColor(R.color.maudo));
    }

    View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(v==btn_vang) {
                img_hinh.setBackgroundColor(getResources().getColor(R.color.vang));
            }
        }
    };

    class MauTim implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            img_hinh.setBackgroundColor(getResources().getColor(R.color.tim));
        }
    }
}
