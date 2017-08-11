package com.example.gaurav.bloodline.SignUp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.gaurav.bloodline.R;

public class SignUp2 extends AppCompatActivity {
    private static Button yes , no ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);
        addListenerOnButton();
    }

    public void addListenerOnButton()
    {
        yes = (Button)findViewById(R.id.yes) ;
        no = (Button)findViewById(R.id.no) ;

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer = "Yes" ;
                Toast.makeText(SignUp2.this , "You Chose To Donate Blood :)", Toast.LENGTH_SHORT).show() ;
                int DELAY = 1000;

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(SignUp2.this , SignUp3.class) ;
                        startActivity(i) ;
                    }
                }, DELAY);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer="No" ;
                Toast.makeText(SignUp2.this , "You Can Anytime Change Your Decision :)", Toast.LENGTH_SHORT).show() ;
                int DELAY = 1000;

                Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(SignUp2.this , SignUp3.class) ;
                        startActivity(i) ;
                    }
                }, DELAY);
            }
        });
    }
}
