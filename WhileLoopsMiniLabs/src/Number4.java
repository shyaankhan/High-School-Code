//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------
import java.util.Scanner;

public class Number4 {
	public static void main(String[]args){
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter each number:");
		int num = 0;
		int prevNum = 0;
		int n = 0;
		String numSequence = "";
		while(num >=0)
		{
			num = scan.nextInt();
			if(prevNum == num)
			{ 
				n++;
			}
			prevNum = num;
			if (num>=0)
			{	
			numSequence += num + ",";
			}
		}
		
		System.out.println("The numbers are: "+numSequence);
		
		System.out.println("Number of consecutive Duplicates are/is: "+n);
	}
}
