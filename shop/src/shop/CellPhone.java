package shop;

public class CellPhone extends Product {

	
	private String carrier; //��Ż�
	
	
	
	public CellPhone(String name, int price, String carrier) {
		super(name, price);
		this.carrier=carrier;
	}

	@Override
	public void printExtra() {
		System.out.println("��Ż� ���� : "+carrier);

	}

}