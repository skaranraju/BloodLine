package com.example.ibrahim.bloodline;

import android.app.PendingIntent;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NewEmergency extends AppCompatActivity {
    Sqldb sqldbobj;

    EditText bgrp, number;
    String bgrps, contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_emergency);
        bgrp=(EditText)findViewById(R.id.bgroup);
        number=(EditText)findViewById(R.id.contact);
        take_inp();

    }
    public void take_inp()
    {

        bgrps = bgrp.getText().toString();
        contacts = number.getText().toString();
    }

    public void messageBroad(String numb)
    {
        String msg=bgrps+" Blood group urgently needed\n contact: "+contacts;

        //Getting intent and PendingIntent instance
        Intent intent=new Intent(this.getApplicationContext(),NewEmergency.class);
        PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0, intent,0);

        //Get the SmsManager instance and call the sendTextMessage method to send message
        SmsManager sms=SmsManager.getDefault();
        sms.sendTextMessage(numb, null, msg, pi,null);

        Toast.makeText(getApplicationContext(), "Message sent for help!",
                Toast.LENGTH_LONG).show();
    }
    public void help(View view)
    {
        Sqldb dbs=new Sqldb(this);
        dbs = dbs.open();
        String num[]=sqldbobj.Get_Phon();
        for(int i=0; i<num.length; i++)
        {
            messageBroad(num[i]);
        }
    }

}
