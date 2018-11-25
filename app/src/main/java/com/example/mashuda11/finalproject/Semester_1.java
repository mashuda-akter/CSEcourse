package com.example.mashuda11.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import static com.example.mashuda11.finalproject.R.id.listView;

public class Semester_1 extends AppCompatActivity {




    private ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_1);
        listView = findViewById(R.id.listView);

      final String[] courseName = getResources().getStringArray(R.array.First);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Semester_1.this,R.layout.sample_view1,R.id.textView,courseName);
   listView.setAdapter(adapter);


   listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
       @Override
       public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



           String  value = courseName[position];
           Toast.makeText(Semester_1.this, "book names and writer names ",Toast.LENGTH_LONG).show();

       }
   });

    }
}
