package assignment7;

public class Rock extends Tool{
	private int strength;
	private char type;
	public Rock(int strength) {
		super(strength);
		this.strength = strength;
		type = 'r';
	}
	
	public int getStrength() {
		return strength;
	}
	public boolean fight(Tool tool) {
		if (tool instanceof Scissors)
		{
			int temp1 = tool.strength/2;
			if(temp1 < getStrength())
			{
				return true;
			}
			return false;
		}
		if(tool instanceof Paper)
		{
			int temp2 = tool.strength*2;
			if(temp2 < getStrength())
			{
				return true;
			}
		return false;
		}
		return false;
	}

	

}
