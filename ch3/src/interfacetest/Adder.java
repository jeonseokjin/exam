package interfacetest;

// �������̽� : �߻�޼���
//			�߻� Ŭ�������� �߻�ȭ ������ �� ����
//			������� ���� �� ����
//			�ٸ� Ŭ������ �ۼ��ϴµ� ���� �� �������� �ۼ�
//			��,  default, static Ű���尡 ���� �޼ҵ�� ���
public interface Adder {
	//private int num; ���� ���� �Ұ�
	public static final int  SPADE = 1;
	int DIAMOND=3; // public static final ���� �� �� ���� ������ ������ ��� ����
	final int HEART=2;
	static int CLOVER=4;
	
	//public void print(){} �߰�ȣ���� �޼ҵ� �����Ұ�
	public void print();
	int add(int x, int y); //public Ű���� ���� ����

}
