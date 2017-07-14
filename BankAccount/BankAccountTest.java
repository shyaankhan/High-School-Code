//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 A class to test the BankAccount class.
*/
public class BankAccountTest
{
 public static void main(String[] args)
 {
 BankAccount mrHaasBigMoney; // haasBigMoney is a object variable,
 // it references an object
 mrHaasBigMoney = new BankAccount(); // initialize to new bankaccount
 System.out.println("Mr Haas >> " + mrHaasBigMoney.getBalance());
 mrHaasBigMoney.deposit(2000);
 System.out.println("Mr Haas >> " + mrHaasBigMoney.getBalance());
 
 mrHaasBigMoney.withdraw(500);
 System.out.println("Mr Haas >> " + mrHaasBigMoney.getBalance());
 
 mrHaasBigMoney.setInterestRate(0.02);
 mrHaasBigMoney.addInterest();
 System.out.println("Mr Haas >> " + mrHaasBigMoney.getBalance());
 
 BankAccount mrsHaasBigMoney; // create another bank account
 mrsHaasBigMoney = mrHaasBigMoney;
 System.out.println("Mrs Haas >> " + mrsHaasBigMoney.getBalance());
 mrsHaasBigMoney.withdraw(1000);
 System.out.println("Mrs Haas >> " + mrsHaasBigMoney.getBalance());
 System.out.println("Mr Haas >> " + mrHaasBigMoney.getBalance());
 
 }
}