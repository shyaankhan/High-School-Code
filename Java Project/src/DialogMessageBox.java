//------------------------------------------------------------------------
//Author:Shyaan Khan    Period:4     Date: September 6th, 2014
//Description: Convert Scanner Mini Lab to use a Message Box instead of scanner
//------------------------------------------------------------------------
import javax.swing.JOptionPane;
public class DialogMessageBox {
	public static void main(String[] args){
		
		
		String numb;
		numb = JOptionPane.showInputDialog(null, "Enter the first number");
		int a;
		a = Integer.parseInt(numb);
		String numb1;
		numb1 = JOptionPane.showInputDialog(null, "Enter the second number");
		int b;
		b = Integer.parseInt(numb1);
		int c = a+b;
		JOptionPane.showMessageDialog(null, "The sum of "+a+" and "+b+" is "+c);
		int d = a-b;
		JOptionPane.showMessageDialog(null, "The difference of "+a+" and "+b+" is "+d);
		int e = a*b;
		JOptionPane.showMessageDialog(null, "The product of "+a+" and "+b+" is "+e);
		
		
	}

}
