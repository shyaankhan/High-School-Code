//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

public class StudentWater {
	public static void main(String []args)
	{
		WaterBottle w1 = new WaterBottle("Shyaan Khan", true, "Red", "Arrowhead");
		WaterBottle w2 = new WaterBottle("John", false);
		
		System.out.println(w1);
		System.out.println();
		System.out.println(w2);
		System.out.println();
		w1.setBrand("Camelbak");
		w1.setColor("Blue");
		System.out.println(w1);
	}
	
	
}
