package dessertShoppe;

public class Candy extends DessertItem{
	double candyWeight;
	int pricePerPound;
	
public Candy(String name, double candyWeight, int pricePerPound) {
	super(name);
	this.candyWeight = candyWeight;
	this.pricePerPound = pricePerPound;
}

public double getCandyWeight() {
	return candyWeight;
}

public int getPricePerPound() {
	return pricePerPound;
}

@Override	
public int getCost() {
double temp = candyWeight*pricePerPound;
int price = (int)temp;
return price;
}
}
