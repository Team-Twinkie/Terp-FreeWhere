package com.teamtwinkie.terpfreewhere;
import java.util.Calendar;

/*
 * This class represents the events items.
 */
public class Events {

	private Calendar when;
	private String where;
	private String who;
	private String how;
	private String what;

	public Events(Calendar whenIn, String whereIn,
			String whoIn, String howIn, String whatIn){

		this.when = whenIn;
		this.where = whereIn;
		this.who = whoIn;
		this.how = howIn;		
		this.what = whatIn;
	}
	
	/*
	 * Get the date and time for the events.
	 */
	public Calendar getDate() {
		return when;
	}

	/*
	 * Set the date and time for the events.
	 */
	public void setDate(Calendar when) {
		this.when = when;
	}


	/*
	 * Get the location for the events.
	 */
	public String getWhere() {
		return where;
	}

	/*
	 * Set the location for the events.
	 */
	public void setWhere(String where) {
		this.where = where;
	}

	/*
	 * Get the name of the host for the events.
	 */
	public String getWho() {
		return who;
	}

	/*
	 * Set the name of the who host the events.
	 */
	public void setWho(String who) {
		this.who = who;
	}
	/*
	 * Get the information on obtaining the events.
	 */
	public String getHow() {
		return how;
	}

	/*
	 * Set the information on obtaining the events.
	 */
	public void setHow(String how) {
		this.how = how;
	}
	
	/*
	 * Get the description of the events.
	 */
	public String getWhat(){
		return this.what;
	}
	
	/*
	 * Set the description of the events.
	 */
	public void setWhat(String what){
		this.what = what;
	}
	
	/* 
	 * Checks to see if one events item is equal to another.
	 */	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Events)) {
			return false;
		}
		Events other = (Events) obj;
		if (how == null) {
			if (other.how != null) {
				return false;
			}
		} else if (!how.equals(other.how)) {
			return false;
		}
		if (when == null) {
			if (other.when != null) {
				return false;
			}
		} else if (!when.equals(other.when)) {
			return false;
		}
		if (where == null) {
			if (other.where != null) {
				return false;
			}
		} else if (!where.equals(other.where)) {
			return false;
		}
		if (who == null) {
			if (other.who != null) {
				return false;
			}
		} else if (!who.equals(other.who)) {
			return false;
		}
		if (what == null) {
			if (other.what != null) {
				return false;
			}
		} else if (!what.equals(other.what)) {
			return false;
		}
		return true;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((how == null) ? 0 : how.hashCode());
		result = prime * result + ((when == null) ? 0 : when.hashCode());
		result = prime * result + ((where == null) ? 0 : where.hashCode());
		result = prime * result + ((who == null) ? 0 : who.hashCode());
		result = prime * result + ((what == null) ? 0 : what.hashCode());
		return result;
	}







}
