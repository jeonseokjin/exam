package basic;
//��ǻ�� : 0,1
//       :A => ? , �� => ?
//��ǻ�� ���ο��� ���ڸ� ǥ���ϱ� ���� ���� �ڵ� set : ���� ���ڵ�
//A(65) => ��Ʈ�� ��ȯ
//���� ���ڵ� : ��Ʈ => ����
//ASCII(�ƽ�Ű)(�⺻ ���� ���ڵ� ���)
//�����ڵ� : �� ������ ǥ�� ���ڵ�(UTP-8)
//       : 1byte �� �ƽ�Ű �ڵ尪�� ȣȯ
//������ : 1. Char(2byte) : Ȭ����ǥ �ȿ� ǥ��(���ڴ� �ϳ��� ����)
//�ֵ���ǥ : "" String �̿��ϸ� ���ڿ� ��� ����
public class CharVariable {

	public static void main(String[] args) {
		char ch1='A';
//		char ch2='AB'; //Invalid character constant
		System.out.println(ch1);
		
		char ch2 = 65; //65(A�� �ƽ�Ű�ڵ� ������ ��)==A // ���� �ƽ�Ű �ڵ� 65�� ������ �ִ� A�� ȣ���ϴ� ����
		System.out.println("ch2="+ch2);
		
		int i= 65;
		System.out.println("i="+i);
		
//		String str1="A";
//		String str2="Abcded";

	}

}
