package api;

public class StringEx1 {
	public static void main(String[] args) {
		
		//���ڿ� ���� �� 2���� ���
		//���ڿ� ���ͷ��� ����
		//String Ŭ���� ������ �̿�
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		
		System.out.println(str1==str2); //true
		System.out.println(str3==str4); //false
		
		//����� equals()
		
	}
}
