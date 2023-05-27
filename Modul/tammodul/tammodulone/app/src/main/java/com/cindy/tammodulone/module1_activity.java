
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		module1
	 *	@date 		Thursday 04th of May 2023 03:06:54 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.cindy.tammodulone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class module1_activity extends Activity {

	
	private View _bg__module1_ek2;
	private View rectangle_27;
	private ImageView _10631461_4523758_1;
	private TextView tentang_hiv___aids_yang_perlu_diketahui;
	private TextView hiv_merupakan_singkatan_dari_human_immunodeficiency_virus__artinya___;
	private View rectangle_26;
	private ImageView _9071140_4045246_1;
	private TextView mengenal_perkembangan_reproduksi_manusia;
	private TextView perkembangan_dapat_diartikan_sebagai_serangkaian_perubahan_progresif___;
	private TextView search_for_everything;
	private ImageView icons8_search_24_1;
	private TextView information_module;
	private ImageView reading_book_pana_removebg_preview_2;
	private ImageView icons8_before_playlist_button_on_a_music_application_48__4__1;
	private ImageView icons8_close_window_48_2;
	private Button rectangle_19;
	private EditText rectangle_15;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.module1);

		
		_bg__module1_ek2 = (View) findViewById(R.id._bg__module1_ek2);
		rectangle_27 = (View) findViewById(R.id.rectangle_27);
		_10631461_4523758_1 = (ImageView) findViewById(R.id._10631461_4523758_1);
		tentang_hiv___aids_yang_perlu_diketahui = (TextView) findViewById(R.id.tentang_hiv___aids_yang_perlu_diketahui);
		hiv_merupakan_singkatan_dari_human_immunodeficiency_virus__artinya___ = (TextView) findViewById(R.id.hiv_merupakan_singkatan_dari_human_immunodeficiency_virus__artinya___);
		rectangle_26 = (View) findViewById(R.id.rectangle_26);
		_9071140_4045246_1 = (ImageView) findViewById(R.id._9071140_4045246_1);
		mengenal_perkembangan_reproduksi_manusia = (TextView) findViewById(R.id.mengenal_perkembangan_reproduksi_manusia);
		perkembangan_dapat_diartikan_sebagai_serangkaian_perubahan_progresif___ = (TextView) findViewById(R.id.perkembangan_dapat_diartikan_sebagai_serangkaian_perubahan_progresif___);
		rectangle_15 = (EditText) findViewById(R.id.rectangle_15);
		rectangle_19 = (Button) findViewById(R.id.rectangle_19);
		icons8_search_24_1 = (ImageView) findViewById(R.id.icons8_search_24_1);
		information_module = (TextView) findViewById(R.id.information_module);
		reading_book_pana_removebg_preview_2 = (ImageView) findViewById(R.id.reading_book_pana_removebg_preview_2);
		icons8_before_playlist_button_on_a_music_application_48__4__1 = (ImageView) findViewById(R.id.icons8_before_playlist_button_on_a_music_application_48__4__1);
		icons8_close_window_48_2 = (ImageView) findViewById(R.id.icons8_close_window_48_2);

		rectangle_15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent search = new Intent(module1_activity.this, iphone_14_plus___1_activity.class);
				startActivity(search);
			}
		});
		
		//custom code goes here
	
	}
}
	
	