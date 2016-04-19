package com.example.bunk_monitor.explicit;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.TextView;

public class Sqldb  {

	private final Context ourcontext;
	private SQLiteDatabase ourdatabase;
	
	public static final String KEY_ROWID="date";
	public static final String KEY_ROWID2="number";
    public static final String KEY_ROWID3="number";
	public static final String KEY_DATE="date";
	
	public static final String KEY_NAME="subject_name";
	public static final String KEY_ATTENDED="attended";
	private static final String DATABASE_NAME="record";
	private static final String DATABASE_TABLE="sub_name";
	private static final String DATABASE_TABLE2="chart";
	private static final int DATABASE_VERSION=1;
	
	private  dbhelper ourhelper;
	private static class dbhelper extends SQLiteOpenHelper{

		public dbhelper(Context context) {
			super(context, DATABASE_NAME,null,DATABASE_VERSION);
		}

		@Override
public void onCreate(SQLiteDatabase db) {
	
			db.execSQL("CREATE TABLE   "+DATABASE_TABLE   +"  ( "+KEY_ROWID3+"  INTEGER PRIMARY KEY   AUTOINCREMENT ,    "   +   KEY_DATE   +   "   TEXT NOT NULL    ,   "  +  KEY_NAME   +"      TEXT NOT NULL    ," +	KEY_ATTENDED  + "   TEXT NOT NULL  )  ; "
					);

			
           db.execSQL("   CREATE TABLE    "+DATABASE_TABLE2+"  (  "+KEY_ROWID+"  INTEGER  PRIMARY KEY AUTOINCREMENT,  "+KEY_NAME+"   TEXT NOT NULL   ) ;");
			

		}

		@Override

public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			db.execSQL("DROP TABLE IF EXISTS  "+DATABASE_TABLE);
			onCreate (db);
			db.execSQL("DROP TABLE IF EXISTS  "+DATABASE_TABLE2);
			onCreate (db);
		}
		
		
	}
	
public Sqldb(Context c)
	{
		ourcontext=c;
	}	
public Sqldb open() throws SQLiteException{
		ourhelper=new dbhelper(ourcontext);
		ourdatabase=ourhelper.getWritableDatabase();
		return this;
	}
	
public void close(){
		ourhelper.close(); 
	   }
public long create_entry(String sub_name) {
	ContentValues cv=new ContentValues();
	cv.put(KEY_NAME,sub_name);
	return ourdatabase.insert(DATABASE_TABLE2, null, cv);
	}
	
public String getdata() throws SQLiteException{
		String s[]=new String[]{KEY_NAME,KEY_ROWID};
		
		Cursor c=ourdatabase.query(DATABASE_TABLE2,s, null, null,null,null, null);
		String result=" partial msucces";;

try		{
		
			
			result=del();
		}

	catch(Exception e){
		
	Dialog d=new Dialog(ourcontext);
	d.setTitle("notification");
	TextView tv=new TextView(ourcontext);
	tv.setText(e.toString());
	d.setContentView(tv);
	d.show();
return e.toString();
	}
finally{

	return result;
	
}
}
		public String getdatafulltable() throws SQLiteException{
				String s[]=new String[]{KEY_NAME,KEY_ROWID};
			Cursor c=ourdatabase.query(DATABASE_TABLE2,s, null, null,null,null, null);
			String result="";
			int iname=c.getColumnIndex(KEY_NAME);
			for(c.moveToFirst();!c.isAfterLast();c.moveToNext()){
				result=result+c.getString(iname)+" \n "/*+c.getString(c.getColumnIndex(KEY_ROWID))*/;
				
			}
			return result;
			
			
			
		}
	
		public String getdatafulltable(String tbnames) throws SQLiteException{
			// TODO Auto-generated method stub
			String s[]=new String[]{KEY_ATTENDED,KEY_NAME,KEY_DATE};
			Cursor c=ourdatabase.query(DATABASE_TABLE,s, null, null,null,null, null);
			String result="";
			int iname=c.getColumnIndex(KEY_DATE);
			for(c.moveToFirst();!c.isAfterLast();c.moveToNext()){
				
				result=result+c.getString(c.getColumnIndex(KEY_NAME))+" \t "+c.getString(c.getColumnIndex(KEY_DATE))+" \t "+c.getString(c.getColumnIndex(KEY_ATTENDED))+"\n";
				
			}
			return result;
			
			
			
		}
	
		


		
		
public String del() throws SQLiteException{
		String s[]=new String[]{KEY_NAME,KEY_ROWID};
		
		Cursor c=ourdatabase.query(DATABASE_TABLE2,s, null, null,null,null, null);
		String result="";
		String iname;Long l;
try		{
		
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext()){
			iname=c.getString(c.getColumnIndex(KEY_ROWID));
			l=Long.parseLong(iname);
			result=c.getString(c.getColumnIndex(KEY_NAME));

			
			ourdatabase.delete(DATABASE_TABLE2,KEY_ROWID +" = "+iname, 	null);
			break;

		}
		}

	catch(Exception e){
	Dialog d=new Dialog(ourcontext);
	d.setTitle("notification");
	TextView tv=new TextView(ourcontext);
	tv.setText(e.toString());
	d.setContentView(tv);
	d.show();
result ="";
}
finally{
	return result;
}

}
public long create_entry(String subname, String attendance) throws SQLiteException{
	ContentValues cv=new ContentValues();
	cv.put(KEY_ATTENDED,attendance);

	Calendar c =Calendar.getInstance();
	System.out.println("current tijme==="+c.getTime());
	SimpleDateFormat df=new SimpleDateFormat("dd-MMMM-yyyy");
	String date=df.format(c.getTime());
	cv.put(KEY_DATE, date);
	cv.put(KEY_NAME,subname);
	return ourdatabase.insert(DATABASE_TABLE, null, cv);
	
	
	
	
}
public String getdetails(String s) throws SQLiteException{
		// TODO Auto-generated method stub
		String s1[]=new String[]{KEY_ATTENDED,KEY_NAME,KEY_DATE};
		Cursor c=ourdatabase.query(DATABASE_TABLE,s1, null, null,null,null, null);
		String result="your's attendance is  \n \n \n \n \n \n ";
try{
		int iname=c.getColumnIndex(KEY_DATE);
		for(c.moveToFirst();!c.isAfterLast();c.moveToNext()){
			if(s.equalsIgnoreCase(c.getString(c.getColumnIndex(KEY_NAME))))
			{	result=result+"  "+c.getString(c.getColumnIndex(KEY_DATE))+" \t \t "+c.getString(c.getColumnIndex(KEY_ATTENDED))+"\n";
			}
		}
		
}

catch(Exception e){

Dialog d=new Dialog(ourcontext);
d.setTitle("notification");
TextView tv=new TextView(ourcontext);
tv.setText(e.toString());
d.setContentView(tv);
d.show();
return e.toString();
}
finally{

		return result;
		
}		
	

}
public String get() {
	
	
	
	return "fuck";
	
}
	}
