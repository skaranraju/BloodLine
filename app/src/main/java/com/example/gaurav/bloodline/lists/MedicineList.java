package com.example.gaurav.bloodline.lists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gaurav.bloodline.R;
import com.example.gaurav.bloodline.adapters.Word;

import java.util.ArrayList;

public class MedicineList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_list);

        ArrayList<Word> medicineList = new ArrayList<>() ;
        medicineList.add(new Word("Apollo Medicine" , "Shop No.2 ,Main Market\n Guduvencherry" , "9962256516" , R.drawable.Call)) ;
    }
}
