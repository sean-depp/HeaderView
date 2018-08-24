package com.so.headerview.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.so.headerview.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v) {
        Intent intent = new Intent(MainActivity.this, SActivity.class);
        startActivity(intent);
    }

    public void click2(View v) {
        Intent intent = new Intent(MainActivity.this, SActivity2.class);
        startActivity(intent);
    }
}
