package poly;

public class ChildEx {

	public static void main(String[] args) {
		Child child=new Child();
		
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		//�θ� - �ڽ� ����
		//parent ������ ������ �� �ִ� ������ �θ� Ŭ������ �ִ� �ʵ��
		//�޼ҵ常 ���� ����
		//��, �������̵� �� �޼ҵ尡 �ִٸ� �ڽ� Ŭ������ �޼ҵ尡 ��� ȣ���
		Parent parent =new Child();
		parent.method1();
		parent.method2();
		
		//Child2 child2 = new Child();
	}
}
