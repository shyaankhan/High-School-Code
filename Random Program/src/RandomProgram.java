//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader; 
import java.io.IOException;
import java.util.ArrayList;

public class RandomProgram {
	public static void main(String [] args) throws IOException
	{
		ArrayList <String> students = new ArrayList <String> (); 
		ArrayList <String> randomStudent = new ArrayList <String> ();
		BufferedReader br = new BufferedReader(new FileReader("src\\StudentList.txt"));
		String line = null;
		while((line = br.readLine()) != null)
		{
			String values[] = line.split(",");
			
			for(String str : values)
			{
				students.add(str);
			}
		}
		
		for(int z = 0; z < students.size(); z++)
		{
			int random = (int) ((Math.random() * 61) +1);
			randomStudent.add(students.get(random));	
		
		}
		
		for(int x = 0; x < randomStudent.size(); x++)
		{
			
		}
		
		
	}

}
