//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice40 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Date birthday = new Date();
		Date adultday = new Date();
		
		System.out.println("�¾ �⵵�� �Է��ϼ���: ");
		birthday.year = input.nextInt();
		adultday.year = birthday.year + 20;
		
		System.out.println("�¾ ���� �Է��ϼ���: ");
		birthday.month = input.nextInt();
		adultday.month = birthday.month;
		
		System.out.println("�¾ ��¥�� �Է��ϼ���: ");
		birthday.day = input.nextInt();
		adultday.day = birthday.day;

		System.out.print("����� ������ ");
		birthday.print();
		System.out.print("����� �������� ");
		adultday.print();
		System.out.print("����� ������ ");
		birthday.print();
		
		input.close();
	}

}
