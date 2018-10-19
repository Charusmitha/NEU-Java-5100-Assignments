package spiral;

import java.util.List;
import java.util.*;

public class Spiral {

	public static void main(String[] args) {
		int[][] matrix = {
				         {1,2,3,4},
				         {5,6,7,8},
				         {9,10,11,12},
				         {13,14,15,16}
		                 };
		System.out.println("Input Matrix: ");
		printMatrix(matrix);
		List<Integer> output = new ArrayList<Integer>();
		output = spiralOrder(matrix);
		System.out.println("Output: " + "\n" +output);
	}
	
	public static List<Integer> spiralOrder(int[][] matrix){
		List<Integer> list = new ArrayList<Integer>();
		int i=0;
		int matrixColumnLength = matrix[0].length;
		int matrixRowLength = matrix.length;
	    int rowLength = matrixRowLength - 1;
		int columnLength = matrixColumnLength-1;
		int rFirst=0;
		int cFirst=0;
		int rLast=rowLength;
		int cLast=columnLength;
		boolean isFirstIteration = true;
		
		if(rFirst == rLast)
		{
			for(i=0;i<matrixColumnLength; i++)
			{
				list.add(matrix[rFirst][i]);
			}
			return list;
		}
		if(cFirst == cLast)
		{
			for(i=0;i<matrixRowLength; i++)
			{
				list.add(matrix[i][cFirst]);
			}
			return list;
		}
		while(rFirst<=rLast && cFirst<=cLast) {
		for(i=cFirst; i< matrixColumnLength; i++)
		{
			list.add(matrix[rFirst][i]);
		}
		
		for(i=rFirst+1; i<=rowLength;i++)
		{	
			list.add(matrix[i][cLast]);
		}
		if(((columnLength > 1) && (rowLength > 1)) || isFirstIteration)
		{
		for(i=columnLength-1; i>=cFirst; i--)
		{
			list.add(matrix[rLast][i]);
			
		}
		for(i=rowLength-1; i>rFirst; i--)
		{
			list.add(matrix[i][cFirst]);
		}
		isFirstIteration = false;
		}
		
		rFirst++;
		cFirst++;
		rLast--;
		cLast--;
		rowLength--;
		columnLength--;
		matrixColumnLength--;
		}
		return list;
	}
	
	public static void printMatrix(int[][] matrix) {
		for(int i=0; i< matrix.length; i++)
		{
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

}
