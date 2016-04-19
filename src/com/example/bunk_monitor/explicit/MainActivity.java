package com.example.bunk_monitor.explicit;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	Button  co,future,deve,what,why,exit,help; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		co=(Button) findViewById(R.id.todays);
		future=(Button) findViewById(R.id.Check);
		deve=(Button) findViewById(R.id.developer);
		what=(Button) findViewById(R.id.addsub);
		why=(Button) findViewById(R.id.summary);
		help=(Button) findViewById(R.id.help);
		exit=(Button) findViewById(R.id.exit);
		
		co.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				Thread timer=new Thread(){
					
					public void run()
					{
							
							Intent home=new Intent("android.intent.action.co");
							
							startActivity(home);
					}

					private void start(Intent welcome) {
						// TODO Auto-generated method stub
						
					}
					
					
				};
				
				timer.start();
			}
		});
		
future.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				Thread timer=new Thread(){
					
					public void run()
					{
							
							Intent home=new Intent("android.intent.action.future");
							
							startActivity(home);
					}

					private void start(Intent welcome) {
						// TODO Auto-generated method stub
						
					}
					
					
				};
				
				timer.start();
			}
		});
deve.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
	
		Thread timer=new Thread(){
			
			public void run()
			{
					
					Intent home=new Intent("android.intent.action.dev");
					
					startActivity(home);
			}

			private void start(Intent welcome) {
				// TODO Auto-generated method stub
				
			}
			
			
		};
		
		timer.start();
	}
});
what.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
	
		Thread timer=new Thread(){
			
			public void run()
			{
					
					Intent home=new Intent("android.intent.action.what");
					
					startActivity(home);
			}

			private void start(Intent welcome) {
				// TODO Auto-generated method stub
				
			}
			
			
		};
		
		timer.start();
	}
});

help.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
	
		Thread timer=new Thread(){
			
			public void run()
			{
					
					Intent home=new Intent("android.intent.action.help");
					
					startActivity(home);
			}

			private void start(Intent welcome) {
				// TODO Auto-generated method stub
				
			}
			
			
		};
		
		timer.start();
	}
});
why.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
	
		Thread timer=new Thread(){
			
			public void run()
			{
					
					Intent home=new Intent("android.intent.action.why");
					
					startActivity(home);
			}

			private void start(Intent welcome) {
				// TODO Auto-generated method stub
				
			}
			
			
		};
		
		timer.start();
	}
});
exit.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		
	int c=0;
		if(c==0){
			moveTaskToBack(true);
			finish();
			
			
			android.os.Process.killProcess(android.os.Process.myPid());
		

		}
		
	}
});

	
	
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
