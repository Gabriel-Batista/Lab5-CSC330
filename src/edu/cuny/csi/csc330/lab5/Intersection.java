/**
 * Class that represents a Street Corner 
 * Instances of this Class will be used to track the history and current location of DrunkWalker(s)
 */
package edu.cuny.csi.csc330.lab5;

public class Intersection {
	
	private int avenue;
	private int street; 

	public Intersection() {
		Intersection(0,0);
	}
	
	
	// !!!!!!!!!!!!!!!!!  
	/**
	 * Constructor that takes ave and street values as parameters ... 
	 */
	public Intersection(int ave, int st)
	{
		this.avenue = ave;
		this.street = st;
	}
	
	
	/**
	 * toString() method  !!!!!!!!!!!!!!!!!
	 */
	@Override
	public String toString() {
		return "Intersection [avenue=" + avenue + ", street=" + street + "]";
	}
	
	
	/**
	 * Getters/Setters !!!!!!!!!!!!!!!!!!!
	 */
	public int getAvenue() {
		return avenue;
	}
	
	
	public void setAvenue(int avenue) {
		this.avenue = avenue;
	}
	
	
	public int getStreet() {
		return street;
	}
	
	
	public void setStreet(int street) {
		this.street = street;
	}
	
	

	/**
	 * hashCode() and equals() methods 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + avenue;
		result = prime * result + street;
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Intersection other = (Intersection) obj;
		if (avenue != other.avenue)
			return false;
		if (street != other.street)
			return false;
		return true;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Implement a Testing main()   !!!!!!!!!!!!!!!!
		// create 2 instances , populate, display, compare  ... does everything look sane??

	}
}
