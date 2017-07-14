//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	10/27/2014
// Description:Modify the Snowman Applet
//-----------------------------------------------------------

/*1st. Run the code  as a “Java Applet” in Eclipse to see the original snowman applet. (see below)

2nd Use web to learn about applets. 

3rd. Make the following(minimum) modifications to the snowman:
Create a revised version of the Snowman applet with the following modifications:
1. Add two red buttons to the upper torso. 

2. Make the snowman’s smile turn upside down .

3. Move the sun to the upper-right corner of the picture.

 4. Shift the entire snowman 20 pixels to the right. Save it as ModifiedSnowman and post 
*/

//********************************************************************
//  Snowman.java       Author: Lewis/Loftus
//
//  Demonstrates basic drawing methods and the use of color.
//********************************************************************

import javax.swing.JApplet;
import java.awt.*;

public class ModifiedSnowman extends JApplet
{
   //-----------------------------------------------------------------
   //  Draws a snowman.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {
      final int MID = 150;
      final int TOP = 50;

      setBackground (Color.cyan);

      page.setColor (Color.blue);
      page.fillRect (20, 175, 300, 50);  // ground
      
      
      

      page.setColor (Color.yellow);
      page.fillOval (220, -40, 80, 80);  // sun
      

      page.setColor (Color.white);
      page.fillOval (MID-0, TOP, 40, 40);      // head
      page.fillOval (MID-15, TOP+35, 70, 50);   // upper torso
      page.fillOval (MID-30, TOP+80, 100, 60);  // lower torso

      page.setColor (Color.black);
      page.fillOval (MID+10, TOP+10, 5, 5);   // left eye
      page.fillOval (MID+25, TOP+10, 5, 5);    // right eye

      page.drawArc (MID+10, TOP+23, 21, 15, 10, 160);   // smile

      page.drawLine (MID-5, TOP+60, MID-50, TOP+40);  // left arm
      page.drawLine (MID+85, TOP+60, MID+55, TOP+60);  // right arm

      page.drawLine (MID-0, TOP+5, MID+20, TOP+5);  // brim of hat
      page.fillRect (MID+5, TOP-20, 30, 25);        // top of hat
      
      page.setColor(Color.red);
      page.fillOval(MID+15, TOP+45, 10, 10);
      
      page.setColor(Color.red);
      page.fillOval(MID+15, TOP+65, 10, 10);
      
      
   }
}

