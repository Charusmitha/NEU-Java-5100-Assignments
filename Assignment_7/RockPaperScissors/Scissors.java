package assignment7;

public class Scissors extends Tool{
	private int strength;
	private char type;
	public Scissors(int strength) {
		super(strength);
		this.strength = strength;
		type = 's';
	}
	
	public int getStrength() {
		return strength;
	}
	
	public boolean fight(Tool tool) {
		if(tool instanceof Rock)
		{
			int temp1 = tool.strength*2;
			if(temp1 < getStrength())
			{
				return true;
			}
			return false;
		}
		if(tool instanceof Paper)
		{
			int temp2 = tool.strength/2;
			if(temp2 < getStrength())
			{
				return true;
			}
			return false;
		}
			return false;
		
	}
	}
	
	



