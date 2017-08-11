package com.example.gaurav.bloodline.SignIn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gaurav.bloodline.R;
import com.example.gaurav.bloodline.SignUp.SignUp1;
import com.example.gaurav.bloodline.SignUp.SplashScreen;
import com.example.gaurav.bloodline.lists.ClinicList;
import com.example.gaurav.bloodline.lists.MedicineList;

public class SignIn1 extends AppCompatActivity {
    private static TextView signuptext ;
    private static EditText username , password ;
    private static Button signin ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in1);
        addListenerOnClick() ;
    }

    public void addListenerOnClick() {
        username = (EditText)findViewById(R.id.useredit) ;
        password = (EditText)findViewById(R.id.passedit) ;
        signuptext = (TextView)findViewById(R.id.signuptext) ;
        signin = (Button)findViewById(R.id.button) ;
        signuptext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignIn1.this , SignUp1.class) ;
                startActivity(i) ;
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = username.getText().toString() ;
                String s2 = password.getText().toString() ;
                if ( s1.trim().equals("") || s2.trim().equals("")) {
                    Toast.makeText(SignIn1.this , "Please fill all the fields" , Toast.LENGTH_SHORT).show() ;
                }
                else {
                    Intent in = new Intent(SignIn1.this, ClinicList.class);
                    startActivity(in);
                }
            }
        });
    }
}
