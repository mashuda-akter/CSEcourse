package com.example.mashuda11.finalproject;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Semester_3 extends AppCompatActivity {

    ExpandableListView expandablelistView;
    HashMap<String, List<String>> listChild;
    List<String> listHeader;
    CustomAdapter customAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_3);


        expandablelistView = (ExpandableListView) findViewById(R.id.expListView);
        listChild = ExpandableListData.getData();

        listHeader = new ArrayList<String>(listChild.keySet());

        customAdapter = new CustomAdapter(this.customAdapter);

        expandablelistView.setAdapter(customAdapter);
    }
}

