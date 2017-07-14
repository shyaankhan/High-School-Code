//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class MiniLab2 {
	public static void main(String [] args)
	{
		int value;
		int sum = 0;
		for(int x = 0; x< 100; x++)
		{
			value = (int) (Math.random()*20) +10;
			sum += value;
		}
		
		System.out.println("Total Sum: "+sum);
	}

}
