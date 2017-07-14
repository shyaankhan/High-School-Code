import java.io.*;
import java.util.*;

public class Ex1_Scanner_Keyboard 
{
	public static void main(String args[]) throws IOException 
	{
		Scanner kb = new Scanner(System.in); 
		System.out.print("Enter an integer: ");
		int a = kb.nextInt(); 	// reads an integer from keyboard
		System.out.println(a);
		
		System.out.print("Enter a double: ");
		double d = kb.nextDouble();	// reads a double from keyboard
		System.out.println(d);	       // static import allows you to drop System

		System.out.print("Enter a word: ");
		String s = kb.next();	// reads one string with no spaces from keyboard		
		System.out.println(s);	
		
		//or another way to write it:
		System.out.print("Enter Another Word: ");
		System.out.println(kb.next());
		
		
		//why i am having trouble picking up this phrase? 
       //see link : //http://stackoverflow.com/questions/12265216/why-cant-i-enter-a-string-in-scannersystem-in-w///hen-calling-nextline-method

		Scanner kb1 = new Scanner(System.in);

		System.out.print("Enter a phrase");
		String phrase =  kb1.nextLine();
		System.out.println(phrase);
		
		
	}
}

