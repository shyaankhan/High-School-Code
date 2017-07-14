//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------


public class Num1 {
	public static void main(String []args){
		for(int i =1; i<=5; i++)
		{
			for(int k = 1; k<=5-i; k++)
			{
				System.out.print(".");
			}
			System.out.print(i);
			for(int p= i-1; p>0; p--)
			{
				System.out.print(".");
			}
			System.out.println();
			
		}

	}

}
