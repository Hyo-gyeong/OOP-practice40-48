//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice42 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Rectangle rtg = new Rectangle();
		
		System.out.print("���� �Է�: ");
		rtg.width = input.nextInt();
		System.out.print("���� �Է�: ");
		rtg.height = input.nextInt();
		
		System.out.println("������ "+rtg.area()+ "�Դϴ�.");
		System.out.println("�ѷ��� "+rtg.perimeter()+ "�Դϴ�.");
		
		input.close();
	}

}
