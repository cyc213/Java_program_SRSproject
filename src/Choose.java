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
			System.out.println("��ҽп�J�ҵ{�N�X" );
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
			System.out.println("�w�n�X");
		}
	}
	
	public void ask(String ID)
	{
		again = true;
		while(again)
		{
			System.out.println("�п�ܭn�ϥΪ��\��A��J 0�Y��ҡA��J 1 �Y�d�ߦ��Z�A��J2�Y�n�X");
			int funcInput = input.nextInt();
			if(funcInput == 0 || funcInput == 1)
			{
				chooFunc(funcInput, ID);
			}
			else
			{
				System.out.println("�w�n�X");
				again = false;
			}
		}
	}
}