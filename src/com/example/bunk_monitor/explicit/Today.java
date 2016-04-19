package com.example.bunk_monitor.explicit;

import java.io.PrintStream;
import java.sql.SQLData;

import android.R.string;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Today extends Activity{
	TextView s1,s2,s3,s4,s5,s6,s7;
	Button home,b1,b2,b3,b4,b5,b6,b7,n1,n2,n3,n4,n5,n6,n7;
	
	
	@Override
		protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	setContentView(R.layout.today); 
	
	
	s1=(TextView)findViewById(R.id.textView1);
	s2=(TextView)findViewById(R.id.textView2);
	s3=(TextView)findViewById(R.id.textView3);
	s4=(TextView)findViewById(R.id.textView4);
	s5=(TextView)findViewById(R.id.textView5);
	s6=(TextView)findViewById(R.id.textView6);
	s7=(TextView)findViewById(R.id.textView7);
	home=(Button) findViewById(R.id.home);
	b1=(Button) findViewById(R.id.subyes1);
	b2=(Button) findViewById(R.id.subyes2);
	b3=(Button) findViewById(R.id.subyes3);
	b4=(Button) findViewById(R.id.subyes4);
	b5=(Button) findViewById(R.id.subyes5);
	b6=(Button) findViewById(R.id.subyes6);
	b7=(Button) findViewById(R.id.subyes7);
	n1=(Button) findViewById(R.id.subno1);
	n2=(Button) findViewById(R.id.subno2);
	n3=(Button) findViewById(R.id.subno3);
	n4=(Button) findViewById(R.id.subno4);
	n5=(Button) findViewById(R.id.subno5);
	n6=(Button) findViewById(R.id.subno6);
	n7=(Button) findViewById(R.id.subno7);
	


	


Today1();

b1.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {

		s1.setVisibility(View.GONE);
		b1.setVisibility(View.GONE);
		n1.setVisibility(View.GONE);
		Sqldb d =new Sqldb(Today.this);
d.open();
d.create_entry("s1","yes");
d.close();	
		
	}
});


b2.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {

		s2.setVisibility(View.GONE);
		b2.setVisibility(View.GONE);
		n2.setVisibility(View.GONE);

		try{
		Sqldb d =new Sqldb(Today.this);
d.open();
d.create_entry("s2","yes");
d.close();	
		
	}
	catch(Exception e){
		
	Dialog d=new Dialog(Today.this);
	d.setTitle("notification");
	TextView tv=new TextView(Today.this);
	tv.setText(e.toString());
	d.setContentView(tv);
	d.show();



	}








	}
});


b3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {

		s3.setVisibility(View.GONE);
		b3.setVisibility(View.GONE);
		n3.setVisibility(View.GONE);
		Sqldb d =new Sqldb(Today.this);
d.open();
d.create_entry("s3","yes");
d.close();	
		
	}
});


b4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {

		s4.setVisibility(View.GONE);
		b4.setVisibility(View.GONE);
		n4.setVisibility(View.GONE);
		Sqldb d =new Sqldb(Today.this);
d.open();
d.create_entry("s4","yes");
d.close();	
		
	}
});


b5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {

		s5.setVisibility(View.GONE);
		b5.setVisibility(View.GONE);
		n5.setVisibility(View.GONE);
		Sqldb d =new Sqldb(Today.this);
d.open();
d.create_entry("s5","yes");
d.close();	
		
	}
});


b6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {

		s6.setVisibility(View.GONE);
		b6.setVisibility(View.GONE);
		n6.setVisibility(View.GONE);
		Sqldb d =new Sqldb(Today.this);
d.open();
d.create_entry("s6","yes");
d.close();	
		
	}
});


b7.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {

		s7.setVisibility(View.GONE);
		b7.setVisibility(View.GONE);
		n7.setVisibility(View.GONE);
		Sqldb d =new Sqldb(Today.this);
d.open();
d.create_entry("s7","yes");
d.close();	
		
	}
});

n1.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {

		s1.setVisibility(View.GONE);
		b1.setVisibility(View.GONE);
		n1.setVisibility(View.GONE);
		Sqldb d =new Sqldb(Today.this);
d.open();
d.create_entry("s1","no");
d.close();	
		
	}
});


