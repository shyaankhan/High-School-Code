//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class testClass {
	public static void main(String[] args)
	{
		Mammal m = new Mammal();
		Mammal bear = new Mammal(20, "black", 300);
		humans human = new humans(280, "white", 130, "black", 10);
		
		
		
		human.laugh();
		human.speak();
		
		m.eat();
		
		bear.setGestationPeriod(10);
		
		System.out.println(bear.getGestationPeriod());
		
		System.out.println(human.getGestationPeriod());
		
		
		
	}

}
