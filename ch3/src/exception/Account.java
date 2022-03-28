package exception;

public class Account {
	String accountNo;
	String owner;
	int balance;
	
	public Account (String accountNo, String owner, int balance) {
		super();
		this.accountNo=accountNo;
		this.owner=owner;
		this.balance=balance;
	}
	
	int deposit(int amount) {
		this.balance+=amount;
		return balance;
	}
	int withdraw(int amount) throws Exception {
		if(balance<amount) {
			//throw�� ���� ���� ���� �߻�
			throw new Exception("�ܰ���� : "+(amount-balance)+"����");
		}
		this.balance-=amount;
		return balance;
	}
}