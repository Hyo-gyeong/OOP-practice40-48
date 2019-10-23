//컴퓨터학과 20190975 신효경
public class Practice48 {

	public static void main(String[] args) {
		
		BankAccount info = new BankAccount();
		
		info.setName("김동덕");
		info.setAccoutNo("1234-5678");
		info.setBalance(100);
		info.setRate(0.0);

		System.out.println("첫 번째 은행 계좌의 정보입니다.\n" + info.toString());
		
		info.setName("홍길동");
		info.setAccoutNo("9999-2531");
		info.setBalance(2000);
		info.setRate(2.15);

		System.out.println("\n두 번째 은행 계좌의 정보입니다." + info.toString());
	}

}
