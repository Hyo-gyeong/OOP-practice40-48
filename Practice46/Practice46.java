//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice46 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.print("�簢���� ���� : ");
		rect.setWidth(input.nextInt());
		System.out.print("�簢���� ���� : ");
		rect.setHeight(input.nextInt());
		
		System.out.println("�簢���� ���δ� "+ rect.getWidth() +"�̰�, "
						+ "���δ� "+ rect.getHeight() +"�Դϴ�.");
		System.out.println("�簢���� ���̴� "+ rect.area() +"�̰�, "
						+ "�ѷ��� "+ rect.perimeter() +"�Դϴ�.");
		
		input.close();
	}

}
