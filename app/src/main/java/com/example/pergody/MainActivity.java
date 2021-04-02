package com.example.pergody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Create(View view) {
        Intent intent = new Intent(this, CreateGoal.class);
        startActivity(intent);
    }

    public void ViewGoal(View view) {
        Intent intent = new Intent(this, View_goals.class);
        startActivity(intent);
    }
}