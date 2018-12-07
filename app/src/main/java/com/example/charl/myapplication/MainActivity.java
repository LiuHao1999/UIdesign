package com.example.charl.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonLog = (Button) findViewById(R.id.buttonLogIn);
        Button register = (Button) findViewById(R.id.buttonRegister);
        Button buttonWx = (Button) findViewById(R.id.ic_wx);
        Button buttonQQ = (Button) findViewById(R.id.ic_qq);
        Button buttonwb = (Button) findViewById(R.id.ic_wb);
        Button buttonwy = (Button) findViewById(R.id.ic_wy);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LogIn.class);
                startActivity(intent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });
        buttonWx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "再不支持", Toast.LENGTH_SHORT).show();
            }
        });
        buttonQQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "再不支持", Toast.LENGTH_SHORT).show();
            }
        });
        buttonwb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "再不支持", Toast.LENGTH_SHORT).show();
            }
        });
        buttonwy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "再不支持", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
