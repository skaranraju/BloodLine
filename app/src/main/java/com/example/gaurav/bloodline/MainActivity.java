package com.example.gaurav.bloodline;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gaurav.bloodline.SignIn.SignIn1;
import com.example.gaurav.bloodline.SignUp.SignUp1;
import com.example.gaurav.bloodline.SignUp.SplashScreen;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, SignIn1.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
