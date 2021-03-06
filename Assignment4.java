package assignment4;

import java.util.Arrays;
import java.util.HashMap;

public class Assignment4 {
	public static void main(String[] args) throws Exception {
		Assignment4 assignment = new Assignment4();
		String input = "loveleetcode";
		System.out.println("Input string: " +input);
		System.out.println("Index of first non repeated character: " +assignment.firstUniqChar(input));
		int num = 18918;
		System.out.println("----------------------------------------------------");
		System.out.println("Input number: " +num);
		System.out.println("Sum of digits until result is single digit: " +assignment.addDigits(num));
		int[] nums = {1,0,2,5,0};
		System.out.println("----------------------------------------------------");
		System.out.println("Input Array: " +Arrays.toString(nums));
		assignment.moveZeroes(nums);
		try{
			String s = "abababab";
			System.out.println("----------------------------------------------------");
			System.out.println("Input String: " +s);
			System.out.println("Longest palindromic substring: " +assignment.longestPalindrome(s));
		}
		catch (Exception e){
			System.out.println("Invalid input");
		}	
		int[][] matrix = {
						  {1,2,3,4},
						  {5,6,7,8},
						  {9,10,11,12},
						  {13,14,15,16}};
						  
					
		System.out.println("----------------------------------------------------");
		System.out.println("Input Matrix: ");
		assignment.printMatrix(matrix);
		System.out.println("Output Matrix: ");
		assignment.rotate(matrix);
		
	}

public int firstUniqChar(String input) {
	int index = 0;
	HashMap<Character,Integer> charMap = new HashMap<>();
	for(int i =0; i< input.length(); i++)
	{
		char ch = input.charAt(i);
		if(charMap.containsKey(ch))
		{
			charMap.put(ch, charMap.get(ch)+1);
		}
		else
		{
			charMap.put(ch, 1);
		}
	}
	for(int i=0;i<input.length();i++)
	{
		char ch = input.charAt(i);
		if(charMap.get(ch) == 1)
		{
			index = i;
			break;
		}
		else
		{
			index = -1;
		}
	}
	return index;
}

public int addDigits(int num) {
	if(num ==0)
	{
		return 0;
	}
	else if(num%9 == 0)
	{
		return 9;
	}
	else
	{
		return num%9;
	}
}

public void moveZeroes(int[] nums) {
	int count =0;
	for(int i =0; i<nums.length;i++)
	{
		if(nums[i] !=0)
		{
			nums[count] = nums[i];
			count++;
		}
	}
	while(count<nums.length)
	{
		nums[count] = 0;
		count++;
	}
	System.out.println("Output Array: " +Arrays.toString(nums));
}

public String longestPalindrome(String s) {
	
	if(s.length() <2)
	{
		return s;
	}
	
	String longest = s.substring(0, 1);
	for (int i = 0; i < s.length(); i++) {
		
		String temp = help(s, i, i);
		if (temp.length() > longest.length()) {
			longest = temp;
		}
 
		
		temp = help(s, i, i + 1);
		if (temp.length() > longest.length()) {
			longest = temp;
		}
	}
 
	return longest;
}
 
public String help(String s, int begin, int end) {
	while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
		begin--;
		end++;
	}
	return s.substring(begin + 1, end);

}

public void rotate(int[][] matrix)
{
	int length = matrix.length-1;
	 
	for (int i = 0; i <= (length)/2; i++) {
		for (int j = i; j < length-i; j++) {

			int temp = matrix[i][j];

			matrix[i][j] = matrix[length-j][i];
			matrix[length-j][i] = matrix[length-i][length-j];
			matrix[length-i][length-j] = matrix[j][length-i];
			matrix[j][length-i] = temp;
		}
	}
	printMatrix(matrix);
}

public  void printMatrix(int[][] matrix)
{
	for(int i=0; i< matrix.length;i++)
	{
		System.out.println(Arrays.toString(matrix[i]));
	}
}

}