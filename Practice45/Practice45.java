//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice45 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Average ave = new Average();
		
		System.out.print("���ϴ� ����� �����ϼ��� (1-����, 2-�Ǽ�) : ");
		int choice = input.nextInt();
		if (choice == 1) //����
		{
			System.out.print("��հ��� ���ϴ� ������ ������ �Է��ϼ��� : ");
			int countInt = input.nextInt();
			if (countInt == 2) //���� 2��
			{
				int[] nums = new int[2];
				int i;
				for (i = 0; i < countInt; i++)
				{
					System.out.print(i+1 +"�� ������ �Է��ϼ��� : ");
					nums[i] = input.nextInt(); 
				}
				System.out.println(i+"�� ������ ����� "
							+ave.getAverage(nums[0], nums[1])+"�Դϴ�.");
				
			}
			else if (countInt == 3) //���� 3��
			{
				int[] nums = new int[3];
				int i;
				for (i = 0; i < countInt; i++)
				{
					System.out.print(i+1 +"�� ������ �Է��ϼ��� : ");
					nums[i] = input.nextInt(); 
				}
				System.out.println(i+"�� ������ ����� "
							+ave.getAverage(nums[0], nums[1], nums[2])+"�Դϴ�.");
			}
				
		}
		
		else if (choice == 2) //�Ǽ�
		{
			System.out.print("��հ��� ���ϴ� �Ǽ��� ������ �Է��ϼ��� : ");
			double countDouble = input.nextDouble();
			if (countDouble == 2) //�Ǽ� 2��
			{
				double[] nums = new double[2];
				int i;
				for (i = 0; i < countDouble; i++)
				{
					System.out.print(i+1 +"�� �Ǽ��� �Է��ϼ��� : ");
					nums[i] = input.nextDouble(); 
				}
				System.out.println(i+"�� �Ǽ��� ����� "
								+ave.getAverage(nums[0], nums[1])+"�Դϴ�.");
				
			}
			else if (countDouble == 3) //�Ǽ� 3��
			{
				double[] nums = new double[3];
				int i;
				for (i = 0; i < countDouble; i++)
				{
					System.out.print(i+1 +"�� �Ǽ��� �Է��ϼ��� : ");
					nums[i] = input.nextDouble(); 
				}
				System.out.println(i+"�� �Ǽ��� ����� "
								+ave.getAverage(nums[0], nums[1], nums[2])+"�Դϴ�.");
			}
		}
		
		input.close();
	}

}
