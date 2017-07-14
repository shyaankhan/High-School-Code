import java.util.Scanner;

public class sda {
	public static void main(String[]args){
		Scanner scan = new Scanner (System.in);		
			int fact;
			fact = scan.nextInt();
			int counter;
			counter = fact -1;
			int result;
			result = fact;
			while (counter >0)
			{
				result = result * counter;
				counter = counter-1;
			}
			System.out.print(result);
	}
}	
