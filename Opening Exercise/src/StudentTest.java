//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class StudentTest {
	public static void main(String []args){
		
		Student [] studentList = new Student [5];
		
		int id = 100;
		
		for (int index = 0; index < studentList.length; index++)
		{
			studentList[index] = new Student("Student", id);
			id++;
		
			System.out.println(studentList[index].getName());
			//System.out.println(studentList[index]);

		}
		
		
	}
}
