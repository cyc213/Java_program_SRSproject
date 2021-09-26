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
	
	//�s�����ƻ��
	public void browse()
	{
		System.out.println("�H�U�O�ҵ{�W�٤ΥN�X:");
		for(int i = 0; i < CORlist.getLength(); i++)
		{
			System.out.println("�ҵ{�W��:" + CORlist.query(i).getName() +" �ҵ{�N�X:" + CORlist.query(i).getCourseID());
		}
	}
	
	//���
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
			System.out.println("�L���ҵ{");
		else
			System.out.println("�[�令�\");
		
		for(int i = 0; i < CurriculumList.size(); i++)
		{
			System.out.println("�ҵ{�N��:" + CurriculumList.get(i).getCourseID() );
		}
	}
}