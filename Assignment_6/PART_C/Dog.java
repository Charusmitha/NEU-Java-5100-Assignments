package pets;

import java.util.Calendar;
import java.util.Date;

public class Dog extends Pet implements Boardable {
	
	private String Size;
	Date BoardingStartDate, BoardingEndDate, Boarding;
	
	
	public Dog(String PetName, String OwnerName, String Color, String Size) {
		super(PetName,OwnerName,Color);
		this.Size = Size;
	}
	
	public String getSize() {
		return Size;
	}
	
	public String toString() {
		return "DOG: " +"\n" + super.toString() + "\nSize: " +this.Size;
	}
	@Override
	public void setBoardStart(int month, int day, int year)  {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		BoardingStartDate = cal.getTime();
		
		
	}

	@Override
	public void setBoardEnd(int month, int day, int year)  {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		BoardingEndDate = cal.getTime();
	}
	
	@Override
	public boolean boarding(int month, int day, int year)  {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		Boarding = cal.getTime();
		
		if((Boarding.compareTo(BoardingStartDate) > 0) && (Boarding.compareTo(BoardingEndDate) < 0) || (Boarding.compareTo(BoardingStartDate) == 0) || (Boarding.compareTo(BoardingEndDate) == 0))
		{
		return true;
		}
		return false;
	}

}