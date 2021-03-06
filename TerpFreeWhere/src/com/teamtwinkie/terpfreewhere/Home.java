package com.teamtwinkie.terpfreewhere;

import android.os.Bundle;
import 

android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import 

android.view.View;
import android.view.View.OnClickListener;
import 

android.widget.Button;

public class Home extends Activity implements OnClickListener {
	Button freeFoodButton;
	Button freeSwagButton; 
	Button freeEventsButton;
	Button allFreeThingsButton;
	Button organizationButton;
	
	
protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		freeFoodButton = (Button) findViewById(R.id.button1);
		freeSwagButton = (Button) findViewById(R.id.button2);
		freeEventsButton = (Button) findViewById(R.id.button3);
		allFreeThingsButton = (Button) findViewById(R.id.button4);
		organizationButton = (Button) findViewById(R.id.button5);
		freeFoodButton.setOnClickListener(this);
		freeSwagButton.setOnClickListener(this);
		freeEventsButton.setOnClickListener(this);
		allFreeThingsButton.setOnClickListener(this);
		organizationButton.setOnClickListener(this);
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		//Comment here
		return true;
	}

	@Override
	public void onClick(View v) {
		Intent m = new Intent(this, AndroidListViewActivity.class);
		Intent sf = new Intent(this, SubmitFree.class);
		
		if(v.getId()== R.id.button1){
			m.putExtra("TYPE", "food");
			startActivity(m);
		}else if(v.getId() == R.id.button2){
			m.putExtra("TYPE","swag");
			startActivity(m);
		}else if(v.getId() == R.id.button3){
			m.putExtra("TYPE","activities");
			startActivity(m);
		}else if(v.getId() == R.id.button4){
			m.putExtra("TYPE","all");
			startActivity(m);
		}else if(v.getId() == R.id.button5){
			startActivity(sf);
		}
	}
}
