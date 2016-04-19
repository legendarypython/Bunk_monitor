package com.example.bunk_monitor.explicit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Help  extends Activity {

	Button home;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	setContentView(R.layout.help); 
	

	home=(Button) findViewById(R.id.home);
	
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
}
