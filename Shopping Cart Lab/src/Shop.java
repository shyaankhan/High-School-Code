//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	1/13/2015
// Description: 
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.text.NumberFormat;

public class Shop {
	public static void main(String [] args) throws Exception
	{  
		ShoppingCart cart = new ShoppingCart();
		
		ArrayList <item> tempArray = new ArrayList<item> (4);
		
		BufferedReader br = new BufferedReader(new FileReader("src:\\shoppingList.txt"));
		String line = null;
		
		while ((line = br.readLine()) != null)
		{
			String[] values = line.split(",");
			item newItem = new item(Integer.parseInt(values[0]),Integer.parseInt(values[1]),Double.parseDouble(values[2]),values[3]);
			
	         tempArray.add(newItem);
	         System.out.println(tempArray.toString());
		}
	     
		br.close();
		
		Scanner scan = new Scanner(System.in);
		boolean check = true;
		while(check == true)
		{
        System.out.print("Write the I.D. of the item you want to add to the Shopping Cart: ");
        int addedItem = scan.nextInt();
         
        item item1 = (item)tempArray.get(addedItem-1);
              
        System.out.println();
        System.out.print("Quantity: ");
        int quantity = scan.nextInt();
        item1.setQuantity(quantity);
        cart.addItem(item1);
        
        System.out.println("Enter 'stop' if you are finished dhopping");
        String stop = scan.next();
        if(stop.equals("stop"))
        {
        	break;
        }
       
        System.out.println("Enter the number of the item you wish to remove: ");
        cart.removeItem(scan.nextInt());
		}      
	        
	        
	    System.out.println();
        System.out.print("Contents of Cart: \n");
        double money = cart.getTotalCost();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(money);
        System.out.println("Total Cost: "+moneyString);
		
	}
}
