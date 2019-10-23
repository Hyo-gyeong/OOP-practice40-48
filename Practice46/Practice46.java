//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice46 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.print("사각형의 가로 : ");
		rect.setWidth(input.nextInt());
		System.out.print("사각형의 세로 : ");
		rect.setHeight(input.nextInt());
		
		System.out.println("사각형의 가로는 "+ rect.getWidth() +"이고, "
						+ "세로는 "+ rect.getHeight() +"입니다.");
		System.out.println("사각형의 넓이는 "+ rect.area() +"이고, "
						+ "둘레는 "+ rect.perimeter() +"입니다.");
		
		input.close();
	}

}
