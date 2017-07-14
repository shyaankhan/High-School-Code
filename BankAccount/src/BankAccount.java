//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/** >>>>>>>>>>>>>>>>>>> CLASS BankAccount <<<<<<<<<<<<<<<<<<
* A bank account has a balance that can be changed by 
* deposits and withdrawals.
*/
public class BankAccount
{ 
 private double balance; // instance variables are usually private
 private double interestRate;
 
 /**
 * Constructor (0 parameters): Constructs a bank account with a zero 
balance
 * >>> method overloading: more that 1 method with same name
 */
 public BankAccount()
 { 
 balance = 0;
 interestRate = 0;
 }
 /**
 * Constructor (1 parameter): Constructs a bank account with a given 
balance
 */
 public BankAccount(double givenBalance)
 {
	 balance = givenBalance;
	 interestRate = 0;
 }

 /** 
 * Constructor (2 parameter): both the initial balance 
 * and interest rate are set when a new account is created*/
 
public BankAccount(double givenBalance, double givenRate)
{
	balance = givenBalance;
	interestRate = givenRate;
}
  
 /** 
 * deposit - Method to deposit money into the bank account.
 * Adds the amount given to the account balance
 */
 public void deposit(double moneyAdded)
 {
	 balance = balance + moneyAdded;
 }
 
 /**
 * withdraw - Method to withdraw money from the bank account.
 * Subtracts the amount given from the account.
 */
 public void withdraw(double moneyTaken)
 {
	 balance = balance - moneyTaken;
 }
 
 /**
 * Gets the current balance of the bank account.
 */
 public double getBalance()
 { 
	 return balance;
 }
 
/**
 * closeAccount - sets the balance to zero and returns the amount of 
 * money which was in the account before it closed
 */
 
 public double closeAccount()
 {
	 double priorBalance;
	 priorBalance = balance;
	 balance = 0;
	 return priorBalance;
 }
 
 
 /**
 * setInterestRate - takes a decimal value as a parameter and sets a 
 * variable called interestRate to the value input. 
 */ 
 
public void setInterestRate(double newRate)
{
	interestRate = newRate;
}
 
 /**
 * getInterestRate - returns the current interest rate as a decimal value 
 */
public double getInterestRate()
{
	return interestRate;
}
 /**
 * addInterest - Method to add Interest to the account balance
 */
public void addInterest()
{
	balance+=(interestRate*balance);
}
/**
 * toString - Method to return instance variable data for chosen object 
*/
public String toString()
{
	return "Interest Rate: "+interestRate+"\nBalance After Interest: "+balance;
}
}

