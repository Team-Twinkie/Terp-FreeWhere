package com.teamtwinkie.terpfreewhere;


import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class SubmitFree extends Activity implements OnClickListener {
	
	EditText orgName;
	EditText catOfFree;
	EditText whatsFree;
	EditText date;
	EditText smallDescription;
	EditText location;
	Button submit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_submit_free);
		orgName = (EditText)findViewById(R.id.editText1);
		catOfFree = (EditText)findViewById(R.id.editText2);
		whatsFree = (EditText)findViewById(R.id.editText3);
		location = (EditText)findViewById(R.id.editText4);
		date = (EditText)findViewById(R.id.editText5);
		smallDescription = (EditText)findViewById(R.id.editText6);
		submit = (Button)findViewById(R.id.submitFreeButton);
		submit.setOnClickListener(this);
	}
	
	public void onClick(View v){
		System.err.println("BEFORE SUBMIT");
		if(v.getId() == R.id.submitFreeButton){
			String orgName1 = orgName.getText().toString();
			String catOfFree1 = catOfFree.getText().toString();
			String whatsFree1 = whatsFree.getText().toString();
			String location1 = location.getText().toString();
			String date1 = date.getText().toString();
			String smallDescription1 = smallDescription.getText().toString();
			System.err.println("IN SUBMIT");
			// put method here thats takes in the entry information
		Main mainObject = new Main();
		mainObject.makeEntry(orgName1, catOfFree1, whatsFree1, date1, smallDescription1, location1);
			
		}
	}
	

}
