//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	10/17
// Description: write a program that lists divisors from number1 to numberentered.
//-----------------------------------------------------------

import java.util.Scanner;

public class PerfectLab {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int numentered = scan.nextInt();
		
		
		for(int a =1; a<= numentered; a++)
		{
			int rowNum = a;
			int sum = 0;
			
			System.out.print(a+": ");
			
			for(int c = a; c>=1; c--)
			{
				int d = a/c;
				
				if(a%c==0)	
				{
					if (c==1)
					{
						System.out.print(d+" ");
					
					}
					else
					{
						System.out.print(d+",");
						sum+=d;
					}
					
				}
		
			}		
			if(sum == rowNum)
				System.out.print(rowNum+" is a perfect number");
		
		System.out.println();
	}		
}		
}


