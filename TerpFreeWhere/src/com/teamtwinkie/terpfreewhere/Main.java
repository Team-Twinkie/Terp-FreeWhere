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
		
		food = new PriorityQueue<Entry>(10, new DateComparator());
		swag = new PriorityQueue<Entry>(10, new DateComparator());
		activities = new PriorityQueue<Entry>(10, new DateComparator());
		
		
		categories.put(type.FOOD, food);
		categories.put(type.SWAG, swag);
		categories.put(type.EVENTS, activities);
		
		all = new TreeSet<Entry>();
	}
	
	/*
	 * Adds the 
	 */
}
