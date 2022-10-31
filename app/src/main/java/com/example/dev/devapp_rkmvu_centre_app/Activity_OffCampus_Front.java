package com.example.dev.devapp_rkmvu_centre_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity_OffCampus_Front extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_off_campus_front);

        ImageView iv_belur,iv_narendrapur,iv_kolkata,iv_ranchi,iv_coembatore;

        iv_belur = (ImageView) findViewById(R.id.iv_campus_belurMath);
        iv_narendrapur = (ImageView) findViewById(R.id.iv_campus_narendrapur);
        iv_kolkata = (ImageView) findViewById(R.id.iv_campus_kolkata);
        iv_ranchi = (ImageView) findViewById(R.id.iv_campus_ranchi);
        iv_coembatore = (ImageView) findViewById(R.id.iv_campus_coimbatore);

        iv_belur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_OffCampus_Front.this,Activity_OffCampus_BelurMath.class);
                startActivity(intent);
            }
        });

        iv_narendrapur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_OffCampus_Front.this,Activity_OffCampus_Narendrapur.class);
                startActivity(intent);
            }
        });

        iv_kolkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_OffCampus_Front.this,Activity_OffCampus_AncestralHouse.class);
                startActivity(intent);
            }
        });

        iv_ranchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_OffCampus_Front.this,Activity_OffCampus_Ranchi.class);
                startActivity(intent);
            }
        });

        iv_coembatore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_OffCampus_Front.this,Activity_OffCampus_Coimbatore.class);
                startActivity(intent);
            }
        });
    }
}
