package com.example.dev.devapp_rkmvu_centre_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_OffCampus_Narendrapur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_off_campus_narendrapur);
        Button openWebsite,viewMap,callForInfo,sendEmail;

        viewMap = (Button) findViewById(R.id.but_NarendrapurCampus_seeMaps);
        viewMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0,10z?q=Ramakrishna Mission Ashrama, Narendrapur, Kolkata 700103"));
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

        openWebsite = (Button) findViewById(R.id.but_NarendrapurCampus_openWebPage);
        openWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://narendrapur.rkmvu.ac.in/"));
                startActivity(i);
            }
        });

        callForInfo = (Button) findViewById(R.id.but_NarendrapurCampus_Call);
        callForInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:033 2477 2020"));
                startActivity(i);
            }
        });

        sendEmail = (Button) findViewById(R.id.but_NarendrapurCampus_sendEmail);
        sendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setPackage("com.google.android.gm");

                String to="rkmvundp@gmail.com";
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Admission to PG Course");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "I am interested in studying at Vivekananda University. My qualification is ");

                emailIntent.setType("text/plain");
                try {
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                }
                catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(Activity_OffCampus_Narendrapur.this, "Sorry, Email client not found!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
