package poly;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	Product items[]=new Product[10];
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ� �������� ���� ���� �Ұ�");
			
		}
		money -=p.price;
		bonusPoint += p.bonusPoint;
		items[i++]=p;
		System.out.println(p+"��/�� �����մϴ�");
	}

}
