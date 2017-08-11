package com.example.gaurav.bloodline.lists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.gaurav.bloodline.R;
import com.example.gaurav.bloodline.adapters.Word;
import com.example.gaurav.bloodline.adapters.WordAdapter;

import java.util.ArrayList;

public class ClinicList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic_list);

        ArrayList<Word> word = new ArrayList<Word>() ;
        word.add(new Word("Shree Lakhsmi Dental Care" , "No.132, First Floor (Near Noor Hotel), \nChennai Theni Hwy, Guduvanchery, \nTamil Nadu 603202, India" , "+91 77084 24656" , R.drawable.call)) ;
        word.add(new Word("Nirmal's Eye Clinic" , "Number. 81, Chennai Theni Hwy\n, Defence Colony, Guduvanchery\n, Tamil Nadu 603202, India" , "044 2746 5242" , R.drawable.call)) ;
        word.add(new Word("Apollo Diagnostics" , " # 3,Sakarapani street,GST Road,\nGuduvancheri,Tamilnadu-603202, \nIndia" , "044 2746 5119" , R.drawable.call)) ;
        word.add(new Word("Adarsh Dental Care" , "100 GK Complex, \nChennai Theni Hwy, Guduvanchery, \nTamil Nadu 603202, India" , "99403 27663" , R.drawable.call)) ;
        word.add(new Word("Sri Vinayaga Clinic" , "No.27/3, Nellikuppam Rd, \nNandhivaram, Guduvancheri, \nChennai, Tamil Nadu 603202, India" , "044 6747 8116" , R.drawable.call)) ;
        word.add(new Word("Dakshan Skin Clinic" , "52, Nellikuppam Rd, Nandivaram, \nNellikuppam Rd, Nandivaram, \nGuduvanchery, Tamil Nadu 603202, India" , "89391 52152" , R.drawable.call)) ;

        WordAdapter wordAdapter = new WordAdapter(this , word) ;
        ListView listView = (ListView)findViewById(R.id.listclinicview) ;
        listView.setAdapter(wordAdapter);
    }
}
