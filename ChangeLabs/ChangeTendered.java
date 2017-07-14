//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	9/10
// Description: determine how many 100, 50 , 20 , and 1 dollar bills, quarters, dimes, and pennies to give back.
//-----------------------------------------------------------
import java.util.Scanner;

public class ChangeTendered {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("What was the purchase price?");
		double purchase = scan.nextDouble();
		System.out.println("How much money did you pay with?");
		double paid = scan.nextDouble();
		System.out.print ("The purchase price was $");
		System.out.printf("%.2f", purchase);
		System.out.println();
		System.out.print("You payed $");
		System.out.printf("%.2f", paid);
		System.out.println();
		double change = paid - purchase;
		System.out.print("You recieved $");
		System.out.printf("%.2f", change);
		System.out.println(" in change");
		
		double hund = (int) change/100; 
		System.out.printf("%.0f", hund);
		System.out.println(" one hundred dollar bill (s)");
		
		double fifty = (int) ((change - (100*hund)) / 50);
		System.out.printf("%.0f",fifty);
		System.out.println(" fifty dollar bill (s)");

		double twenty = (int) ((change - (100*hund)-(50*fifty))/20);
		System.out.printf("%.0f", twenty);
		System.out.println(" twenty dollar bill (s)");
		
		double ten = (int) ((change - (100*hund) - (50*fifty) - (20*twenty))/(10));
		System.out.printf("%.0f", ten);
		System.out.println(" ten dollar bill (s)");
		
		double five = (int) ((change - (100*hund) - (50*fifty) - (20*twenty) - (10*ten))/(5));
		System.out.printf("%.0f", five);
		System.out.println(" five dollar bill (s)");
		
		double one = (int) ((change - (100*hund) - (50*fifty) - (20*twenty) - (10*ten) - (5*five))/(1));
		System.out.printf ("%.0f", one);
		System.out.println(" one dollar bill (s)");
		
		double quarters =  (int) ((change - (100*hund) - (50*fifty) - (20*twenty) - (10*ten) - (5*five) - (1*one))/(.25));
		System.out.printf("%.0f", quarters);
		System.out.println(" quarter (s)");
		
		double dime = (int) ((change - (100*hund) - (50*fifty) - (20*twenty) - (10*ten) - (5*five) - (1*one) - (.25*quarters))/(.10));
		System.out.printf("%.0f", dime);
		System.out.println(" dime (s)");
		
		double nickel =  (int) ((change - (100*hund) - (50*fifty) - (20*twenty) - (10*ten) - (5*five) - (1*one) - (.25*quarters) - (.10*dime))/(.05));
		System.out.printf("%.0f", nickel);
		System.out.println(" nickel (s)");
		
		double pennies = (int) ((change - (100*hund) - (50*fifty) - (20*twenty) - (10*ten) - (5*five) - (1*one) - (.25*quarters) - (.10*dime) - (.05*nickel))/(.01));
		System.out.printf("%.0f", pennies);
		System.out.println(" penny/pennies");
	}

}
