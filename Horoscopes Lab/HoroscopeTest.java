import java.util.Scanner;
import java.util.Date;
//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

public class HoroscopeTest{
	
	public static void main(String []args)
	{
		
		
		Date d1 = new Date(2015, 03, 22);
		Date d2 = new Date(2015, 04, 29);
		Date d3 = new Date(2015, 06, 10);
		
		//Programmed Aries, Taurus, and Gemini Horoscope
		
		Date begAries = new Date(2015, 03, 21);
		Date endAries = new Date(2015, 04, 19);
		Date begTaurus = new Date(2015, 04, 20);
		Date endTaurus = new Date(2015, 05, 20);
		Date begGemini = new Date(2015, 05, 21);
		Date endGemini = new Date(2015, 06, 20);
		
		
		
		
	
		if(d1.compareTo(begAries) > 0 && d1.compareTo(endAries) < 0)
		{
			System.out.println("You are Aries: Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		}
		
		if(d1.compareTo(begTaurus) > 0 && d1.compareTo(endTaurus) < 0)
		{
			System.out.println("You are Taurus: Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		}
		
		if(d1.compareTo(begGemini) > 0 && d1.compareTo(endGemini) < 0)
		{
			System.out.println("You are Gemini: Cerebral, chatty, loves learning and education, charming, and adventurous.");
		}
	
		if(d2.compareTo(begAries) > 0 && d2.compareTo(endAries) < 0)
		{
			System.out.println("You are Aries: Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		}
		
		if(d2.compareTo(begTaurus) > 0 && d2.compareTo(endTaurus) < 0)
		{
			System.out.println("You are Taurus: Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		}
		
		if(d2.compareTo(begGemini) > 0 && d2.compareTo(endGemini) < 0)
		{
			System.out.println("You are Gemini: Cerebral, chatty, loves learning and education, charming, and adventurous.");
		}
		if(d3.compareTo(begAries) > 0 && d3.compareTo(endAries) < 0)
		{
			System.out.println("You are Aries: Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		}
		
		if(d3.compareTo(begTaurus) > 0 && d3.compareTo(endTaurus) < 0)
		{
			System.out.println("You are Taurus: Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		}
		
		if(d3.compareTo(begGemini) > 0 && d3.compareTo(endGemini) < 0)
		{
			System.out.println("You are Gemini: Cerebral, chatty, loves learning and education, charming, and adventurous.");
		}
		
		
		
	}

	

}
