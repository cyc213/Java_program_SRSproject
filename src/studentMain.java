public class studentMain
{
	private studentList STList;
	
	public studentMain() 
	{
		STList = new studentList();
	}
	
	public int logIn(String ID)
	{
		int i;
		for(i = 0; i < STList.getLength(); i++)
		{
			Student a = STList.query(i);
			if (ID.compareTo(a.getID()) == 0)
			{
				System.out.println("�Ǹ����T �n�J���\");
				System.out.println("�m�W:" + a.getName() + " �Ǹ�: " + a.getID() + " ��t:" + a.getDepartment() + " �~��:" + a.getDegree() );
				i = 999;
			}
		}
		
		if(i == STList.getLength())
		{
			System.out.println("�L���Ǹ� �n�J����");
		}
		return i;
	}
}