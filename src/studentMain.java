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
				System.out.println("學號正確 登入成功");
				System.out.println("姓名:" + a.getName() + " 學號: " + a.getID() + " 科系:" + a.getDepartment() + " 年級:" + a.getDegree() );
				i = 999;
			}
		}
		
		if(i == STList.getLength())
		{
			System.out.println("無此學號 登入失敗");
		}
		return i;
	}
}