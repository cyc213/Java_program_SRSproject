import java.util.ArrayList;

public class transcriptList implements interList
{
	private ArrayList<Transcript> scoreList = new ArrayList<>();
	
	private Transcript Item;
	
	public transcriptList()
	{
		Item = new Transcript("������", "���t", "�@�~��", "Java�{���]�p", "U10716015", 85.0);
		scoreList.add(Item);

		Item = new Transcript("������", "���t", "�@�~��", "�L�n��", "U10716015", 85.0);
		scoreList.add(Item);

		Item = new Transcript("������", "���t", "�@�~��", "�p�������", "U10716015", 85.0);
		scoreList.add(Item);

		Item = new Transcript("������", "���t", "�@�~��", "�����ƾ�", "U10716015", 85.0);
		scoreList.add(Item);
		
		Item = new Transcript("�����", "���t", "�@�~��", "Java�{���]�p", "U10716016", 90.0);
		scoreList.add(Item);
		
		Item = new Transcript("�����", "���t", "�@�~��", "�L�n��", "U10716016", 90.0);
		scoreList.add(Item);
		
		Item = new Transcript("�����", "���t", "�@�~��", "�p�������", "U10716016", 90.0);
		scoreList.add(Item);
		
		Item = new Transcript("�����", "���t", "�@�~��", "�����ƾ�", "U10716016", 90.0);
		scoreList.add(Item);
	}
	
	public Transcript query(int i)
	{
		return scoreList.get(i);
	}
	
	@Override
	public int getLength()
	{
		return scoreList.size();
	}
}