package op;
//���������ڴ� ��,�ڿ� �ü� ���� 
//���Կ����ڶ� ���� �� ���ʿ� ���� ���� ������ ���� �ϰ� ������ �Ͼ
// 1. ++x
// 2. 1.�� ��� +20
// 3. =(���Կ�����)�� ���� => ��� 22
// ���ʿ� ���� ���� ������ �ϰ� ������ �Ͼ
// 1. x+20 �� ���� ����
// 2. =(���Կ�����)�� ���� => ��� 21
// 3. x++
public class IncreaseDecreaseOperEx2 {

	public static void main(String[] args) {
		int x=1;
		int y=1;
		
//		int result1=++x+20; //22
		int result1=x+++20;
		System.out.println("result1="+result1);
		System.out.println(x);
//		int result2=--y+20; //20
		int result2=y--+20;
		System.out.println("result2="+result2);
		System.out.println(y);

	}

}
