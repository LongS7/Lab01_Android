package com.longs7.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnRegister).setOnClickListener(v -> {
            Intent intent = new Intent(this, LoginActivity04.class);
            startActivity(intent);
        });

        findViewById(R.id.btnRegister).setOnClickListener(v -> {
            Intent intent = new Intent(this, LoginActivity05.class);
            startActivity(intent);
        });
    }
}