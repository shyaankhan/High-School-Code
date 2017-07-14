//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 * @author Shyaan
 *
 */
public class Reservation {
	int counter = 0;
	String [][] seatChart = new String[10][5];
	ArrayList <String> waitingList = new  ArrayList<String>();
	
	public Reservation()
	{
		for(int r = 0; r < seatChart.length; r++)
		{
			for (int c = 0; c < seatChart[0].length; c++)
			{
				seatChart[r][c] = "empty";
			}
		}
		
		waitingList.add("empty");
	}
	
	public Reservation(Passenger pass)
	{
		
		for(int r = 0; r < seatChart.length; r++)
		{
			for(int c = 0; c < seatChart[0].length; c++)
			{
				if (counter == 50)
				{
					System.out.println("Put on waiting list");
					waitingList.add(pass.getName());
				}
				else
				{
					
					if (seatChart[r][c].equals("empty"))
					{
						System.out.print("Sorry, seat is unavailable");
					}
					else
					{
						seatChart[r][c] = pass.getName();
						counter++;
					}
				
				}
			}
		}
	}


	public String emptySeat()
	{
		int emptyRow=0;
		int emptySeat=0;
		for(int row = 0; row < seatChart.length; row++)
		{
			for (int col = 0; col < seatChart[row].length; col++)
			{
				if(seatChart[row][col].equals("empty"))
				{
					emptyRow = row;
					emptySeat = col;
				}
				else
				{
					
				}
			}
		}
		return "There is an empty seat at row "+emptyRow+", seat number "+emptySeat;
	}
	
	public void cancelReservation(Passenger pass)
	{
		for (int row = 0; row < seatChart.length; row++)
		{
			for (int col = 0; col < seatChart[row].length; col++)
			{
				if( row == pass.getRow() && col == pass.getSeat())
				{
					seatChart[row][col] = 	waitingList.get(0);  			//replaces the cancelled reservation with the first person on the waiting list. If the waiting list is empty, then there will be an empty spot on the plane	
				}
			}
		}
	}
	
	public void displayReservationChart() throws IOException
	{
		
		for(int row = 0; row < seatChart.length; row++)
		{
			System.out.println();
			for (int col = 0; col < seatChart[0].length; col++)
			{
				System.out.print(seatChart[row][col]+ "  ");
			}
		}
		
		
	}
	
}
