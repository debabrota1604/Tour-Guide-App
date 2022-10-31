package com.example.dev.devapp_rkmvu_centre_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_OffCampus_AncestralHouse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__off_campus__ancestral_house);

        Button openWebsite,viewMap;

        viewMap = (Button) findViewById(R.id.but_AncestralCampus_seeMaps);
        viewMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0,10z?q=Swami Vivekananda's Ancestral House and Cultural Centre"));
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
                else
                {
                    Toast t= Toast.makeText(getApplicationContext(),"Sorry, Map application not found!",Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });

        openWebsite = (Button) findViewById(R.id.but_AncestralCampus_openWebPage);
        openWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://rkmsvh.org/site/"));
                startActivity(i);
            }
        });
    }
}
