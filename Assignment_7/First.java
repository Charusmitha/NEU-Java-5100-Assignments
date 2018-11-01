package assignment7;

public class MyIndexOutOfBoundException extends Exception{
	
	String str;
	
	public MyIndexOutOfBoundException(String str) {
		this.str=str;
	   }

	public String toString() {
	return (str);
	}
	
	public static void main(String[] args) {
		int count = 0;
		int index = 0;
		int lowerBound = 0;
		int upperBound = 2;
		
		try {
		int[] test = new int[3];
		for(int i =0; i<=test.length;i++)
		{
		if(i>=test.length)
		{
			index = i;
			throw new MyIndexOutOfBoundException("Error Message: Index: " +index +", but Lower Bound: " +lowerBound +", Upper Bound: " +upperBound);
		}
		test[i] = count++;
		}
		}
				
		catch(MyIndexOutOfBoundException exp){
			System.out.println(exp) ;
		}

	}
	
	

}
