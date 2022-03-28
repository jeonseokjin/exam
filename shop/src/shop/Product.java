package shop;

public abstract class Product {
	//�Ϲ� Ŭ���� + �߻�޼ҵ�
	private String name; //��ǰ��
	private int price; //����
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	//��ǰ���� ������ ������ ���
	public void printDetail() {
		System.out.println("��ǰ�̸� : "+name);
		System.out.println("��ǰ���� : "+price);
		
		printExtra();
		
	}
	//��ǰ���� ���� �ٸ� ������ ���
	public abstract void printExtra();

	
	
}
