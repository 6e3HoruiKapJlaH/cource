package com.course.tvapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        View v = findViewById(R.id.reg_in_log);
        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        if (arg0.getId() == R.id.reg_in_log) {
            //define a new Intent for the second Activity
            Intent intent = new Intent(this, RegistrationActivity.class);

            //start the second Activity
            this.startActivity(intent);
        }
    }
    public void onClickLogin(View arg0) {
        EditText nick;
        EditText pass;
        nick = findViewById(R.id.nickname_in_log);
        pass = findViewById(R.id.password_in_log);
        if(nick.getText().toString().equals("admin") && pass.getText().toString().equals("admin")){
            Intent intent = new Intent(this, AdminActivity.class);

            //start the second Activity
            this.startActivity(intent);
        }
    }

}