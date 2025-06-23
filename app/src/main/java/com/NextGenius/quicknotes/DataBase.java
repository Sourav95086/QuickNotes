package com.NextGenius.quicknotes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DataBase extends SQLiteOpenHelper {

    private static final String DATABAE_NAME = "MyDataBase";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "Data_Table";
    private static final String TITLE = "title";
    private static final String NOTE = "note";
    private static final String SERIAL_NUMBER = "sl_no";
    public DataBase( Context context) {
        super(context,DATABAE_NAME, null , DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " ( "
                + SERIAL_NUMBER + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + TITLE + " TEXT, "
                + NOTE + " TEXT)"
        );
    }

        @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
    public void StoreData(String Title , String Note){
        ContentValues cn = new ContentValues();
        cn.put(TITLE,Title);
        cn.put(NOTE,Note);

        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLE_NAME,null,cn);
    }
    public ArrayList<ModalClass> FetchData (){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from "+TABLE_NAME,null);
        ArrayList<ModalClass> list = new ArrayList<>();
        while(cursor.moveToNext()){
            ModalClass mc = new ModalClass();
            mc.sl_no = cursor.getInt(0);
            mc.title = cursor.getString(1);
            mc.note = cursor.getString(2);
            list.add(mc);
        }
        cursor.close();
        return list;
    }
    public void updateNotes(ModalClass m){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(TITLE,m.title);
        cv.put(NOTE,m.note);
        db.update(TABLE_NAME , cv , SERIAL_NUMBER + " = " + m.sl_no , null);

    }
    public void DeleteNote(int id){
        SQLiteDatabase db = this .getWritableDatabase();
        db.delete(TABLE_NAME,SERIAL_NUMBER + " = " + id ,null);
    }
}
