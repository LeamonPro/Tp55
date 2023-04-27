package com.example.tp55;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLInput;

public class Helper extends SQLiteOpenHelper {

    public Helper(Context context){
        super(context,"centerManager",null,1);

    }

    @Override
    //Creation des tables
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE centre (_id INTEGER PRIMARY KEY ,nom TEXT,ville TEXT,latitude TEXT,longitude TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
       db.execSQL("DROP TABLE IF EXISTS centre");
       onCreate(db);
    }
    public void addCentre(Centre centre){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("nom",centre.getNom());
        cv.put("ville",centre.getVille());
        cv.put("latitude",centre.getLatitude());
        cv.put("longitude",centre.getLongitude());
        db.insert("centre",null,cv);
        db.close();
    }
    public Cursor fetchAllCentre(){
        SQLiteDatabase db=this.getWritableDatabase();
        String[] table={"_id","nom","ville","latitude","longitude"};
        return db.query("centre",table,null,null,null,null,null);
    }
    public void deleteCentre(int i){
        SQLiteDatabase db =this.getWritableDatabase();
        db.delete("centre","_id"+"=?",new String[]{String.valueOf(i)});
    }
    public void updateCentre(int id,Centre centre){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("nom",centre.getNom());
        cv.put("ville",centre.getVille());
        cv.put("latitude",centre.getLatitude());
        cv.put("longitude",centre.getLongitude());
        db.update("centre",cv,"_id"+"=?",new String[]{String.valueOf(id)});
    }
    /*
    public Centre getCentre(int id){
        SQLiteDatabase db= this.getWritableDatabase();
        Cursor c=db.query("centre",new String[]{"_id","nom","ville","latitude","longitude"},"_id"+"=?",new String[]{String.valueOf(id)},null,null,null,null);
    }*/
}

