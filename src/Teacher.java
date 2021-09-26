public class Teacher extends Person
{
	private String teacherID;
	
	public Teacher()
	{
		
	}
	
	public Teacher(String name, String department, String teacherID)
	{
		super(name, department);
		this.teacherID = teacherID;
	}
}