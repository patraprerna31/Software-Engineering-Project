package com.example.kmit.hospiceconnect;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class Page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_page3 );

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
