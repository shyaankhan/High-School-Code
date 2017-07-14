//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

public class CarTest {
	public static void main(String []args)
	{
		Car c1 = new Car("BMW", "M3", 2011);
		Car c2 = new Car("Scion", "TC", 2012);
		Car c3 = new Car("McLaren", "MP412-C", 2013);
		
		System.out.println(c1);
		System.out.println();
		c1.setMake("Subaru");
		System.out.println(c1);
		System.out.println();
		System.out.println(c2.getYear());
	}

}
