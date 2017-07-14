//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

public class Kennel {
	public static void main(String[]args)
	{
		Dog d1 = new Dog("Air Bud", 15);
		Dog d2 = new Dog ("Snoop", 2);
		Dog d3 = new Dog("Cat", 4);
		
		d1.computeAgeInPersonYrs(15);
		System.out.println(d1);
		System.out.println();
		
		d1.setName("My Dawg");
		System.out.println(d1);
		System.out.println();
		
		d2.computeAgeInPersonYrs(2);
		System.out.println(d2);
		
	}

}
