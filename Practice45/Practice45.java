//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice45 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Average ave = new Average();
		
		System.out.print("원하는 기능을 선택하세요 (1-정수, 2-실수) : ");
		int choice = input.nextInt();
		if (choice == 1) //정수
		{
			System.out.print("평균값을 원하는 정수의 개수를 입력하세요 : ");
			int countInt = input.nextInt();
			if (countInt == 2) //정수 2개
			{
				int[] nums = new int[2];
				int i;
				for (i = 0; i < countInt; i++)
				{
					System.out.print(i+1 +"번 정수를 입력하세요 : ");
					nums[i] = input.nextInt(); 
				}
				System.out.println(i+"개 정수의 평균은 "
							+ave.getAverage(nums[0], nums[1])+"입니다.");
				
			}
			else if (countInt == 3) //정수 3개
			{
				int[] nums = new int[3];
				int i;
				for (i = 0; i < countInt; i++)
				{
					System.out.print(i+1 +"번 정수를 입력하세요 : ");
					nums[i] = input.nextInt(); 
				}
				System.out.println(i+"개 정수의 평균은 "
							+ave.getAverage(nums[0], nums[1], nums[2])+"입니다.");
			}
				
		}
		
		else if (choice == 2) //실수
		{
			System.out.print("평균값을 원하는 실수의 개수를 입력하세요 : ");
			double countDouble = input.nextDouble();
			if (countDouble == 2) //실수 2개
			{
				double[] nums = new double[2];
				int i;
				for (i = 0; i < countDouble; i++)
				{
					System.out.print(i+1 +"번 실수를 입력하세요 : ");
					nums[i] = input.nextDouble(); 
				}
				System.out.println(i+"개 실수의 평균은 "
								+ave.getAverage(nums[0], nums[1])+"입니다.");
				
			}
			else if (countDouble == 3) //실수 3개
			{
				double[] nums = new double[3];
				int i;
				for (i = 0; i < countDouble; i++)
				{
					System.out.print(i+1 +"번 실수를 입력하세요 : ");
					nums[i] = input.nextDouble(); 
				}
				System.out.println(i+"개 실수의 평균은 "
								+ave.getAverage(nums[0], nums[1], nums[2])+"입니다.");
			}
		}
		
		input.close();
	}

}
