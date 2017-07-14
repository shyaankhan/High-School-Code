//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

import java.awt.*;
import javax.swing.*;

public class LabelDemo
{
   //-----------------------------------------------------------------
   //  Creates and displays the primary application frame.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Label Demo");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      ImageIcon icon = new ImageIcon("src\\BMW-E92-M3-by-TrueBlissCustoms-1.jpg");
      JLabel label1, label2, label3;
      label1 = new JLabel ("car",icon, SwingConstants.CENTER);
      label2 = new JLabel ("", icon, SwingConstants.CENTER);
      label2.setHorizontalTextPosition (SwingConstants.LEFT);
      label2.setVerticalTextPosition (SwingConstants.BOTTOM);
      label3 = new JLabel ("", icon, SwingConstants.CENTER);
      label3.setHorizontalTextPosition (SwingConstants.CENTER);
      label3.setVerticalTextPosition (SwingConstants.BOTTOM);
      JPanel panel = new JPanel();
      panel.setBackground (Color.cyan);
      panel.setPreferredSize (new Dimension (300,350));
      panel.add (label1);
      panel.add (label2);
      panel.add (label3);
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}