package basic;

//ũ��
//byte(1)<shor(2)<int(4)<long(8)<float(4)<double(8)

//����ȯ
//1. �ڵ�����ȯ(Promotion) : �����ڰ� �Ű澲�� �ʾƵ� ��
//            ū ũ�� Ÿ��=���� ũ�� Ÿ��
//2. ��������ȯ(Casting) : ������ ������ �����ֱ� ������ �Ű��� ��� ��
//                ���� ũ�� Ÿ�� = (���� ũ�� Ÿ��) ū ũ�� Ÿ��
public class CastingEx1 {

	public static void main(String[] args) {
		int intValue = 1034;
		System.out.println("intValue="+intValue);
		//��������ȯ
		byte byteValue = (byte)intValue; // cannot conver from int to byte
		System.out.println("byteValue="+byteValue); //10
		
		int num1=123456780;
		//�ڵ�����ȯ
		double num2=num1;
		System.out.println(num2);
		//��������ȯ
		int num3=(int)num2;
		System.out.println(num3);

	}

}
