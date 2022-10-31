package com.example.dev.devapp_rkmvu_centre_app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.suitebuilder.annotation.Suppress;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getIntent();
        Log.i("dev","Main2Activity OnCreate...");

        ArrayList<String> ArrayList_elements = new ArrayList<String>();
        Resources res = getResources();
        Collections.addAll(ArrayList_elements, res.getStringArray(R.array.outline_array));
        // Create the adapter to convert the array to views
        MyArrayAdapter adapter = new MyArrayAdapter(this,R.layout.layout_listview_outline, ArrayList_elements);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.lv_main2Activity);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Log.i("dev","Introduction...");
                    Intent intent = new Intent(Main2Activity.this,Activity_Introduction.class);
                    startActivity(intent);
                }
                else if (position==1){
                    Log.i("dev","Aims and Objectives...");
                    Intent intent = new Intent(Main2Activity.this,Activity_aimsObjectives.class);
                    startActivity(intent);
                }
                else if (position==2){
                    Log.i("dev","Off Campus...");
                    Intent intent = new Intent(Main2Activity.this,Activity_OffCampus_Front.class);
                    startActivity(intent);
                }
            }
        });
    }

    public class MyArrayAdapter extends ArrayAdapter<String> {

        public MyArrayAdapter(Context context, int resource, ArrayList<String> lst) {
            super(context, resource, lst);
            //Log.i("mytag", "in myarrayadapter constructor ");
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //Log.i("dev", "In getview() method, position is " + position);
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());

            View view = layoutInflater.inflate(R.layout.layout_listview_outline, parent, false);

            String item = getItem(position);  //????????????????????
            TextView textView = (TextView) view.findViewById(R.id.tv_listlayout_outline);
            textView.setText(item);

            ImageView imageView = (ImageView) view.findViewById(R.id.iv_listlayout_outline);
            imageView.setImageResource(R.drawable.arrow_icon);

            return view;
        }

    }
}
