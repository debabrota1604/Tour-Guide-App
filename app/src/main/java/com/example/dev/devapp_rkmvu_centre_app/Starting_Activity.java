package com.example.dev.devapp_rkmvu_centre_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Starting_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        Button button_proceed = (Button) findViewById(R.id.but_firstActivity);
        button_proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Starting_Activity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
