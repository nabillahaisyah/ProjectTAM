package com.example.projectteo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup_notif extends AppCompatActivity implements View.OnClickListener {
    private Button btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_notif);
        btn_start = (Button) findViewById(R.id.button_start);
        btn_start.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.button_start) {
            i = new Intent(this, Menu.class);
            startActivity(i);
        }
    }
}