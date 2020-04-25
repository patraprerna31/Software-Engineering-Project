package com.example.kmit.hospiceconnect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main1 );

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button next = (Button) findViewById(R.id.button5);
        next.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity1.this, Page0.class );
                startActivity( intent );
            }
        } );
    }
}
