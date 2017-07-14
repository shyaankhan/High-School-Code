//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	September 21th, 2014
// Description:Payment for Lawn Mowing Service
//-----------------------------------------------------------
import javax.swing.JOptionPane;

public class LawnMowing {
	public static void main(String [] args){
		
		String LawnLength;
		LawnLength = JOptionPane.showInputDialog(null, "Enter Length of Lawn");
		int length;
		length = Integer.parseInt(LawnLength);
		String LawnWidth;
		LawnWidth = JOptionPane.showInputDialog(null, "Enter Width of Lawn");
		int width;
		width = Integer.parseInt(LawnWidth);
		
		int area = length*width;
		
		final int WEEKSINSEASON = 20;
		
		String Payment;
		Payment = JOptionPane.showInputDialog(null, "Do you want to pay: \n(1) Once Per Season \n(2) Twice Per Season \n(3) 20 Times per year");
		int p;
		p = Integer.parseInt(Payment);
	
		if(p == 1 && area<4000){
			int fee = 25;
			int seasonalfee = WEEKSINSEASON*fee;
			JOptionPane.showMessageDialog(null, "Based on your selected payment schedule, \nyour payment for a lot of "+area+" square feet is $"+seasonalfee+". \nSeasonal fee is $"+seasonalfee);
		}
		if(p == 1 && area>4000 && area<6000){
			int fee1 = 35;
			int seasonalfee = WEEKSINSEASON*fee1;
			JOptionPane.showMessageDialog(null, "Based on your selected payment schedule, \nyour payment for a lot of "+area+" square feet is "+seasonalfee+". \nSeasonal fee is $"+seasonalfee);
		}
		if(p == 1 && area>6000){
			int fee2 = 50;
			int seasonalfee = WEEKSINSEASON*fee2;
			JOptionPane.showMessageDialog(null, "Based on your selected payment schedule, \nyour payment for a lot of "+area+" square feet is $"+seasonalfee+". \nSeasonal fee is $"+seasonalfee);
		}
		if(p == 2 && area<4000){
			int fee = 25;
			int beforeseasonalfee = WEEKSINSEASON*fee;
			int cost = (beforeseasonalfee/2) +5;
			int seasonalfee = cost*2;
			JOptionPane.showMessageDialog(null, "Based on your selected payment schedule, \nyour payment for a lot of "+area+" square feet is $"+cost+". \nSeasonal fee is $"+seasonalfee);
		}
		if(p == 2 && area>4000 && area<6000){
			int fee = 35;
			int seasonalfee = WEEKSINSEASON*fee;
			int cost = (seasonalfee/2) +5;
			JOptionPane.showMessageDialog(null, "Based on your selected payment schedule, \nyour payment for a lot of "+area+" square feet is $"+cost+". \nSeasonal fee is $"+seasonalfee);
		}
		if(p == 2 && area>6000){
			int fee = 50;
			int seasonalfee = WEEKSINSEASON*fee;
			int cost = (seasonalfee/2) +5;
			JOptionPane.showMessageDialog(null, "Based on your selected payment schedule, \nyour payment for a lot of "+area+" square feet is $"+cost+". \nSeasonal fee is $"+seasonalfee);
		}
		if(p == 3 && area<4000){
			int fee = 25;
			int cost = (fee+(fee+3)*19);
			int seasonalfee = WEEKSINSEASON*fee;
			JOptionPane.showMessageDialog(null, "Based on your selected payment schedule, \nyour payment for a lot of "+area+" square feet is $"+cost+". \nSeasonal fee is $"+seasonalfee);
		}
		if(p == 3 && area>4000 && area<6000){
			int fee = 35;
			int cost =(fee+(fee+3)*19);
			int seasonalfee = WEEKSINSEASON*fee;
			JOptionPane.showMessageDialog(null, "Based on your selected payment schedule, \nyour payment for a lot of "+area+" square feet is $"+cost+". \nSeasonal fee is $"+seasonalfee);
		}
		if(p == 3 && area>6000){
			int fee = 50;
			int cost = (fee+(fee+3)*19);
			int seasonalfee = WEEKSINSEASON*fee;
			JOptionPane.showMessageDialog(null, "Based on your selected payment schedule, \nyour payment for a lot of "+area+" square feet is $"+cost+". \nSeasonal fee is $"+seasonalfee);
		}
		
	}
}
