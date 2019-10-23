//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice47 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		Movie info = new Movie();
		
		System.out.print("영화정보를 입력하세요");
		
		System.out.print("영화 제목은? ");
		info.setTitle(input.next());
		
		System.out.print("평점은? ");
		info.setScore(input.nextInt());
		
		System.out.print("감독은? ");
		info.setDirector(input.next());
		
		System.out.print("개봉 년도는? ");
		info.setYear(input.nextInt());
		
		System.out.println("\n입력한 영화의 정보입니다.\n"+info.toString());
		
		input.close();
	}

}
