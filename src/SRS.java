import java.util.Scanner;

public class SRS
{
	public static void main(String[] args) 
	{
		studentMain start = new studentMain();
		Scanner input = new Scanner(System.in);
		
		//登入
		System.out.println("登入請輸入學號" );		
		String str1 = input.nextLine();
		int i = start.logIn(str1);
		
		if(i == 1000)
		{
			//選擇要使用的功能
			Choose choose = new Choose();
			System.out.println("請選擇要使用的功能，輸入 0 即選課，輸入 1  即查詢成績，輸入 2 即登出");
			int scoreInput = input.nextInt();
			choose.chooFunc(scoreInput, str1);
		}
	}
}