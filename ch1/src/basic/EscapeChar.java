package basic;

public class EscapeChar {

	public static void main(String[] args) {
		// \�� �����ϴ� ���ڴ� ��ӵ� ��Ģ�� ����. \n, \t �� ���� �������� ��ǻ�Ͱ� ������
		// \n(���� ����), \t, \"(�ֵ���ǥ�� ȭ�鿡 ����ϴ� ���� ����)
		System.out.println("\n�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���\t�ݰ����ϴ�");
		System.out.println("'Hello'");
		System.out.println("\"Hello\"");
		
		//println���� ln�� �ǹ̴�(������ �ǹ��̴�)���� print�� ����Ұ�� �پ ��µȴ�
		System.out.print("Hello");
		System.out.print("\nworld\t");
		// \�ϳ��� ǥ���Ϸ��� => \\
		System.out.println("c:\\");

	}

}

