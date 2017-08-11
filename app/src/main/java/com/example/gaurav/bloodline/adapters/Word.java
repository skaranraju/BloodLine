package com.example.gaurav.bloodline.adapters;

/**
 * Created by gaurav on 12/8/17.
 */

public class Word {
    private String mShopName ;
    private String mShopAddress ;
    private String mPhoneno ;
    private int mImageResourceId = NO_IMAGE_PROVIDED ;
    private static final int NO_IMAGE_PROVIDED=-1 ;

    public Word ( String ShopName , String ShopAddress , String PhoneNo , int imageResourceId ){
        mShopName = ShopName ;
        mShopAddress = ShopAddress ;
        mPhoneno = PhoneNo ;
        mImageResourceId = imageResourceId ;
    }

    public String getmShopName(){
        return mShopName ;
    }

    public String getmShopAddress(){
        return mShopAddress ;
    }

    public String getmPhoneNo() { return mPhoneno ; }

    public int getmImageResourceId() {
        return mImageResourceId ;
    }

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED ;
    }
}
