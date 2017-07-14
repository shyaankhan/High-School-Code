//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------
import java.util.Scanner;

public class sdfkre {
			public static void main(String [] args){
			
					Scanner scan = new Scanner (System.in);		
					
					int num1 = scan.nextInt();
					
					int counter = 10;
					
					while(counter<num1)
					{
						int newNumb;
						newNumb = num1 % counter;
							if (newNumb >= 10)
							{
								newNumb = newNumb / 10;
								System.out.println(newNumb);
							}
							else
							{
								System.out.println(newNumb);
							}
					
						counter = counter*10;
					}
				
				
			}
}