n2.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {

		s2.setVisibility(View.GONE);
		b2.setVisibility(View.GONE);
		n2.setVisibility(View.GONE);
		Sqldb d =new Sqldb(Today.this);
d.open();
d.create_entry("s2","no");
d.close();	
		
	}
});


n3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {

		s3.setVisibility(View.GONE);
		b3.setVisibility(View.GONE);
		n3.setVisibility(View.GONE);
		Sqldb d =new Sqldb(Today.this);
d.open();
d.create_entry("s3","no");
d.close();	
		
	}
});


n4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {

		s4.setVisibility(View.GONE);
		b4.setVisibility(View.GONE);
		n4.setVisibility(View.GONE);
		Sqldb d =new Sqldb(Today.this);
d.open();
d.create_entry("s4","no");
d.close();	
		
	}
});


n5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {

		s5.setVisibility(View.GONE);
		b5.setVisibility(View.GONE);
		n5.setVisibility(View.GONE);
		Sqldb d =new Sqldb(Today.this);
d.open();
d.create_entry("s5","no");
d.close();	
		
	}
});


n6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {

		s6.setVisibility(View.GONE);
		b6.setVisibility(View.GONE);
		n6.setVisibility(View.GONE);
		Sqldb d =new Sqldb(Today.this);
d.open();
d.create_entry("s6","no");
d.close();	
		
	}
});


n7.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {

		s7.setVisibility(View.GONE);
		b7.setVisibility(View.GONE);
		n7.setVisibility(View.GONE);
		Sqldb d =new Sqldb(Today.this);
d.open();
d.create_entry("s7","no");
d.close();	
		
	}
});















	home.setOnClickListener(new View.OnClickListener() {
	
		@Override
		public void onClick(View v) {
			Thread timer=new Thread(){
				
				public void run()
				{
						
						Intent home=new Intent("android.intent.action.HOME");
						
						startActivity(home);
				}

				private void start(Intent welcome) {
					// TODO Auto-generated method stub
					
				}
				
				
			};
			
			timer.start();
		}
	});


	


	}

	
	
public void Today1() throws SQLiteException{
	
	int i=0;
String rj=getfirstsub();
String r="";
if(!rj.equals(null))
			{
			s1.setText(rj);
	        s1.setVisibility(View.VISIBLE);
	b1.setVisibility(View.VISIBLE);
	n1.setVisibility(View.VISIBLE);
	        
	        r=getfirstsub();

if (!r.equals(rj)){

	s2.setText(r);
    s2.setVisibility(View.VISIBLE);
b2.setVisibility(View.VISIBLE);
n2.setVisibility(View.VISIBLE);
    
    r=getfirstsub();

if (!r.equals(rj)){

	s3.setText(r);
    s3.setVisibility(View.VISIBLE);
b3.setVisibility(View.VISIBLE);
n3.setVisibility(View.VISIBLE);
    
    r=getfirstsub();
	

if (!r.equals(rj)){

	s4.setText(r);
    s4.setVisibility(View.VISIBLE);
b4.setVisibility(View.VISIBLE);
n4.setVisibility(View.VISIBLE);
    
    r=getfirstsub();
	

if (!r.equals(rj)){

	s5.setText(r);
    s5.setVisibility(View.VISIBLE);
b5.setVisibility(View.VISIBLE);
n5.setVisibility(View.VISIBLE);
    
    r=getfirstsub();
	

if (!r.equals(rj)){

	s6.setText(r);
    s6.setVisibility(View.VISIBLE);
b6.setVisibility(View.VISIBLE);
n6.setVisibility(View.VISIBLE);
    
    r=getfirstsub();
	

if (!r.equals(rj)){

	s7.setText(r);
    s7.setVisibility(View.VISIBLE);
b7.setVisibility(View.VISIBLE);
n7.setVisibility(View.VISIBLE);
    
    r=getfirstsub();
	
}
}

}
}
}
}
}	

	
	
	}



private String getfirstsub() {
	
	String r="";

	try{
		Sqldb d=new Sqldb(Today.this);
	d.open();
	r=d.getdata();
    d.create_entry(r);
	d.close();

	}catch(Exception e){
		
}

return r;
	
}	
	


	
	
	
public  Today()
{
}
}