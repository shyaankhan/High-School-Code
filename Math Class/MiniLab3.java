import java.util.Scanner;

//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class MiniLab3 {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		double number = 0;
		
		System.out.println("Enter the lower number for the range");
		int lower = scan.nextInt();
		
		System.out.println("Enter the upper number for the range");
		
		int upper = scan.nextInt(); 
		
		for(int x = 0; x<10; x++)
		{
			number = (int)((upper-lower)* Math.random() + lower);
			System.out.println(number+", ");
		}
		
	}
	
	
}
