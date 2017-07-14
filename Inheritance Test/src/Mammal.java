//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

public class Mammal {
	// declare instant variables here and initialize default and other values in constructor
	protected String color;
	private double weight;
	private float gestationPeriod;
	//default constructor of Mammal (super) class
	public Mammal()
	{
		//color = "";
		//gestationPeriod=9;
		//weight= 0;
			
	}
	
	public Mammal(float gPeriod, String myColor, double wt){
		
		gestationPeriod=gPeriod;
		color = myColor;
		weight = wt; 
	}
	public void eat()
	{
		System.out.println("chew_chew");
		
	}
	//this method is optional  now because gPeriod can be set in the constructor
	public void setGestationPeriod(float newGestationPeriod)
	{
		gestationPeriod = newGestationPeriod;
	}
	
	public float getGestationPeriod()
	{
	
		return gestationPeriod;
	}
	
	public void speak()
	{
		System.out.println("This mammal says Hello");
		//System.out.print("This mammal says:");
	}
}
