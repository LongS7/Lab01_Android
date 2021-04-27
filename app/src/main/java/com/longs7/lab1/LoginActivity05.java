package com.longs7.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity05 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login05);

        findViewById(R.id.btnRegister).setOnClickListener(v -> {
            Toast.makeText(this, "You clicked register button", Toast.LENGTH_SHORT).show();
        });
    }
}