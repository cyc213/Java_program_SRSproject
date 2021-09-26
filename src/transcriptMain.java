public class transcriptMain
{
	private transcriptList gradeList = new transcriptList();
	
	public transcriptMain()
	{
		
	}
	
	public void checkList(String ID)
	{
		System.out.println("成績單");
		
		for(int i = 0; i < gradeList.getLength(); i++)
		{
			if(gradeList.query(i).getID().compareTo(ID) == 0)
			{
			System.out.println("學生姓名:" + gradeList.query(i).getName() + " 科系:" + gradeList.query(i).getDepartment() + 
					" 年級:" + gradeList.query(i).getDegree() + " 課程名稱:" + gradeList.query(i).getCourse() + " 學號:" + gradeList.query(i).getID() + 
					" 分數:" + gradeList.query(i).getScore());
			}
		}
	}
}