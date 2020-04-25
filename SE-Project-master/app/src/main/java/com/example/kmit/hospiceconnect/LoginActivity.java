package com.example.kmit.hospiceconnect;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button signinButton;
    EditText username, password;
    TextView errorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        signinButton = findViewById(R.id.button);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        errorText = findViewById(R.id.errorText);

        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().length() > 5 && password.getText().toString() != "") {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    errorText.setText("Error: Invalid username or password!!!");
                }
            }
        });
    }
}
