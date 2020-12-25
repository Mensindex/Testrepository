package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final int NAME = 0;
    public static final int SEC_NAME = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && data != null) {
            switch (requestCode) {
                case NAME:
                    Log.d("MyLog", " Result from Activity 2 : " + data.getStringExtra("answer_activity2") );
                    break;
                case SEC_NAME:
                    Log.d("MyLog", " Result from Activity 3 : " + data.getStringExtra("sec_name") );
                    break;
            }

        }
    }

    public void onClick1(View view) {
        Intent i = new Intent(MainActivity.this, Activity2.class);
        i.putExtra("key_1", "Привет");
        i.putExtra("key_2", 100);
        i.putExtra("key_3", true);
        startActivityForResult(i, NAME);
    }

    public void onClick11(View view) {
        Intent i = new Intent(MainActivity.this, Activity3.class);
        i.putExtra("key_1", "Как дела");
        i.putExtra("key_2", 50);
        i.putExtra("key_3", false);
        startActivityForResult(i, SEC_NAME);
    }
}