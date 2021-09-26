import java.util.ArrayList;

public class studentList implements interList
{
	private ArrayList<Student> studentsList = new ArrayList<>();
	
	private Student a;
	
	public studentList()
	{
		a = new Student("陳奕晴", "U10716015", "資訊科學系", "一年級");
		studentsList.add(a);
		
		a = new Student("李芷綺", "U10716016", "資訊科學系", "一年級");
		studentsList.add(a);
	}
		
	public Student query(int i)
	{
		return studentsList.get(i);
	}
	
	@Override
	public int getLength()
	{
		return studentsList.size();
	}
}