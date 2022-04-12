package com.example.netflix.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.example.netflix.R;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_SCREE_TIME = 2000;
//    Animation animation;
//    View logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        animation = AnimationUtils.loadAnimation(this,R.anim.zoom);

        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

            getSupportActionBar().hide();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, SignIn.class);

                startActivity(intent);
                finish();
            }
        },SPLASH_SCREE_TIME);
    }
}