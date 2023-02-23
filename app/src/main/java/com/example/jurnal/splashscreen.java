package com.example.jurnal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        int SPLASH_SCREEN_TIME_OUT = 3000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a = new Intent(splashscreen.this, utama.class);
                startActivity(a);
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}
