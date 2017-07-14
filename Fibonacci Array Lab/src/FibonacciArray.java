//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------
import javax.swing.JOptionPane; 


public class FibonacciArray {
	public static void main(String[]args){
		

	
	int numFib = Integer.parseInt(JOptionPane.showInputDialog("Type the number of the Fibonacci sequence you would like to see"));
	int [] numbers = new int[numFib];
	
	int i;
	
	for(i= 1; i>=numFib; i++)
	{
		numbers[numFib]= numbers[i];
	}
	
	int[] fibonacci = new int[numFib];
	
		
		
	}
}
