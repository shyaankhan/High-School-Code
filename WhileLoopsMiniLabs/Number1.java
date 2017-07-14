//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	9.30.14
// Description: Print the number given by the user and the odd numbers up to the number given.  
//-----------------------------------------------------------
import java.util.Scanner;

public class Number1 {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int numb = scan.nextInt();
	
		int i = 1; 
		System.out.println("Number entered = "+numb);
		System.out.print("Odd Numbers:");
		while(i<=numb)
		{
			if(i!= numb && i!= (numb+1)&&  i!= (numb-1))
			{
				System.out.print(i+",");
			}
			else
			{
				System.out.print(i);
			}
				i+=2;
		}
	}
}
