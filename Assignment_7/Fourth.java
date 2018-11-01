package assignment7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		Interval i1 = new Interval(1,3);
		Interval i2 = new Interval(2,4);
		Interval i3 = new Interval(5,7);
		Interval i4 = new Interval(6,8);
		
		LinkedList<Interval> list = new LinkedList<Interval>();
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		System.out.println(list);
		System.out.println(merge(list));
		

	}

	 public static List<Interval> merge(List<Interval> intervals) {
		 List<Interval> result = new ArrayList<Interval>();
			Collections.sort(intervals);
			Interval pre = intervals.get(0);
		    for(int i=0; i<intervals.size(); i++){
		        Interval curr = intervals.get(i);
		        if(curr.start>pre.end)
		        {
		            result.add(pre);
		            pre = curr;
		        }
		        else
		        {
		            Interval merged = new Interval(pre.start, Math.max(pre.end, curr.end));
		            pre = merged;
		        }
		    }
		    result.add(pre);
		 
		    return result;
	 }	
}

public class Interval implements Comparable<Interval>{
	int start;
	int end;
	
	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Interval o) {
		if(o==null)
		{
			return -1;
		}
		return Integer.compare(start, o.start);
	}
	
	@Override
	public String toString() {
	    return "Interval{" +
	            "start=" + start +
	            ", end=" + end +
	            '}';
	  }
}