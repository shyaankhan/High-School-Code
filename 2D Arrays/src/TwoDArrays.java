//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------
import java.util.Arrays;

public class TwoDArrays {
	public static void main(String[] args)
	{
		int [][] array = new int[3][4]; 
		
		for(int row = 0; row < array.length; row++)
		{
			for(int col= 0; col < array[0].length; col++)
			{
				array[row][col] = row + col;
				System.out.print(array[row][col]+" ");
			}
			System.out.print("\n");
		}
	
		//boolean check = isSquare(array);
		//System.out.println(check);
		
		
		boolean check = isMagic(array);
		System.out.println(check);
	
	
	}
	
	public static int max(int [][] a)
	{
		int [][] tempArray = a;
		int maxValue = tempArray[0][0];
		for(int row = 0; row<tempArray.length; row++)
		{
			for (int col = 0; col<tempArray[0].length; col++)
			{
				if (tempArray[row][col]> maxValue)
				{
					maxValue = tempArray[row][col];
				}
			}
		}
		
		return maxValue;
	}
	
	public static int rowSum(int[][] a, int x)
	{
		int [][] tempArray = a;
		int sum = 0;
		
		for(int row = x;row==x;row++)
		{
			for(int col = 0; col < tempArray[0].length; col++)
			{
				int element = tempArray[row][col];
				sum+=element;
			}
		}
		return sum;
	}

	public static int columnSum(int[][] a, int x)
	{
		int [][] tempArray =  a;
		int sum = 0;
		
		for(int row = 0; row <tempArray.length; row++)
		{
			for(int col = x; col == x; col++)
			{
				int element = tempArray[row][col];
				sum += element;
			}
		}
		
		return sum;
	}

	public static boolean isRowMagic(int[][] a )
	{
		int [][] tempArray = a;
		boolean magic = false;
		for(int i = 0; i < tempArray[0].length -1; i++)
		{
			if(rowSum(tempArray, i) == rowSum(tempArray, i++))
			{
				magic = true;
			}
			else
			{
				magic = false;
			}	
		}
		return magic;
	}		
	
	public static boolean isColumnMagic(int[][] a)
	{
		boolean columnMagic = true;
		int maxLength = a[0].length;
		for(int i = 0; i <a.length; i++)
		{
			if (a[i].length > maxLength)
			{
				maxLength = a[i].length;
			}
		}
		
		int val = columnSum(a, 0);
		for(int i = 0; i<maxLength; i++)
		{
			if (val != columnSum(a,i))
				{
					columnMagic= false;
				}
			
		}
		return columnMagic;
	}
	
	public static boolean isSquare(int[][]a)
	{
		int [][] tempArray = a;
		boolean square = true;
		int length = tempArray.length;
		
		for(int i = 0; i < length; i++)
		{
			if(length == tempArray[i].length)
			{
				square = true;
			}
			else
			{
				square = false; 
			}
			
		}
		
		return square;
	}
	
	public static boolean isMagic(int [][] a)
	{
		boolean magicSquare = false;
		
		int [][]tempArray = a;
		for(int row = 0; row < tempArray.length; row++)
		{
			int rowSum = rowSum(tempArray, row);
			
			for(int col = 0; col < tempArray[0].length; col++ )
			{
				int colSum = columnSum(tempArray, col);
				if(rowSum == colSum)
				{
					boolean square = isSquare(tempArray);
					if (square = true)
					{
						magicSquare = true;
					}
					else
					{
						magicSquare = false;
					}
				}
				else
				{
					magicSquare = false;
				}
			}
		}
		
		return magicSquare;
	}
	
	
		
}

