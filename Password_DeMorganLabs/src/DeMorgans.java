//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	9.27.14
// Description: Use DeMorgans Law to create a new expression
//-----------------------------------------------------------
public class DeMorgans {
	public static void main(String[]args){
		
		int x = 6;
		int y = 4;
		System.out.println("a) Original Expression: !( x < 5 ) && ( y >= 7 )");
		boolean num1a = !( x < 5 ) && ( y >= 7 );
		System.out.println("Result: "+num1a);
		System.out.println("DeMorgans Law: !(( x >= 5 ) || ( y < 7)");
		boolean num1b = !(( x >= 5 ) || ( y < 7));
		System.out.println("Result: "+num1b);
		
		System.out.println();
		
		int a = 4;
		int b = 4;
		int g = 5;
		System.out.println("b) Original Expression: !( a == b ) || !( g != 5)");
		boolean num2a = !( a == b ) || !( g != 5);
		System.out.println("Result: "+num2a);
		System.out.println("DeMorgans Law: !( a != b ) && ( g == 5)");
		boolean num2b = !( a != b ) && ( g == 5);
		System.out.println("Result: "+num2b);
		
		System.out.println();
		
		int c = 8;
		int d = 7;
		System.out.println("c) Original Expression: !( ( c <= 8 ) && ( d > 4 ) )");
		boolean num3a = !( ( c <= 8 ) && ( d > 4 ) );
		System.out.println("Result: "+ num3a);
		System.out.println("DeMorgans Law: ( c > 8 ) || ( d <= 4 )");
		boolean num3b = ( c > 8 ) || ( d <= 4 );
		System.out.println("Result: "+ num3b);
	
		System.out.println();
		
		int i = 2;
		int j = 21;
		System.out.println("d) Original Expression: !( ( i > 4 ) || ( j <= 6 ))");
		boolean num4a = !( ( i > 4 ) || ( j <= 6 ));
		System.out.println("Result: "+num4a);
		System.out.println("DeMorgans Law: ( i <= 4 ) && & j > 6 )");
		boolean num4b = ( i <= 4 ) &&  (j > 6 );
		System.out.println("Result: "+num4b);
	}
}
