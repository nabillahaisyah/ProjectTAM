package com.example.projectteo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Menu extends AppCompatActivity {
    private CardView modul, docsloc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        modul= findViewById(R.id.information_module_page);
        docsloc = findViewById(R.id.doctors_location_page);

        modul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent search = new Intent(Menu.this, modul.class);
                startActivity(search);
            }
        });
        docsloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent search = new Intent(Menu.this, DoctorlocMain.class);
                startActivity(search);
            }
        });
    }
}