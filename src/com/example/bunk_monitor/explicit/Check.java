package com.example.bunk_monitor.explicit;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Check extends Activity implements OnClickListener{

	String s,r;
	Button get_records;
	EditText et;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	
		
		super.onCreate(savedInstanceState);
	
	setContentView(R.layout.check); 
	get_records=(Button)findViewById(R.id.but1);
	et=(EditText)findViewById(R.id.textVie);
	tv=(TextView)findViewById(R.id.textiew2);
	


	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.button1:
			s=et.getText().toString();
	et.setText("rght reached tillhere");
			
			
			Sqldb db=new Sqldb(Check.this);
			db.open();
			int i=0;
try{			
			for(i=0;i<7;i++){
				r=db.getdata();
			    db.create_entry(r);
				if(r.equalsIgnoreCase(s))
				{
					s="s"+(i+1);
					break;
				}
				
				
			}
		}

	catch(Exception e){
		
	Dialog d=new Dialog(Check.this);
	d.setTitle("notification");
	TextView tv=new TextView(Check.this);
	tv.setText(e.toString());
	d.setContentView(tv);
	d.show();
et.setText(e.toString());
	}
finally{

			
			if(!r.equalsIgnoreCase(s)){
				et.setText("enter valid subject name");
			}
			

			et.setVisibility(View.GONE);
            tv.setVisibility(View.GONE);			
			if(r.equalsIgnoreCase(s)){
			String g=db.getdetails(s);
			tv.setText(g);
			}
			db.close();
			
}					
			
			break;
		case R.id.textView1:
			
			break;
		case R.id.textView2:
			break;
		
		}
		
		
	}

}
