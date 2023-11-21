package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnstop, btnstart;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add onClick Listener
        btnstart=findViewById(R.id.startactivty);
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Service started", Toast.LENGTH_SHORT).show();
                startService(new Intent(MainActivity.this, Services.class));

            }
        });

        //onClick Listener
        btnstop=findViewById(R.id.stopservice);
        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Service Stop", Toast.LENGTH_SHORT).show();
                stopService(new Intent(MainActivity.this, Services.class));
            }
        });
    }
}