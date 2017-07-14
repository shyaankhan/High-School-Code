//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	9/25/14
// Description: Enter Password for admins or measly worker
//-----------------------------------------------------------
import java.util.Scanner;

public class Password {
	
		public static void main(String[]args){
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter your name: ");
		String userName;
		userName = scan.nextLine();
		
		System.out.println("Enter either 1 or 2 for the following \n1) Admin\n2) Measly Worker");
		int choice;
		choice = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
			
		if (choice==1){
			System.out.println("Enter your password");
			String password1;
			password1 = scan2.nextLine();
			
			if(password1.equals("iforgotmypassword") || password1.equals("unoriginalpassword")){
				System.out.println("Welcome "+ userName+" (Admin)");
			 }
			else{
				System.out.println("Access Denied");
			 }
		}
		
		if(choice==2){
			System.out.println("Enter the first password");
			String password1;
			password1 =scan2.nextLine();
			System.out.println("Enter the second password");
			String password2;
			password2= scan2.nextLine();
			
			if(password1.equals("iforgotmypassword") && password2.equals("unoriginalpassword") || (password1.equals("unoriginalpassword") && (password2.equals("iforgotmypassword")))){
				System.out.print("Welcome " + userName);
			}
			else{
				System.out.print("Access Denied");
			}
		}
	}
}