package com.example.poems;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button HindiText = (Button) findViewById(R.id.HindiText);
        HindiText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent= new Intent(getApplicationContext(),SecondHindi.class);
                startActivity(startIntent);
            }
        });
        Button thought = findViewById(R.id.thought);
        thought.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent thoughtIntent = new Intent(getApplicationContext(),second_thought_of_day.class);
            startActivity(thoughtIntent);
            }
        });
        Button EnglishText= (Button)findViewById(R.id.EnglishText);
        EnglishText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startEnglishIntent = new Intent(getApplicationContext(), SecondEnglish.class);
                startActivity(startEnglishIntent);
            }
        });
        Button self= (Button)findViewById(R.id.self);
        self.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startNotesIntent = new Intent(getApplicationContext(), Self_Written.class);
                startActivity(startNotesIntent);
            }
        });
    }


}
