package com.example.charl.myapplication;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    public static String phoneNumber;
    public static String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        final EditText editText1 = (EditText) findViewById(R.id.phoneNumber);
        final EditText editText2 = (EditText) findViewById(R.id.password);
        Button buttonBack2 = (Button) findViewById(R.id.buttonBack2);
        Button buttonRegister2 = (Button) findViewById(R.id.buttonRegister2);
        buttonBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        buttonRegister2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             phoneNumber   = editText1.getText().toString();
               password = editText2.getText().toString();
                if(phoneNumber.length()!=11){
                    Toast.makeText(Register.this,"电话号码为11位",Toast.LENGTH_SHORT).show();
                }else if(password.length()<5){
                    Toast.makeText(Register.this,"密码小于5字符",Toast.LENGTH_SHORT).show();
                }else {

                }
            }
        });
    }
}
