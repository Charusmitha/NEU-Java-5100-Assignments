package pets;

import java.util.Calendar;
import java.util.Date;


public class Cat extends Pet implements Boardable {
	
	private String HairLength;
	Date BoardingStartDate;
	Date BoardingEndDate;
	Date Boarding;
	
	public Cat(String PetName, String OwnerName, String Color, String HairLength) {
		super(PetName, OwnerName, Color);
		this.HairLength = HairLength;
	}
	
	public String getHairLength() {
		return HairLength;
	}
	
	@Override
	public String toString() {
		return "CAT: " +"\n" + super.toString() + "\nHair: " +this.HairLength;
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
