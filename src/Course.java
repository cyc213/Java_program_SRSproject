public class Course
{
	private String name, prerequisite, weekTime, classroom, teacher;
	private int number, courseID;
	
	public Course()
	{
		
	}
	
	public Course(String name, String prerequisite, String weekTime, String classroom, String teacher, int number, int courseID)
	{
		this.name = name;
		this.prerequisite = prerequisite;
		this.weekTime = weekTime;
		this.classroom = classroom;
		this.teacher = teacher;
		this.number = number;
		this.courseID = courseID;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPrerequisite(String prerequisite)
	{
		this.prerequisite = prerequisite;
	}
	
	public void setWeekTime(String weekTime)
	{
		this.weekTime = weekTime;
	}
	
	public void setClassroom(String classroom)
	{
		this.classroom = classroom;
	}
	
	public void setTeacher(String teacher)
	{
		this.teacher = teacher;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public void setCourseID(int courseID)
	{
		this.courseID = courseID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getPrerequisite()
	{
		return prerequisite;
	}
	
	public String getWeekTime()
	{
		return weekTime;
	}
	
	public String getClassroom()
	{
		return classroom;
	}
	
	public String getTeacher()
	{
		return teacher;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public int getCourseID()
	{
		return courseID;
	}
	
}