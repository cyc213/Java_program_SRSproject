import java.util.ArrayList;

public class studentList implements interList
{
	private ArrayList<Student> studentsList = new ArrayList<>();
	
	private Student a;
	
	public studentList()
	{
		a = new Student("������", "U10716015", "��T��Ǩt", "�@�~��");
		studentsList.add(a);
		
		a = new Student("�����", "U10716016", "��T��Ǩt", "�@�~��");
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