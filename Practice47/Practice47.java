//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice47 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		Movie info = new Movie();
		
		System.out.print("��ȭ������ �Է��ϼ���");
		
		System.out.print("��ȭ ������? ");
		info.setTitle(input.next());
		
		System.out.print("������? ");
		info.setScore(input.nextInt());
		
		System.out.print("������? ");
		info.setDirector(input.next());
		
		System.out.print("���� �⵵��? ");
		info.setYear(input.nextInt());
		
		System.out.println("\n�Է��� ��ȭ�� �����Դϴ�.\n"+info.toString());
		
		input.close();
	}

}
