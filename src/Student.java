public class Student extends Person implements inter //DataBase
{
	private String ID;
	private String degree;
		
	public Student()
	{
		
	}
	
	public Student(String name, String ID, String department, String degree)
	{
		super(name, department);
		this.ID = ID;
		this.degree = degree;
	}
	
	@Override
	public void setID(String ID)
	{
		this.ID = ID;
	}
		
	@Override
	public void setDegree(String degree)
	{
		this.degree = degree;
	}
		
	@Override
	public String getID()
	{
		return ID;
	}
	
	@Override
	public String getDegree()
	{
		return degree;
	}
}