package extend;

public class BonusPointAccount extends Account {

	
	private int bonusPoint;
	
	public BonusPointAccount(String accountNo, String owner, int balance, int bonusPoint) {
		super(accountNo, owner, balance);
		this.bonusPoint=bonusPoint;
	}

	
	


	@Override
	int deposit (int amount) {
		//����
		super.deposit(amount);
		//���ʽ�����Ʈ = ���ݾ� *0.1%
		bonusPoint=(int)(amount*0.001);
		return bonusPoint;
		
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
}
