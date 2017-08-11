package com.example.gaurav.bloodline.SignUp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.gaurav.bloodline.R;

public class SignUp1 extends AppCompatActivity {
    private static ImageButton next ;
    private static EditText name , user , email , pass , passconfirm ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up1);
        addListenerOnClick();
    }

    public void addListenerOnClick()
    {
        name = (EditText)findViewById(R.id.nameedit) ;
        user = (EditText)findViewById(R.id.useredit) ;
        email = (EditText)findViewById(R.id.emailedit) ;
        pass = (EditText)findViewById(R.id.passedit) ;
        passconfirm = (EditText)findViewById(R.id.passconfirmedit) ;
        next = (ImageButton)findViewById(R.id.fab) ;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = name.getText().toString() ;
                String s2 = user.getText().toString() ;
                String s3 = email.getText().toString() ;
                String s4 = pass.getText().toString() ;
                String s5 = passconfirm.getText().toString() ;
                if ( s1.trim().equals("")|| s2.trim().equals("") || s3.trim().equals("") || s4.trim().equals("") || s5.trim().equals("") ) {
                    Toast.makeText( SignUp1.this , "Please Don't Leave any field Vacant" , Toast.LENGTH_LONG).show() ;
                }
                else {
                    if ( s4.equals(s5) ) {
                        Intent i = new Intent(SignUp1.this, SignUp2.class);
                        startActivity(i);
                    }
                    else {
                        Toast.makeText(SignUp1.this , "Password Doesn't match" , Toast.LENGTH_SHORT ).show() ;
                    }
                }
            }
        });
    }
}
