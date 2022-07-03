package com.example.weatherapp1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.weatherapp1.MainActivity;
import com.example.weatherapp1.R;

public class SplashActivity extends AppCompatActivity {
    private final int SPLASH_DELAY = 2500;
    private ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setBackgroundDrawable(null);
        initializeView();
        animateLogo();
        goToMainActivity();

    }
    private void animateLogo() {
        Animation fadinAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        fadinAnimation.setDuration(SPLASH_DELAY);
        imgView.startAnimation(fadinAnimation);
    }
    private void initializeView() {
        imgView = findViewById(R.id.imageView);

    }
    private  void goToMainActivity() {
        new Handler().postDelayed(()-> {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        }, SPLASH_DELAY);
    }
}