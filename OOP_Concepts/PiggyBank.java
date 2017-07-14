
public class PiggyBank {
	
	// ========================Step #1======================================//
	// Create instance data variables. They will be private instance variables
	// They will be accessible only through methods in the PennyJar class
	// They will be ints
	// Their names will be pennies, nickels,and
	// double total
	  
	private	int	pennies;
	private	int	nickels;
	private	int total;
	
	// =========================Step #2 ======================================//
	// A constructor for the class.
	// This constructor initializes the number of pennies in the jar to
	 //the value of the parameter, p.
	// NOTE: added a parameter to the constructor to initialize the pennies 
	// instance variable
	//sets the nickles to n
	//total to zero
	public PiggyBank (int p, int n)
	{
		pennies =	p;
		nickels	=	n;
		
		computeTotal();
		
		
	}
	

	// ============================ Step #3=============================//
	// This method returns number of pennies in the piggybank
	public int getNumbPennies()	
		
	{
		return pennies;
	}
	// ============================ Step #4=============================//
	// This method returns  number of nickles from the piggybank
	public int getNumbNickels()
	{
		return nickels;
	}
	
	// ============================ Step #5=============================//
	// This method computes total in the jar
	public void computeTotal()
	{  
		total = nickels * 5  + pennies ;
	}


	// ===============================Step # 6==========================//
	// This method returns the total value of pennies and nickels stored in the 
	// piggy bank.
	public int getTotalValue()
	{
	    return total;
	}

	
	// ============================= Step #7 ============================//
	// This method returns the total number of coins (pennies and nickels)
	// currently stored in the piggy bank.
	public void addCoins(int nickles, int pennies)
	{
	   this.nickels += nickles;
	   this.pennies += pennies;
	}
	
	public void removeCoins(int nickels, int pennies)
	{
		this.nickels -= nickels;
		this.pennies -= pennies;
	}
	
	
	// =============================== Step #8=============================//
	//This method returns the state of the instance variables
	public String toString()
	{
	     return pennies  +" pennies " +  nickels + " nickels " +  "total " + total;     
	}
	
	// ============================== Step #9============================//
	// There are two siblings one sibling decides to sneak in their room and swap 
	// the money(coins) from the piggyBanks, switch the coins from one PiggyBank 
	//other
	public void SneakySwap(PiggyBank sibling1PB, PiggyBank sibling2PB)
	{
		//need to create LOCAL/temporary variables to hold nickels/pennies of 1st sibling
		int  nickelSibling1= sibling1PB.getNumbNickels();
		int penniesSibling1 = sibling1PB.getNumbPennies();
		
		//remove nickels and pennies so you swap NOT add onto current amount
		sibling1PB.removeCoins(nickelSibling1, penniesSibling1);
		
		//this is why you had the temp variables above because sibling1
		//will have new/overriding values
		sibling1PB.addCoins(sibling2PB.getNumbNickels(), sibling2PB.getNumbPennies());
	    
		//remove coins from sibling2 so nickles/pennies will be zero and then
		sibling2PB.removeCoins(sibling2PB.getNumbNickels(), sibling2PB.getNumbPennies());
		
		//add sibling1's coins to sibling2's pennies/nickels , to sibling2's piggybank
		sibling2PB.addCoins(nickelSibling1, penniesSibling1);
	    
		
	}
	
	// ============================== Step #10============================//
	//The other sibling decides to sneak in the room and while “playing” with his 
	//sister’s piggybank accidently drops it. He comes up with a plan and 
	//tells his sister they should accrue their funds and as a result would be 
	//able to buy a “larger/better” toy. 
	//explains to his sister she shouldn’t worry; she has equal access(alias)to 
	//his PiggyBank 
	//This method should take sister’s number of coins that were in her piggybank
	// and add them to her brother’s piggybank.
	
	//THE METHOD BELOW DOES NOT WORK!!!
	
	public void accruePiggyBankFunds(PiggyBank sisterPB, PiggyBank brotherPB)
	{
		int nickleTemp= sisterPB.getNumbNickels();
		int penniesTemp = sisterPB.getNumbPennies();
	
	    brotherPB.addCoins(nickleTemp, penniesTemp);
	    
	    
	    //setting null doesn't make sense here sisterPB is a local variable that will die
	    // anyways
	    //sisterPB = null means it looses is ability to point to the memory location
	    //original reference is not affected
	    // THIS DOES NOT WORK:
	    sisterPB = null;
	}

	//This method returns the sisterPB state to where method was invoked
	public PiggyBank accruePiggyBankFundsReturn(PiggyBank sisterPB, PiggyBank brotherPB)
	{
		int nickleTemp= sisterPB.getNumbNickels();
		int penniesTemp = sisterPB.getNumbPennies();
	
	    brotherPB.addCoins(nickleTemp, penniesTemp);
	    //setting null doesn't make sense here sisterPB is a local variable that will die
	    // anyways
	    //sisterPB = null means it looses is ability to point to the memory location
	    //original reference is not affected
	    sisterPB = null;
	    //return the state of the object back to the main method to affect
	    //original reference
	    return sisterPB;   // sisterPB reference is returned
	}

	
	
}
