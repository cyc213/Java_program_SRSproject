import java.util.ArrayList;

public class CourseList implements interList
{
	private ArrayList<Course> coursesList = new ArrayList<>();
	
	private Course course;
	
	public CourseList()
	{
		course = new Course("JAVA 程式設計", "無", "星期二、2~3節 ", "G512", "李昆翰 老師", 40, 1);
		coursesList.add(course);

		course = new Course("微積分", "無", "星期一、6~7節 和 星期四、6~7節 ", "G313", "吳威良 老師", 40, 2);
		coursesList.add(course);
		
		course = new Course("計算機概論", "無", "星期二、8~10節 ", "G313", "盧東華 老師", 40, 3);
		coursesList.add(course);
		
		course = new Course("離散數學", "無", "星期四、2~4節 ", "G313", "盧東華 老師", 40, 4);
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