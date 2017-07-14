//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	10.2.14
// Description: requests a description of the item, the year of purchase, the cost of the item, the number of years to be depreciated  and the method of depreciation. Displays a depreciation schedule for the item similar to the schedule shown below
//-----------------------------------------------------------
import java.util.Scanner;
public class Number6 {
	
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		Scanner scan1= new Scanner (System.in);

		System.out.println("Please enter method of deprecation (straight line or double-declining)");
		String method = scan.nextLine();
	
		System.out.println("Please enter description of product");
		String description= scan.nextLine();
		
		System.out.println("Please enter year the product was purchased");
		int years =scan1.nextInt();
	
		System.out.println("Please enter cost of product");
		double cost = scan1.nextDouble();
	
		System.out.println("Please enter years to be depreciated (estimated life)");
		int n = scan1.nextInt();
		
		int limit = years+n;
		
		
		System.out.println( "Description: "+description);
		System.out.println("Year of purchase: "+years);
		System.out.println("Cost of purchase: $"+cost);
		System.out.println("Estimated Life: "+n+" years");
		System.out.println("Method of Depreciation: "+method+"\n");
		
		if (method.equalsIgnoreCase("straight line"))
		{
			double prevTotal = 0;
			System.out.print("Year	Value at Beginning of year 		Depreciation during year		Total depreciation\n");
			while (years<limit)
			{
				double prevCost= cost;
				double firsttotal= (cost*(1.0/n));
				cost = cost - (cost*(1.0 / n));
		
				prevTotal += firsttotal;
				
				System.out.print(years+"	$");
				System.out.printf("%.2f", prevCost);
				System.out.print("					$");
				System.out.printf("%.2f", firsttotal);
				System.out.print("					$");
				System.out.printf("%.2f", prevTotal);
				System.out.println();
		
				years++;		
			}		
		}
		if (method.equalsIgnoreCase("double-declining"))
				{
					
					double prevTotal = 0;
					System.out.print("Year	Value at Beginning of year 		Depreciation during year		Total depreciation\n");
					while(years<limit)	
					{
						double prevCost = cost;
						double total1 = (cost*(2.0/ n));
						
						prevTotal += total1;
						
						cost = cost - (cost*(2.0/ n));
						System.out.print(years+"	$");
						System.out.printf("%.2f", prevCost);
						System.out.print("					$");
						System.out.printf("%.2f", total1);
						System.out.print("					$");
						System.out.printf("%.2f", prevTotal);
						System.out.println();
						
						years++;
					}	
			}
	}
}
