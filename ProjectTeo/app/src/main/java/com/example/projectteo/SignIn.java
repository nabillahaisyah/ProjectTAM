package com.example.projectteo;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.Intent;

public class SignIn extends AppCompatActivity implements View.OnClickListener{
    private Button btn_sign_in;

    private RelativeLayout create, signin_google;

    private TextView txtView9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        create = (RelativeLayout) findViewById(R.id.relativeLayout2);
        create.setOnClickListener(this);
        btn_sign_in = (Button) findViewById(R.id.button);
        btn_sign_in.setOnClickListener(this);
        txtView9 = (TextView) findViewById(R.id.textView9);
        txtView9.setOnClickListener(this);
        signin_google = (RelativeLayout) findViewById(R.id.relativeLayout3);
        signin_google.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.button) {
            i = new Intent(this, Menu.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.relativeLayout2) {
            i = new Intent(this, SignUpActivity.class);
            startActivity(i);
        }
        else if(view.getId() == R.id.textView9){
            i = new Intent(this, ForgotPasswordActivity.class);
            startActivity(i);
        }
        else if(view.getId() == R.id.relativeLayout3){
            i = new Intent(this, signin_google.class);
            startActivity(i);
        }
    }
}