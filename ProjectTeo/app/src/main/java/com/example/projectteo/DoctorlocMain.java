package com.example.projectteo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class DoctorlocMain extends AppCompatActivity {

    private EditText prov, kab, kec;
    private Button btnnext;
    private ImageView icons8_before_playlist_button_on_a_music_application_48__4__1;
    private ImageView icons8_close_window_48_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorloc);

        prov = findViewById(R.id.prov);
        kab = findViewById(R.id.kab);
        kec= findViewById(R.id.kec);
        btnnext = findViewById(R.id.btnnext);
        icons8_before_playlist_button_on_a_music_application_48__4__1 = findViewById(R.id.icons8_before_playlist_button_on_a_music_application_48__4__1);
        icons8_close_window_48_2 = findViewById(R.id.icons8_close_window_48_2);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(DoctorlocMain.this, Doctorloc2.class);

            }
        });
        icons8_close_window_48_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent search = new Intent(DoctorlocMain.this, Menu.class);
                startActivity(search);
            }
        });
        icons8_before_playlist_button_on_a_music_application_48__4__1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent search = new Intent(DoctorlocMain.this, Menu.class);
                startActivity(search);
            }
        });

    }
}