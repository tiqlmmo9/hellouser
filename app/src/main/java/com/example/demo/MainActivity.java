package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {

        // get the text to pass
        EditText email = findViewById(R.id.edtEmail);
        EditText password = findViewById(R.id.edtPassword);

        String txtEmail = email.getText().toString();
        String txtPassword = password.getText().toString();

        // start the SecondActivity
        Intent intent = new Intent(this, HelloUser.class);
       intent.putExtra("txtEmail", txtEmail);
        intent.putExtra("txtPassword", txtPassword);
        startActivity(intent);
    }
}