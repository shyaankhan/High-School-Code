//--------------------------------------------------------------------------------------
//Author: Shyaan Khan      Period: 4         Date: September 4th, 2014
//Description: A program that determines your net pay and gross pay 
//---------------------------------------------------------------------------------------
import java.util.Scanner;

public class MiniLab2_Payroll {
	public static void main (String args[]){
		Scanner scan = new Scanner (System.in);
		String name ="Shyaan Khan";
		System.out.println(name);
		final double INCOME_TAX = .28;
		System.out.println("");
		System.out.print("My hourly rate is: $");
		double hourlyRate = scan.nextDouble();
		System.out.print("Numbers of hours I worked are: ");
		int hoursWorked = scan.nextInt();
		double grossPay = hourlyRate*hoursWorked;
		System.out.print("My gross Pay is : $"+grossPay);
		System.out.println("");
		double tax = grossPay*INCOME_TAX;
		double netPay = grossPay - tax;
		System.out.println("My Net Pay is: $"+netPay);
		System.out.println("");
		System.out.print("I need a new job!");
		
	}
}
