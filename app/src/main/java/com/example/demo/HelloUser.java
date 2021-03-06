package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HelloUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_user);

        // get the text from MainActivity
        Intent intent = getIntent();
        String email = intent.getStringExtra("txtEmail");

        String password = intent.getStringExtra("txtPassword");

        // use the text in a TextView
        TextView txtEmail = findViewById(R.id.txtEmail);
        txtEmail.setText(email);
        TextView txtPassword = findViewById(R.id.txtPassword);
        txtPassword.setText(password);
    }
}