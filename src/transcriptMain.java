public class transcriptMain
{
	private transcriptList gradeList = new transcriptList();
	
	public transcriptMain()
	{
		
	}
	
	public void checkList(String ID)
	{
		System.out.println("���Z��");
		
		for(int i = 0; i < gradeList.getLength(); i++)
		{
			if(gradeList.query(i).getID().compareTo(ID) == 0)
			{
			System.out.println("�ǥͩm�W:" + gradeList.query(i).getName() + " ��t:" + gradeList.query(i).getDepartment() + 
					" �~��:" + gradeList.query(i).getDegree() + " �ҵ{�W��:" + gradeList.query(i).getCourse() + " �Ǹ�:" + gradeList.query(i).getID() + 
					" ����:" + gradeList.query(i).getScore());
			}
		}
	}
}