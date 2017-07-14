//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 10.1.14
// Description:Write a while loop that takes a number and prints out the divisors of that number
//-----------------------------------------------------------
import java.util.Scanner;

public class Number3 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = scan.nextInt();
		int b = 1;
		while(b<=a)
		{
			
			if(a%b==0)
			{
				if(b!=a)
				{System.out.print(b+",");
				}
				else
				{
					System.out.print(a);
				}
			}
			b++;
		
		}
		
	}

}
