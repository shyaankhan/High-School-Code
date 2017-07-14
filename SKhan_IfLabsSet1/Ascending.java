//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	September 19th, 2014
// Description: Program outputs the 3 numbers in ascending order
//-----------------------------------------------------------
import java.util.Scanner;

public class Ascending {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
	
		if (c<a && c<b){
			System.out.println(c);
		}	
		if (a<b && a<c){	
				System.out.println(a);
		} 	
		if (b<a && b<c){
			System.out.println(b);
		}
		if (a>c && a<b){
			System.out.println(a);
		}
		if (b>c && b<a){
			System.out.println(b);
		}
		if (c<a && c>b){
			System.out.println(c);
		}
		if (c>a && c<b){
			System.out.println(c);
		}
		if (a<c && a>b){
			System.out.println(a);
		}
		if (b<c && b>a){
			System.out.println(b);
		}
		if (a>b && a>c){
			System.out.println(a);
		}
		if (b>a && b>c){
			System.out.println(b);
		}
		if (c>a && c>b){
			System.out.println(c);
		}
	}
}
