package com.example.projectteo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        btn_next = (Button) findViewById(R.id.btn_next);
        btn_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btn_next) {
            i = new Intent(this, EnterNumber.class);
            startActivity(i);
        }
    }
}