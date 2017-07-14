//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------
import java.util.Date;
/**
 * @author mv.skhan
 *
 */
public class TestClass {
	public static void main(String[] args) {
		      // create 2 dates
		      Date date = new Date(70, 3, 10);
		      Date date2 = new Date(70, 1, 10);
		      Date currentDate = new Date(14, 11, 13);
		      // Check if they are equal
		      //boolean check = date.equals(date2);
		      // print the result
		     // System.out.println("Dates are equal:" + check);
		   
		
	Lunch newLunch = new Lunch("Sandwich", "Water", true);
	Lunch newLunch1  = new Lunch ("Pizza", "Soda", false);
	
	Homework homework1 = new Homework("21", "C", "Practice Quiz", date);
	Homework homework2 = new Homework ();
	
	Friends f1 = new Friends ("Shyaan Khan", homework1, newLunch1);
	Friends f2 = new Friends ("Robert Zhang", homework2, newLunch);
	
	System.out.println(f1);
	System.out.println();
	System.out.println(f2);
	System.out.println();
	
	SharingIsCaring share = new SharingIsCaring();
	share.swapLunches(f1, f2);
	
	System.out.println(f1);
	System.out.println();
	System.out.println(f2);
	System.out.println();
	homework1.getDueDate();
	
	boolean check  = currentDate.equals(date);
	
	if (check = true)
	{
		share.shareHomework(homework1, homework2);
		System.out.println(date);
		System.out.println("Copy Homework!");
		System.out.println();
	}
	else
		System.out.println("Procrastinate and do it later!");
	
	
	System.out.println();
	System.out.println(f1);
	System.out.println();
	System.out.println(f2);
	}
}
