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

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        View v = findViewById(R.id.reg_back);
        v.setOnClickListener(this);

    }


    @Override
    public void onClick(View arg0) {
        if (arg0.getId() == R.id.reg_back) {
            //define a new Intent for the second Activity
            Intent intent = new Intent(this, MainActivity.class);

            //start the second Activity
            this.startActivity(intent);
        }
    }

    public void onClickReg(View arg0) {
        EditText nick;
        EditText pass_1;
        EditText pass_2;
        EditText email;
        Button reg;

        nick = findViewById(R.id.nickname);
        pass_1 = findViewById(R.id.password);
        pass_2 = findViewById(R.id.conf_pass);
        email = findViewById(R.id.email);
        reg = findViewById(R.id.reg_in_log);
        if (isEmpty(nick)) {
            nick.setError("Nickname can`t be empty!");
        }

        if (isEmpty(pass_1)) {
            pass_1.setError("Password can`t be empty!");
        }
        if (!isSame(pass_1, pass_2)) {
            pass_2.setError("Passwords must match!");
        }
        if (isEmail(email) == false) {
            email.setError("Enter valid email!");
        }
    }


    boolean isEmail(EditText text) {
        CharSequence e_mail = text.getText().toString();
        return (!TextUtils.isEmpty(e_mail) && Patterns.EMAIL_ADDRESS.matcher(e_mail).matches());
    }

    boolean isSame(EditText text1, EditText text2) {
        CharSequence txt1 = text1.getText().toString();
        CharSequence txt2 = text2.getText().toString();
        if (txt1.equals(txt2)) {
            return true;
        }
        else {
            return false;
        }
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }
}
