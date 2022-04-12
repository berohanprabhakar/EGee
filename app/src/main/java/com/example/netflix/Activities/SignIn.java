package com.example.netflix.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.netflix.Mainscreens.Mainscreen;
import com.example.netflix.R;

import java.util.Timer;
import java.util.TimerTask;

public class SignIn extends AppCompatActivity {

    ProgressBar progressBar;
    TextView signuptextview,forgetpasswordtextview;
    Button signinbutton;
    static int duration=500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sign_in);

        progressBar = findViewById(R.id.signinprogressbar);
        progressBar.setVisibility(View.GONE);
        signuptextview = findViewById(R.id.signuptextview);
        forgetpasswordtextview = findViewById(R.id.forgotpasswordtextview);
        signinbutton = findViewById(R.id.signinbutton);

        signinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                progressBar.setVisibility(View.VISIBLE);
                Intent i = new Intent(SignIn.this, Mainscreen.class);
                startActivity(i);
            }
        });

        signuptextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                progressBar.setVisibility(View.VISIBLE);
                Intent i = new Intent(SignIn.this, SwipeScreen.class);
                startActivity(i);
            }

        });

        forgetpasswordtextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignIn.this, "Forgot Password", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
