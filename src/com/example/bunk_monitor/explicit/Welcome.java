package com.example.bunk_monitor.explicit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Welcome  extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	setContentView(R.layout.welcome); 
	
	Thread timer=new Thread(){
	
		public void run()
		{
			try{
			sleep(5000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
				
				
			}
			finally{
				
				Intent welcome=new Intent("android.intent.action.HOME");
				
				startActivity(welcome);
				
			}
		}

		private void start(Intent welcome) {
			// TODO Auto-generated method stub
			
		}
		
		
	};
	
	timer.start();
	
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onPause()
	 */
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	finish();
	
	}
	
	
	
	
	
	
	

}
