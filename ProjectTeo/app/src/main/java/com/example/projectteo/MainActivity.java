package com.example.projectteo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_get_started;
    private TextView txt_sign_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent i = new Intent(this, SignIn.class);
//        startActivity(i);
        btn_get_started = (Button) findViewById(R.id.btn_get_started);
        txt_sign_in = (TextView) findViewById(R.id.tv_sign_in_landing_page);
//        String text = "Sign In";
//        SpannableString ss = new SpannableString(text);
//
//        ClickableSpan clickableSpan1 = new ClickableSpan() {
//            @Override
//            public void onClick(@NonNull View view) {
//
//            }
//        }
        btn_get_started.setOnClickListener(this);
        txt_sign_in.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btn_get_started) {
            i = new Intent(this, SignUpActivity.class);
            startActivity(i);
        }
        else if(view.getId() == R.id.tv_sign_in_landing_page){
            i = new Intent(this, SignIn.class);
            startActivity(i);
        }
    }
}