package basic;

//���� ��ȿ ����
//������ ��� �����ߴ��Ŀ� ���� ��ġ�� ������ �ٸ�
//{} : ��Ͼȿ��� ���� =>����� ��ϳ������� ��밡��
//1)Ŭ���� ���ο� ����
//2)�޼ҵ� ���ο� ����

public class VariableScope1 {
	
	//Ŭ���� ���� ����
//	int age;

	public static void main(String[] args) {
		
		//�޼ҵ� ���ο��� ����-��������
		int age=4;
		int v1=3;

		{
			v1= age+30;
//			int age=4; //Duplicate local variable age   -������ ��ġ�� ������ ������ ����� �� ����.
			int v2=45;
		}
		System.out.println("v1="+v1);
//		System.out.println("v2="+v2); v2 ������ �ٸ� ��Ͽ� ����
	}
	public static void print() {
//		System.out.println(age);//age�� ������ �޼ҵ�� �ٸ� �޼ҵ�, �� �ٸ� ��Ͽ� age ������ �����ϱ⿡ ����� �� ����.
	}

}
