package shop;

public class MyShopEx {
	public static void main(String[] args) {
		
		//IShop shop = new MyShop();
		MyShop shop = new MyShop();
		//��������
		shop.setTitle("MyShop");
		//��(User)����
		shop.genUser();
		//��ǰ ����
		shop.genProduct();
		//shop ����
		shop.start();
		
	}
}
