package com.teamtwinkie.terpfreewhere;

import java.util.ArrayList;
import java.util.Iterator;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class AndroidListViewActivity extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Intent i = getIntent();
		
        Bundle extras = i.getExtras();
        String type = extras.getString("TYPE");

		//Iterator for everything
//		Iterator<Entry> foodIt = Main.m1.foodIt();
//		Iterator<Entry> foodIt2 = Main.m1.foodIt();


		// storing string resources into Array
		ArrayList<Entry> foodList = new ArrayList<Entry>();
		ArrayList<Entry> swagList = new ArrayList<Entry>();
		ArrayList<Entry> activitiesList = new ArrayList<Entry>();



//		int size = 0;
//		while(foodIt2.hasNext()){
//			size++;
//		}
		String[] foods = new String[1];
		String[] swags= new String[1];
		String[] activitiess = new String[1];

		foods[0]=foodList.get(0).getWhat();
		swags[0]=swagList.get(0).getWhat();
		activitiess[0]=activitiesList.get(0).getWhat();
		
//		int index = 0;
//		while(foodIt.hasNext()){
//			Entry f1 = foodIt.next();
//			foodList.add(f1);
//			foods[index] = f1.getWhat();
//			index++;
//		}
		//		foods[0]= foodList.get(0).getWhat();
		//		foods[1]= foodList.get(1).getWhat();

		// Binding Array to ListAdapter
		this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, entries));

		ListView lv = getListView();

		// listening to single list item on click
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				// selected item 
				String name = ((TextView) view).getText().toString();

				//Create a bundle to store the extras
				Bundle extras = new Bundle();
				extras.putString("NAME", name.toString());
				extras.putString("WHERE", "Named Where");

				// Launching new Activity on selecting single List Item
				Intent i = new Intent(getApplicationContext(), SingleListItem.class);
				// sending data to new activity
				i.putExtras(extras);
				startActivity(i);

			}
		});
	}
}