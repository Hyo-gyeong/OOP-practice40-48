//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice44 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Date birthday = new Date();
		Date adultday = new Date();
		
		System.out.print("�¾ �⵵�� �Է��ϼ��� : ");
		birthday.setYear(input.nextInt());
		adultday.setYear(birthday.getYear() + 20);
		
		System.out.print("�¾ ���� �Է��ϼ��� : ");
		birthday.setMonth(input.nextInt());
		adultday.setMonth(birthday.getMonth());
		
		System.out.print("�¾ ���� �Է��ϼ��� : ");
		birthday.setDay(input.nextInt());
		adultday.setDay(birthday.getDay());
		
		System.out.println("����� ������ "+ birthday.toString() + "�Դϴ�." );
		System.out.println("����� �������� "+ adultday.toString() + "�Դϴ�." );
		System.out.println("����� ������ "+ birthday.toString() + "�Դϴ�." );
		
		input.close();
	}

}
