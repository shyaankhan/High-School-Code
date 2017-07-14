//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class BackpacksandBooks {
	
	public static void main(String[]args){
		Backpacks b1 = new Backpacks("In", "Out", .75, 14 );
		Book book1 = new Book("Salinger", "Catcher in the Rye", 21, 1949);
		
		/*System.out.println("Open your backpack..."); 
		System.out.println(b1.toString());
		System.out.println();
		System.out.println("Number of books in the backpack: "+Book.numOfBooks);  //Calls the static variable
		
		System.out.print("Number of total items in backpack (including Books): ");
		System.out.println(Backpacks.getNumofItems());				
		*/
		
		b1.returnBookClass();
		
	}

}
