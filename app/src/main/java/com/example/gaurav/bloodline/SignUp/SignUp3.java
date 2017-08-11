package com.example.gaurav.bloodline.SignUp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.gaurav.bloodline.R;

public class SignUp3 extends AppCompatActivity {
    private static Button yes , no ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up3);
        addListenerOnButton();
    }

    public void addListenerOnButton()
    {
        yes = (Button)findViewById(R.id.yes1) ;
        no = (Button)findViewById(R.id.no1) ;

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = "Yes" ;
                Toast.makeText(SignUp3.this , "You Chose To Help Your Neighbours :)", Toast.LENGTH_SHORT).show() ;
                int DELAY = 1000;

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(SignUp3.this , SplashScreen.class) ;
                        startActivity(i) ;
                    }
                }, DELAY);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer="No" ;
                Toast.makeText(SignUp3.this , "You Can Anytime Change Your Decision :)", Toast.LENGTH_SHORT).show() ;
                int DELAY = 1000;

                Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(SignUp3.this , SplashScreen.class) ;
                        startActivity(i) ;
                    }
                }, DELAY);
            }
        });
    }
}
