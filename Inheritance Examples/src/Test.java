import java.lang.reflect.Array;

//-------------------------------------------------------------
// Author: Shyaan Khan    Period: 4 		Date: 	
// Description:
//-----------------------------------------------------------

/**
 * @author mv.skhan
 *
 */
public class Test {
	public static void main(String[]args)
	{
	
		int[] arrays1 = {87,78,90};
		int[] arrays2 = {90,95,87};
		int[] arrays3 = {67,77,68};
		int[] arrays4 = {80,85,80};
		int[] arrays5 = {76,69,79};
		
		Student s1 = new UnderGrad("John Doe", arrays1, " ");
		Student s2 = new GradStudent("Jill Jones", arrays2, " ", 0001);
		Student s3 = new GradStudent("Jack Smith", arrays3, " ", 0002);
		Student s4 = new UnderGrad("Mary Hines", arrays4, " ");
		Student s5 = new UnderGrad("Mick Taylor", arrays5, " ");
		
		Student[] students = {s1,s2,s3,s4,s5};
		
		
		System.out.println("Average Test Score for "+s1.getName()+" is "+s1.getTestAverage());
		System.out.println("Average Test Score for "+s2.getName()+" is "+s2.getTestAverage());
		System.out.println("Average Test Score for "+s3.getName()+" is "+s3.getTestAverage());
		System.out.println("Average Test Score for "+s4.getName()+" is "+s4.getTestAverage());
		System.out.println("Average Test Score for "+s5.getName()+" is "+s5.getTestAverage());
	
		int Ucount = 0;
		int totalUnderGrad = 0;
		int Gcount = 0;
		int totalGrad = 0;
	
	
		for(int i = 0; i < students.length;i++)
		{
			students[i].computeGrade();
			if(students[i] instanceof UnderGrad)
			{
				totalUnderGrad++;
				if(students[i].getGrade().equals("Pass"))
				{
					Ucount++;
				}
			}
			if(students[i] instanceof GradStudent)
			{
				totalGrad++;
				if(students[i].getGrade().equals("Pass"))
				{
					Gcount++;
				}
			}
		}
		
	
		
		System.out.println(((Ucount/totalUnderGrad)*100)+"% of the UnderGrad students passed");
		System.out.println(((Gcount/totalGrad)*100)+"% of the Grad Students passed");
	
	}

}
