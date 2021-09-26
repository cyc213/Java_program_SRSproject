import java.util.ArrayList;

public class transcriptList implements interList
{
	private ArrayList<Transcript> scoreList = new ArrayList<>();
	
	private Transcript Item;
	
	public transcriptList()
	{
		Item = new Transcript("陳奕晴", "資科系", "一年級", "Java程式設計", "U10716015", 85.0);
		scoreList.add(Item);

		Item = new Transcript("陳奕晴", "資科系", "一年級", "微積分", "U10716015", 85.0);
		scoreList.add(Item);

		Item = new Transcript("陳奕晴", "資科系", "一年級", "計算機概論", "U10716015", 85.0);
		scoreList.add(Item);

		Item = new Transcript("陳奕晴", "資科系", "一年級", "離散數學", "U10716015", 85.0);
		scoreList.add(Item);
		
		Item = new Transcript("李芷綺", "資科系", "一年級", "Java程式設計", "U10716016", 90.0);
		scoreList.add(Item);
		
		Item = new Transcript("李芷綺", "資科系", "一年級", "微積分", "U10716016", 90.0);
		scoreList.add(Item);
		
		Item = new Transcript("李芷綺", "資科系", "一年級", "計算機概論", "U10716016", 90.0);
		scoreList.add(Item);
		
		Item = new Transcript("李芷綺", "資科系", "一年級", "離散數學", "U10716016", 90.0);
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