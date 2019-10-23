//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice42 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Rectangle rtg = new Rectangle();
		
		System.out.print("가로 입력: ");
		rtg.width = input.nextInt();
		System.out.print("세로 입력: ");
		rtg.height = input.nextInt();
		
		System.out.println("면적은 "+rtg.area()+ "입니다.");
		System.out.println("둘레는 "+rtg.perimeter()+ "입니다.");
		
		input.close();
	}

}
