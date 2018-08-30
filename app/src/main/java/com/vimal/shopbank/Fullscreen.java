package com.vimal.shopbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class Fullscreen extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent mainIntent = new Intent(Fullscreen.this, MainActivity.class);
                Fullscreen.this.startActivity(mainIntent);
                Fullscreen.this.finish();
            }

        }, 1000);
    }
}
