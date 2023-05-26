package com.example.projectteo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EnterNumber extends AppCompatActivity implements View.OnClickListener {
    private FloatingActionButton btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_number);
        btn_next = (FloatingActionButton) findViewById(R.id.floatingNextButton);
        btn_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.floatingNextButton) {
            i = new Intent(this, otp_number.class);
            startActivity(i);
        }
    }
}