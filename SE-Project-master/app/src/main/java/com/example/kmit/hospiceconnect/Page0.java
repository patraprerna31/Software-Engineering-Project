package com.example.kmit.hospiceconnect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;

public class Page0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_page0 );

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button b = (Button) findViewById( R.id.book1 );
        Button back = (Button) findViewById( R.id.button13 );
        Button next = (Button) findViewById( R.id.button12 );
        next.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( Page0.this, Page1.class ) );
            }
        } );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( Page0.this, Page1.class ) );
            }
        } );
        back.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( Page0.this, MainActivity.class ) );
            }
        } );
    }
}
