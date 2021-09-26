import java.util.ArrayList;

public class CourseList implements interList
{
	private ArrayList<Course> coursesList = new ArrayList<>();
	
	private Course course;
	
	public CourseList()
	{
		course = new Course("JAVA �{���]�p", "�L", "�P���G�B2~3�` ", "G512", "������ �Ѯv", 40, 1);
		coursesList.add(course);

		course = new Course("�L�n��", "�L", "�P���@�B6~7�` �M �P���|�B6~7�` ", "G313", "�d�¨} �Ѯv", 40, 2);
		coursesList.add(course);
		
		course = new Course("�p�������", "�L", "�P���G�B8~10�` ", "G313", "�c�F�� �Ѯv", 40, 3);
		coursesList.add(course);
		
		course = new Course("�����ƾ�", "�L", "�P���|�B2~4�` ", "G313", "�c�F�� �Ѯv", 40, 4);
		coursesList.add(course);
	}
		
	public Course query(int i)
	{
		return coursesList.get(i);
	}
	
	@Override
	public int getLength()
	{
		return coursesList.size();
	}
}