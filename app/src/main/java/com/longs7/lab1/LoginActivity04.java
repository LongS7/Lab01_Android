package com.longs7.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login04);
        
        findViewById(R.id.btnRegister).setOnClickListener(v -> {
            Toast.makeText(this, "You clicked login button", Toast.LENGTH_SHORT).show();
        });
    }
}