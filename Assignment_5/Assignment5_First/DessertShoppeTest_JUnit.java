package dessertShoppe;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Before;
import org.junit.Test;

public class DessertShoppeTest {

	private DessertShoppe classUnderTest;
	
	@Before
	public void setUp() throws Exception {
		classUnderTest = new DessertShoppe();
	}

	@Test
	public void testCents2dollarsAndCents() {
		double tempDouble;
		String output;
		
		tempDouble = (double)599/100;
		if((tempDouble-(int)tempDouble) == 0)
		{
		DecimalFormat df = new DecimalFormat("#.00");
		output = df.format(tempDouble);
		}
		else
		{
		output = Double.toString(tempDouble);
		}
		
		assertEquals(output,classUnderTest.cents2dollarsAndCents(599));
		
		tempDouble = (double)69900/100;
		if((tempDouble-(int)tempDouble) == 0)
		{
		DecimalFormat df = new DecimalFormat("#.00");
		output = df.format(tempDouble);
		}
		else
		{
		output = Double.toString(tempDouble);
		}
		
		assertEquals(output,classUnderTest.cents2dollarsAndCents(69900));
		
		tempDouble = (double) 89/100;
		if((tempDouble-(int)tempDouble) == 0)
		{
		DecimalFormat df = new DecimalFormat("#.00");
		output = df.format(tempDouble);
		}
		else
		{
		output = Double.toString(tempDouble);
		}
		
		assertEquals(output,classUnderTest.cents2dollarsAndCents(89));
		
	}

}
