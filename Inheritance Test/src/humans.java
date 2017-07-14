//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class humans extends Mammal
{
	private String hairColor;
	private int shoeSize;

	public humans()
	{
		super();
		hairColor = "black";
		shoeSize = 0;
	}	
	
	public humans(float gPeriod, String myColor, double wt, String myHairColor, int myShoeSize)
	{
		super(gPeriod, myColor, wt);
		hairColor = myHairColor;
		shoeSize = myShoeSize;
	}

	public void laugh()
	{
		System.out.println("haha");
	}

	public void speak()
	{
		super.speak();
		System.out.println("Hello");
	}

}
