package basic;

//ũ��
// byte(1)<shor(2)<int(4)<long(8)<float(4)<double(8)

//����ȯ
//1. �ڵ�����ȯ(Promotion) : �����ڰ� �Ű澲�� �ʾƵ� ��
//               ū ũ�� Ÿ��=���� ũ�� Ÿ��
//2. ��������ȯ(Casting) : ������ ������ �����ֱ� ������ �Ű��� ��� ��

public class PromotionEx1 {

	public static void main(String[] args) {
		
		byte byteValue=10;
		
		//�ڵ�����ȯ(byte -> int)
		int intValue=byteValue;
		System.out.println(intValue);
		
		
		char charValue='A';
		//�ڵ�����ȯ (char->int)
		intValue= charValue;
		System.out.println(intValue);
		
		
		intValue = 500;
		//�ڵ�����ȯ(int->long)
		long longValue =intValue;
		System.out.println(longValue);
		
		//�ڵ�����ȯ(int->float)
		float floatValue = intValue;
		System.out.println(floatValue);
		
		floatValue=35.2f;
		//�ڵ�����ȯ(float->double)
		double doubleValue = floatValue;
		System.out.println(doubleValue);
		
		int v1=10;
		double d1=5.5;
		//�ΰ��� Ÿ���� ���� �ٸ� �� ��������� �ϴ� ��� ū Ÿ���� ����
		double d2=v1+d1;
//		int  d3=v1+d1; ���� error �߻� double Ÿ���� int type�� ���� �� ����.
		System.out.println("d2="+d2);
	}

}
