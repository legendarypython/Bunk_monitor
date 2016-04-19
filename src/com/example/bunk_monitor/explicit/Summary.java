package com.example.bunk_monitor.explicit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class Summary extends Activity implements OnClickListener {

Button home;
TextView t1;

	
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	setContentView(R.layout.summary); 
	home=(Button)findViewById(R.id.home);
	t1=(TextView)findViewById(R.id.tex);

Summary1();
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


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

public void Summary1(){
Sqldb d1=new Sqldb(Summary.this);
String result="ggg";
d1.open();
 result=d1.get();
d1.close();	
	t1.setText(result);
	
}

}
