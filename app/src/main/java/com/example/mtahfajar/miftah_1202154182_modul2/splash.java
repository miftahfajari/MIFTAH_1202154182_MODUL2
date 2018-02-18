package com.example.mtahfajar.miftah_1202154182_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class splash extends AppCompatActivity {


    private TextView tv,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_splash);

        tv = (TextView) findViewById(R.id.judul);
        tv2 = (TextView) findViewById(R.id.judul2);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        tv.startAnimation(myanim);
        tv2.startAnimation(myanim);

        final Intent i = new Intent(this, menuUtama.class);

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}