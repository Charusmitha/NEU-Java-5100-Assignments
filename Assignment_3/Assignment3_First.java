package registration;

public class Test {
	public static void main(String[] args) {
		//charu and lee are objects of class Student
		Student charu = new Student("Charu", 100);
		Student lee = new Student("Lee", 200);
		//java and db are objects of class Course
		Course java = new Course("Java");
		Course db = new Course("Database Management");
		
		String Course1Name = java.getCourseName();
		String Course2Name = db.getCourseName();
		
		System.out.println("Student " +charu.getName()+ " with ID " +charu.getID()+ " wants to register to " +Course1Name+ " course\n");
		System.out.println("List of Students currently registered to " +Course1Name+ " course");
		//Adding 10 students to javaStudents array of type Student to check the scenario where the seats are full and registration is not allowed
		java.javaStudents[0] = new Student("Divya", 800);
	    java.javaStudents[1] = new Student("Gavin", 900);
	    java.javaStudents[2] = new Student("Amanda", 909);
	    java.javaStudents[3] = new Student("Zen", 908);
	    java.javaStudents[4] = new Student("Emily", 907);
	    java.javaStudents[5] = new Student("Elise", 906);
	    java.javaStudents[6] = new Student("Jim", 905);
	    java.javaStudents[7] = new Student("Rachel", 904);
	    java.javaStudents[8] = new Student("Tim", 903);
	    java.javaStudents[9] = new Student("Bob", 902);
	    //Print list of students currently registered to java course
	    java.getStudent(java.javaStudents);
	    int Course1NumOfStudents = java.getNumOfStudents();
	    System.out.println("\nNumber of students registered to " +Course1Name+ " course : " +Course1NumOfStudents);
	    //Check if registration is available for java course based on the seats occupied
	    if (java.isFull(Course1NumOfStudents))
		{
			System.out.println("\nSeats full. Cannot register to the course");
		}
		else
		{
			System.out.println("\nSeats available for " +Course1Name+ " course registration");
			java.registerStudent(charu);
			java.registerStudent(lee);
			System.out.println("\nRegistration Successfull");
			System.out.println("\nList of Students registered to " +Course1Name+ " course");
			java.getStudent(java.javaStudents);
		}
		
	    System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("\nStudent " +lee.getName()+ " with ID " +lee.getID()+ " wants to register to " +Course2Name+ " course\n");
		System.out.println("List of Students currently registered to " +Course2Name+ " course");
		
		//Adding 1 student to dbStudents array of type Student
		db.dbStudents[0] = new Student("Mihir", 500);
		//Print list of students currently registered to db course
		db.getStudent(db.dbStudents);
		int Course2NumOfStudents = db.getNumOfStudents();
		System.out.println("\nNumber of students registered to " +Course2Name+ " course : " +Course2NumOfStudents);
		 //Check if registration is available for db course based on the seats occupied
		if (db.isFull(Course2NumOfStudents))
		{
			System.out.println("\nSeats full. Cannot register to the course");
		}
		else
		{
			System.out.println("\nSeats available for " +Course2Name+ " course registration");
			db.registerStudent(lee);
			System.out.println("\nRegistration Successfull");
			System.out.println("\nList of Students registered to " +Course2Name+ " course");
			db.getStudent(db.dbStudents);
		}
		
		
		
	}
}

public class Student {
	  String name;
	    int ID;
	    
	public Student(String name, int ID) {
		this.name = name;
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}
	
	public String toString()
	{
		return "Student Name: " +this.name + ", Student ID: " + this.ID;
	}
}

import java.util.Arrays;

public class Course {
	 String courseName; //use private 
	 int numOfStudents;
	 Student[] javaStudents = new Student[10];
	 Student[] dbStudents = new Student[10];
	 
public Course(String courseName) {
    this.courseName = courseName;
}


public String getCourseName() {
	return courseName;
}

public int getNumOfStudents() {
	return numOfStudents;
}

public void getStudent(Student[] inputArray) {
	int count = 0;
	for(int i =0; i<inputArray.length; i++)
	{
		if(inputArray[0] == null)
		{
			System.out.println("No students registered");
			break;
		}
		if(inputArray[i] != null)
		{
			System.out.println(inputArray[i]);
			count++;
		}
	}
	numOfStudents = count;
}

public boolean isFull(int numOfStudents) {
	if (numOfStudents >= 10)
	{
		return true;
	}
		return false;

}


public void registerStudent(Student student) {
	switch(courseName){
	case "Java":
	    for(int i=0; i < javaStudents.length; i++)
	    {
		    if(javaStudents[i] == null)
		    {
		    	javaStudents[i] = new Student(student.name, student.ID);
		    	break;
		    }
	    }
	    break;
	case "Database Management":
		for(int i = 0; i < dbStudents.length; i++)
		{
			if(dbStudents[i] == null)
			{
				dbStudents[i] = new Student(student.name, student.ID);
				break;
			}
		}
		break;
	default:
		System.out.println("Invalid Course");
		break;
	
	}
}
}
