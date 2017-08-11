package com.example.gaurav.bloodline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gaurav.bloodline.SignUp.SignUp1;

public class MainActivity extends AppCompatActivity {
    private static Button signupbutton ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton() ;
    }

    public void addListenerOnButton(){
        signupbutton = (Button)findViewById(R.id.signupbutton) ;
        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this , SignUp1.class) ;
                startActivity(i);
            }
        });
    }
}
