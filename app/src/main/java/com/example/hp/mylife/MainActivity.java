package com.example.hp.mylife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life cycle", "Invoked succefully");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("life cycle", "on start stage");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("life cycle", "on Resume stage");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("life cycle", "on Pause stage");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("life cycle", "on stop stage");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("life cycle", "on Restart stage");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("life cycle", "on finish stage");
    }




}
