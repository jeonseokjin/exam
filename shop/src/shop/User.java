package shop;

public class User {
	private String name;  //����
	private PayType payType;					//�������
	public User(String name, PayType payType) {
		super();
		this.name = name;
		this.payType = payType;
	}
	public String getName() {
		return name;
	}
	
	public PayType getPayType() {
		return payType;
	}
	
	
	
	
}
