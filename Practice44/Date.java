//컴퓨터학과 20190975 신효경
public class Date {
	private int year; 
	private int month; 
	private int day;
	
	public String toString() 
	{
		return year+"년 "+month+"월 "+day+"일";
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	public int getYear() 
	{
		return year;
	}
	
	public void setMonth(int m) 
	{
		month = m;
	}
	public int getMonth()
	{
		return month;
	}
	
	public void setDay(int d)
	{
		day = d;
	}
	public int getDay()
	{
		return day;
	}
}