package basic;
//������ - 1.byte
//		 2.short
//       3.int : �ڹٴ� ��� �������� �⺻������ int �� ǥ��
//		 4.long : 8byte
public class LongVariable {

	public static void main(String[] args) {
		long var1=15;
		System.out.println("var1="+var1);
		//var1=12345678900; //The literal 12345678900 of type int is out of range
		var1=12345678900L; //L,l ����ϸ� ������ ������ ( long Ÿ���� �����Ϸ����� long Ÿ���� �˷���� ��)
		System.out.println("var1="+var1);

	}

}
