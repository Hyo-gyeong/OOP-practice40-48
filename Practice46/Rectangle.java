//��ǻ���а� 20190975 ��ȿ��
public class Rectangle {
	private int width;
	private int height;
	
	public void setWidth(int a)
	{
		width = a;
	}
	public int getWidth()
	{
		return width;
	}
	
	public void setHeight(int b)
	{
		height = b;
	}
	public int getHeight()
	{
		return height;
	}
	
	public int area()
	{
		return width * height;
	}
	
	public int perimeter()
	{
		return 2 * (width + height);
	}
}