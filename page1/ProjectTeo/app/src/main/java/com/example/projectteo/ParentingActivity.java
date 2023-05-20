package com.example.tambal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ParentingActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parenting);
        image = (ImageButton) findViewById(R.id.image);
        image.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.image) {
            i = new Intent(this, activity_parenting2.class);
            startActivity(i);
        }
    }
}