package classtest;

public class Calculator3 {
	long a, b; //�ν��Ͻ� ���� (�������)
	
	//����޼ҵ�(�ν��Ͻ� �޼ҵ�)
	long add() {
		return a+b;
	}
	long substract() {
		return a-b;
	}
	long multiple() {
		return a*b;
	}
	double divide() {
		return a/b;
	}
	
	//Ŭ���� �޼ҵ�
	//static => ����, ��ü �������� ��� ����
	//�ν��Ͻ� ����, �ν��Ͻ� �޼ҵ� ��� �Ұ�
	static long add(long c, long d) {
		return c+d;
	}
	static long substract(long c, long d) {
		return c-d;
	}
	static long multiple(long c, long d) {
		return c*d;
	}
	static double divide(long c, long d) {
		return c/d;
	}
}
