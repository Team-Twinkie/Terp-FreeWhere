package com.teamtwinkie.terpfreewhere;

import android.os.Bundle;
import 

android.app.Activity;
import android.view.Menu;
import 

android.view.View;
import android.view.View.OnClickListener;
import 

android.widget.Button;

public class Home extends Activity implements 

OnClickListener {
	Button freeFoodButton;
	Button freeSwagButton; 
	Button freeEventsButton ;
	Button allFreeThingsButton ;
	

Button organizationButton ;
	
	
protected void onCreate(Bundle savedInstanceState) {
		

freeFoodButton = (Button) findViewById(R.id.button1);
		

freeSwagButton = (Button) findViewById(R.id.button2);
		

freeEventsButton = (Button) findViewById(R.id.button3);
		

allFreeThingsButton = (Button) findViewById(R.id.button4);
		

organizationButton = (Button) findViewById(R.id.button5);
		

freeFoodButton.setOnClickListener(this);
		

freeSwagButton.setOnClickListener(this);
		

freeEventsButton.setOnClickListener(this);
		

allFreeThingsButton.setOnClickListener(this);
		

super.onCreate(savedInstanceState);
		setContentView

(R.layout.activity_home);
	}
	

	@Override
	public 

boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		

getMenuInflater().inflate(R.menu.home, menu);
		//Comment here
	

	return true;
	}

	@Override
	public void onClick

(View v) {
		switch(v.getId()){
		case 

R.id.button1:
			//switch to the menu activity
		

case R.id.button2:
			//switch to the menu activity
	

	case R.id.button3:
			// switch to the menu activity
		case R.id.button4:
			

//switch to the menu activity
		case R.id.button5:
		

	//switch to the orginaztion submission activity
		}
	

	
	}

}
