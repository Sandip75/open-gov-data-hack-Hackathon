package com.example.pc.hack2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class premain extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premain);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(premain.this,MainActivity.class);
                startActivity(home);
                finish();
            }
        },SPLASH_TIME_OUT);

        ImageView image = (ImageView) findViewById(R.id.ivf);

    }
}
