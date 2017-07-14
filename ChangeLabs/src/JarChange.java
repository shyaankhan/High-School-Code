//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 9/10
// Description: Determines the value of coins in a jar and prints the total; in dollars and cents
//-----------------------------------------------------------
import java.util.Scanner;
public class JarChange {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of quarters: ");
		int amtQuarters = scan.nextInt();
		System.out.print("Enter the number of dimes: ");
		int amtDimes = scan.nextInt();
		System.out.print("Enter the number of nickels: ");
		int amtNickels = scan.nextInt();
		System.out.print("Enter the number of pennies: ");
		int amtPennies = scan.nextInt();
		System.out.print("Total Value: $");
		double totalQuarters = (amtQuarters*.25);
		double totalDimes = (amtDimes*.10);
		double totalNickels = (amtNickels*.05);
		double totalPennies = (amtPennies*.01);
		double Total = (totalQuarters + totalDimes + totalNickels + totalPennies);
		System.out.println(Total);

	}
}
