//��ǻ���а� 20190975 ��ȿ��
public class Practice48 {

	public static void main(String[] args) {
		
		BankAccount info = new BankAccount();
		
		info.setName("�赿��");
		info.setAccoutNo("1234-5678");
		info.setBalance(100);
		info.setRate(0.0);

		System.out.println("ù ��° ���� ������ �����Դϴ�.\n" + info.toString());
		
		info.setName("ȫ�浿");
		info.setAccoutNo("9999-2531");
		info.setBalance(2000);
		info.setRate(2.15);

		System.out.println("\n�� ��° ���� ������ �����Դϴ�." + info.toString());
	}

}
