package com.example.dev.devapp_rkmvu_centre_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_OffCampus_Ranchi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_off_campus_ranchi);

        Button openWebsite,viewMap,callForInfo,sendEmail;

        viewMap = (Button) findViewById(R.id.but_RanchiCampus_seeMaps);
        viewMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0,10z?q=RKMVU, Morabadi, Ranchi, Jharkhand"));
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
                else
                {
                    Toast t= Toast.makeText(Activity_OffCampus_Ranchi.this,"Sorry, Map application not found!",Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });

        openWebsite = (Button) findViewById(R.id.but_RanchiCampus_openWebPage);
        openWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.rkmvuranchi.ac.in/"));
                startActivity(i);
            }
        });

        callForInfo = (Button) findViewById(R.id.but_RanchiCampus_Call);
        callForInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:065 1255 2260"));
                startActivity(i);
            }
        });

        sendEmail = (Button) findViewById(R.id.but_RanchiCampus_sendEmail);
        sendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setPackage("com.google.android.gm");

                String to="rkmvu.rch@gmail.com";
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Admission to PG Course");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "I am interested in studying at Vivekananda University. My qualification is ");

                emailIntent.setType("text/plain");
                try {
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                }
                catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(Activity_OffCampus_Ranchi.this, "Sorry, Email client not found!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
