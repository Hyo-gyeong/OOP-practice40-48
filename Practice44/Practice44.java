//컴퓨터학과 20190975 신효경
import java.util.Scanner;

public class Practice44 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Date birthday = new Date();
		Date adultday = new Date();
		
		System.out.print("태어난 년도를 입력하세요 : ");
		birthday.setYear(input.nextInt());
		adultday.setYear(birthday.getYear() + 20);
		
		System.out.print("태어난 월을 입력하세요 : ");
		birthday.setMonth(input.nextInt());
		adultday.setMonth(birthday.getMonth());
		
		System.out.print("태어난 일을 입력하세요 : ");
		birthday.setDay(input.nextInt());
		adultday.setDay(birthday.getDay());
		
		System.out.println("당신의 생일은 "+ birthday.toString() + "입니다." );
		System.out.println("당신의 성년일은 "+ adultday.toString() + "입니다." );
		System.out.println("당신의 생일은 "+ birthday.toString() + "입니다." );
		
		input.close();
	}

}
