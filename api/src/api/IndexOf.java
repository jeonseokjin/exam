package api;

public class IndexOf {
	public static void main(String[] args) {
		String str1="�ڹ� ���α׷���";
		
		//indexOf() : ���ڿ� ���Կ���
		int pos=str1.indexOf('��');
		System.out.println(pos);

		System.out.println(str1.indexOf("ũ"));
		
		if(str1.indexOf("�ڹ�")==-1) {
			System.out.println("�ڹ� ���ڿ� ����");
		}else {
			System.out.println("�ڹ� ���ڿ� ����");
		}
		String str2 = new String("HelloHelloHello World");
		//���� ó���� ������ ��ġ
		System.out.println(str2.indexOf('o'));
		//���� ���߿� ������ ��ġ
		System.out.println(str2.lastIndexOf('o'));
		//������ġ ���� ����
		System.out.println(str2.indexOf('o', 6));
	}
}
