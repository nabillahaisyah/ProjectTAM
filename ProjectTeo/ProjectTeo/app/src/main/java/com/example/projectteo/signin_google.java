package com.example.projectteo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signin_google extends AppCompatActivity implements View.OnClickListener {
    private Button btn_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_google);
        btn_signin = (Button) findViewById(R.id.button_sign_in);
        btn_signin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.button_sign_in) {
            i = new Intent(this, Menu.class);
            startActivity(i);
        }
    }
}