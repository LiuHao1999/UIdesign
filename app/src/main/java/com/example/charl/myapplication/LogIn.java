package com.example.charl.myapplication;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

public class LogIn extends AppCompatActivity {
    public static String phoneNumber;
    public static String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        final EditText editText1 = (EditText) findViewById(R.id.editText1);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);

        Button buttonBack = (Button) findViewById(R.id.buttonBack);
        Button buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNumber = editText1.getText().toString();
                password = editText2.getText().toString();

                if (phoneNumber.equals("18227663110") && password.equals("admin")) {
                    Toast.makeText(LogIn.this, "登陆成功", Toast.LENGTH_SHORT).show();
                } else {
                    if (phoneNumber.length() != 11) {
                        Toast.makeText(LogIn.this, "电话号码为11位", Toast.LENGTH_SHORT).show();
                    } else if (password.length() < 5) {
                        Toast.makeText(LogIn.this, "密码小于6字符", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(LogIn.this, "密码错误", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
