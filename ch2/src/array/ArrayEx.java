package array;

//�迭 : ����Ÿ��, ���������� ���� => heap������ ����(new Ű���� �ʿ�)
//		�⺻������ �ʱ�ȭ�� ����(���� : 0, �Ǽ� : 0.0, boolean : false)

public class ArrayEx {
	public static void main(String[] args) {
		//5���� ����(����Ÿ��)
		int num1=3, num2=4, num3=5, num4=6, num5=7;
		int num6;
		
//		System.out.println(num6);
		
		//�迭 ���� �� ����
		boolean arr[]=new boolean[5];
		int arr1[]=new int[5];
		System.out.println(arr);
		arr[3]=true;
		System.out.println(arr[3]);
		arr1[2]=123;
		System.out.println(arr1[2]); //index ��ȣ�� 0������ ����
		
		//int arr[] = {3,4,5,6,7};
	}
}
