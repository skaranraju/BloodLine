package com.example.gaurav.bloodline.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gaurav.bloodline.R;

import java.util.ArrayList;

/**
 * Created by gaurav on 12/8/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> medicineList) {
        super(context, 0, medicineList);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentMedicalShop = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.shop_name);

        nameTextView.setText(currentMedicalShop.getmShopName());


        TextView numberTextView = (TextView) listItemView.findViewById(R.id.shop_address);


        numberTextView.setText(currentMedicalShop.getmShopAddress());


        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phoneno);

        phoneTextView.setText(currentMedicalShop.getmPhoneNo());


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);

        iconView.setImageResource(currentMedicalShop.getmImageResourceId());

        return listItemView;
    }

}
