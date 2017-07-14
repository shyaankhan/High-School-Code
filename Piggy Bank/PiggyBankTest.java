
public class PiggyBankTest {

	
	public static void main(String [] args)
	{
		PiggyBank sisterBank = new PiggyBank(5, 3);
	        PiggyBank brotherBank = new PiggyBank(10, 2);
	    
	   
		System.out.println(sisterBank);
		System.out.println(brotherBank);
		
		System.out.println("After Swap:\n");
		
		brotherBank.SneakySwap(sisterBank, brotherBank);
		
		System.out.println(sisterBank);
		System.out.println(brotherBank);
		
		System.out.println("\nAfter IncorrectAccrue, adds to brother but doesn't set to sister to null\n");
		brotherBank.accruePiggyBankFunds(sisterBank, brotherBank);
		System.out.println(sisterBank);
		System.out.println(brotherBank);
		
		//return can take care of getting object reference back to the main
		//method so you can point it to another reference in this main method
		//or set to null 
		
		System.out.println("\n Correct Accruemethod returns the modified reference of sister and here will set to original");
		
		//sisterBank = brotherBank.accruePiggyBankFundsReturn(sisterBank, brotherBank);
		System.out.println(sisterBank);
		System.out.println(brotherBank);
		
		System.out.println("set sister to point to brother's bank\n");
		sisterBank = brotherBank;
		
		System.out.println(sisterBank);
		System.out.println(brotherBank);
		
		
		
		
	
	}
	
}

