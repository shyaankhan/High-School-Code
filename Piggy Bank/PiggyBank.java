
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
		int sibling1PBNickels = sibling1PB.getNumbNickels();
		int sibling1PBPennies= sibling1PB.getNumbPennies();
		int sibling2PBNickels = sibling2PB.getNumbNickels();
		int sibling2PBPennies = sibling2PB.getNumbPennies();
		
		sibling1PB.removeCoins(sibling1PBNickels, sibling1PBPennies);
		sibling1PB.addCoins(sibling2PBNickels, sibling2PBPennies);
		
		sibling2PB.removeCoins(sibling2PBNickels, sibling2PBPennies);
		sibling2PB.addCoins(sibling1PBNickels, sibling1PBPennies);
		

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
	
	public void accruePiggyBankFunds(PiggyBank sisterPB, PiggyBank brotherPB)
	{
		int nickleTemp= sisterPB.getNumbNickels();
		int penniesTemp = sisterPB.getNumbPennies();
	
	    brotherPB.addCoins(nickleTemp, penniesTemp);
	    //setting null doesn't make sense here sisterPB is a local variable that will die
	    // anyways
	    //sisterPB = null means it looses is ability to point to the memory location
	    //original reference is not affected
	    
	    sisterPB = null;
	}

	//This method returns the sisterPB state to where method was invoked
	//public PiggyBank accruePiggyBankFundsReturn(PiggyBank sisterPB, PiggyBank brotherPB)
	{
		


	}

	
	
}
