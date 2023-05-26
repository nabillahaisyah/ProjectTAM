package com.example.projectteo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Doctorloc2 extends AppCompatActivity {

    private Button btnbackk;
    private ImageView icons8_before_playlist_button_on_a_music_application_48__4__1;
    private ImageView icons8_close_window_48_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorloc2);

        btnbackk = findViewById(R.id.btnback);
        icons8_before_playlist_button_on_a_music_application_48__4__1 = findViewById(R.id.icons8_before_playlist_button_on_a_music_application_48__4__1);
        icons8_close_window_48_2 = findViewById(R.id.icons8_close_window_48_2);

        btnbackk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Doctorloc2.this, DoctorlocMain.class);
            }
        });
        icons8_close_window_48_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent search = new Intent(Doctorloc2.this, Menu.class);
                startActivity(search);
            }
        });
        icons8_before_playlist_button_on_a_music_application_48__4__1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent search = new Intent(Doctorloc2.this, DoctorlocMain.class);
                startActivity(search);
            }
        });

    }
}