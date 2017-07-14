//--------------------------------------------------------------------------------------
//Author: Shyaan Khan      Period: 4         Date: September 3th, 2014
//Description: The application prints the sum, difference, and product of 2 numbers
//--------------------------------------------------------------------------------------
import java.util.Scanner;
public class FloatingNumbers {
	public static void main(String args[]){
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the first number: ");
		double a = scan.nextDouble();
		System.out.print("Enter the second number: ");
		double b = scan.nextDouble();
		System.out.println("Their sum is: "+(a+b));
		System.out.println("Their difference is: "+(a-b));	
		System.out.println("Their product is: "+(a*b));
	}
}
