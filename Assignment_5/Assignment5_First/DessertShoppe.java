package dessertShoppe;

import java.text.DecimalFormat;

class DessertShoppe {
	
public final static double taxRate = 2;
public final static String storeName = "Kurt Farm Shop";
public final static int maxLengthOfName = 25;
public final static int maxWidthOfCost = 6;


public static String cents2dollarsAndCents(int cents) {
	double tempDouble = (double)cents/100;
	if((tempDouble-(int)tempDouble) == 0)
	{
	DecimalFormat df = new DecimalFormat("#.00");
	String tempString = df.format(tempDouble);
	return tempString;
	}
	String output = Double.toString(tempDouble);
	return output;
}

}
