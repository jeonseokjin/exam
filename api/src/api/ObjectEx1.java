package api;

public class ObjectEx1 {
	public static void main(String[] args) {
		
		//��ü ���� : default ������ ȣ��
		Object obj1 =new Object();
		Object obj2 =new Object();
		
		//�޼ҵ� ȣ��
		//equals() : String ���ڿ� �񱳽� ==��ſ�
		//String Ŭ���������� �������̵��� ���� ���ڿ� ���� ���·� ���
		if(obj1.equals(obj2)) {//�ּ� ��
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		if(obj1==obj2) {//�ּ� ��
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		//java.lang.Object@3830f1c0//��ü�� ����Ǿ��ִ� �ּ�
		System.out.println("obj1.toString()"+obj1.toString());
		//java.lang.Object@39ed3c8d
		System.out.println("obj2.toString()"+obj2.toString());
		
		
		
		Value value1=new Value(10);
		Value value2=new Value(10);
		System.out.println(value1.equals(value2)?"����":"�ٸ���");
		System.out.println(value1.toString());
		System.out.println(value1);
	}

}
