//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
    
public class ReadFileExample {
	public static void main(String[] args) throws Exception {
		CDCollection collection = new CDCollection();
		
		BufferedReader br = new BufferedReader(new FileReader("E:\\textfile.txt"));
        String line = null;
		while ((line = br.readLine()) != null) {
		            // you can use " " to split where white space is
		          String[] values = line.split(",");
		          for (String str : values) {
		            System.out.println(str);
		          }
		          collection.addCD(values[0], values[1], Double.parseDouble(values[2])  , Integer.parseInt(values[3]));

			        System.out.println(collection);
		        }
		        br.close();
		   
		      }
	
}

