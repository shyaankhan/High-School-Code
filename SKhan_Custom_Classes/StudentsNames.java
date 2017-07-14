//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

public class StudentsNames {
		public static void main(String[]args)
		{
			Student s1 = new Student("Shyaan Khan", 1997, "Male");
			Student s2 = new Student("Cheyenne Kahn", 1999, "Female");
			Student s3 = new Student();
			
			System.out.println(s1);
			System.out.println();
			System.out.println(s2);
			
			s2.setName("Bill");
			s2.setBirthYear(1994);
			s2.setGender("Male");
			System.out.println();
			System.out.println(s2);
			System.out.println();
			System.out.println(s3);
		}
}
