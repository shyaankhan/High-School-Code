//--------------------------------------------------------------------------------------
//Author: Shyaan Khan      Period: 4         Date: September 4th, 2014
//Description: A program that determines your net pay and gross pay 
//-------------------------------------------------------------------------

import java.util.Scanner;

public class Time {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of hours: ");
		int hours = scan.nextInt();
		System.out.print("Enter the number of minutes: ");
		int minutes = scan.nextInt();
		System.out.print("Enter the number of seconds: ");
		int seconds = scan.nextInt();
		System.out.print("");
		final int SECONDS_PER_HOUR = 60;
		final int SECONDS_PER_MINUTE = 60;
		int secondsInHrs = hours*SECONDS_PER_HOUR*SECONDS_PER_MINUTE;
		int secondsInMins = minutes*SECONDS_PER_MINUTE;
		int totalSeconds = secondsInHrs+secondsInMins+seconds;
		System.out.println("");
		System.out.print("Total seconds: "+totalSeconds);
		
	}

}
