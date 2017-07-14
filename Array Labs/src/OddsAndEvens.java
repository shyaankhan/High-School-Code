//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;

public class OddsAndEvens
{
	private static int countEm(int[] array, boolean odd)
	{
		return 0;
	}
	
	public static int[] getAllEvens(int[] array)
	{
		
		int[] evens = new int[9];
		int counter = 0;
		for(int i = 0; i<array.length; i++)
		{
		
	
				if(array[i]%2==0)
				{
					evens[i] = array [i];
								
				}
				
				
		}
	
		return evens;
	} 

	public static int[] getAllOdds(int[] array)
	{
		return array;		
	}
}