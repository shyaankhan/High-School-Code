//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class OverloadedMethods {	
     //Method1:
	public static void simpleInterest(double bal, double rate)
	{
	double interest;
	interest = bal * rate;
	System.out.println(" #1_Interest on " + bal + " at " +
	rate + " interest rate is " + interest);
	}

	//Method2:
	public static void simpleInterest(double bal, int rate)
	// Notice rate type
	{
	double interest, rateAsPercent;
	rateAsPercent = rate/100.0;
	// Converts whole number rate to decimal equivalent 
	interest = bal * rateAsPercent; 
	System.out.println(" #2_Interest on " + bal + " at " + rate + " interest rate is " + interest);
	}

	//Method3:
	public static void simpleInterest(int rate, double bal)
	// Notice rate type
	{ 
	double interest, rateAsPercent;
	rateAsPercent = rate/100.0;
	// Converts whole number rate to decimal equivalent 
	interest = bal * rateAsPercent; 
	System.out.println(" #3_ Interest on " + bal + " at " + rate + " interest rate is " + interest);
	}
	

	/*public static double simpleInterest(int rate, double bal)
	{ 
		double interest, rateAsPercent;
		rateAsPercent = rate/100.0;
		// Converts whole number rate to decimal equivalent 
		interest = bal * rateAsPercent; 
		System.out.println(" #4_ Interest on " + bal + " at " + rate + " interest rate is " + interest);
           return interest;
		}
	*/

	
	public static void main(String[]args){
		//Q1: following code will work why or why not? which method will it print?
		//simpleInterest(1000, 0.04);
		
			//yes it will work, because there is an int and a double and it will print method 3
		
		//Q2: following code will work why or why not? which method will it print?
		// simpleInterest (1000, 4);
		
			//it will not work, because these numbers can fit in any method, and they will compete
		
		 //Q3:following will work why or why not? which method will it print?
		//simpleInterest(1000.0, 4);

			//yes, because there is a method for a double and an int, method 2
		
		//Q4:following code will work why or why not? which method will print- what will be printer?
		// simpleInterest(1000.0, 0.04);
		
			//yes, it will work because there is a method for both doubles as parameters, method 1
			//#1_Interest on 1000 at 0.04 interest rate is 40
		
		//Q5: following code will work why or why not? which method will print- what will be printeD?
		//  simpleInterest(1000, 4); 
		
			//it will not work, because these numbers can fit in any method, and they will compete
			//it will not print anything
		
		//Q6:What if we added another  method  above with a method header: public static double simpleInterest( int rate, double bal)
		//Would the compiler see it as a different method and be happy :) or not Happy :( Why?
		
			//the compiler would not be happy, because the signature is the same as method 3
		 
		
		//Q7: Write the signature of Method 1 and Method 2
		
		//method 1: simpleInterest(double bal, double rate)
		//method 2: simpleInterest(double bal, int rate)
	}
	
}

