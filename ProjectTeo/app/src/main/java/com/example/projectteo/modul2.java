
	 
	/*
     *	This content is generated from the API File Info.
     *	(Alt+Shift+Ctrl+I).
     *
     *	@desc
     *	@file 		iphone_14_plus___1
     *	@date 		Thursday 04th of May 2023 03:33:10 AM
     *	@title 		Page 1
     *	@author
     *	@keywords
     *	@generator 	Export Kit v1.3.figma
     *
     */


    package com.example.projectteo;

    import android.app.Activity;
    import android.content.Intent;
    import android.os.Bundle;


    import android.view.View;
    import android.widget.TextView;
    import android.widget.ImageView;

    public class modul2 extends Activity {


        private View  _bg__iphone_14_plus___1_ek2;
        private View rectangle_29;
        private TextView mengenali_jenis_pelecehan_seksual;
        private ImageView gender_violence_pana_1;
        private TextView information_module;
        private ImageView icons8_before_playlist_button_on_a_music_application_48__4__2;
        private ImageView icons8_close_window_48_2;

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_modul2);


            _bg__iphone_14_plus___1_ek2 = (View) findViewById(R.id._bg__iphone_14_plus___1_ek2);
            rectangle_29 = (View) findViewById(R.id.rectangle_29);
            mengenali_jenis_pelecehan_seksual = (TextView) findViewById(R.id.mengenali_jenis_pelecehan_seksual);
            gender_violence_pana_1 = (ImageView) findViewById(R.id.gender_violence_pana_1);
            information_module = (TextView) findViewById(R.id.information_module);
            icons8_before_playlist_button_on_a_music_application_48__4__2 = (ImageView) findViewById(R.id.icons8_before_playlist_button_on_a_music_application_48__4__2);
            icons8_close_window_48_2 = (ImageView) findViewById(R.id.icons8_close_window_48_2);

            icons8_close_window_48_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent search = new Intent(modul2.this, Menu.class);
                    startActivity(search);
                }
            });
            icons8_before_playlist_button_on_a_music_application_48__4__2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent search = new Intent(modul2.this, modul.class);
                    startActivity(search);
                }
            });
            //custom code goes here

        }
    }
	
	