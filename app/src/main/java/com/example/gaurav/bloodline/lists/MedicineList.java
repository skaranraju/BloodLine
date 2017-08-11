package com.example.gaurav.bloodline.lists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.gaurav.bloodline.R;
import com.example.gaurav.bloodline.adapters.Word;
import com.example.gaurav.bloodline.adapters.WordAdapter;

import java.util.ArrayList;

public class MedicineList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_list);

        ArrayList<Word> word = new ArrayList<Word>() ;
        word.add(new Word("Apollo Pharmacy" , "No.13/8, Railway Station Road,\nGuduvanchery, Chennai, \nTamil Nadu 603202, India" , "044 4740 9038" , R.drawable.call)) ;
        word.add(new Word("Med Plus" , "Zion Complex, Velachery \nTambaram Main Rd, Pallavaram, Chennai, \nTamil Nadu 600117, India" , "044 4287 3165" , R.drawable.call)) ;
        word.add(new Word("Santhanam Pharmacy" , "no 54, Pillayar Koil St,\nPotheri, Kattankulathur, \nTamil Nadu 603203, India" , "044 2746 6440" , R.drawable.call)) ;
        word.add(new Word("Hetero Pharmacy" , "Medavakkam Main Rd, \nKovilambakkam, Chennai, \nTamil Nadu 600117, India" , "1800 425 9799" , R.drawable.call)) ;
        word.add(new Word("Apollo Pharmacy" , "Kalaignar Nedunchalai, \nSrinivasa Nagar, New Perungalathur, \nChennai, Tamil Nadu 600063, India" , "044 2274 1215" , R.drawable.call)) ;
        word.add(new Word("Medplus" , "Ground floor, No. 12, \nAnna Street, Chitlapakkam, \nChennai, Tamil Nadu 600064, India" , "9962256516" , R.drawable.call)) ;

        WordAdapter wordAdapter = new WordAdapter(this , word) ;
        ListView listView = (ListView)findViewById(R.id.listmedicineview) ;
        listView.setAdapter(wordAdapter);
    }
}
