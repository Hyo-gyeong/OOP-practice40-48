//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice40 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Date birthday = new Date();
		Date adultday = new Date();
		
		System.out.println("태어난 년도를 입력하세요: ");
		birthday.year = input.nextInt();
		adultday.year = birthday.year + 20;
		
		System.out.println("태어난 월을 입력하세요: ");
		birthday.month = input.nextInt();
		adultday.month = birthday.month;
		
		System.out.println("태어난 날짜를 입력하세요: ");
		birthday.day = input.nextInt();
		adultday.day = birthday.day;

		System.out.print("당신의 생일은 ");
		birthday.print();
		System.out.print("당신의 성년일은 ");
		adultday.print();
		System.out.print("당신의 생일은 ");
		birthday.print();
		
		input.close();
	}

}
