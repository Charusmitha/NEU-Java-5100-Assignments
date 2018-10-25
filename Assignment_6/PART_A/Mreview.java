package mreview;

import java.util.ArrayList;
import java.util.Arrays;

public class Mreview implements Comparable<Mreview> {
	private String title;
	private ArrayList<Integer> ratings = new ArrayList<Integer>();
	
	public Mreview() {}
	
	public Mreview(String title) {
		this.title = title;
	}
	
	public Mreview(String title, int firstRating) {
		this.title = title;
		ratings.add(firstRating);
	}
	
	public String getTitle() {
		return title;
	}
	
	public void addRating(int r) {
		ratings.add(r);
	}
	
	public double aveRating() {
		int sum =0;
		for(int i=0; i< ratings.size(); i++)
		{
			sum = sum + ratings.get(i);
		}
		return sum/ratings.size();
	}
	
    public int numRatings() {
    	return ratings.size();
	}
    
	@Override
	public int compareTo(Mreview o) {
		Mreview m = (Mreview) o;
		int result = this.title.compareTo(m.title);
		if(result != 0)
		{
			return result;
		}
		return result;
	}
	
	@Override
	public boolean equals(Object o) {
		Mreview m = (Mreview) o;
		if(m.title == this.title) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return getTitle() +",average " +aveRating() +" out of " +numRatings() +" ratings ";
	}
	
}
