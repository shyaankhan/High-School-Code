//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

public class BoxTest {
	
	public static void main(String[]args)
	{
		
	BoxConstructor b1 = new BoxConstructor(12);
	System.out.println(b1);
	System.out.println();
	
	BoxConstructor b2 = new BoxConstructor(13, 23);
	System.out.println(b2);
	System.out.println();
	
	BoxConstructor b3  = new BoxConstructor(2,3,44);
	System.out.println(b3);
	System.out.println();
	
	BoxConstructor b4 = new BoxConstructor();
	System.out.println(b4);
	
	
	}
	
}
