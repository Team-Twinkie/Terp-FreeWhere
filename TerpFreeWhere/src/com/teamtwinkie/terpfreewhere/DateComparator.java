package com.teamtwinkie.terpfreewhere;
import java.util.Comparator;

public class DateComparator implements Comparator<Entry>{
	public int compare(Entry x, Entry y) {          
        return x.getWhen().getTime().compareTo(y.getWhen().getTime());
    }	
}
