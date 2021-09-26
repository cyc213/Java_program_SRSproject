import java.util.Scanner;

public class Choose
{
	private boolean again;
	private CourseMain function1 = new CourseMain();
	private transcriptMain function2 = new transcriptMain();
	Scanner input = new Scanner(System.in);

	
	public Choose()
	{
		
	}
	
	public void chooFunc(int i, String ID)
	{
		if (i == 0)
		{
			function1.browse();
			System.out.println("選課請輸入課程代碼" );
			int courseInput = input.nextInt();
			function1.recruit(courseInput, ID);
			ask(ID);
		}
		else if (i == 1)
		{
			function2.checkList(ID);
			ask(ID);
		}
		else
		{
			System.out.println("已登出");
		}
	}
	
	public void ask(String ID)
	{
		again = true;
		while(again)
		{
			System.out.println("請選擇要使用的功能，輸入 0即選課，輸入 1 即查詢成績，輸入2即登出");
			int funcInput = input.nextInt();
			if(funcInput == 0 || funcInput == 1)
			{
				chooFunc(funcInput, ID);
			}
			else
			{
				System.out.println("已登出");
				again = false;
			}
		}
	}
}