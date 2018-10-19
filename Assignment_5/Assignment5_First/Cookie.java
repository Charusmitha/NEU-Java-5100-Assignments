package dessertShoppe;

public class Cookie extends DessertItem{
	int numOfCookies;
	int pricePerDozen;
	
public Cookie(String name, int numOfCookies, int pricePerDozen) {
	super(name);
	this.numOfCookies = numOfCookies;
	this.pricePerDozen = pricePerDozen;
}

public int getNumOfCookies() {
	return numOfCookies;
}

public int getPricePerDozen() {
	return pricePerDozen;
}
@Override
public int getCost() {
	return numOfCookies*pricePerDozen;
}
}

