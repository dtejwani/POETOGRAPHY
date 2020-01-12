package com.example.poems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Self_Written extends AppCompatActivity {
    ArrayList<String> notes= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self__written);
        ListView listview= findViewById(R.id.listview);
        notes.add("Work In progress. Will be Out soon");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.simple_item1,R.id.textView,notes);
        listview.setAdapter(arrayAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent= new Intent(getApplicationContext(), note_editor.class );
                intent.putExtra("note id",1);
                startActivity(intent);
            }
        });
    }
}
