package com.example.bunk_monitor.explicit;

import android.R.string;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Addsub extends Activity{
	
	EditText et;
	Button b1,b2,home,b3,b4;
	
	@Override

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	setContentView(R.layout.addsub); 

	home=(Button) findViewById(R.id.button1);

	et=(EditText) findViewById(R.id.et);
	b1=(Button) findViewById(R.id.b1);
	b2=(Button) findViewById(R.id.b2);
b3=(Button)findViewById(R.id.bview);
b4=(Button)findViewById(R.id.button2);
b1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
b2.setVisibility(View.VISIBLE);
		}
	});

b3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
	String tablename=et.getText().toString();
		 
		String s ="";
		Sqldb d=new Sqldb(Addsub.this);
try{
	
	
        d.open();	
	s=d.getdatafulltable(tablename);
		d.close();
}
catch(Exception e){
	
Dialog d1=new Dialog(Addsub.this);
d1.setTitle("notification");
TextView tv=new TextView(Addsub.this);
tv.setText(e.toString());
d1.setContentView(tv);
d1.show();

}finally{
	
	
	et.setText(s);
}
	

	}
});
	

b4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
	
		String s="";

		Sqldb d=new Sqldb(Addsub.this);
try{
	
	
        d.open();	
	s=   d.del();
		d.close();
}
catch(Exception e){
	
Dialog d1=new Dialog(Addsub.this);
d1.setTitle("notification");
TextView tv=new TextView(Addsub.this);
tv.setText(e.toString());
d1.setContentView(tv);
d1.show();

}finally{
	
	
	et.setText(s);
}
	

	}
});


home.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
	
		b4.setText("delete");
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


		
		
	b2.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {

	String sub_name	=et.getText().toString();
			try{
Sqldb sql=new Sqldb(Addsub.this);


sql.open();
 sql.create_entry(sub_name);
 
 sql.close();
 
b2.setVisibility(View.GONE);
}
catch(Exception e){
	
Dialog d=new Dialog(Addsub.this);
d.setTitle("notification");
TextView tv=new TextView(Addsub.this);
tv.setText(e.toString());
d.setContentView(tv);
d.show();



}
finally			{

Dialog d=new Dialog(Addsub.this);
d.setTitle("notification");
TextView tv=new TextView(Addsub.this);
tv.setText("success!!");
d.setContentView(tv);
d.show();

}

			

		}
	});

		
		

	
	
	

	}

}
