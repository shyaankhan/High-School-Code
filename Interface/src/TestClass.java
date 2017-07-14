//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person("Tom", 15, "M");
		Person p2 = new Person("Carol",2, "F");
		Person p3 = new Person("John", 6, "M");
		
		
         //add your if statements, compareTo invocation 		
		
		if(p1.compareTo(p2) == -1 && p1.compareTo(p3) == -1)
		{
			System.out.println(p1);
			if(p2.compareTo(p3) == -1)
			{
				System.out.println(p2);
			}
			else
			{
				System.out.println(p3);
			}
			if(p3.compareTo(p2) == 1 && p3.compareTo(p1) == 1)
			{
				System.out.println(p3);
			}
			else
			{
				System.out.println(p2);
			}
			
		}          
		
		if(p2.compareTo(p1) == -1 && p2.compareTo(p3) == -1)
		{
			System.out.println(p2);
			if(p1.compareTo(p3) == -1)
			{
				System.out.println(p1);
			}
			else
			{
				System.out.println(p3);
			}
			if(p3.compareTo(p1) == 1 && p3.compareTo(p2) == 1)
			{
				System.out.println(p3);
			}
			else
			{
				System.out.println(p1);
			}
		}
		
		if(p3.compareTo(p1) == -1 && p3.compareTo(p2) == -1)
		{
			System.out.println(p3);
			if(p1.compareTo(p2) == -1)
			{
				System.out.println(p1);
			}
			else
			{
				System.out.println(p2);
			}
			if(p2.compareTo(p1) == 1 && p2.compareTo(p3) == 1)
			{
				System.out.println(p2);
			}
			else
			{
				System.out.println(p1);
			}
		}
		
	}
	
}
