package com.example.kmit.hospiceconnect;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EmergencyNumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_numbers);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        TextView police = (TextView) findViewById(R.id.police);
        TextView ambulance = (TextView) findViewById(R.id.ambulance);

        /*
        police.setAutoLinkMask(Linkify.ALL);
        police.setText("100");

        ambulance.setAutoLinkMask(Linkify.ALL);
        ambulance.setText("108");
         */

        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:100"));
                startActivity(intent);
            }
        });

        ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:108"));
                startActivity(intent);
            }
        });
    }
}
