package com.course.tvapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdminActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_panel);
        View v = findViewById(R.id.go_back);
        v.setOnClickListener(this);

    }

    @Override
    public void onClick(View arg0) {
        if (arg0.getId() == R.id.go_back) {
            //define a new Intent for the second Activity
            Intent intent = new Intent(this, MainActivity.class);

            //start the second Activity
            this.startActivity(intent);
        }
    }

}
