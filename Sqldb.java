package com.example.ibrahim.bloodline;

/**
 * Created by IBRAHIM on 8/11/2017.
 */

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;
import android.widget.Toast;
import android.app.PendingIntent;
        import android.telephony.SmsManager;

public class Sqldb
{
    static final String DATABASE_NAME = "login.db";
    static final int DATABASE_VERSION = 1;
    public static final int NAME_COLUMN = 1;
    // SQL Statement to create a new database.
    static final String DATABASE_CREATE = "create table "+"LOGIN"+
            "( " + "USERNAME  text,PASSWORD text,FULLNAME text,EMAIL text, PHONENUM text); ";
    // Variable to hold the database instance
    public static SQLiteDatabase db;
    // Context of the application using the database.
    private final Context context;
    // Database open/upgrade helper
    private static DataBaseHelper dbHelper;
    public Sqldb(Context _context)
    {
        context = _context;
        dbHelper = new DataBaseHelper(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public  Sqldb open() throws SQLException
    {
        db = dbHelper.getWritableDatabase();
        return this;
    }
    public static String[] Get_Phon() {
        Cursor cursor;
        String num[] = new String[0];
        int i=0;
        cursor = db.query("LOGIN", null, " PHONENUM=?", null, null, null, null);
        cursor.moveToFirst();
        int val = cursor.getCount();
        if (val > 0)
        {

            num[i]=cursor.getString(4);
            ++i;
        }
        return num;
    }
    public static void close()
    {
        db.close();
    }

    public  SQLiteDatabase getDatabaseInstance()
    {
        return db;
    }

    public static void insertEntry(EditText userName, EditText password, EditText fullname, EditText email, EditText phoneNum)
    {
        ContentValues newValues = new ContentValues();
        // Assign values for each row.
        String username=userName.getText().toString();
        String Password=password.getText().toString();
        String full=fullname.getText().toString();

        String id=email.getText().toString();
        String phon=phoneNum.getText().toString();
        newValues.put("USERNAME", username);
        newValues.put("PASSWORD",Password);
        newValues.put("FULLNAME",full);
        newValues.put("EMAIL",id);
        newValues.put("PHONENUM", phon);
        // Insert the row into your table
        db.insert("LOGIN", null, newValues);
        // Toast.makeText(, "Reminder Is Successfully Saved", Toast.LENGTH_LONG).show();
    }

    public int deleteEntry(String UserName)
    {
        //String id=String.valueOf(ID);
        String where="USERNAME=?";
        int numberOFEntriesDeleted= db.delete("LOGIN", where, new String[]{UserName}) ;
        Toast.makeText(context, "Number fo Entry Deleted Successfully : "+numberOFEntriesDeleted, Toast.LENGTH_LONG).show();
        return numberOFEntriesDeleted;
    }
    public String getSinlgeEntry(String userName)
    {
        Cursor cursor=db.query("LOGIN", null, " USERNAME=?", new String[]{userName}, null, null, null);
        if(cursor.getCount()<1) // UserName Not Exist
        {
            cursor.close();
            return "NOT EXIST";
        }
        cursor.moveToFirst();
        String password= cursor.getString(cursor.getColumnIndex("PASSWORD"));
        cursor.close();
        return password;
    }
    public void  updateEntry(String userName,String password)
    {
        // Define the updated row content.
        ContentValues updatedValues = new ContentValues();
        // Assign values for each row.
        updatedValues.put("USERNAME", userName);
        updatedValues.put("PASSWORD",password);

        String where="USERNAME = ?";
        db.update("LOGIN",updatedValues, where, new String[]{userName});
    }
}