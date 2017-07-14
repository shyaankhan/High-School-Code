//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------
public class TestCircle {
	
	public static void main(String []args)
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		
		
		c1.setRadius(2);
		c1.computeArea();
		
		System.out.println(c1);
		System.out.println();
		
		c2.setRadius(21);
		c2.computeArea();
		
		System.out.println(c2);
		System.out.println();
		
		c3.computeArea();
		System.out.println(c3);
	
		
	}
}
