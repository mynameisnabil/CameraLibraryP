package com.example.cameralibraryp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cameralib.PrinLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PrinLog.printLog("MainActivity", "onCreate");
    }
}