//��ǻ���а� 20190975 ��ȿ��
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
		return "�̸�: "+ name + "\n���¹�ȣ: " + accoutNo 
				+ "\n�ܾ�: "+balance + "��\n������: " + rate+ "%\n����: " 
				+ (int)calcInterest(balance, rate) + "��";
	} 
	private double calcInterest(int balance, double rate)  
	{
		return balance * rate / 100;
	}

}
