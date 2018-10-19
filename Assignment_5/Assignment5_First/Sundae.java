package dessertShoppe;

public class Sundae extends IceCream{
	String topping;
	int costOfTopping;
	
public Sundae(String iceCreamName, int iceCreamCost, String topping, int costOfTopping) {
	super(iceCreamName, iceCreamCost);
	this.topping = topping;
	this.costOfTopping = costOfTopping;
}

public String getTopping()
{
	return topping;
}
@Override
public int getCost() {
	return iceCreamCost+costOfTopping;
}

}
