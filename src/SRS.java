import java.util.Scanner;

public class SRS
{
	public static void main(String[] args) 
	{
		studentMain start = new studentMain();
		Scanner input = new Scanner(System.in);
		
		//�n�J
		System.out.println("�n�J�п�J�Ǹ�" );		
		String str1 = input.nextLine();
		int i = start.logIn(str1);
		
		if(i == 1000)
		{
			//��ܭn�ϥΪ��\��
			Choose choose = new Choose();
			System.out.println("�п�ܭn�ϥΪ��\��A��J 0 �Y��ҡA��J 1  �Y�d�ߦ��Z�A��J 2 �Y�n�X");
			int scoreInput = input.nextInt();
			choose.chooFunc(scoreInput, str1);
		}
	}
}