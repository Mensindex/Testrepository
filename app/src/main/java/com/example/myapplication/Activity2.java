package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent i=getIntent();
        if(i !=null) {
            Log.d("MyLog", " Result String : " + i.getStringExtra("key_1") );
            Log.d("MyLog", " Result Int : " + i.getIntExtra("key_2", 0) );
            Log.d("MyLog", " Result Boolean : " + i.getBooleanExtra("key_3", false) );
        }
    }

    public void onClick2(View view) {
        Intent i = new Intent(Activity2.this, Activity3.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}