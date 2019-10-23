//컴퓨터학과 20190975 신효경
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
		return "제목: "+title+"\n평점: "+score+"\n감독: "
						+director+"\n개봉년도: "+year;
	}
}