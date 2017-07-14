//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	September 19th, 2014
// Description: Program outputs the 3 numbers in ascending order
//-----------------------------------------------------------
import java.util.Scanner;

public class IfLabs {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
	
		if (c<a){
			System.out.println(c);
		}
		if (b<a){
			System.out.println(b);
		}
		if (a<b){
			System.out.println(a);
		}
		if (c<b){
			System.out.println(c);
		} 
		if (b>a){
			System.out.println(b);
		}
		
		if (a>b){
			System.out.println(a);
		}
		if (c>b){
			System.out.println(c);
		}
	}
}
