package com.example.projectteo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificationActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_allow, btn_dont_allow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        btn_allow = (Button) findViewById(R.id.button_allow);
        btn_dont_allow = (Button) findViewById(R.id.button_dont_allow);
        btn_allow.setOnClickListener(this);
        btn_dont_allow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.button_allow) {
            i = new Intent(this, Menu.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.button_dont_allow) {
            i = new Intent(this, Menu.class);
            startActivity(i);
        }
    }
}