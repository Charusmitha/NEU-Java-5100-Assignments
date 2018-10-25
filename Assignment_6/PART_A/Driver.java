package mreview;

public class Driver {

	public static void main(String[] args) {
		Mreview m1 = new Mreview("Mission Impossible");
		m1.addRating(4);
		m1.addRating(5);
		m1.addRating(4);
		System.out.println(m1);
		Mreview m2 = new Mreview("Harry Potter", 4);
		m2.addRating(4);
		m2.addRating(5);
		m2.addRating(5);
		System.out.println(m2);
	// Results of compareTo() and equals() with different inputs
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Movie list contains 2 movies in the order ' Mission Impossible' and 'Harry Potter'");
		System.out.println("Result of compareTo method when 'Harry potter' is compared to 'Mission Impossible' : " +m2.compareTo(m1));
		System.out.println("Result of compareTo method when 'Mission Impossible' is compared to 'Harry Potter' : " +m1.compareTo(m2));
		System.out.println("Result of compareTo method when 'Harry Potter' is compared to 'Harry Potter' : " +m2.compareTo(m2));
		System.out.println("Result of equals method when 'Mission Impossible' is equal to 'Harry Potter' : " +m1.equals(m2));
		System.out.println("Result of compareTo method when 'Harry Potter' is equal to 'Harry Potter' : " +m2.equals(m2));
	}

	}
