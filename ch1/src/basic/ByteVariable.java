package basic;


//Ŭ�������� �ΰ��� �ܾ�� �̷�����ִ� ��� :  �� ������ �빮�ڷ�
//���� : �޸� ������� ( ����(���������� ����������)�� ���� ���̳Ŀ� ���� Ÿ���� ����)
//    : ��� ���� ���� �� ����
//    : ������, ������, �Ǽ���, ����
public class ByteVariable {
	public static void main(String[] args) {
		//������ : byte
		//Ÿ�� ������ = ��;
		byte b1 = 3; //The value of the local variable b1 is not used
		System.out.println(b1);
		
		byte b2= -128;
//		byte b3= 120;
		byte b3= 127;
		System.out.println("b2="+b2+b3);
	}

}
