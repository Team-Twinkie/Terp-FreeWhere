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
	
	private PriorityQueue<Entry> all;
	
	public Main(){
		
		categories = new HashMap<type,PriorityQueue<Entry>>();
		
		Comparator<Entry> comparator = new DateComparator();
		
		food = new PriorityQueue<Entry>(0, comparator);
		swag = new PriorityQueue<Entry>(0, comparator);
		activities = new PriorityQueue<Entry>(0, comparator);
				
		all = new PriorityQueue<Entry>(0,comparator);
		
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
	void addAll(Entry e1){
		all.add(e1);
	}
	
	public void makeEntry(String orgName, String catOfFree,String what, String date, 
			String description, String location){
		
		boolean isFood = false;
		boolean isSwag = false;
		boolean isEvents = false;
		
		Food newF=null;
		Swag newS=null;
		Events newE=null;
		
		if(catOfFree.contains("food")){
			newF = new Food(parseDate(date), location, orgName, description, what);
			food.add(newF);
			isFood = true;
		}
		if(catOfFree.contains("swag")){
			newS = new Swag(parseDate(date), location, orgName, description, what);
			swag.add(newS);
			isSwag = true;
		}if(catOfFree.contains("activities")){
			newE = new Events(parseDate(date), location, orgName, description, what);
			activities.add(newE);
			isEvents = true;
		}		
		if(isFood==true && isSwag==true && isEvents==true){
			all.add(newF);
			all.add(newS);
			all.add(newE);
		}
	}
	
	private Calendar parseDate(String date){
		String characters = "";
		int pos=0;
		
		// gets the month
		for(int i = 0;i < date.length();i++){
			if(date.charAt(i)=='/'){
				pos = i;
				characters = date.substring(0, pos);
				break;
			}
		}
		int month = Integer.parseInt(characters);
		
		// gets the day
		for(int i = pos+1;i < date.length();i++){
			if(date.charAt(i)=='/'){
				pos = i;
				characters = date.substring(pos+1, i-1);
				break;
			}
		}
		int day = Integer.parseInt(characters);
		
		// gets the year
		for(int i = pos+1;i < date.length();i++){
			if(date.charAt(i)==','){
				pos = i;
				characters = date.substring(pos+1, i-1);
				break;
			}
		}
		int year = Integer.parseInt("20"+characters);
		
		// gets the hour
		for(int i = pos+1;i < date.length();i++){
			if(date.charAt(i)==':'){
				pos = i;
				characters = date.substring(pos+1, i-1);
				break;
			}
		}
		int hour = Integer.parseInt(characters);
		
		// gets the minutes
		characters = date.substring(pos+1, date.length()-1);
		int min = Integer.parseInt(characters);
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day, hour, min);
		return cal;
	}
	
}
