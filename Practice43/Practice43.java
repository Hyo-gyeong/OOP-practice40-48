//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice43 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Date birthday = new Date();
		Date adultday = new Date();
		
		System.out.println("�¾ �⵵�� �Է��ϼ���: ");
		birthday.setYear(input.nextInt());
		adultday.setYear(birthday.year + 20);
		System.out.println("�¾ ���� �Է��ϼ���: ");
		birthday.setMonth(input.nextInt());
		adultday.setMonth(birthday.month);
		System.out.println("�¾ ��¥�� �Է��ϼ���: ");
		birthday.setDay(input.nextInt());
		adultday.setDay(birthday.day);
		
		System.out.println("����� ������ " + birthday.toString() + "�Դϴ�.");
		System.out.println("����� �������� "+ adultday.toString()+" �Դϴ�.");
		System.out.println("����� ������ " + birthday.toString() + "�Դϴ�.");
		
		input.close();
	}

}
