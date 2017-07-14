//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.NullPointerException;
/**
 * @author Shyaan
 *
 */
public class ReservationTest 
{
	public static void main(String [] args) throws IOException
	{		
		ArrayList <String> myList = new ArrayList <String> (); 
		Reservation reservation = new Reservation();
			
		reservation.displayReservationChart();
		System.out.println();
		System.out.println();
		int z = 1;
		while(z > 0)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 1 to add, 2 to remove, and 3 to quit: ");
			
			int x = scan.nextInt();
			
			while (x == 1)
			{
				System.out.println("Would you like to search for a seat? (1 = yes, 2 = no)");
				int search = scan.nextInt();
				if(search == 1)
				{
					String empty = reservation.emptySeat();
					System.out.println(empty);
				}
				
				System.out.println();
				System.out.println("Enter name to add: ");
				String newName = scan.next();
				System.out.println();
				System.out.println("Enter Desired Row (0-9): ");
				Scanner temp = new Scanner(System.in);
				int newRow = temp.nextInt();
				System.out.println("Enter Desired Seat(0-4): ");
				int newSeat = temp.nextInt();
				
				reservation.seatChart[newRow][newSeat] = newName;
				
				reservation.displayReservationChart();
				System.out.println();
				System.out.println();
				
				x = -1;
				z++;
			
			}
			while ( x == 2)
			{
				System.out.println("Enter Passenger to Remove: ");
				Scanner temp = new Scanner(System.in);
				String removal = scan.next();
				String [][] newArray = reservation.seatChart;
				for (int row = 0; row < newArray.length; row++)
				{
					for (int col = 0; col < newArray[0].length; col++ )
					{
						if(removal.equals(reservation.seatChart[row][col]))
						{
							reservation.seatChart[row][col] = "empty";			
							reservation.displayReservationChart();
						}
						
					}
				}
				
				System.out.println();
				System.out.println();
				x = -2;
				
			}	
			while (x == 3)
			{
				System.out.println("Would you like to see the CSV File? (1 = yes, 2 = no)");
				Scanner n = new Scanner(System.in);
				int csv = n.nextInt();
				if(csv == 1)
				{
					BufferedReader br = new BufferedReader(new FileReader ("src\\passengerList (1).CSV"));
					String line = null; 
					while((line = br.readLine()) != null)
					{
						
						String values[] = line.split(",");
						
						for(String str : values)
						{
							myList.add(str);
						}
						
					}
					
						int i = 1;
						int counter = 1;
						
							for(int row = 0; row < reservation.seatChart.length; row++)
							{
								for( int col = 0; col < reservation.seatChart[row].length; col++)
								{
									if( counter <= 50)
									{
										String newStr = (String) (myList.get(i));
										reservation.seatChart[row][col] = newStr;
										i+=3;
										counter++;
									}
									while (50 < counter && counter <=61)	
									{
										String anotherString  = (String) (myList.get(i));
										reservation.waitingList.add(anotherString);
										i+=3;
										counter++;
									}
								
								}
							}
							reservation.waitingList.remove(0);
							reservation.displayReservationChart();
							System.out.println();
							System.out.println();
							System.out.println("Waiting List: ");
							System.out.println();
							System.out.println(reservation.waitingList);
							
							x++;
							csv++;
							z = -1;
			
				}
				else
				{
					System.out.println("Done");
					x++;
					z = -4;
				}
			}
		}
	}	
}

