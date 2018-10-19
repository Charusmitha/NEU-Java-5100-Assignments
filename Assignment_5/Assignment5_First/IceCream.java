package dessertShoppe;

public class IceCream extends DessertItem{
	int iceCreamCost;
	
public IceCream(String name, int iceCreamCost) {
	super(name);
	this.iceCreamCost = iceCreamCost;
}

@Override
public int getCost() {
	return iceCreamCost;
}
}
