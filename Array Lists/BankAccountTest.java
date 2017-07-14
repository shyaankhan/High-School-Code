//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
import java.util.ArrayList;
public class BankAccountTest {
	public static void main(String[] args){
		ArrayList myList = new ArrayList();   //generic raw Array List
		
		ArrayList <BankAccount> theList = new ArrayList<BankAccount> (10);
		
	// add first name to myList
		myList.add("Shyaan");
	// add age to the myList
		myList.add("17");
		
	//	System.out.println(myList);		
		
		Integer myInteger = new Integer(25);
				myList.add (myInteger);
				
		//add a Bank Account object with id of 9000
				BankAccount thisBA = new BankAccount(9090);
				myList.add(thisBA);	
				myList.add(new BankAccount(9090));
				
	//create integer variable num, use the method 25 assign it to numb
	
				int numb = (Integer)myList.get(2);
				System.out.println(numb);
				

				//create a BankAccount reference myBankAccount, get (3) from assign  to myBankAccount
				String myBankAccount = (String)myList.get(3);

	
	//print acccountNumber of get(3) 
				
	System.out.println(((BankAccount) myList.get(3)).getAccountNumber());	
	
	//print out all of the data (invoke the toString method.?"
	
	System.out.println(myList.get(3));
	
	
	
	}
}



