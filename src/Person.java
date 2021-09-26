public class Person
{
	private String name;
	private String department;
	
	public Person()
	{
		
	}
	
	public Person(String name, String department)
	{
		this.name = name;
		this.department = department;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDepartment()
	{
		return department;
	}
}