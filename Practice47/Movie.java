//��ǻ���а� 20190975 ��ȿ��
public class Movie 
{ 
	private String title, director; 
	private int score, year;


	public void setTitle(String a)
	{
		title = a;
	}
	
	public void setDirector(String b)
	{
		director = b;
	}
	public void setScore(int c)
	{
		score = c;
	}
	public void setYear(int d)
	{
		year = d;
	}
	public String toString() 
	{
		return "����: "+title+"\n����: "+score+"\n����: "
						+director+"\n�����⵵: "+year;
	}
}