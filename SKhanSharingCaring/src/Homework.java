//-------------------------------------------------------------

import java.util.Date;

public class Homework {

	private String answer1, answer2;
	private String assignmentName;
	private Date dueDate;
	
	public Homework(String answer1, String answer2,String assignmentName, Date dueDate )
	{
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.assignmentName = assignmentName;
	}	
	


	public Homework() {
	}


	public String getAnswer1()
	{
		return answer1;
	}
	public String getAnswer2()
	{
		return answer2;
	}
	public String getAssignmentName()
	{
		return assignmentName;
	}
	
	public Date getDueDate()
	{
		return dueDate;
	}
	
	public void setDueDate(Date newDate)
	{
		dueDate = newDate;
	}
	
	public String toString()
	{
		return "Assignment Name: "+assignmentName+ " Answer 1: "+answer1+" Answer 2: "+answer2+"\nDue Date: "+dueDate;
	}
	
}

