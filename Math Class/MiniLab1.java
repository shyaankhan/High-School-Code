//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class MiniLab1 {
	public static void main(String []args)
	{
		int sum;
		int die1;
		int die2;
		
		die1 = (int) (Math.random() * 5) +1;
		
		die2 = (int) (Math.random() * 5) + 1;
		
		System.out.println("Die 1: "+die1);
		System.out.println("Die 2: "+die2);
		
		sum = die1 + die2;
		
		System.out.println("Sum: "+sum);
		
	}

}
