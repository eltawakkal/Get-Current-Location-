package com.example.eltawakkal.anothergps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    GpsHelper gpshelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gpshelper = new GpsHelper(MainActivity.this, MainActivity.this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        gpshelper.Resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        gpshelper.Pause();
    }

}
