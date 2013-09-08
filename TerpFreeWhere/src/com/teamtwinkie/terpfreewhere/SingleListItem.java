package com.teamtwinkie.terpfreewhere;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SingleListItem extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_list_item_view);
        
        TextView text = (TextView) findViewById(R.id.label);
        TextView whereText = (TextView) findViewById(R.id.textView1);
        
        Intent i = getIntent();
        //Get the extras
        Bundle extras = i.getExtras();
        // getting attached intent data
        String name = extras.getString("NAME");
        String where = extras.getString("WHERE");
        // displaying selected extras
        text.setText(name);
        whereText.setText(where);
       
        
	}
}
