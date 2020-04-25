package com.example.kmit.hospiceconnect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_page2 );

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button b = (Button) findViewById( R.id.button3 );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( Page2.this, Page3.class ) );
            }
        } );
    }
}
