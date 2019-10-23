//컴퓨터학과 20190975 신효경
public class Date {
	int year; 
	int month; 
	int day;
	
	public String toString() 
	{
		return year+"년 "+month+"월 "+day+"일";
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	
	public void setMonth(int m) 
	{
		month = m;
	}
	
	public void setDay(int d)
	{
		day = d;
	}
}