//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	10/1/14
// Description: Compute the sum of the squares of the first 50 counting numbers
//-----------------------------------------------------------
public class Number2 {
	public static void main(String[]args){
		int k = 1;
		int total = 0;
		
		while(k <= 50)
		{
			total= total +(k*k);
			k++;
		}
		
		System.out.println(total);
	}

}
