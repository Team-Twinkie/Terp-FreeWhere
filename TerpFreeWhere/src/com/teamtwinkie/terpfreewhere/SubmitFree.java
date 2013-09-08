package com.teamtwinkie.terpfreewhere;

import android.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;

public class SubmitFree extends Activity {
	
	EditText orgName;
	EditText catOfFree;
	EditText whatsFree;
	EditText email;
	EditText date;
	EditText smallDescription;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_submit_free);
		orgName = (EditText)findViewById(R.id.editText1);
		catOfFree = (EditText)findViewById(R.id.editText2);
		whatsFree = (EditText)findViewById(R.id.editText3);
		email = (EditText)findViewById(R.id.editText4);
		date = (EditText)findViewById(R.id.editText5);
		smallDescription = (EditText)findViewById(R.id.editText6);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.submit_free, menu);
		return true;
	}

}
