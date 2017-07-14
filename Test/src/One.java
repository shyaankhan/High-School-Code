//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------
import java.util.Scanner;
/**
 * @author mv.skhan
 *
 */
public class One
	{
	public static void main( String[]args )//copy/paste your Eclipse code
	  {
		Scanner scan = new Scanner(System.in);
		int sum=0;
		int num = scan.nextInt();
		while (num>0)
		{ 
			int remainder = num % 10;
			sum= sum +remainder; 
			num = num/10;		

		}
		System.out.println(sum);
		
	  }
}


