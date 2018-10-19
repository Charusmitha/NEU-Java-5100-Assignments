package dessertShoppe;

import java.util.Vector;

public class Checkout{
	Vector v = new Vector();
	int receiptWidth = 30;
	
public Checkout() {
}

public int numberOfItems() {
	return v.size();
}

public void enterItem(DessertItem item) {
	v.add(item);
}

public void clear() {
	v.clear();
}

public int totalCost() {
	int allItemCost = 0;
	for(int i=0; i<v.size();i++)
	{
		allItemCost += ((DessertItem) v.elementAt(i)).getCost();
	}
	return allItemCost;
}

public int totalTax() {
	double temp = totalCost()*(DessertShoppe.taxRate)/100;
	 int tax = (int)Math.round(temp);
	 return tax;
}

public String toString() {
	String s = "";
	s += "          " +DessertShoppe.storeName+ "\n";
	s += "      " +"---------------------"+ "\n";
	
	for(int i=0; i<v.size();i++)
	{
		String name = ((DessertItem) v.elementAt(i)).getName();
		String cost = DessertShoppe.cents2dollarsAndCents(((DessertItem) v.elementAt(i)).getCost());
		
		if(cost.length() > DessertShoppe.maxWidthOfCost)
		{
			cost = cost.substring(0,DessertShoppe.maxWidthOfCost);
		}
		while(cost.length() < DessertShoppe.maxWidthOfCost)
		{
			cost = " " + cost;
		}
		
		if(v.elementAt(i) instanceof Sundae)
		{
			s += ((Sundae) v.elementAt(i)).getTopping() + " Sundae with\n";
			while(name.length() < (receiptWidth - DessertShoppe.maxWidthOfCost))
			{
				name += " ";		
			}
			s += name + cost + "\n"; 
		}
		else if(v.elementAt(i) instanceof IceCream)
		{
			while(name.length() < (receiptWidth - DessertShoppe.maxWidthOfCost))
			{
				name += " ";		
			}
			s += name + cost + "\n"; 
		}
		else if(v.elementAt(i) instanceof Cookie)
		{
			s += ((Cookie) v.elementAt(i)).getNumOfCookies() +" @ " + DessertShoppe.cents2dollarsAndCents(((Cookie) v.elementAt(i)).getPricePerDozen()) + " /dz.\n";
			while(name.length() < (receiptWidth - DessertShoppe.maxWidthOfCost))
			{
				name += " ";		
			}
			s += name + cost + "\n"; 
		}
		else if(v.elementAt(i) instanceof Candy)
		{
			s += ((Candy) v.elementAt(i)).getCandyWeight() +" lbs. @ " +DessertShoppe.cents2dollarsAndCents(((Candy) v.elementAt(i)).getPricePerPound()) + " /lb.\n";
		while(name.length() < (receiptWidth - DessertShoppe.maxWidthOfCost))
		{
			name += " ";		
		}
		s += name + cost + "\n"; 
		}
	}
	
	String taxLine = "Tax";
	String tax = DessertShoppe.cents2dollarsAndCents(totalTax());
	if(tax.length() > DessertShoppe.maxWidthOfCost)
	{
		tax = tax.substring(0,DessertShoppe.maxWidthOfCost);
	}
	while(tax.length() < DessertShoppe.maxWidthOfCost)
	{
		tax = " " + tax;
	}
	while(taxLine.length() < (receiptWidth - DessertShoppe.maxWidthOfCost))
	{
		taxLine += " ";
	}
	s += "\n" +taxLine + tax + "\n";
	
	String totalCostLine = "Total Cost";
	int tempTotalCost = totalCost()+totalTax();
	String totalCost = DessertShoppe.cents2dollarsAndCents(tempTotalCost);
	if(totalCost.length() > DessertShoppe.maxWidthOfCost)
	{
		totalCost = totalCost.substring(0,DessertShoppe.maxWidthOfCost);
	}
	while(totalCost.length() < DessertShoppe.maxWidthOfCost)
	{
		totalCost = " " + totalCost;
	}
	while(totalCostLine.length() < (receiptWidth - DessertShoppe.maxWidthOfCost))
	{
		totalCostLine += " ";
	}
	s += "\n" +totalCostLine + totalCost + "\n";
	return s;
}
}

