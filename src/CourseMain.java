import java.util.ArrayList;

public class CourseMain
{
	private CourseList CORlist;
	private Curriculum stdCourse;
	private ArrayList<Curriculum> CurriculumList;
	
	public CourseMain()
	{
		CORlist = new CourseList();
		CurriculumList = new ArrayList<>();
	}
	
	//瀏覽有甚麼課
	public void browse()
	{
		System.out.println("以下是課程名稱及代碼:");
		for(int i = 0; i < CORlist.getLength(); i++)
		{
			System.out.println("課程名稱:" + CORlist.query(i).getName() +" 課程代碼:" + CORlist.query(i).getCourseID());
		}
	}
	
	//選課
	public void recruit(int courseInput, String ID)
	{
		int temp = -1;
		for(int i = 0; i < CORlist.getLength(); i++)
		{
			if (courseInput == CORlist.query(i).getCourseID())
			{
				stdCourse = new Curriculum();
				temp = courseInput;
				stdCourse.setcourseID(courseInput);
				stdCourse.setStudentID(ID);
				CurriculumList.add(stdCourse);
				break;
			}
		}
		
		if (temp == -1)
			System.out.println("無此課程");
		else
			System.out.println("加選成功");
		
		for(int i = 0; i < CurriculumList.size(); i++)
		{
			System.out.println("課程代號:" + CurriculumList.get(i).getCourseID() );
		}
	}
}