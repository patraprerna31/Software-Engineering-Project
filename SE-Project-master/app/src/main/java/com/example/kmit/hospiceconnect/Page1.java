package com.example.kmit.hospiceconnect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.DateFormatSymbols;

public class Page1 extends AppCompatActivity {
CalendarView calendarView ;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_page1 );

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button next = (Button) findViewById(R.id.button6);
        Button back = (Button) findViewById( R.id.back1 );
        textView = (TextView) findViewById( R.id.textView7 );
        calendarView = (CalendarView) findViewById( R.id.calendarView );
        calendarView.setOnDateChangeListener( new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                String date = (i1 +1 ) + "/" + ( i2 ) + "/" +i;
                textView.setText( date );
            }


        } );
        next.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Page1.this, Page2.class );
                startActivity( intent );

            }
        } );
        back.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Page1.this, Page0.class );
                startActivity( intent );            }
        } );
    }

    public String getMonth(int month) {
        return new DateFormatSymbols().getMonths()[month-1];
    }
}
