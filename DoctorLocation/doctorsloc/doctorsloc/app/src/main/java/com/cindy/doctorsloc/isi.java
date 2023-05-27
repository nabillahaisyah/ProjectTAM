package com.cindy.doctorsloc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class isi extends AppCompatActivity {

    private Button btnbackk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isi);

        btnbackk = findViewById(R.id.btnback);

        btnbackk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(isi.this, MainActivity.class);

            }
        });

    }
}