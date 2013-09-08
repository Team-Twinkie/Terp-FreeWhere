package com.teamtwinkie.terpfreewhere;

import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Main {
	
	enum type {FOOD, SWAG, EVENTS};
	
	private PriorityQueue<Entry> food;
	private PriorityQueue<Entry> swag;
	private PriorityQueue<Entry> activities;
	
	private Map<type, PriorityQueue<Entry>> categories;
	
	private TreeSet<Entry> all;
	
	public Main(){
		
		categories = new HashMap<type,PriorityQueue<Entry>>();
		
		Comparator<Entry> comparator = new DateComparator();
		
		food = new PriorityQueue<Entry>(0, comparator);
		swag = new PriorityQueue<Entry>(0, comparator);
		activities = new PriorityQueue<Entry>(0, comparator);
				
		all = new TreeSet<Entry>(comparator);
		
		categories.put(type.FOOD, food);
		categories.put(type.SWAG, swag);
		categories.put(type.EVENTS, activities);
	}
	
	/*
	 * Generic Add Food
	 */
	void addFood(Food f1){
		food.add(f1);
	}
	
	/*
	 * Generic Add Swag
	 */
	void addSwag(Swag s1){
		swag.add(s1);
	}
	
	/*
	 * Generic Add Activities
	 */
	void addActivities(Events a1){
		activities.add(a1);
	}
	
	/*
	 * Generic Add to all
	 */
	void addFood(Entry e1){
		all.add(e1);
	}
}
