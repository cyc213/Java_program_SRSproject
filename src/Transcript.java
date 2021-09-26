public class Transcript implements inter
{
	private String name, department, degree, course, ID;
	private double score;
	
	public Transcript()
	{
		
	}
	
	public Transcript(String name, String department, String degree, String course, String  ID, double score)
	{
		this.name = name;
		this.department = department;
		this.degree = degree;
		this.course = course;
		this.ID = ID;
		this.score = score;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	@Override
	public void setDegree(String degree)
	{
		this.degree = degree;
	}
	
	public void setCourse(String course)
	{
		this.course = course;
	}
	
	@Override
	public void setID(String ID)
	{
		this.ID = ID;
	}
	
	public void setScore(double score)
	{
		this.score = score;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	@Override
	public String getDegree()
	{
		return degree;
	}
	
	public String getCourse()
	{
		return course;
	}
	
	@Override
	public String getID()
	{
		return ID;
	}
	
	public double getScore()
	{
		return score;
	}
}