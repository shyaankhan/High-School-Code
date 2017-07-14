//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: September 21th, 2014
// Description:The program should display the coordinates and the corresponding location (origin, x or y axis, or quadrant). 
//-----------------------------------------------------------
import java.util.Scanner;

public class Cartesian {
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the x coordinate: ");
		int x = scan.nextInt();
		System.out.print("Please enter the y coordinate: ");
		int y = scan.nextInt();
		if (x==0 && y==0){
			System.out.println("("+x+","+y+") is on the origin");
		}
		if (x>0 && y>0){
			System.out.println("("+x+","+y+") is in the first quadrant");
		}
		if (x==0 && y>0){
			System.out.println("("+x+","+y+") is on the y-axis");
		}
		if (x>0 && y==0){
			System.out.println("("+x+","+y+") is on the x-axis");
		}
		if (x<0 && y>0){
			System.out.println("("+x+","+y+") is in the second quadrant");
		}
		if (x<0 && y==0){
			System.out.println("("+x+","+y+") is on the x-axis");
		}
		if (x<0 && y<0){
			System.out.println("("+x+","+y+") is in the third quadrant");
		}
		if (x==0 && y<0){
			System.out.println("("+x+","+y+") is on the y-axis");
		}
		if(x>0 && y<0){
			System.out.println("("+x+","+y+") is in the fourth quadrant");
		}
	}
}
