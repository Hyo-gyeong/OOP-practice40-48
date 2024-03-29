//컴퓨터학과 20190975 신효경
public class BankAccount {

	private String name, accoutNo; 
	private int balance; 
	private double rate;

	public void setName(String a)
	{
		name = a; 
	}
	public void setAccoutNo(String b)
	{
		accoutNo = b; 
	}
	public void setBalance(int c)
	{
		balance = c; 
	}
	public void setRate(double d)
	{
		rate = d; 
	}
	
	public String toString()   
	{
		return "이름: "+ name + "\n계좌번호: " + accoutNo 
				+ "\n잔액: "+balance + "원\n이자율: " + rate+ "%\n이자: " 
				+ (int)calcInterest(balance, rate) + "원";
	} 
	private double calcInterest(int balance, double rate)  
	{
		return balance * rate / 100;
	}

}
